package sigmfsdc.vista;

import static java.awt.EventQueue.invokeLater;
import java.awt.HeadlessException;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.text.DateFormatSymbols;
import static java.util.Calendar.YEAR;
import static java.util.Calendar.getInstance;
import java.util.Locale;
import static java.util.logging.Level.SEVERE;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import static javax.persistence.Persistence.createEntityManagerFactory;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.UIManager.getInstalledLookAndFeels;
import static javax.swing.UIManager.setLookAndFeel;
import javax.swing.UnsupportedLookAndFeelException;
import sigmfsdc.controladora.GeradorPDF;
import sigmfsdc.controladora.PacienteJpaController;
import sigmfsdc.modelo.Usuario;

public class ObterRelatorio extends javax.swing.JFrame {
Usuario usuario;
int mesInicio,mesFim, anoo;
    public ObterRelatorio() {
        initComponents();
    }

   public ObterRelatorio(Usuario usuario) {
          initComponents();
        this.usuario = usuario;
        nomeUsuario.setText(usuario.getNome());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ano = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Imprimir = new javax.swing.JButton();
        descaregarRelatorioBtn = new javax.swing.JButton();
        mesInicial = new javax.swing.JComboBox<>();
        mesTermino = new javax.swing.JComboBox<>();
        esquerda = new javax.swing.JPanel();
        republica = new javax.swing.JLabel();
        provincia2 = new javax.swing.JLabel();
        emblema = new javax.swing.JLabel();
        lema = new javax.swing.JLabel();
        servico = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        usernameTXt1 = new javax.swing.JLabel();
        nomeUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerar Relatório");

        ano.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        ano.setForeground(new java.awt.Color(204, 204, 204));
        ano.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ano");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mês Inicial");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mês Final");

        Imprimir.setText("Imprimir");
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });

        descaregarRelatorioBtn.setText("Descarregar");
        descaregarRelatorioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descaregarRelatorioBtnActionPerformed(evt);
            }
        });

        mesInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        mesInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesInicialActionPerformed(evt);
            }
        });

        mesTermino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        mesTermino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesTerminoActionPerformed(evt);
            }
        });

        esquerda.setBackground(new java.awt.Color(255, 255, 255));
        esquerda.setForeground(new java.awt.Color(255, 0, 0));
        esquerda.setPreferredSize(new java.awt.Dimension(700, 400));

        republica.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        republica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        republica.setText("REPÚBLICA DE MOÇAMBIQUE");

        provincia2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        provincia2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        provincia2.setText("PROVĺNCIA DE NAMPULA ");

        emblema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sigmfsdc/vista/imagens/emblema.png"))); // NOI18N

        lema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lema.setText("O nosso maior Valor é a vida");

        servico.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        servico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        servico.setText("SERVIÇO PROVINCIAL DE SAÚDE ");

        titulo2.setFont(new java.awt.Font("sansserif", 0, 17)); // NOI18N
        titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo2.setText("de Funcionários Com  Doenças Crónicas ");

        titulo1.setFont(new java.awt.Font("sansserif", 0, 17)); // NOI18N
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText(" Sistema de Informação e Monitoria da Saúde");

        usernameTXt1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        usernameTXt1.setText("Utilizador");

        nomeUsuario.setForeground(new java.awt.Color(254, 0, 0));

        javax.swing.GroupLayout esquerdaLayout = new javax.swing.GroupLayout(esquerda);
        esquerda.setLayout(esquerdaLayout);
        esquerdaLayout.setHorizontalGroup(
            esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, esquerdaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(emblema)
                .addGap(157, 157, 157))
            .addGroup(esquerdaLayout.createSequentialGroup()
                .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(esquerdaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lema, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(esquerdaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(esquerdaLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(provincia2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(esquerdaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(esquerdaLayout.createSequentialGroup()
                        .addComponent(usernameTXt1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(esquerdaLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(servico)
                            .addGroup(esquerdaLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(republica)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        esquerdaLayout.setVerticalGroup(
            esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, esquerdaLayout.createSequentialGroup()
                .addComponent(emblema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(republica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(provincia2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(servico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameTXt1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nomeUsuario, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo2)
                .addGap(33, 33, 33)
                .addComponent(lema)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(esquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Imprimir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesInicial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descaregarRelatorioBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ano, jLabel1, jLabel2, jLabel3, mesInicial, mesTermino});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(mesInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Imprimir)
                    .addComponent(descaregarRelatorioBtn))
                .addGap(111, 111, 111))
            .addGroup(layout.createSequentialGroup()
                .addComponent(esquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Imprimir, ano, descaregarRelatorioBtn, jLabel1, jLabel2});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private  int obterNumeroMes(String nomeMes) {
        var symbols = new DateFormatSymbols(new Locale("pt", "BR"));
        var meses = symbols.getMonths();
        for (var i = 0; i < meses.length; i++) {
            if (meses[i].equalsIgnoreCase(nomeMes)) {
                return i + 1;
            }
        }
        return 0;
    }
    
    private void anoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anoActionPerformed
    try {
        var anoDigitado = parseInt(ano.getText());
        var anoAtual = getInstance().get(YEAR);

        if (anoDigitado >= 1930 && anoDigitado <= anoAtual) {
            anoo = anoDigitado;
            mesInicial.requestFocus();
        } else {
                showMessageDialog(this, "Ano inválido. Digite um ano entre 1930 e " + anoAtual, "Erro", ERROR_MESSAGE);
       ano.setText("");
        }
        
    } catch (NumberFormatException e) {
            showMessageDialog(this, "Formato de ano inválido. Digite um valor numérico.", "Erro", ERROR_MESSAGE);
    
    }
    }//GEN-LAST:event_anoActionPerformed

    private void descaregarRelatorioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descaregarRelatorioBtnActionPerformed
        try {
            var relatorios = new GeradorPDF();
            var emf = createEntityManagerFactory("SistemaigmfsdcPU");
            var pacientes = new PacienteJpaController(emf);
    var pct = pacientes.findPacientesPorPeriodo(anoo, mesInicio, mesFim);

            try {
                relatorios.gerarRelatorio(pct,anoo,mesInicio,mesFim,usuario);
            } catch (IOException ex) {
                getLogger(ObterRelatorio.class.getName()).log(SEVERE, null, ex);
            }
            showMessageDialog(null, "Relatório gerado com sucesso!", "Sucesso", INFORMATION_MESSAGE);

        } catch (HeadlessException ex) {
            showMessageDialog(null, "Erro ao gerar o relatório: " + ex.getMessage(), "Erro", ERROR_MESSAGE);
        } finally {
            this.setVisible(false);
            var accoes = new EscolherAccao(usuario);
            try {
                setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                getLogger(ObterRelatorio.class.getName()).log(SEVERE, null, ex);
            }
            accoes.setLocationRelativeTo(null);
            accoes.setVisible(true);
        }

    }//GEN-LAST:event_descaregarRelatorioBtnActionPerformed

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
        var geradorPDF = new GeradorPDF();
        var emf = createEntityManagerFactory("SistemaigmfsdcPU");
        var pacientes = new PacienteJpaController(emf);
    var pct = pacientes.findPacientesPorPeriodo(anoo, mesInicio, mesFim);
        try {
            geradorPDF.imprimirRelatorio(pct,anoo,mesInicio,mesFim,usuario);
        } catch (IOException ex) {
            getLogger(ObterRelatorio.class.getName()).log(SEVERE, null, ex);
        }
    }//GEN-LAST:event_ImprimirActionPerformed


    private void mesInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesInicialActionPerformed
        mesInicio = obterNumeroMes((String) mesInicial.getSelectedItem());
        mesTermino.requestFocus();
    }//GEN-LAST:event_mesInicialActionPerformed

    private void mesTerminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesTerminoActionPerformed
  mesFim = obterNumeroMes((String) mesTermino.getSelectedItem());
if (mesFim <= mesInicio ){
            showMessageDialog(null, "O mes deve ser maior que o primeiro " , "Mes Inferior", ERROR_MESSAGE);
mesTermino.setSelectedIndex(0);
mesFim =0;
}
else {
    descaregarRelatorioBtn.requestFocus();
  }
    }//GEN-LAST:event_mesTerminoActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (var info : getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            getLogger(ObterRelatorio.class.getName()).log(SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        invokeLater(() -> {
            new ObterRelatorio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Imprimir;
    private javax.swing.JTextField ano;
    private javax.swing.JButton descaregarRelatorioBtn;
    private javax.swing.JLabel emblema;
    private javax.swing.JPanel esquerda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lema;
    private javax.swing.JComboBox<String> mesInicial;
    private javax.swing.JComboBox<String> mesTermino;
    private javax.swing.JLabel nomeUsuario;
    private javax.swing.JLabel provincia2;
    private javax.swing.JLabel republica;
    private javax.swing.JLabel servico;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel usernameTXt1;
    // End of variables declaration//GEN-END:variables
    private static final Logger LOG = Logger.getLogger(ObterRelatorio.class.getName());
}
