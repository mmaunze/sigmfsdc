package sigmfsdc.vista;

import static java.awt.EventQueue.invokeLater;
import static java.util.logging.Level.SEVERE;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import static javax.persistence.Persistence.createEntityManagerFactory;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.UIManager.setLookAndFeel;
import javax.swing.UnsupportedLookAndFeelException;
import sigmfsdc.controladora.LocalTrabalhoResidenciaJpaController;
import sigmfsdc.modelo.LocalTrabalhoResidencia;
import sigmfsdc.modelo.Paciente;
import sigmfsdc.modelo.Usuario;

public class LocalDeTrabalhoResidencia extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    EntityManagerFactory emf = createEntityManagerFactory("SistemaigmfsdcPU");
    EntityManager entityManager = emf.createEntityManager();
    LocalTrabalhoResidenciaJpaController locaisDeTrabalho = new LocalTrabalhoResidenciaJpaController(emf);
    LocalTrabalhoResidencia localDeTrabalho = new LocalTrabalhoResidencia();
    Paciente doente;
    Usuario usuario;
    private InformacaoBasicaPaciente frame1;

    private ControleESeguimento frame3 = null;
    boolean provinciaPreenchido = false;
    boolean distritoPreenchido = false;
    boolean estabelecimentoSaudePreenchido = false;
    boolean sectorDeTrabalhoPreenchido = false;
    boolean moradaPreenchido = false;

    public LocalDeTrabalhoResidencia() {
        initComponents();
    }

    public LocalDeTrabalhoResidencia(InformacaoBasicaPaciente frame1, Paciente doente, Usuario usuario) {
        initComponents();
        this.frame1 = frame1;
        this.usuario = usuario;
        this.doente = doente;
        localDeTrabalho.setNid(doente.getNid());
        var loc = locaisDeTrabalho.findLocalTrabalhoResidencia(doente.getNid());
        if (loc != null) {
            provincia.setText(loc.getProvincia());
            provincia.setEnabled(true);
            provincia.setEditable(true);
            provinciaPreenchido = true;

            distrito.setText(loc.getDistrito());
            distritoPreenchido = true;
            distrito.setEnabled(true);
            distrito.setEditable(true);

            estabelecimentoSaude.setText(loc.getEstabelecimentoSaude());
            estabelecimentoSaudePreenchido = true;
            estabelecimentoSaude.setEnabled(true);
            estabelecimentoSaude.setEditable(true);

            sectorDeTrabalho.setText(loc.getSetorTrabalho());
            sectorDeTrabalhoPreenchido = true;
            sectorDeTrabalho.setEnabled(true);
            sectorDeTrabalho.setEditable(true);

            morada.setText(loc.getMorada());
            moradaPreenchido = true;
            morada.setEnabled(true);
            morada.setEditable(true);
            avancarTela3Btn.requestFocus();

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voltarTela1Btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        provincia = new javax.swing.JTextField();
        distritoTxt = new javax.swing.JLabel();
        distrito = new javax.swing.JTextField();
        estabelecimentoSaude = new javax.swing.JTextField();
        sectorDeTrabalho = new javax.swing.JTextField();
        morada = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        voltarTela1Btn1 = new javax.swing.JButton();
        avancarTela3Btn = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
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

        voltarTela1Btn.setText("Anterior");
        voltarTela1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTela1BtnActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Local de Trabalho e Residência");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Província");

        provincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provinciaActionPerformed(evt);
            }
        });

        distritoTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        distritoTxt.setText("Distrito");

        distrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distritoActionPerformed(evt);
            }
        });

        estabelecimentoSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estabelecimentoSaudeActionPerformed(evt);
            }
        });

        sectorDeTrabalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectorDeTrabalhoActionPerformed(evt);
            }
        });

        morada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moradaActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Estabelecimento de Saúde ");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Secor de Trabalho");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Morada");

        voltarTela1Btn1.setText("Anterior");
        voltarTela1Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTela1Btn1ActionPerformed(evt);
            }
        });

        avancarTela3Btn.setText("Avançar");
        avancarTela3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancarTela3BtnActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(esquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(voltarTela1Btn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(avancarTela3Btn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(distritoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(distrito, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estabelecimentoSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sectorDeTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(morada, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(67, 67, 67))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {distrito, distritoTxt, estabelecimentoSaude, jLabel1, jLabel3, jLabel4, jLabel5, morada, provincia, sectorDeTrabalho});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(distritoTxt)
                    .addComponent(distrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estabelecimentoSaude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sectorDeTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(morada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarTela1Btn1)
                    .addComponent(cancelar)
                    .addComponent(avancarTela3Btn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(esquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {distrito, distritoTxt, estabelecimentoSaude, jLabel1, jLabel3, jLabel4, jLabel5, morada, provincia, sectorDeTrabalho});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarTela1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTela1BtnActionPerformed
        try {
            try {
                setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            } catch (UnsupportedLookAndFeelException ex) {
                getLogger(LocalDeTrabalhoResidencia.class.getName()).log(SEVERE, null, ex);
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            getLogger(LocalDeTrabalhoResidencia.class.getName()).log(SEVERE, null, ex);
        }

        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_voltarTela1BtnActionPerformed

    private void voltarTela1Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTela1Btn1ActionPerformed
        try {
            setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            getLogger(LocalDeTrabalhoResidencia.class.getName()).log(SEVERE, null, ex);
        }

        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_voltarTela1Btn1ActionPerformed

    private void avancarTela3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarTela3BtnActionPerformed
        if (provinciaPreenchido
                && distritoPreenchido
                && estabelecimentoSaudePreenchido
                && sectorDeTrabalhoPreenchido
                && moradaPreenchido) {
            if (frame3 == null) {
                frame3 = new ControleESeguimento(this, doente, localDeTrabalho, usuario);
            }
            this.setVisible(false);
            frame3.setVisible(true);

            try {
                setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                getLogger(LocalDeTrabalhoResidencia.class.getName()).log(SEVERE, null, ex);
            }

            frame3.setLocationRelativeTo(null);
            frame3.setVisible(true);
        } else {
            showMessageDialog(this, "Deve Preencher Todos os Campos Antes de Avancar", "Campos Vazios", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_avancarTela3BtnActionPerformed

    private void estabelecimentoSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estabelecimentoSaudeActionPerformed
        var estabelecimentoSaudeValue = estabelecimentoSaude.getText().trim();
        if (estabelecimentoSaudeValue.isEmpty()) {
            showMessageDialog(this, "Deve preencher este campo", "Campo Vazio", ERROR_MESSAGE);
        } else {
            if (estabelecimentoSaudeValue.matches("[a-zA-Z ]+")) {
                estabelecimentoSaudePreenchido = true;
                sectorDeTrabalho.setEditable(true);
                sectorDeTrabalho.setEnabled(true);
                localDeTrabalho.setEstabelecimentoSaude(estabelecimentoSaudeValue);
                sectorDeTrabalho.requestFocus();
            } else {
                showMessageDialog(this, "o ESTABELECIMENTO deve conter apenas letras.", "Apenas Letras", ERROR_MESSAGE);

                estabelecimentoSaude.requestFocus();
                sectorDeTrabalho.setEditable(false);
                sectorDeTrabalho.setEnabled(false);
            }
        }
    }//GEN-LAST:event_estabelecimentoSaudeActionPerformed

    private void provinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provinciaActionPerformed
        var provinciaValue = provincia.getText().trim();
        if (provinciaValue.isEmpty()) {
            showMessageDialog(this, "Deve preencher este campo", "Campo Vazio", ERROR_MESSAGE);
        } else {
            if (provinciaValue.matches("[a-zA-Z ]+")) {
                provinciaPreenchido = true;
                distrito.setEditable(true);
                distrito.setEnabled(true);
                localDeTrabalho.setProvincia(provinciaValue);
                distrito.requestFocus();
            } else {
                showMessageDialog(this, "A ProvinciA deve conter apenas letras.", "Apenas Letras", ERROR_MESSAGE);
                provincia.requestFocus();
                distrito.setEditable(false);
                distrito.setEnabled(false);

            }
        }
    }//GEN-LAST:event_provinciaActionPerformed

    private void distritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distritoActionPerformed
        var distritoValue = distrito.getText().trim();
        if (distritoValue.isEmpty()) {
            showMessageDialog(this, "Deve preencher este campo", "Campo Vazio", ERROR_MESSAGE);
        } else {
            if (distritoValue.matches("[a-zA-Z ]+")) {
                distritoPreenchido = true;
                estabelecimentoSaude.setEditable(true);
                estabelecimentoSaude.setEnabled(true);
                localDeTrabalho.setDistrito(distritoValue);
                estabelecimentoSaude.requestFocus();
            } else {
                showMessageDialog(this, "O DISTRITO deve conter apenas letras.", "Apenas Letras", ERROR_MESSAGE);

                distrito.requestFocus();
                estabelecimentoSaude.setEditable(false);
                estabelecimentoSaude.setEnabled(false);
            }
        }
    }//GEN-LAST:event_distritoActionPerformed

    private void sectorDeTrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectorDeTrabalhoActionPerformed
        var sectorDeTrabalhoValue = sectorDeTrabalho.getText().trim();
        if (sectorDeTrabalhoValue.isEmpty()) {
            showMessageDialog(this, "Deve preencher este campo", "Campo Vazio", ERROR_MESSAGE);
        } else {
            if (sectorDeTrabalhoValue.matches("[a-zA-Z ]+")) {
                sectorDeTrabalhoPreenchido = true;
                morada.setEditable(true);
                morada.setEnabled(true);
                localDeTrabalho.setSetorTrabalho(sectorDeTrabalhoValue);
                morada.requestFocus();
            } else {
                showMessageDialog(this, "O sector de Trabalho deve conter apenas letras.", "Apenas Letras", ERROR_MESSAGE);
                sectorDeTrabalho.requestFocus();
                morada.setEditable(false);
                morada.setEnabled(false);
            }
        }
    }//GEN-LAST:event_sectorDeTrabalhoActionPerformed

    private void moradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moradaActionPerformed
        var moradaValue = morada.getText().trim();
        if (moradaValue.isEmpty()) {
            showMessageDialog(this, "Deve preencher este campo", "Campo Vazio", ERROR_MESSAGE);
        } else {
            if (moradaValue.matches("[a-zA-Z ]+")) {
                moradaPreenchido = true;
                //  distrito.setEditable(true);
                //   distrito.setEnabled(true);
                localDeTrabalho.setMorada(moradaValue);
                avancarTela3Btn.requestFocus();
            } else {
                showMessageDialog(this, "A Morada deve conter apenas letras.", "Apenas Letras", ERROR_MESSAGE);

                provincia.requestFocus();

            }
        }
    }//GEN-LAST:event_moradaActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        showMessageDialog(this, " Cadastro Cancelado");
        var escolherAccao = new EscolherAccao(usuario);
        escolherAccao.setLocationRelativeTo(null);
        escolherAccao.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    public static void main(String args[]) {
        invokeLater(() -> {
            new LocalDeTrabalhoResidencia().setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avancarTela3Btn;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField distrito;
    private javax.swing.JLabel distritoTxt;
    private javax.swing.JLabel emblema;
    private javax.swing.JPanel esquerda;
    private javax.swing.JTextField estabelecimentoSaude;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lema;
    private javax.swing.JTextField morada;
    private javax.swing.JLabel nomeUsuario;
    private javax.swing.JTextField provincia;
    private javax.swing.JLabel provincia2;
    private javax.swing.JLabel republica;
    private javax.swing.JTextField sectorDeTrabalho;
    private javax.swing.JLabel servico;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel usernameTXt1;
    private javax.swing.JButton voltarTela1Btn;
    private javax.swing.JButton voltarTela1Btn1;
    // End of variables declaration//GEN-END:variables
    private static final Logger LOG = Logger.getLogger(LocalDeTrabalhoResidencia.class.getName());
}
