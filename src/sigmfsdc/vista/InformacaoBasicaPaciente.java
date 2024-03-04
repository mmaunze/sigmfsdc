package sigmfsdc.vista;

import static java.lang.Integer.valueOf;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import static java.util.logging.Level.SEVERE;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import javax.persistence.EntityManagerFactory;
import static javax.persistence.Persistence.createEntityManagerFactory;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import sigmfsdc.controladora.PacienteJpaController;
import sigmfsdc.modelo.Paciente;
import sigmfsdc.modelo.Usuario;

public class InformacaoBasicaPaciente extends javax.swing.JFrame implements MetodosGerais {

    EntityManagerFactory emf = createEntityManagerFactory("SistemaigmfsdcPU");
    PacienteJpaController doentes = new PacienteJpaController(emf);
    Paciente doente = new Paciente();
    private LocalDeTrabalhoResidencia frame2 = null;

    boolean nidPreenchido = false;
    boolean dataRegistoCasoPreencido = false;
    boolean localDaUSPreenchido = false;
    boolean UsDeAssistenciaPreenchido = false;
    boolean distritoNascimentoPreenchido = false;
    boolean provinciaNascimentoPreenchido = false;
    boolean dataNascimentoPreencido = false;
    boolean categoriaPreenchido = false;
    boolean carreiraPreenchido = false;
    boolean nomePreenchido = false;
    boolean nivelCarreiraPreenchido =false;
 Usuario usuario;
    public InformacaoBasicaPaciente() {
        initComponents();
    }

    InformacaoBasicaPaciente(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
            dataRegistoCaso.setText(converteData(new Date()));
           

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dataNascimentoTxt = new javax.swing.JLabel();
        dataNascimento = new javax.swing.JTextField();
        localDaUsTxt = new javax.swing.JLabel();
        idadeTxt = new javax.swing.JLabel();
        localDaUS = new javax.swing.JTextField();
        idade = new javax.swing.JTextField();
        faixaEtariaTxt = new javax.swing.JLabel();
        faixaEtaria = new javax.swing.JTextField();
        provinciaDeNascimentoTxt = new javax.swing.JLabel();
        provinciaNascimento = new javax.swing.JTextField();
        dataRegistoCasoTxt = new javax.swing.JLabel();
        distritoDeNascimentoTxt = new javax.swing.JLabel();
        dataRegistoCaso = new javax.swing.JTextField();
        distritoNascimento = new javax.swing.JTextField();
        nidTxt = new javax.swing.JLabel();
        usDeAssistenciaTxt = new javax.swing.JLabel();
        nid = new javax.swing.JTextField();
        UsDeAssistencia = new javax.swing.JTextField();
        nomePacienteTxt = new javax.swing.JLabel();
        nivelCarreira = new javax.swing.JComboBox<>();
        nomePaciente = new javax.swing.JTextField();
        sexo = new javax.swing.JComboBox<>();
        sexoTxt = new javax.swing.JLabel();
        avancarBtn = new javax.swing.JButton();
        carreiraTxt = new javax.swing.JLabel();
        carreira = new javax.swing.JTextField();
        nivelDeCarreiraTxt = new javax.swing.JLabel();
        categoriaTxt = new javax.swing.JLabel();
        categoria = new javax.swing.JTextField();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Informações Básicas do Paciente ");
        setIconImages(null);
        setResizable(false);

        dataNascimentoTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        dataNascimentoTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dataNascimentoTxt.setText("Data de Nascimento");
        dataNascimentoTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        dataNascimento.setEditable(false);
        dataNascimento.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        dataNascimento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dataNascimento.setEnabled(false);
        dataNascimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dataNascimentoMouseExited(evt);
            }
        });
        dataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataNascimentoActionPerformed(evt);
            }
        });

        localDaUsTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        localDaUsTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        localDaUsTxt.setText("Local da US");
        localDaUsTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        idadeTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        idadeTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        idadeTxt.setText("Idade");
        idadeTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        localDaUS.setEditable(false);
        localDaUS.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        localDaUS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        localDaUS.setEnabled(false);
        localDaUS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                localDaUSMouseExited(evt);
            }
        });
        localDaUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localDaUSActionPerformed(evt);
            }
        });

        idade.setEditable(false);
        idade.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        idade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        idade.setFocusable(false);
        idade.setRequestFocusEnabled(false);

        faixaEtariaTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        faixaEtariaTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        faixaEtariaTxt.setText("Faixa Etária");
        faixaEtariaTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        faixaEtaria.setEditable(false);
        faixaEtaria.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        faixaEtaria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        faixaEtaria.setFocusable(false);
        faixaEtaria.setRequestFocusEnabled(false);
        faixaEtaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faixaEtariaActionPerformed(evt);
            }
        });

        provinciaDeNascimentoTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        provinciaDeNascimentoTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        provinciaDeNascimentoTxt.setText("Provincia de Nascimento");
        provinciaDeNascimentoTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        provinciaNascimento.setEditable(false);
        provinciaNascimento.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        provinciaNascimento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        provinciaNascimento.setEnabled(false);
        provinciaNascimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                provinciaNascimentoMouseExited(evt);
            }
        });
        provinciaNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provinciaNascimentoActionPerformed(evt);
            }
        });

        dataRegistoCasoTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        dataRegistoCasoTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dataRegistoCasoTxt.setText("Data de Registo Do Caso");
        dataRegistoCasoTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        distritoDeNascimentoTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        distritoDeNascimentoTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        distritoDeNascimentoTxt.setText("Distrito De nascimento");
        distritoDeNascimentoTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        dataRegistoCaso.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        dataRegistoCaso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dataRegistoCaso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dataRegistoCasoMouseExited(evt);
            }
        });
        dataRegistoCaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataRegistoCasoActionPerformed(evt);
            }
        });

        distritoNascimento.setEditable(false);
        distritoNascimento.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        distritoNascimento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        distritoNascimento.setEnabled(false);
        distritoNascimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                distritoNascimentoMouseExited(evt);
            }
        });
        distritoNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distritoNascimentoActionPerformed(evt);
            }
        });

        nidTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        nidTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nidTxt.setText("NID");
        nidTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        usDeAssistenciaTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        usDeAssistenciaTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        usDeAssistenciaTxt.setText("US de Assistência ");
        usDeAssistenciaTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        nid.setEditable(false);
        nid.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        nid.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nid.setEnabled(false);
        nid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nidMouseExited(evt);
            }
        });
        nid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nidActionPerformed(evt);
            }
        });

        UsDeAssistencia.setEditable(false);
        UsDeAssistencia.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        UsDeAssistencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UsDeAssistencia.setEnabled(false);
        UsDeAssistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UsDeAssistenciaMouseExited(evt);
            }
        });
        UsDeAssistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsDeAssistenciaActionPerformed(evt);
            }
        });

        nomePacienteTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        nomePacienteTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nomePacienteTxt.setText("Nome Do Paciente");
        nomePacienteTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        nivelCarreira.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        nivelCarreira.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar nivel de carreira", "Superior", "Médio", "Básico", "Elementar" }));
        nivelCarreira.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nivelCarreira.setEnabled(false);
        nivelCarreira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelCarreiraActionPerformed(evt);
            }
        });

        nomePaciente.setEditable(false);
        nomePaciente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        nomePaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nomePaciente.setEnabled(false);
        nomePaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nomePacienteMouseExited(evt);
            }
        });
        nomePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomePacienteActionPerformed(evt);
            }
        });

        sexo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar sexo", "M", "F" }));
        sexo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sexo.setEnabled(false);
        sexo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sexoMouseExited(evt);
            }
        });
        sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoActionPerformed(evt);
            }
        });

        sexoTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        sexoTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sexoTxt.setText("Sexo");
        sexoTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        avancarBtn.setText("Avançar");
        avancarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        avancarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancarBtnActionPerformed(evt);
            }
        });

        carreiraTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        carreiraTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        carreiraTxt.setText("Carreira");
        carreiraTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        carreira.setEditable(false);
        carreira.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        carreira.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        carreira.setEnabled(false);
        carreira.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carreiraMouseExited(evt);
            }
        });
        carreira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carreiraActionPerformed(evt);
            }
        });

        nivelDeCarreiraTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        nivelDeCarreiraTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nivelDeCarreiraTxt.setText("Nivel de Carreira");
        nivelDeCarreiraTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        categoriaTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        categoriaTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        categoriaTxt.setText("Categoria");
        categoriaTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        categoria.setEditable(false);
        categoria.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        categoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        categoria.setEnabled(false);
        categoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                categoriaMouseExited(evt);
            }
        });
        categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar o Cadastro");
        cancelar.setFocusPainted(false);
        cancelar.setFocusable(false);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(provinciaDeNascimentoTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(provinciaNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(idadeTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(categoriaTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(carreiraTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carreira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(nomePacienteTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(dataRegistoCasoTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dataRegistoCaso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nidTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(distritoDeNascimentoTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(faixaEtariaTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dataNascimentoTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nivelDeCarreiraTxt)
                                .addComponent(sexoTxt))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(usDeAssistenciaTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UsDeAssistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(209, 209, 209)))
                        .addComponent(localDaUsTxt)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(localDaUS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(distritoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nivelCarreira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(faixaEtaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(avancarBtn)))
                .addGap(43, 43, 43))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {UsDeAssistencia, avancarBtn, carreira, categoria, dataNascimento, dataNascimentoTxt, dataRegistoCaso, distritoDeNascimentoTxt, distritoNascimento, faixaEtaria, faixaEtariaTxt, idade, localDaUS, localDaUsTxt, nid, nidTxt, nivelCarreira, nivelDeCarreiraTxt, nomePaciente, provinciaNascimento, sexo, sexoTxt});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nidTxt)
                    .addComponent(dataRegistoCaso)
                    .addComponent(dataRegistoCasoTxt)
                    .addComponent(nid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexoTxt)
                    .addComponent(nomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomePacienteTxt)
                    .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nivelDeCarreiraTxt)
                    .addComponent(carreira)
                    .addComponent(carreiraTxt)
                    .addComponent(nivelCarreira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataNascimentoTxt)
                    .addComponent(categoria)
                    .addComponent(categoriaTxt)
                    .addComponent(dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(faixaEtaria)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(faixaEtariaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idade)
                        .addComponent(idadeTxt)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(distritoDeNascimentoTxt)
                            .addComponent(provinciaNascimento)
                            .addComponent(provinciaDeNascimentoTxt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(localDaUsTxt)
                            .addComponent(localDaUS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UsDeAssistencia)
                            .addComponent(usDeAssistenciaTxt)))
                    .addComponent(distritoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avancarBtn)
                    .addComponent(cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {UsDeAssistencia, avancarBtn, cancelar, carreira, categoria, dataNascimento, dataNascimentoTxt, dataRegistoCaso, distritoDeNascimentoTxt, distritoNascimento, faixaEtaria, faixaEtariaTxt, idade, localDaUS, localDaUsTxt, nid, nidTxt, nivelCarreira, nivelDeCarreiraTxt, nomePaciente, provinciaNascimento, sexo, sexoTxt});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dataNascimentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataNascimentoMouseExited
        if (dataNascimento.isEditable() && dataNascimento.isEnabled()) {
            var dataTexto = dataNascimento.getText();
            if (dataTexto != null && !dataTexto.trim().isEmpty()) {
                dataNascimentoPreencido = true;
                if (isValidDateFormat(dataTexto)) {
                    var idadePaciente = calcularIdade(dataTexto);
                    idade.setText(Integer.toString(idadePaciente));
                    var faixaEtariaPaciente = calcularFaixaEtaria(idadePaciente);
                    faixaEtaria.setText(faixaEtariaPaciente);
                    provinciaNascimento.setEnabled(true);
                    provinciaNascimento.setEditable(true);
                    provinciaNascimento.requestFocus();
                    doente.setFaixaEtaria(faixaEtariaPaciente);
                    doente.setIdade(valueOf(idade.getText()));
                    try {
                        doente.setDataNascimento(converterStringParaData(dataTexto));
                    } catch (ParseException ex) {
                        getLogger(InformacaoBasicaPaciente.class.getName()).log(SEVERE, null, ex);
                    }

                } else {
                    showMessageDialog(this, "Formato de data inválido. Use dd/MM/AAAA. \n o ano deve esar entre [1930 ate o ano Actual]", "Data Invalida", ERROR_MESSAGE);
                    dataNascimento.setText("");
                }

            } else {
                showMessageDialog(this, "Por favor, preenchaa Data de Nascimento do Paciente primeiro.");
                dataNascimento.requestFocus();
            }
        }
    }//GEN-LAST:event_dataNascimentoMouseExited

    private void dataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataNascimentoActionPerformed

        var dataTexto = dataNascimento.getText();
        if (dataTexto != null && !dataTexto.trim().isEmpty()) {
            dataNascimentoPreencido = true;
            if (isValidDateFormat(dataTexto)) {
                var idadePaciente = calcularIdade(dataTexto);
                idade.setText(Integer.toString(idadePaciente));
                doente.setIdade(valueOf(idade.getText()));
                var faixaEtariaPaciente = calcularFaixaEtaria(idadePaciente);
                faixaEtaria.setText(faixaEtariaPaciente);
                doente.setFaixaEtaria(faixaEtariaPaciente);
                try {
                    doente.setDataNascimento(converterStringParaData(dataTexto));
                } catch (ParseException ex) {
                    getLogger(InformacaoBasicaPaciente.class.getName()).log(SEVERE, null, ex);
                }
                provinciaNascimento.setEditable(true);
                provinciaNascimento.setEnabled(true);
                provinciaNascimento.requestFocus();

            } else {
                showMessageDialog(this, "Formato de data inválido. Use dd/MM/AAAA. \n o ano deve esar entre [1930 ate o ano Actual]", "Data Invalida", ERROR_MESSAGE);
                dataNascimento.setText("");
            }

        } else {
            showMessageDialog(this, "Por favor, preencha a Data de Nascimento do Paciente primeiro.");
            dataNascimento.requestFocus();

        }
    }//GEN-LAST:event_dataNascimentoActionPerformed

    private void localDaUSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_localDaUSMouseExited
        if (localDaUS.isEditable() && localDaUS.isEnabled()) {
            var localDaUSValue = localDaUS.getText().trim();
            if (localDaUSValue.matches("[a-zA-Z ]+")) {
                localDaUSPreenchido = true;
                doente.setLocalUs(localDaUSValue);
            avancarBtn.requestFocus();
            } else {
                showMessageDialog(this, "O local da US deve conter apenas letras.", "Apenas Letras", ERROR_MESSAGE);
                localDaUS.requestFocus();
                doente.setLocalUs(localDaUSValue);

            }
        }
    }//GEN-LAST:event_localDaUSMouseExited

    private void localDaUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localDaUSActionPerformed

        var localDaUSValue = localDaUS.getText().trim();
        if (localDaUSValue.matches("[a-zA-Z ]+")) {
            localDaUSPreenchido = true;
            doente.setLocalUs(localDaUSValue);
            avancarBtn.requestFocus();
        } else {
            showMessageDialog(this, "O Local da US deve conter apenas letras.", "Apenas Letras", ERROR_MESSAGE);
            localDaUS.requestFocus();
        }
    }//GEN-LAST:event_localDaUSActionPerformed

    private void provinciaNascimentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_provinciaNascimentoMouseExited
        if (provinciaNascimento.isEditable() && provinciaNascimento.isEnabled()) {
            var provinciaNascimentoValue = provinciaNascimento.getText().trim();
            if (provinciaNascimentoValue.matches("[a-zA-Z ]+")) {
                provinciaNascimentoPreenchido = true;
                distritoNascimento.setEnabled(true);
                distritoNascimento.setEditable(true);

                distritoNascimento.requestFocus();
                doente.setProvinciaNascimento(provinciaNascimentoValue);

            } else {
                showMessageDialog(this, "A Provincia deve conter apenas letras.", "Apenas Letras", ERROR_MESSAGE);
                provinciaNascimento.requestFocus();
            }
        }
    }//GEN-LAST:event_provinciaNascimentoMouseExited

    private void provinciaNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provinciaNascimentoActionPerformed

        var provinciaNascimentoValue = provinciaNascimento.getText().trim();
        if (provinciaNascimentoValue.matches("[a-zA-Z ]+")) {
            provinciaNascimentoPreenchido = true;
            distritoNascimento.setEnabled(true);
            distritoNascimento.setEditable(true);
            distritoNascimento.requestFocus();
            doente.setProvinciaNascimento(provinciaNascimentoValue);
        } else {
            showMessageDialog(this, "A Provincia deve conter apenas letras.", "Apenas Letras", ERROR_MESSAGE);
            provinciaNascimento.requestFocus();
        }
    }//GEN-LAST:event_provinciaNascimentoActionPerformed

    private void dataRegistoCasoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataRegistoCasoMouseExited

        var dataTexto = dataRegistoCaso.getText();
        if (dataTexto != null && !dataTexto.trim().isEmpty()) {
            dataRegistoCasoPreencido = true;
            if (isValidDateFormat(dataTexto)) {
                nid.setEditable(true);
                nid.setEnabled(true);
                nid.requestFocus();
            } else {
                showMessageDialog(this, "Formato de data inválido. Use dd/MM/yyyy.", "Erro", ERROR_MESSAGE);
                dataRegistoCaso.setText("");
            }

        } else {

            showMessageDialog(this, "Por favor, preencha o a Data de Registo do caso do Paciente primeiro.");
            dataRegistoCaso.requestFocus();
        }
    }//GEN-LAST:event_dataRegistoCasoMouseExited

    private void dataRegistoCasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataRegistoCasoActionPerformed
        var dataTexto = dataRegistoCaso.getText();
        if (dataTexto != null && !dataTexto.trim().isEmpty()) {
            dataRegistoCasoPreencido = true;
            if (isValidDateFormat(dataTexto)) {
                nid.setEditable(true);
                nid.setEnabled(true);
                try {
                    doente.setDataRegistoCaso(converterStringParaData(dataTexto));
                } catch (ParseException ex) {
                    Logger.getLogger(InformacaoBasicaPaciente.class.getName()).log(Level.SEVERE, null, ex);
                }
                nid.requestFocus();
            } else {
                showMessageDialog(this, "Formato de data inválido. Use dd/MM/yyyy.", "Data Invalida", ERROR_MESSAGE);
                dataRegistoCaso.setText("");
            }

        } else {

            showMessageDialog(this, "Por favor, preencha o a Data de Registo do caso do Paciente primeiro.");
            dataRegistoCaso.requestFocus();
        }
    }//GEN-LAST:event_dataRegistoCasoActionPerformed

    private void distritoNascimentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_distritoNascimentoMouseExited
        if (distritoNascimento.isEditable() && distritoNascimento.isEnabled()) {
            var distritoNascimentoValue = distritoNascimento.getText().trim();
            if (distritoNascimentoValue.matches("[a-zA-Z ]+")) {
                distritoNascimentoPreenchido = true;
                UsDeAssistencia.setEnabled(true);
                UsDeAssistencia.setEditable(true);
                UsDeAssistencia.requestFocus();
                doente.setDistritoNascimento(distritoNascimentoValue);
            } else {
                showMessageDialog(this, "O distrito deve conter apenas letras.", "Apenas Letras", ERROR_MESSAGE);
                distritoNascimento.requestFocus();
            }
        }
    }//GEN-LAST:event_distritoNascimentoMouseExited

    private void distritoNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distritoNascimentoActionPerformed

        var distritoNascimentoValue = distritoNascimento.getText().trim();
        if (distritoNascimentoValue.matches("[a-zA-Z ]+")) {
            distritoNascimentoPreenchido = true;
            UsDeAssistencia.setEnabled(true);
            UsDeAssistencia.setEditable(true);
            UsDeAssistencia.requestFocus();
            doente.setDistritoNascimento(distritoNascimentoValue);
        } else {
            showMessageDialog(this, "O distrito deve conter apenas letras.", "Apenas Letras", ERROR_MESSAGE);
            distritoNascimento.requestFocus();
        }
    }//GEN-LAST:event_distritoNascimentoActionPerformed

    private void nidMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nidMouseExited
        if (nid.isEnabled() && nid.isEditable()) {
            var nidValue = nid.getText().trim();
            if (nidValue.matches("\\d+")) {
                if (nidValue.length() == 5) {
                    nidPreenchido = true;
                    nomePaciente.setEditable(true);
                    doente.setNid(nidValue);
                    nomePaciente.setEnabled(true);
                    nomePaciente.requestFocus();
                } else {
                    showMessageDialog(this, "O NID do Paciente deve ter exatamente 5 dígitos.", "5 digitos permitidos", ERROR_MESSAGE);
                    nid.requestFocus();
                }
            } else {
                showMessageDialog(this, "O NID do Paciente deve conter apenas números.", "Apenas Numeros Permitidos", ERROR_MESSAGE);
                nid.requestFocus();
            }
        }
    }//GEN-LAST:event_nidMouseExited

    private void nidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nidActionPerformed

        var nidValue = nid.getText().trim();
if (doentes.findPaciente(nidValue) != null){
       var paciente =     doentes.findPaciente(nidValue); 

    localDaUS.setText(paciente.getLocalUs());
    localDaUS.setEditable(true);
    localDaUS.setEnabled(true);
    
    UsDeAssistencia.setText(paciente.getUsAssistencia());
    UsDeAssistencia.setEditable(true);
    UsDeAssistencia.setEnabled(true);
    
    distritoNascimento.setText(paciente.getDistritoNascimento());
   distritoNascimento.setEditable(true);
    distritoNascimento.setEnabled(true);
    
    provinciaNascimento.setText(paciente.getProvinciaNascimento());
   provinciaNascimento.setEditable(true);
    provinciaNascimento.setEnabled(true);
    
   nivelCarreira.setSelectedItem(paciente.getNivelCarreira());
   nivelCarreira.setEditable(true);
   nivelCarreira.setEnabled(true);
   
   dataNascimento.setText(converteData(paciente.getDataNascimento()));
     dataNascimento.setEditable(true);
     dataNascimento.setEnabled(true);
    
   categoria.setText(paciente.getCategoria());
   carreira.setText(paciente.getCarreira());
    
    nomePaciente.setText(paciente.getNome());
    nomePaciente.setEditable(true);
    nomePaciente.setEnabled(true);
    
     faixaEtaria.setText(doentes.findPaciente(String.valueOf(nidValue)).getFaixaEtaria());
     faixaEtaria.setEnabled(true);
     
     idade.setText(String.valueOf( paciente.getIdade()));
     idade.setEnabled(true);
    
     
    
    sexo.setSelectedItem(paciente.getSexo());
    sexo.setEnabled(true);
    sexo.setEditable(true);
    
    dataRegistoCaso.setText(converteData(paciente.getDataRegistoCaso()));
    dataRegistoCaso.setEnabled(true);
    dataRegistoCaso.setEditable(true);
    
   localDaUS.setText(paciente.getLocalUs());
   localDaUS.setEditable(true);
   localDaUS.setEnabled(true);
    
    nidPreenchido = true;
     dataRegistoCasoPreencido = true;
     localDaUSPreenchido = true;
     UsDeAssistenciaPreenchido = true;
     distritoNascimentoPreenchido = true;
     provinciaNascimentoPreenchido = true;
     dataNascimentoPreencido = true;
     categoriaPreenchido = true;
     carreiraPreenchido = true;
     nomePreenchido = true;
     nivelCarreiraPreenchido=true;
     
}
        if (nidValue.matches("\\d+")) {
            if (nidValue.length() == 5) {
                nidPreenchido = true;
                nomePaciente.setEditable(true);
                doente.setNid(nidValue);
                nomePaciente.setEnabled(true);
                nomePaciente.requestFocus();
            } else {
                showMessageDialog(this, "O NID do Paciente deve ter exatamente 5 dígitos.", "5 Digitos Obrigatorios", ERROR_MESSAGE);
                nid.requestFocus();
            }
        } else {
            showMessageDialog(this, "O NID do Paciente deve conter apenas números.", "Apenas Numeros Permitidos", ERROR_MESSAGE);
            nid.requestFocus();
        }
    }//GEN-LAST:event_nidActionPerformed

    private void UsDeAssistenciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsDeAssistenciaMouseExited
        if (UsDeAssistencia.isEnabled() && UsDeAssistencia.isEditable()) {
            var UsDeAssistenciaValue = UsDeAssistencia.getText().trim();
            if (UsDeAssistenciaValue.matches("[a-zA-Z ]+")) {
                UsDeAssistenciaPreenchido = true;
                localDaUS.setEnabled(true);
                localDaUS.setEditable(true);
                localDaUS.requestFocus();
                doente.setUsAssistencia(UsDeAssistenciaValue);

            } else {
                showMessageDialog(this, "A Uniddade de Assistencia deve conter apenas letras.", "Apenas Letras", ERROR_MESSAGE);
                UsDeAssistencia.requestFocus();
            }
        }
    }//GEN-LAST:event_UsDeAssistenciaMouseExited

    private void UsDeAssistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsDeAssistenciaActionPerformed

        var UsDeAssistenciaValue = UsDeAssistencia.getText().trim();
        if (UsDeAssistenciaValue.matches("[a-zA-Z ]+")) {
            UsDeAssistenciaPreenchido = true;
            localDaUS.setEnabled(true);
            localDaUS.setEditable(true);
            localDaUS.requestFocus();
            doente.setUsAssistencia(UsDeAssistenciaValue);
        } else {
            showMessageDialog(this, "A Uniddade de Assistencia deve conter apenas letras.", "Apenas Letras", ERROR_MESSAGE);
             localDaUS.setEnabled(false);
            localDaUS.setEditable(false);
            UsDeAssistencia.requestFocus();
            UsDeAssistencia.setText("");
        }
    }//GEN-LAST:event_UsDeAssistenciaActionPerformed

    private void nivelCarreiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelCarreiraActionPerformed

        var nivelSelecionado = (String) nivelCarreira.getSelectedItem();
        if (!nivelSelecionado.equals("seleccionar nivel de carreira")) {
            nivelCarreiraPreenchido = true;
            categoria.setEnabled(true);
            doente.setNivelCarreira(nivelSelecionado);
            categoria.setEditable(true);
            categoria.requestFocus();
        } else {
            showMessageDialog(this, "Por favor, selecione um nível de carreira válido.", "ERRO", ERROR_MESSAGE);
            nivelCarreira.requestFocus();
        }
    }//GEN-LAST:event_nivelCarreiraActionPerformed

    private void nomePacienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomePacienteMouseExited
        if (nomePaciente.isEnabled() && nomePaciente.isEditable()) {
            var nomeValue = nomePaciente.getText().trim();
            if (nomeValue.matches("[a-zA-Z ]+")) {
                nomePreenchido = true;
                sexo.setEditable(true);
                doente.setNome(nomeValue);
                sexo.setEnabled(true);
                sexo.requestFocus();
            } else {
                showMessageDialog(this, "O nome do paciente deve conter apenas letras.", "Apenas Letras Permitidas", ERROR_MESSAGE);
                nomePaciente.requestFocus();
            }
        }
    }//GEN-LAST:event_nomePacienteMouseExited

    private void nomePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomePacienteActionPerformed

        var nomeValue = nomePaciente.getText().trim();
        if (nomeValue.matches("[a-zA-Z ]+")) {
            nomePreenchido = true;
            sexo.setEditable(true);
            sexo.setEnabled(true);
            sexo.requestFocus();
            doente.setNome(nomeValue);
        } else {
            showMessageDialog(this, "O nome do paciente deve conter apenas letras.", "ERRO", ERROR_MESSAGE);
            nomePaciente.requestFocus();
        }
    }//GEN-LAST:event_nomePacienteActionPerformed

    private void sexoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sexoMouseExited

    }//GEN-LAST:event_sexoMouseExited

    private void sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoActionPerformed

        var sexoPreencido = false;
        var sexoSelecionado = (String) sexo.getSelectedItem();
        if ("M".equals(sexoSelecionado) || "F".equals(sexoSelecionado)) {
            sexoPreencido = true;
            carreira.setEditable(true);
            doente.setSexo(sexoSelecionado);
            carreira.setEnabled(true);
            carreira.requestFocus();
        } else {
            showMessageDialog(this, "Selecione um valor válido para o campo Sexo.", "ERRO", ERROR_MESSAGE);
            sexo.requestFocus();
        }
    }//GEN-LAST:event_sexoActionPerformed

    private void avancarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarBtnActionPerformed
        if (nidPreenchido
                && dataRegistoCasoPreencido
                && localDaUSPreenchido
                && UsDeAssistenciaPreenchido
                && distritoNascimentoPreenchido
                && provinciaNascimentoPreenchido
                && dataNascimentoPreencido
                && categoriaPreenchido
                && carreiraPreenchido
                && nivelCarreiraPreenchido && nomePreenchido) {

            if (frame2 == null) {
                frame2 = new LocalDeTrabalhoResidencia(this, doente , usuario);
                
            }
            this.setVisible(false);

            try {
                // Configurações adicionais do frame2, se necessário
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                Logger.getLogger(InformacaoBasicaPaciente.class.getName()).log(Level.SEVERE, null, ex);
            }

            frame2.setLocationRelativeTo(null);
            frame2.setVisible(true);
        } else {
            showMessageDialog(this, "Deve Preencher Todos os Campos Antes de Avançar", "Campos Vazios", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_avancarBtnActionPerformed

    private void carreiraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carreiraMouseExited
        if (carreira.isEnabled() && carreira.isEditable()) {
            var carreiraValue = carreira.getText().trim();
            if (carreiraValue.matches("[a-zA-Z ]+")) {
                carreiraPreenchido = true;
                nivelCarreira.setEditable(true);
                doente.setCarreira(carreiraValue);

                nivelCarreira.setEnabled(true);
                nivelCarreira.requestFocus();
            } else {
                showMessageDialog(this, "O Carreira deve conter apenas letras.", "Apenas Letras", ERROR_MESSAGE);
                carreira.requestFocus();
            }
        }
    }//GEN-LAST:event_carreiraMouseExited

    private void carreiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carreiraActionPerformed

        var carreiraValue = carreira.getText().trim();
        if (carreiraValue.matches("[a-zA-Z ]+")) {
            carreiraPreenchido = true;
            nivelCarreira.setEditable(true);
doente.setCarreira(carreiraValue);
            nivelCarreira.setEnabled(true);
            nivelCarreira.requestFocus();
        } else {
            showMessageDialog(this, "A Carreira deve conter apenas letras.", "Apenas Letras", ERROR_MESSAGE);
            carreira.requestFocus();
        }
    }//GEN-LAST:event_carreiraActionPerformed

    private void categoriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriaMouseExited
        if (categoria.isEditable() && categoria.isEnabled()) {
            var categoriaValue = categoria.getText().trim();
            if (categoriaValue.matches("[a-zA-ZÀ-ÖØ-öø-ÿ -]+")) {
                categoriaPreenchido = true;
                dataNascimento.setEnabled(true);
                doente.setCategoria(categoriaValue);
                dataNascimento.setEditable(true);
                dataNascimento.requestFocus();
            } else {
                showMessageDialog(this, "A Categoria deve conter apenas letras.", "Apenas Letras", ERROR_MESSAGE);
                categoria.requestFocus();
            }
        }
    }//GEN-LAST:event_categoriaMouseExited

    private void categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaActionPerformed

        var categoriaValue = categoria.getText().trim();
        if (categoriaValue.matches("[a-zA-Z ]+")) {
            categoriaPreenchido = true;
            dataNascimento.setEditable(true);
            doente.setCategoria(categoriaValue);
            dataNascimento.setEnabled(true);
            dataNascimento.requestFocus();
        } else {
            showMessageDialog(this, "A Categoria deve conter apenas letras.", "Apenas Letras", ERROR_MESSAGE);
            categoria.requestFocus();
        }
    }//GEN-LAST:event_categoriaActionPerformed

    private void faixaEtariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faixaEtariaActionPerformed

    }//GEN-LAST:event_faixaEtariaActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        showMessageDialog(this, " Cadastro Cancelado");
            var escolherAccao = new EscolherAccao(usuario);
            escolherAccao.setLocationRelativeTo(null);
            escolherAccao.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new InformacaoBasicaPaciente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField UsDeAssistencia;
    private javax.swing.JButton avancarBtn;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField carreira;
    private javax.swing.JLabel carreiraTxt;
    private javax.swing.JTextField categoria;
    private javax.swing.JLabel categoriaTxt;
    private javax.swing.JTextField dataNascimento;
    private javax.swing.JLabel dataNascimentoTxt;
    private javax.swing.JTextField dataRegistoCaso;
    private javax.swing.JLabel dataRegistoCasoTxt;
    private javax.swing.JLabel distritoDeNascimentoTxt;
    private javax.swing.JTextField distritoNascimento;
    private javax.swing.JTextField faixaEtaria;
    private javax.swing.JLabel faixaEtariaTxt;
    private javax.swing.JTextField idade;
    private javax.swing.JLabel idadeTxt;
    private javax.swing.JTextField localDaUS;
    private javax.swing.JLabel localDaUsTxt;
    private javax.swing.JTextField nid;
    private javax.swing.JLabel nidTxt;
    private javax.swing.JComboBox<String> nivelCarreira;
    private javax.swing.JLabel nivelDeCarreiraTxt;
    private javax.swing.JTextField nomePaciente;
    private javax.swing.JLabel nomePacienteTxt;
    private javax.swing.JLabel provinciaDeNascimentoTxt;
    private javax.swing.JTextField provinciaNascimento;
    private javax.swing.JComboBox<String> sexo;
    private javax.swing.JLabel sexoTxt;
    private javax.swing.JLabel usDeAssistenciaTxt;
    // End of variables declaration//GEN-END:variables
    private static final Logger LOG = Logger.getLogger(InformacaoBasicaPaciente.class.getName());
}
