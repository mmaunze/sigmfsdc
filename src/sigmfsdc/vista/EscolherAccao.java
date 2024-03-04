package sigmfsdc.vista;

import static java.awt.EventQueue.invokeLater;
import static java.util.logging.Level.SEVERE;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.UIManager.getInstalledLookAndFeels;
import static javax.swing.UIManager.setLookAndFeel;
import javax.swing.UnsupportedLookAndFeelException;
import sigmfsdc.Sigmfsdc;
import sigmfsdc.modelo.Usuario;

public class EscolherAccao extends javax.swing.JFrame {

    Usuario usuario;

    public EscolherAccao(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        nomeUsuario.setText(usuario.getNome());
        
        if (usuario.getNivelPermissao() != 1) {
            this.criarUsuarioBtn.setVisible(false);
            
        }
    }

    public EscolherAccao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        direita = new javax.swing.JPanel();
        inserirBtn = new javax.swing.JButton();
        actualizarBtn = new javax.swing.JButton();
        criarUsuarioBtn = new javax.swing.JButton();
        alterarSenha = new javax.swing.JButton();
        produzirRelatorioBtn1 = new javax.swing.JButton();
        verDados1 = new javax.swing.JButton();
        terminarSessao = new javax.swing.JButton();
        esquerda = new javax.swing.JPanel();
        republica = new javax.swing.JLabel();
        provincia = new javax.swing.JLabel();
        emblema = new javax.swing.JLabel();
        lema = new javax.swing.JLabel();
        servico = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        usernameTXt1 = new javax.swing.JLabel();
        nomeUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Escolher Acção");

        direita.setPreferredSize(new java.awt.Dimension(700, 400));

        inserirBtn.setText("Inserir");
        inserirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirBtnActionPerformed(evt);
            }
        });

        actualizarBtn.setText("Actualizar");
        actualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarBtnActionPerformed(evt);
            }
        });

        criarUsuarioBtn.setText("Criar Usuario");
        criarUsuarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarUsuarioBtnActionPerformed(evt);
            }
        });

        alterarSenha.setText("Alterar a Senha");
        alterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarSenhaActionPerformed(evt);
            }
        });

        produzirRelatorioBtn1.setText("Produzir Relatório");
        produzirRelatorioBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produzirRelatorioBtn1ActionPerformed(evt);
            }
        });

        verDados1.setText("Ver Dados");
        verDados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verDados1ActionPerformed(evt);
            }
        });

        terminarSessao.setText("Terminar Sessao");
        terminarSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarSessaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout direitaLayout = new javax.swing.GroupLayout(direita);
        direita.setLayout(direitaLayout);
        direitaLayout.setHorizontalGroup(
            direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(direitaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(direitaLayout.createSequentialGroup()
                        .addComponent(inserirBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(actualizarBtn))
                    .addGroup(direitaLayout.createSequentialGroup()
                        .addComponent(alterarSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produzirRelatorioBtn1))
                    .addGroup(direitaLayout.createSequentialGroup()
                        .addComponent(verDados1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(criarUsuarioBtn)
                            .addComponent(terminarSessao))))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        direitaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {actualizarBtn, alterarSenha, criarUsuarioBtn, inserirBtn, produzirRelatorioBtn1, terminarSessao, verDados1});

        direitaLayout.setVerticalGroup(
            direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(direitaLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actualizarBtn)
                    .addComponent(inserirBtn))
                .addGap(31, 31, 31)
                .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(produzirRelatorioBtn1)
                    .addComponent(alterarSenha))
                .addGap(31, 31, 31)
                .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verDados1)
                    .addComponent(terminarSessao))
                .addGap(28, 28, 28)
                .addComponent(criarUsuarioBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        direitaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {actualizarBtn, alterarSenha, criarUsuarioBtn, inserirBtn, produzirRelatorioBtn1, terminarSessao, verDados1});

        esquerda.setBackground(new java.awt.Color(255, 255, 255));
        esquerda.setForeground(new java.awt.Color(255, 0, 0));
        esquerda.setPreferredSize(new java.awt.Dimension(700, 400));

        republica.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        republica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        republica.setText("REPÚBLICA DE MOÇAMBIQUE");

        provincia.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        provincia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        provincia.setText("PROVĺNCIA DE NAMPULA ");

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
                        .addComponent(provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(esquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(direita, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(direita, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
            .addComponent(esquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirBtnActionPerformed
        this.dispose();
        var tela1 = new InformacaoBasicaPaciente(usuario);
        try {
            setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            getLogger(EscolherAccao.class.getName()).log(SEVERE, null, ex);
        }

        tela1.setLocationRelativeTo(null);
        tela1.setVisible(true);
    }//GEN-LAST:event_inserirBtnActionPerformed

    private void actualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarBtnActionPerformed
        try {
            setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            getLogger(EscolherAccao.class.getName()).log(SEVERE, null, ex);
        }


    }//GEN-LAST:event_actualizarBtnActionPerformed

    private void alterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarSenhaActionPerformed
        this.setVisible(false);
        var alterar_senha = new AlterarSenha(usuario);
        try {
            setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            getLogger(AlterarSenha.class.getName()).log(SEVERE, null, ex);
        }
        alterar_senha.setLocationRelativeTo(null);
        alterar_senha.setVisible(true);
    }//GEN-LAST:event_alterarSenhaActionPerformed

    private void produzirRelatorioBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produzirRelatorioBtn1ActionPerformed
        this.setVisible(false);
        var relatorios = new ObterRelatorio(usuario);
        try {
            setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            getLogger(EscolherAccao.class.getName()).log(SEVERE, null, ex);
        }
        relatorios.setLocationRelativeTo(null);
        relatorios.setVisible(true);
    }//GEN-LAST:event_produzirRelatorioBtn1ActionPerformed

    private void criarUsuarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarUsuarioBtnActionPerformed
        var criarUtilizador = new CriarUtilizador(usuario);
        criarUtilizador.setLocationRelativeTo(null);
        criarUtilizador.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_criarUsuarioBtnActionPerformed

    private void verDados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verDados1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verDados1ActionPerformed

    private void terminarSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarSessaoActionPerformed
        showMessageDialog(this, "A sessão foi encerrada. Você será desconectado.", "Sessão Encerrada", INFORMATION_MESSAGE);
        var inicio = new Sigmfsdc();
    inicio.setLocationRelativeTo(null);
    inicio.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_terminarSessaoActionPerformed

    public static void main(String args[]) {

        try {
            for (var info : getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            getLogger(EscolherAccao.class.getName()).log(SEVERE, null, ex);
        }

        invokeLater(() -> {
            new EscolherAccao().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarBtn;
    private javax.swing.JButton alterarSenha;
    private javax.swing.JButton criarUsuarioBtn;
    private javax.swing.JPanel direita;
    private javax.swing.JLabel emblema;
    private javax.swing.JPanel esquerda;
    private javax.swing.JButton inserirBtn;
    private javax.swing.JLabel lema;
    private javax.swing.JLabel nomeUsuario;
    private javax.swing.JButton produzirRelatorioBtn1;
    private javax.swing.JLabel provincia;
    private javax.swing.JLabel republica;
    private javax.swing.JLabel servico;
    private javax.swing.JButton terminarSessao;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel usernameTXt1;
    private javax.swing.JButton verDados1;
    // End of variables declaration//GEN-END:variables
    private static final Logger LOG = Logger.getLogger(EscolherAccao.class.getName());
}
