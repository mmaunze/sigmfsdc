package sigmfsdc.vista;

import static java.awt.EventQueue.invokeLater;
import java.text.SimpleDateFormat;
import java.util.Date;
import static java.util.logging.Level.SEVERE;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import static javax.persistence.Persistence.createEntityManagerFactory;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.UIManager.getInstalledLookAndFeels;
import static javax.swing.UIManager.setLookAndFeel;
import javax.swing.UnsupportedLookAndFeelException;
import sigmfsdc.controladora.UsuarioJpaController;
import sigmfsdc.modelo.Usuario;

public class CriarUtilizador extends javax.swing.JFrame {

    EntityManagerFactory emf = createEntityManagerFactory("SistemaigmfsdcPU");
    EntityManager entityManager = emf.createEntityManager();
    Usuario usuario;

    public CriarUtilizador() {
        initComponents();
    }

    CriarUtilizador(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        nomeUsuario.setText(usuario.getNome());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nome = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        confirmarSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        criarUtilizadorBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nivelPermissao = new javax.swing.JComboBox<>();
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
        setTitle("Criar Utilizador");

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });

        confirmarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarSenhaActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome Completo");

        jLabel2.setText("Senha");

        jLabel3.setText("Confirmacao de Senha");

        criarUtilizadorBtn.setText("Criar Utilizador");
        criarUtilizadorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarUtilizadorBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo de Usuario");

        nivelPermissao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Usuario Normal", "Administrador" }));
        nivelPermissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelPermissaoActionPerformed(evt);
            }
        });

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nome)
                    .addComponent(senha)
                    .addComponent(confirmarSenha)
                    .addComponent(criarUtilizadorBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nivelPermissao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {confirmarSenha, jLabel1, jLabel2, jLabel3, nome, senha});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(confirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(nivelPermissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(criarUtilizadorBtn)
                .addGap(81, 81, 81))
            .addComponent(esquerda, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   private String criarUsername(String nomeCompleto) {
    var username = "";
        var partesNome = nomeCompleto.split("\\s+");
    if (partesNome.length >= 1) {
        if (partesNome.length == 1) {
            username = partesNome[0].substring(0, 1).toLowerCase() + partesNome[0].toLowerCase();
        } else {
            username = partesNome[0].substring(0, 1).toLowerCase() + partesNome[1].toLowerCase();
            if (verificarExistenciaUsername(entityManager, username)) {
                username = partesNome[1].toLowerCase() + "." + partesNome[0].toLowerCase();

                if (verificarExistenciaUsername(entityManager, username)) {
                    username = partesNome[0].toLowerCase() + "." + partesNome[1].toLowerCase();

                    if (verificarExistenciaUsername(entityManager, username)) {
                        
                        username = partesNome[0].substring(0, 1).toLowerCase() + partesNome[1].toLowerCase()
                                + new SimpleDateFormat("HHmmss").format(new Date());
                    }
                }
            }
        }
    }
    return username;
}

    private boolean verificarExistenciaUsername(EntityManager entityManager, String username) {
        try {
            var query = entityManager.createQuery("SELECT COUNT(u) FROM Usuario u WHERE u.username = :username");
            query.setParameter("username", username);

            var count = (Long) query.getSingleResult();

            return count > 0;
        } catch (NoResultException | NonUniqueResultException e) {
            // Trate a exceção apropriadamente
            return false;
        }
    }

    private Integer obterNivelPermissao(String nivelPermissao) {
        return switch (nivelPermissao.toLowerCase()) {
            case "usuario normal" ->
                2;
            case "administrador" ->
                1;
            default ->
                2;
        }; // Ou retorne um valor padrão ou lance uma exceção, dependendo do seu caso
    }

    private void criarUtilizadorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarUtilizadorBtnActionPerformed
        var usuarios = new UsuarioJpaController(emf);
        int nivel = obterNivelPermissao((String) nivelPermissao.getSelectedItem());
        var senhasIguais = false;
        var senhaArray = senha.getPassword();
        var confirmarSenhaArray = confirmarSenha.getPassword();
        var senhaDigitada = new String(senhaArray);
        var confirmarsenhaDigitada = new String(confirmarSenhaArray);

        if (!senhaDigitada.isEmpty() && !confirmarsenhaDigitada.isEmpty()) {
            if (senhaDigitada.equals(confirmarsenhaDigitada)) {
                senhasIguais = true;
                if (senhasIguais) {
                    var novoUsuario = new Usuario();
                    novoUsuario.setNome(nome.getText());
                    novoUsuario.setSenha(confirmarsenhaDigitada);
                    novoUsuario.setUsername(criarUsername(novoUsuario.getNome()));
                    novoUsuario.setNivelPermissao(nivel);
                    novoUsuario.setIdInstituicao(usuario.getIdInstituicao());
                    usuarios.create(novoUsuario);
                    var mensagem = "Nome: " + novoUsuario.getNome() + "\n"
                            + "Username: " + novoUsuario.getUsername() + "\n"
                            + "Senha: " + novoUsuario.getSenha() + "\n"
                            + "Nível de Permissão: " + novoUsuario.getNivelPermissao();
                    showMessageDialog(this, mensagem, "Usuário Criado com Sucesso", INFORMATION_MESSAGE);

                    var escolherAccao = new EscolherAccao(usuario);
                    escolherAccao.setLocationRelativeTo(null);
                    escolherAccao.setVisible(true);
                    this.setVisible(false);

                    try {
                        setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                    } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                        getLogger(EscolherAccao.class.getName()).log(SEVERE, null, ex);
                    }
                } else {
                    showMessageDialog(this, "As senhas não coincidem. Tente novamente.", "Senhas Diferentes", ERROR_MESSAGE);
                }
            }
        } else {
            showMessageDialog(this, "As senhas não podem estar vazias. Tente novamente.", "Senhas Vazias", ERROR_MESSAGE);
        }

    }//GEN-LAST:event_criarUtilizadorBtnActionPerformed

    private void nivelPermissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelPermissaoActionPerformed

    }//GEN-LAST:event_nivelPermissaoActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        var nom = nome.getText();
    if (nom.isEmpty() || nom.length() < 3) {  
            showMessageDialog(this, "O nome deve ter pelo menos 3 caracteres", "Erro de validação", ERROR_MESSAGE);
        
    }
    }//GEN-LAST:event_nomeActionPerformed

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
        var senhaChars = senha.getPassword();
    var senh = new String(senhaChars);
    if (senh.isEmpty()) {
            showMessageDialog(this, "A senha não pode estar vazia", "Erro de validação", ERROR_MESSAGE);
    }
    }//GEN-LAST:event_senhaActionPerformed

    private void confirmarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarSenhaActionPerformed
         var senhaChars = senha.getPassword();
    var senhaaa = new String(senhaChars);
        var confirmacaoSenhaChars = confirmarSenha.getPassword();
    var confirmacaoSenha = new String(confirmacaoSenhaChars);
    if (senhaaa.isEmpty() || confirmacaoSenha.isEmpty()) {
            showMessageDialog(this, "A senha e a confirmação de senha não podem estar vazias", "Erro de validação", ERROR_MESSAGE);
        return;
    }
    if (!senhaaa.equals(confirmacaoSenha)) {
            showMessageDialog(this, "A senha e a confirmação de senha não coincidem", "Erro de validação", ERROR_MESSAGE);
       
    }
    }//GEN-LAST:event_confirmarSenhaActionPerformed

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
            getLogger(CriarUtilizador.class.getName()).log(SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        invokeLater(() -> {
            new CriarUtilizador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmarSenha;
    private javax.swing.JButton criarUtilizadorBtn;
    private javax.swing.JLabel emblema;
    private javax.swing.JPanel esquerda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lema;
    private javax.swing.JComboBox<String> nivelPermissao;
    private javax.swing.JTextField nome;
    private javax.swing.JLabel nomeUsuario;
    private javax.swing.JLabel provincia;
    private javax.swing.JLabel republica;
    private javax.swing.JPasswordField senha;
    private javax.swing.JLabel servico;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel usernameTXt1;
    // End of variables declaration//GEN-END:variables
    private static final Logger LOG = Logger.getLogger(CriarUtilizador.class.getName());
}
