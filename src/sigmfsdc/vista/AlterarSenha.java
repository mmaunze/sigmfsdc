package sigmfsdc.vista;

import static java.awt.EventQueue.invokeLater;
import java.net.URL;
import static java.util.logging.Level.SEVERE;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import static javax.persistence.Persistence.createEntityManagerFactory;
import javax.swing.ImageIcon;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.UIManager.getInstalledLookAndFeels;
import static javax.swing.UIManager.setLookAndFeel;
import sigmfsdc.Sigmfsdc;
import sigmfsdc.controladora.UsuarioJpaController;
import sigmfsdc.modelo.Usuario;

public class AlterarSenha extends javax.swing.JFrame {

    EntityManagerFactory emf = createEntityManagerFactory("SistemaigmfsdcPU");
    EntityManager entityManager = emf.createEntityManager();

    private String senhaAtual, novaSenhaa, confirNovaSenha;
    UsuarioJpaController usuarios = new UsuarioJpaController(emf);
    Usuario usuario;


    public AlterarSenha() {
        initComponents();
    }

    AlterarSenha(Usuario usuario) {
       initComponents();
        this.usuario = usuario;
        nomeUsuario.setText(usuario.getNome());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        direita = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        alterarSenhaBtn = new javax.swing.JButton();
        senhaActualTxt = new javax.swing.JLabel();
        novaSenhaTxt = new javax.swing.JLabel();
        novaSenha = new javax.swing.JPasswordField();
        confirmarNovaSenhaTxt = new javax.swing.JLabel();
        confirmarNovaSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
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

        esquerdaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {nomeUsuario, usernameTXt1});

        direita.setPreferredSize(new java.awt.Dimension(700, 400));

        jLabel1.setText("Alterar Senha");
        jLabel1.setFocusable(false);

        senha.setForeground(new java.awt.Color(0, 153, 204));
        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });

        alterarSenhaBtn.setText("Alterar Senha");
        alterarSenhaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarSenhaBtnActionPerformed(evt);
            }
        });

        senhaActualTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        senhaActualTxt.setText("Senha Actual");

        novaSenhaTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        novaSenhaTxt.setText("Nova Senha");

        novaSenha.setForeground(new java.awt.Color(0, 153, 204));
        novaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaSenhaActionPerformed(evt);
            }
        });

        confirmarNovaSenhaTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmarNovaSenhaTxt.setText("Confirmar Senha");

        confirmarNovaSenha.setForeground(new java.awt.Color(0, 153, 204));
        confirmarNovaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarNovaSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout direitaLayout = new javax.swing.GroupLayout(direita);
        direita.setLayout(direitaLayout);
        direitaLayout.setHorizontalGroup(
            direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(direitaLayout.createSequentialGroup()
                .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(direitaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(alterarSenhaBtn)
                            .addGroup(direitaLayout.createSequentialGroup()
                                .addComponent(senhaActualTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(direitaLayout.createSequentialGroup()
                                .addComponent(novaSenhaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(novaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(direitaLayout.createSequentialGroup()
                                .addComponent(confirmarNovaSenhaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(confirmarNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(direitaLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );
        direitaLayout.setVerticalGroup(
            direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(direitaLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaActualTxt)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novaSenhaTxt)
                    .addComponent(novaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarNovaSenhaTxt)
                    .addComponent(confirmarNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(alterarSenhaBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(esquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(direita, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(esquerda, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
            .addComponent(direita, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private int tentativasIncorretas = 0;
    private void alterarSenhaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarSenhaBtnActionPerformed
     var nova_senhaArray = novaSenha.getPassword();
        var newSenha = new String(nova_senhaArray);
        
        var confirmarNovaArray = confirmarNovaSenha.getPassword();
        var confirNewSenha = new String(confirmarNovaArray);
        
        var senhaActArray = senha.getPassword();
        var senhaAcctual = new String(senhaActArray);
        
        try {
        if (senhaAcctual.equals(usuario.getSenha())) {
            if (newSenha.equalsIgnoreCase(confirNewSenha)) {
                usuario.setSenha(newSenha);
                usuarios.edit(usuario);
                mostrarDialogoSucesso();
              
            } else {
                mostrarDialogoErro("As novas senhas não coincidem.");
            }
        } else {
            tentativasIncorretas++;

            if (tentativasIncorretas == 3) {
                bloquearConta();
            } else {
                mostrarDialogoErro("Senha atual incorreta. Tentativa " + tentativasIncorretas + " de 3.");
            }
        }
    } catch (Exception ex) {
            getLogger(AlterarSenha.class.getName()).log(SEVERE, null, ex);
                tentativasIncorretas++;
        if (tentativasIncorretas == 3) {
            bloquearConta();
        } else {
            mostrarDialogoErro("Erro ao alterar a senha. Tentativa " + tentativasIncorretas + " de 3.");
        }
    }
    }//GEN-LAST:event_alterarSenhaBtnActionPerformed


private void mostrarDialogoSucesso() {
    // Mostrar janela de sucesso
    var inicio = new Sigmfsdc();
    inicio.setLocationRelativeTo(null);
    inicio.setVisible(true);
    this.setVisible(false);
}

private void mostrarDialogoErro(String mensagem) {
    // Mostrar janela de erro
        showMessageDialog(this, mensagem, "Erro", ERROR_MESSAGE);
}

private void bloquearConta() {
    // Atingiu o limite de erros, bloquear conta
    var inicio = new Sigmfsdc();
    inicio.setLocationRelativeTo(null);
    inicio.setVisible(true);
    this.setVisible(false);
}

    
    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
        var senhaArray = senha.getPassword();
        var senhaDigitada = new String(senhaArray);
        senhaAtual = senhaDigitada;
    }//GEN-LAST:event_senhaActionPerformed

    private void novaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaSenhaActionPerformed
        var senhaArray = novaSenha.getPassword();
        var senhaDigitada = new String(senhaArray);
        novaSenhaa = senhaDigitada;
    }//GEN-LAST:event_novaSenhaActionPerformed

    private void confirmarNovaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarNovaSenhaActionPerformed
        var senhaArray = confirmarNovaSenha.getPassword();
        var senhaDigitada = new String(senhaArray);
        confirNovaSenha = senhaDigitada;
    }//GEN-LAST:event_confirmarNovaSenhaActionPerformed

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
            getLogger(AlterarSenha.class.getName()).log(SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        invokeLater(() -> {
            new AlterarSenha().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarSenhaBtn;
    private javax.swing.JPasswordField confirmarNovaSenha;
    private javax.swing.JLabel confirmarNovaSenhaTxt;
    private javax.swing.JPanel direita;
    private javax.swing.JLabel emblema;
    private javax.swing.JPanel esquerda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lema;
    private javax.swing.JLabel nomeUsuario;
    private javax.swing.JPasswordField novaSenha;
    private javax.swing.JLabel novaSenhaTxt;
    private javax.swing.JLabel provincia;
    private javax.swing.JLabel republica;
    private javax.swing.JPasswordField senha;
    private javax.swing.JLabel senhaActualTxt;
    private javax.swing.JLabel servico;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel usernameTXt1;
    // End of variables declaration//GEN-END:variables
    private static final Logger LOG = Logger.getLogger(AlterarSenha.class.getName());
}
