package sigmfsdc.controladora;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import static com.itextpdf.text.Element.ALIGN_CENTER;
import static com.itextpdf.text.FontFactory.HELVETICA_BOLD;
import static com.itextpdf.text.FontFactory.getFont;
import static com.itextpdf.text.Image.getInstance;
import static com.itextpdf.text.PageSize.A3;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import static com.itextpdf.text.pdf.PdfWriter.getInstance;
import java.io.File;

import static java.io.File.separator;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import static java.util.Locale.getDefault;
import javax.swing.*;
import static javax.swing.JFileChooser.APPROVE_OPTION;
import static javax.swing.JFileChooser.DIRECTORIES_ONLY;
import sigmfsdc.modelo.Paciente;
import sigmfsdc.modelo.Usuario;
import sigmfsdc.vista.MetodosGerais;

public class GeradorPDF implements MetodosGerais {
    public void imprimirRelatorio(List<Paciente> pacientes, int ano, int mesInicio, int mesFim, Usuario usuario) throws IOException {
    //
    }


  public void gerarRelatorio(List<Paciente> pacientes, int ano, int mesInicio, int mesFim, Usuario usuario) throws IOException {

        var fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(DIRECTORIES_ONLY);

        var result = fileChooser.showSaveDialog(null);

        var dateFormatExtenso = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("pt", "BR"));
        var dataExtenso = dateFormatExtenso.format(new Date());

        var dateFormat = new SimpleDateFormat("HH:mm:ss", getDefault());
        var dateFormat2 = new SimpleDateFormat("HH'h' mm'min' ss's' ", getDefault());

        var horaGeracao = dateFormat.format(new Date());
        var horaGeracao2 = dateFormat2.format(new Date());


        if (result == APPROVE_OPTION) {
            var selectedDirectory = fileChooser.getSelectedFile();

            var filePath = selectedDirectory.getAbsolutePath() + separator + "relatorio  " + dataExtenso+" "+horaGeracao2+ ".pdf";

            var document = new Document(A3);
            try {

                getInstance(document, new FileOutputStream(filePath));
                document.open();

         File imageFile = new File("src/sigmfsdc/vista/imagens/emblema.png");

            if (imageFile.exists()) {
                var image = getInstance(imageFile.getAbsolutePath()); // Obtém o caminho absoluto do arquivo
                image.setAlignment(ALIGN_CENTER);
                document.add(image);
            } else {
                System.out.println("Arquivo de imagem não encontrado.");
            }

                
                var paragraph = new Paragraph("REPÚBLICA DE MOÇAMBIQUE");
                paragraph.setAlignment(ALIGN_CENTER);
                document.add(paragraph);

                paragraph = new Paragraph("PROVÍNCIA DE NAMPULA");
                paragraph.setAlignment(ALIGN_CENTER);
                document.add(paragraph);

                paragraph = new Paragraph("SERVIÇO PROVINCIAL DE SAÚDE");
                paragraph.setAlignment(ALIGN_CENTER);
                document.add(paragraph);

                paragraph = new Paragraph("RELATÓRIO DE REGISTO E ACTUALIZAÇÃO DE CASOS DE DOENÇAS CRÓNICAS");
                paragraph.setAlignment(ALIGN_CENTER);
                document.add(paragraph);

                document.add(new Paragraph("\n\n"));
                document.add(new Paragraph("Ano: "+ano));
                document.add(new Paragraph("Meses: " + (obterMesPorExtenso(mesInicio)).toUpperCase() + " a " + (obterMesPorExtenso(mesFim)).toUpperCase()));
                document.add(new Paragraph("\n\n\n"));
                
// Cria uma tabela com o número de colunas igual ao número de campos
                var table = new PdfPTable(12); // 12 colunas conforme o número de campos
                table.setWidthPercentage(100);

                // Adiciona o cabeçalho da tabela
                addTableHeader(table);

                // Adiciona os campos e valores à tabela
                for (var paciente : pacientes) {
                    addTableRow(table, paciente);
                }

                // Adiciona a tabela ao documento
                document.add(table);

                document.add(new Paragraph("\n\n"));
                document.add(new Paragraph("\nGerado por " + usuario.getNome() + "\nData " + dataExtenso + "\nHora : " + horaGeracao));

                document.add(new Paragraph("\n\n"));
                paragraph = new Paragraph("_________________________________________________");
                paragraph.setAlignment(ALIGN_CENTER);
                document.add(paragraph);
                
                paragraph = new Paragraph(usuario.getNome());
                paragraph.setAlignment(ALIGN_CENTER);
                document.add(paragraph);
                
            } catch (DocumentException | FileNotFoundException e) {
                // Trate as exceções apropriadamente
            } finally {
                document.close();
            }

        }
    }
       

    private void addTableHeader(PdfPTable table) {
        String[] headers = {
            "NID",
            "Nome",
            "Data de Registo do caso",
            "Enfermidade",
            "Rastreio",
            "Diagnóstico",
            "ESP actual",
            "Situacao Atual do Paciente",
            "US de Assistencia",
            "Local da US",
            "Sector de Trabalho",
            "Morada"
        };

        var font = getFont(HELVETICA_BOLD);
        for (var header : headers) {
            var cell = new PdfPCell(new Phrase(header, font));
            table.addCell(cell);
        }
    }

    private void addTableRow(PdfPTable table, Paciente paciente) {
        table.addCell(paciente.getNid());
        table.addCell(paciente.getNome());
        table.addCell((paciente.getDataRegistoCaso() != null) ? new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("pt", "MZ")).format(paciente.getDataRegistoCaso()) : "null");
        table.addCell(paciente.getControleSeguimento().getEnfermidade());
        table.addCell(paciente.getControleSeguimento().getRastreio());
        table.addCell(paciente.getControleSeguimento().getDiagnostico());
        table.addCell(paciente.getControleSeguimento().getEspAtualObservado());
        table.addCell(paciente.getControleSeguimento().getSituacaoAtualPaciente());
        table.addCell(paciente.getUsAssistencia());
        table.addCell(paciente.getLocalUs());
        table.addCell(paciente.getLocalTrabalhoResidencia().getSetorTrabalho());
        table.addCell(paciente.getLocalTrabalhoResidencia().getMorada());
    }


}
