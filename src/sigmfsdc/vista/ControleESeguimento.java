package sigmfsdc.vista;


import static java.awt.EventQueue.invokeLater;
import java.text.ParseException;
import static java.util.logging.Level.SEVERE;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import javax.persistence.EntityManagerFactory;
import static javax.persistence.Persistence.createEntityManagerFactory;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.UIManager.setLookAndFeel;
import javax.swing.UnsupportedLookAndFeelException;
import sigmfsdc.controladora.ControleSeguimentoJpaController;
import sigmfsdc.controladora.LocalTrabalhoResidenciaJpaController;
import sigmfsdc.controladora.PacienteJpaController;
import sigmfsdc.modelo.ControleSeguimento;
import sigmfsdc.modelo.LocalTrabalhoResidencia;
import sigmfsdc.modelo.Paciente;
import sigmfsdc.modelo.Usuario;

public class ControleESeguimento extends javax.swing.JFrame implements MetodosGerais {

    EntityManagerFactory emf = createEntityManagerFactory("SistemaigmfsdcPU");
    LocalTrabalhoResidenciaJpaController locaisTrabalho = new LocalTrabalhoResidenciaJpaController(emf);
    LocalTrabalhoResidencia localTrabalho;
    ControleSeguimentoJpaController controles = new ControleSeguimentoJpaController(emf);
    ControleSeguimento controle = new ControleSeguimento();
    PacienteJpaController pacientes = new PacienteJpaController(emf);
    Paciente doente = new Paciente();
    Usuario usuario;
    private LocalDeTrabalhoResidencia frame2 = null;

    public ControleESeguimento() {
        initComponents();
    }

    public ControleESeguimento(LocalDeTrabalhoResidencia frame2, Paciente doente, LocalTrabalhoResidencia localDeTrabalho, Usuario usuario) {
        initComponents();
        this.frame2 = frame2;
        this.doente = doente;
        this.usuario = usuario;
        this.localTrabalho = localDeTrabalho;
        var cont = controles.findControleSeguimento(doente.getNid());
        if (cont != null) {
            Apss.setSelectedItem(cont.getApss());
            Apss.setEnabled(true);
            Apss.setEditable(true);
            aon.setSelectedItem(cont.getAon());
            aon.setEnabled(true);
            aon.setEditable(true);
            aspAnterior.setSelectedItem(cont.getEspAnteriorObservado());
            aspAnterior.setEnabled(true);
            aspAnterior.setEditable(true);
            consultaMedica.setSelectedItem(cont.getConsultaMedica());
            consultaMedica.setEnabled(true);
            consultaMedica.setEditable(true);
            dataConsultaActual.setText(converteData(cont.getDataConsultaAtual()));
            dataConsultaActual.setEnabled(true);
            dataConsultaActual.setEditable(true);
            dataConsultaAnterior.setText(converteData(cont.getDataConsultaAnterior()));
            dataConsultaAnterior.setEnabled(true);
            dataConsultaAnterior.setEditable(true);
//dataFalecimento.setS
            dataFalecimento.setEnabled(true);
            dataFalecimento.setEditable(true);
            dataProximaConsulta.setText(converteData(cont.getDataProximaConsulta()));
            dataProximaConsulta.setEnabled(true);
            dataProximaConsulta.setEditable(true);
            diagnostico.setSelectedItem(cont.getDiagnostico());
            diagnostico.setEnabled(true);
            diagnostico.setEditable(true);
            enfermidade.setSelectedItem(cont.getEnfermidade());
            enfermidade.setEnabled(true);
            enfermidade.setEditable(true);
            espActual.setSelectedItem(cont.getEspAtualObservado());
            espActual.setEnabled(true);
            espActual.setEditable(true);
            espObservado.setSelectedItem(cont.getEspObservado());
            espObservado.setEnabled(true);
            espObservado.setEditable(true);
            rastreio.setSelectedItem(cont.getRastreio());
            rastreio.setEnabled(true);
            rastreio.setEditable(true);
            situacaoActualPaciente.setSelectedItem(cont.getSituacaoAtualPaciente());
            situacaoActualPaciente.setEnabled(true);
            situacaoActualPaciente.setEditable(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aonTxt = new javax.swing.JLabel();
        aon = new javax.swing.JComboBox<>();
        dataConsultaActualTxt = new javax.swing.JLabel();
        situacaoActualPacienteTxt = new javax.swing.JLabel();
        EspObservadoTxt = new javax.swing.JLabel();
        situacaoActualPaciente = new javax.swing.JComboBox<>();
        espObservado = new javax.swing.JComboBox<>();
        dataProximaConsultaTxt = new javax.swing.JLabel();
        dataFalecimentoTxt = new javax.swing.JLabel();
        dataFalecimento = new javax.swing.JComboBox<>();
        consultaMedicaTxt = new javax.swing.JLabel();
        consultaMedica = new javax.swing.JComboBox<>();
        enfermidadeTxt = new javax.swing.JLabel();
        espActualTxt = new javax.swing.JLabel();
        espActual = new javax.swing.JComboBox<>();
        enfermidade = new javax.swing.JComboBox<>();
        dataConsultaActual = new javax.swing.JTextField();
        diagnosticoTxt = new javax.swing.JLabel();
        dataConsultaAnterior = new javax.swing.JTextField();
        diagnostico = new javax.swing.JComboBox<>();
        dataProximaConsulta = new javax.swing.JTextField();
        rastreioTxt = new javax.swing.JLabel();
        voltarTela2Btn = new javax.swing.JButton();
        rastreio = new javax.swing.JComboBox<>();
        guardarDadosBtn = new javax.swing.JButton();
        apssTxt = new javax.swing.JLabel();
        Apss = new javax.swing.JComboBox<>();
        dataConsultaAnteriorTxt = new javax.swing.JLabel();
        aspAnteriorTxt = new javax.swing.JLabel();
        aspAnterior = new javax.swing.JComboBox<>();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Passo 3: Controle e Seguimento");

        aonTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        aonTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        aonTxt.setText("AON");

        aon.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        aon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "Sempre vai a consulta", "Às vezes vai a consulta", "Nunca foi a consulta", "Não Aplicável" }));
        aon.setEnabled(false);
        aon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aonActionPerformed(evt);
            }
        });

        dataConsultaActualTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        dataConsultaActualTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dataConsultaActualTxt.setText("Data Da Consulta");

        situacaoActualPacienteTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        situacaoActualPacienteTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        situacaoActualPacienteTxt.setText("Situação Actual do Paciente");

        EspObservadoTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        EspObservadoTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EspObservadoTxt.setText("Esp Observado");

        situacaoActualPaciente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        situacaoActualPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "Activo", "Abandono", "Falecido" }));
        situacaoActualPaciente.setEnabled(false);
        situacaoActualPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                situacaoActualPacienteActionPerformed(evt);
            }
        });

        espObservado.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        espObservado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "Bem ", "Normal", "Mal" }));
        espObservado.setEnabled(false);
        espObservado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espObservadoActionPerformed(evt);
            }
        });

        dataProximaConsultaTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        dataProximaConsultaTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dataProximaConsultaTxt.setText("Data da Próxima Consulta");

        dataFalecimentoTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        dataFalecimentoTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dataFalecimentoTxt.setText("Data de Falecimento");

        dataFalecimento.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        dataFalecimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dataFalecimento.setEnabled(false);
        dataFalecimento.setOpaque(true);

        consultaMedicaTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        consultaMedicaTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        consultaMedicaTxt.setText("Consulta Médica ");

        consultaMedica.setEditable(true);
        consultaMedica.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        consultaMedica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "Sempre vai a consulta", "Às vezes vai a consulta", "Nunca foi a consulta" }));
        consultaMedica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultaMedicaMouseExited(evt);
            }
        });
        consultaMedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaMedicaActionPerformed(evt);
            }
        });

        enfermidadeTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        enfermidadeTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        enfermidadeTxt.setText("Enfermidade");

        espActualTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        espActualTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        espActualTxt.setText("ESP Actual Observado");

        espActual.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        espActual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "Bem ", "Normal", "Mal" }));
        espActual.setEnabled(false);
        espActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espActualActionPerformed(evt);
            }
        });

        enfermidade.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        enfermidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "HIV", "TB", "Hipertensão", "Diabetes", "Cancro da mama", "Cancro uterino, ", "Câncro da próstata", "HIV e TB", "HIV e Hipertensão", "HIV e Diabetes", "HIV e Câncro", "TB e Hipertensão", "Hipertensão e Diabetes" }));
        enfermidade.setEnabled(false);
        enfermidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enfermidadeActionPerformed(evt);
            }
        });

        dataConsultaActual.setEditable(false);
        dataConsultaActual.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        dataConsultaActual.setEnabled(false);
        dataConsultaActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataConsultaActualActionPerformed(evt);
            }
        });

        diagnosticoTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        diagnosticoTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        diagnosticoTxt.setText("Diagnóstico");

        dataConsultaAnterior.setEditable(false);
        dataConsultaAnterior.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        dataConsultaAnterior.setEnabled(false);
        dataConsultaAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataConsultaAnteriorActionPerformed(evt);
            }
        });

        diagnostico.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        diagnostico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "Determinado", "Não determinado" }));
        diagnostico.setEnabled(false);
        diagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagnosticoActionPerformed(evt);
            }
        });

        dataProximaConsulta.setEditable(false);
        dataProximaConsulta.setEnabled(false);
        dataProximaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataProximaConsultaActionPerformed(evt);
            }
        });

        rastreioTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        rastreioTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rastreioTxt.setText("Rastreio");

        voltarTela2Btn.setText("Anterior");
        voltarTela2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTela2BtnActionPerformed(evt);
            }
        });

        rastreio.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        rastreio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "Rastreado", "Não rastreado" }));
        rastreio.setEnabled(false);
        rastreio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rastreioActionPerformed(evt);
            }
        });

        guardarDadosBtn.setText("Guardar");
        guardarDadosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarDadosBtnActionPerformed(evt);
            }
        });

        apssTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        apssTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        apssTxt.setText("APSS");

        Apss.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Apss.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "Sempre vai a consulta", "Às vezes vai a consulta", "Nunca foi a consulta", "Não Aplicável" }));
        Apss.setEnabled(false);
        Apss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApssActionPerformed(evt);
            }
        });

        dataConsultaAnteriorTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        dataConsultaAnteriorTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dataConsultaAnteriorTxt.setText("Data da Consulta");
        dataConsultaAnteriorTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dataConsultaAnteriorTxtMouseExited(evt);
            }
        });

        aspAnteriorTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        aspAnteriorTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        aspAnteriorTxt.setText("ESP Anterior Observado");

        aspAnterior.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        aspAnterior.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "Bem", "Normal", "Mal" }));
        aspAnterior.setEnabled(false);
        aspAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aspAnteriorActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dataProximaConsultaTxt)
                        .addGap(18, 18, 18)
                        .addComponent(dataProximaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EspObservadoTxt)
                        .addGap(24, 24, 24)
                        .addComponent(espObservado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(aonTxt)
                        .addGap(18, 18, 18)
                        .addComponent(aon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apssTxt)
                        .addGap(18, 18, 18)
                        .addComponent(Apss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rastreioTxt)
                        .addGap(18, 18, 18)
                        .addComponent(rastreio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diagnosticoTxt)
                        .addGap(18, 18, 18)
                        .addComponent(diagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(consultaMedicaTxt)
                        .addGap(18, 18, 18)
                        .addComponent(consultaMedica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enfermidadeTxt)
                        .addGap(18, 18, 18)
                        .addComponent(enfermidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(espActualTxt)
                        .addGap(18, 18, 18)
                        .addComponent(espActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataConsultaActualTxt)
                        .addGap(18, 18, 18)
                        .addComponent(dataConsultaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(aspAnteriorTxt)
                        .addGap(18, 18, 18)
                        .addComponent(aspAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataConsultaAnteriorTxt)
                        .addGap(18, 18, 18)
                        .addComponent(dataConsultaAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(situacaoActualPacienteTxt)
                                .addGap(18, 18, 18)
                                .addComponent(situacaoActualPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dataFalecimentoTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(voltarTela2Btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guardarDadosBtn)
                            .addComponent(dataFalecimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Apss, EspObservadoTxt, aon, aonTxt, apssTxt, aspAnterior, aspAnteriorTxt, consultaMedica, consultaMedicaTxt, dataConsultaActual, dataConsultaActualTxt, dataConsultaAnterior, dataConsultaAnteriorTxt, dataFalecimento, dataFalecimentoTxt, dataProximaConsulta, dataProximaConsultaTxt, diagnostico, diagnosticoTxt, enfermidade, enfermidadeTxt, espActual, espActualTxt, espObservado, guardarDadosBtn, rastreio, rastreioTxt, situacaoActualPaciente, situacaoActualPacienteTxt, voltarTela2Btn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(consultaMedicaTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(enfermidadeTxt)
                        .addComponent(enfermidade)
                        .addComponent(consultaMedica)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rastreio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rastreioTxt)
                    .addComponent(diagnosticoTxt)
                    .addComponent(diagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aonTxt)
                    .addComponent(apssTxt)
                    .addComponent(Apss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dataConsultaAnteriorTxt)
                        .addComponent(dataConsultaAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(aspAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(aspAnteriorTxt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(espActual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dataConsultaActualTxt)
                        .addComponent(dataConsultaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(espActualTxt)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataProximaConsultaTxt)
                    .addComponent(EspObservadoTxt)
                    .addComponent(espObservado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataProximaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataFalecimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(situacaoActualPacienteTxt)
                        .addComponent(situacaoActualPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dataFalecimentoTxt)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guardarDadosBtn)
                    .addComponent(voltarTela2Btn)
                    .addComponent(cancelar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Apss, EspObservadoTxt, aon, aonTxt, apssTxt, aspAnterior, aspAnteriorTxt, consultaMedica, consultaMedicaTxt, dataConsultaActual, dataConsultaActualTxt, dataConsultaAnterior, dataConsultaAnteriorTxt, dataFalecimento, dataFalecimentoTxt, dataProximaConsulta, dataProximaConsultaTxt, diagnostico, diagnosticoTxt, enfermidade, enfermidadeTxt, espActual, espActualTxt, espObservado, guardarDadosBtn, rastreio, rastreioTxt, situacaoActualPaciente, situacaoActualPacienteTxt, voltarTela2Btn});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aonActionPerformed
        var aonSeleccionado = (String) aon.getSelectedItem();
        if (!aonSeleccionado.equals("seleccionar")) {
            Apss.setEnabled(true);
            Apss.setEditable(true);
            controle.setAon(aonSeleccionado);
            Apss.requestFocus();
        } else {
            showMessageDialog(this, "Por favor selecione uma opcao válida.", "Seleccionar Campo", ERROR_MESSAGE);
            aon.requestFocus();
             Apss.setEnabled(false);
            Apss.setEditable(false);
        }
    }//GEN-LAST:event_aonActionPerformed

    private void situacaoActualPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_situacaoActualPacienteActionPerformed
        var situacaoActualPacienteSelecionado = (String) situacaoActualPaciente.getSelectedItem();
        if (!situacaoActualPacienteSelecionado.equals("seleccionar")) {
            controle.setSituacaoAtualPaciente(situacaoActualPacienteSelecionado);
            if (situacaoActualPacienteSelecionado.equals("Falecido")) {
                dataFalecimento.setEnabled(true);
                dataFalecimento.setEditable(true);
                dataFalecimento.requestFocus();
            }
        } else {
            showMessageDialog(this, "Por favor selecione uma opcao válida.", "Seleccionar Campo", ERROR_MESSAGE);
            situacaoActualPaciente.requestFocus();
              dataFalecimento.setEnabled(false);
                dataFalecimento.setEditable(false);
                
        }
    }//GEN-LAST:event_situacaoActualPacienteActionPerformed

    private void espObservadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espObservadoActionPerformed
        var espObservadoSelecionado = (String) espObservado.getSelectedItem();
        if (!espObservadoSelecionado.equals("seleccionar")) {
            situacaoActualPaciente.setEnabled(true);
            situacaoActualPaciente.setEditable(true);
            controle.setEspObservado(espObservadoSelecionado);
            situacaoActualPaciente.requestFocus();
        } else {
            showMessageDialog(this, "Por favor selecione uma opcao válida.", "Seleccionar Campo", ERROR_MESSAGE);
            espObservado.requestFocus();
             situacaoActualPaciente.setEnabled(false);
            situacaoActualPaciente.setEditable(false);
        }
    }//GEN-LAST:event_espObservadoActionPerformed

    private void consultaMedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaMedicaActionPerformed
        var consultamedicaValue = (String) consultaMedica.getSelectedItem();
        if (!consultamedicaValue.equals("seleccionar")) {
            enfermidade.setEnabled(true);
            enfermidade.setEditable(true);
            controle.setConsultaMedica(consultamedicaValue);
            enfermidade.requestFocus();
        } else {
            showMessageDialog(this, "Por favor selecione uma opcao válida.", "Seleccionar Campo", ERROR_MESSAGE);
            consultaMedica.requestFocus();
             enfermidade.setEnabled(false);
            enfermidade.setEditable(false);
        }
    }//GEN-LAST:event_consultaMedicaActionPerformed

    private void espActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espActualActionPerformed
        var espActualSelecionado = (String) espActual.getSelectedItem();
        if (!espActualSelecionado.equals("seleccionar")) {
            dataConsultaActual.setEnabled(true);
            dataConsultaActual.setEditable(true);
            dataConsultaActual.requestFocus();
            controle.setEspAtualObservado(espActualSelecionado);
        } else {
            showMessageDialog(this, "Por favor selecione uma opcao válida.", "Seleccionar Campo", ERROR_MESSAGE);
            espActual.requestFocus();
            dataConsultaActual.setEnabled(false);
            dataConsultaActual.setEditable(false);
        }
    }//GEN-LAST:event_espActualActionPerformed

    private void enfermidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enfermidadeActionPerformed
        var enfermidadeSeleccionada = (String) enfermidade.getSelectedItem();
        if (!enfermidadeSeleccionada.equals("seleccionar")) {
            rastreio.setEnabled(true);
            rastreio.setEditable(true);
            controle.setEnfermidade(enfermidadeSeleccionada);
            rastreio.requestFocus();
        } else {
            showMessageDialog(this, "Por favor selecione uma opcao válida.", "Seleccionar Campo", ERROR_MESSAGE);
            enfermidade.requestFocus();
             rastreio.setEnabled(false);
            rastreio.setEditable(false);
        }
    }//GEN-LAST:event_enfermidadeActionPerformed

    private void dataConsultaActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataConsultaActualActionPerformed
        var dataConsultaActualPreencido = false;
        var dataTexto = dataConsultaActual.getText();
        if (dataTexto != null && !dataTexto.trim().isEmpty()) {
            dataConsultaActualPreencido = true;
            if (isValidDateFormat(dataTexto)) {
                dataProximaConsulta.setEditable(true);
                dataProximaConsulta.setEnabled(true);
                try {
                    controle.setDataConsultaAtual(converterStringParaData(dataTexto));
                } catch (ParseException ex) {
                    getLogger(ControleESeguimento.class.getName()).log(SEVERE, null, ex);
                }
                dataProximaConsulta.requestFocus();
            } else {
                showMessageDialog(this, "Formato de data inválido. Use dd/MM/aaaa.", "Data Invalida", ERROR_MESSAGE);
  dataProximaConsulta.setEditable(false);
                dataProximaConsulta.setEnabled(false);
            }

        } else {

            showMessageDialog(this, "Por favor, preencha o a Data de Registo do caso do Paciente primeiro.");
            dataConsultaActual.requestFocus();
            dataProximaConsulta.setEditable(false);
            dataProximaConsulta.setEnabled(false);
        }
    }//GEN-LAST:event_dataConsultaActualActionPerformed

    private void dataConsultaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataConsultaAnteriorActionPerformed
        var dataConsultaAnteriorPreencido = false;
        var dataTexto = dataConsultaAnterior.getText();
        if (dataTexto != null && !dataTexto.trim().isEmpty()) {
            dataConsultaAnteriorPreencido = true;
            if (isValidDateFormat(dataTexto)) {
                espActual.setEditable(true);
                espActual.setEnabled(true);
                espActual.requestFocus();
                try {
                    controle.setDataConsultaAnterior(converterStringParaData(dataTexto));
                } catch (ParseException ex) {
                    getLogger(ControleESeguimento.class.getName()).log(SEVERE, null, ex);
                }
            } else {
                showMessageDialog(this, "Formato de data inválido. Use dd/MM/aaaa.", "Data Invalida", ERROR_MESSAGE);
           dataConsultaAnterior.requestFocus();
                espActual.setEditable(false);

           espActual.setEnabled(false);
            }

        } else {

            showMessageDialog(this, "Por favor, preencha  a Data");
            dataConsultaAnterior.requestFocus();
             espActual.setEditable(false);
                espActual.setEnabled(false);
        }
    }//GEN-LAST:event_dataConsultaAnteriorActionPerformed

    private void diagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagnosticoActionPerformed
        var diagnosticoSelecionado = (String) diagnostico.getSelectedItem();
        if (!diagnosticoSelecionado.equals("seleccionar")) {
            aon.setEnabled(true);
            aon.setEditable(true);
            controle.setDiagnostico(diagnosticoSelecionado);
            aon.requestFocus();
        } else {
            showMessageDialog(this, "Por favor selecione uma opcao válida.", "Seleccionar Campo", ERROR_MESSAGE);
            diagnostico.requestFocus();
            aon.setEnabled(false);
            aon.setEditable(false);
        }
    }//GEN-LAST:event_diagnosticoActionPerformed

    private void dataProximaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataProximaConsultaActionPerformed
        var dataRegistoCasoPreencido = false;
        var dataTexto = dataProximaConsulta.getText();
        if (dataTexto != null && !dataTexto.trim().isEmpty()) {
            dataRegistoCasoPreencido = true;
            if (isValidDateFormat(dataTexto)) {
                espObservado.setEditable(true);
                espObservado.setEnabled(true);
                try {
                    controle.setDataProximaConsulta(converterStringParaData(dataTexto));
                } catch (ParseException ex) {
                    getLogger(ControleESeguimento.class.getName()).log(SEVERE, null, ex);
                }
                espObservado.requestFocus();
            } else {
                showMessageDialog(this, "Formato de data inválido. Use dd/MM/aaaa. \n O ano deve estar entre 1930 ate o ano actual", "Data Invalida", ERROR_MESSAGE);
                espObservado.setEditable(false);
                espObservado.setEnabled(false);
            }
        } else {

            showMessageDialog(this, "Por favor, preencha o a Data de Registo do caso do Paciente primeiro.");
            dataProximaConsulta.requestFocus();
        }
    }//GEN-LAST:event_dataProximaConsultaActionPerformed

    private void voltarTela2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTela2BtnActionPerformed
        try {
            setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            getLogger(ControleESeguimento.class.getName()).log(SEVERE, null, ex);
        }
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_voltarTela2BtnActionPerformed

    private void rastreioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rastreioActionPerformed
        var RastreioSeleccionado = (String) rastreio.getSelectedItem();
        if (!RastreioSeleccionado.equals("seleccionar")) {
            diagnostico.setEnabled(true);
            diagnostico.setEditable(true);
            controle.setRastreio(RastreioSeleccionado);
            diagnostico.requestFocus();
        } else {
            showMessageDialog(this, "Por favor selecione uma opcao válida.", "Seleccionar Campo", ERROR_MESSAGE);
            rastreio.requestFocus();
        }
    }//GEN-LAST:event_rastreioActionPerformed

    private void guardarDadosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarDadosBtnActionPerformed

        try {
            var existingDoente = pacientes.findPaciente(doente.getNid());

            if (existingDoente == null) {
                controle.setNid(doente.getNid());
                pacientes.create(doente);
                showMessageDialog(this, "Doente criado com sucesso!");
            } else {
                pacientes.edit(existingDoente);
                showMessageDialog(this, "Doente atualizado com sucesso!");
            }
        } catch (Exception ex) {
            getLogger(ControleESeguimento.class.getName()).log(SEVERE, null, ex);
            showMessageDialog(this, "Erro ao salvar doente: " + ex.getMessage(), "Erro", ERROR_MESSAGE);
        }

        try {
            var existingLocalTrabalho = locaisTrabalho.findLocalTrabalhoResidencia(doente.getNid());

            if (existingLocalTrabalho == null) {
                localTrabalho.setNid(doente.getNid());
                locaisTrabalho.create(localTrabalho);
                showMessageDialog(this, "Local de trabalho criado com sucesso!");
            } else {
                locaisTrabalho.edit(existingLocalTrabalho);
                showMessageDialog(this, "Local de trabalho atualizado com sucesso!");
            }
        } catch (Exception ex) {
            getLogger(ControleESeguimento.class.getName()).log(SEVERE, null, ex);
            showMessageDialog(this, "Erro ao salvar/local de trabalho: " + ex.getMessage(), "Erro", ERROR_MESSAGE);
        }

        try {
            var existingControle = controles.findControleSeguimento(doente.getNid());

            if (existingControle == null) {
                controle.setNid(doente.getNid());
                controles.create(controle);
                showMessageDialog(this, "Controle criado com sucesso!");
            } else {

                controles.edit(existingControle);
                showMessageDialog(this, "Controle atualizado com sucesso!");
            }
        } catch (Exception ex) {
            getLogger(ControleESeguimento.class.getName()).log(SEVERE, null, ex);
            showMessageDialog(this, "Erro ao salvar/controle: " + ex.getMessage(), "Erro", ERROR_MESSAGE);

        }
    }//GEN-LAST:event_guardarDadosBtnActionPerformed

    private void ApssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApssActionPerformed
        var ApssSelecionado = (String) Apss.getSelectedItem();
        if (!ApssSelecionado.equals("seleccionar")) {
            aspAnterior.setEnabled(true);
            aspAnterior.setEditable(true);
            controle.setApss(ApssSelecionado);
            aspAnterior.requestFocus();
        } else {
            showMessageDialog(this, "Por favor selecione uma opcao válida.", "Seleccionar Campo", ERROR_MESSAGE);
            Apss.requestFocus();
        }
    }//GEN-LAST:event_ApssActionPerformed

    private void dataConsultaAnteriorTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataConsultaAnteriorTxtMouseExited
        var dataRegistoCasoPreencido = false;
        var dataTexto = dataConsultaAnterior.getText();
        if (dataTexto != null && !dataTexto.trim().isEmpty() && dataConsultaAnterior.isEnabled()) {
            dataRegistoCasoPreencido = true;
            if (isValidDateFormat(dataTexto)) {
                try {
                    espActual.setEditable(true);
                    espActual.setEnabled(true);
                    controle.setDataConsultaAnterior(converterStringParaData(dataTexto));

                    espActual.requestFocus();
                } catch (ParseException ex) {
                    getLogger(ControleESeguimento.class.getName()).log(SEVERE, null, ex);
                }
            } else {
                showMessageDialog(this, "Formato de data inválido. Use dd/MM/aaaa.", "Data Invalida", ERROR_MESSAGE);
 espActual.setEditable(false);
                    espActual.setEnabled(false);
            }

        } else {

            showMessageDialog(this, "Por favor, preencha o a Data de Registo do caso do Paciente primeiro.");
            dataConsultaAnterior.requestFocus();
            espActual.setEditable(false);
                    espActual.setEnabled(false);
        }
    }//GEN-LAST:event_dataConsultaAnteriorTxtMouseExited

    private void aspAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aspAnteriorActionPerformed
        var aspAnteriorSelecionado = (String) aspAnterior.getSelectedItem();
        if (!aspAnteriorSelecionado.equals("seleccionar")) {
            dataConsultaAnterior.setEnabled(true);
            dataConsultaAnterior.setEditable(true);
            controle.setEspAnteriorObservado(aspAnteriorSelecionado);
            dataConsultaAnterior.requestFocus();
        } else {
            showMessageDialog(this, "Por favor selecione uma opcao válida.", "Seleccionar Campo", ERROR_MESSAGE);
            aspAnterior.requestFocus();
             dataConsultaAnterior.setEnabled(false);
            dataConsultaAnterior.setEditable(false);
        }
    }//GEN-LAST:event_aspAnteriorActionPerformed


    private void consultaMedicaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaMedicaMouseExited

    }//GEN-LAST:event_consultaMedicaMouseExited

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        showMessageDialog(this, " Cadastro Cancelado");
        var escolherAccao = new EscolherAccao(usuario);
        escolherAccao.setLocationRelativeTo(null);
        escolherAccao.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    public static void main(String args[]) {
        invokeLater(() -> {
            new ControleESeguimento().setVisible(true);

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Apss;
    private javax.swing.JLabel EspObservadoTxt;
    private javax.swing.JComboBox<String> aon;
    private javax.swing.JLabel aonTxt;
    private javax.swing.JLabel apssTxt;
    private javax.swing.JComboBox<String> aspAnterior;
    private javax.swing.JLabel aspAnteriorTxt;
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox<String> consultaMedica;
    private javax.swing.JLabel consultaMedicaTxt;
    private javax.swing.JTextField dataConsultaActual;
    private javax.swing.JLabel dataConsultaActualTxt;
    private javax.swing.JTextField dataConsultaAnterior;
    private javax.swing.JLabel dataConsultaAnteriorTxt;
    private javax.swing.JComboBox<String> dataFalecimento;
    private javax.swing.JLabel dataFalecimentoTxt;
    private javax.swing.JTextField dataProximaConsulta;
    private javax.swing.JLabel dataProximaConsultaTxt;
    private javax.swing.JComboBox<String> diagnostico;
    private javax.swing.JLabel diagnosticoTxt;
    private javax.swing.JComboBox<String> enfermidade;
    private javax.swing.JLabel enfermidadeTxt;
    private javax.swing.JComboBox<String> espActual;
    private javax.swing.JLabel espActualTxt;
    private javax.swing.JComboBox<String> espObservado;
    private javax.swing.JButton guardarDadosBtn;
    private javax.swing.JComboBox<String> rastreio;
    private javax.swing.JLabel rastreioTxt;
    private javax.swing.JComboBox<String> situacaoActualPaciente;
    private javax.swing.JLabel situacaoActualPacienteTxt;
    private javax.swing.JButton voltarTela2Btn;
    // End of variables declaration//GEN-END:variables
    private static final Logger LOG = Logger.getLogger(ControleESeguimento.class.getName());
}
