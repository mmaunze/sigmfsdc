package sigmfsdc;

import static java.awt.EventQueue.invokeLater;
import static java.util.logging.Level.SEVERE;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import static javax.persistence.Persistence.createEntityManagerFactory;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.UIManager.getInstalledLookAndFeels;
import static javax.swing.UIManager.setLookAndFeel;
import sigmfsdc.modelo.Usuario;
import sigmfsdc.vista.EscolherAccao;

public class Sigmfsdc extends javax.swing.JFrame {

    EntityManagerFactory emf = createEntityManagerFactory("SistemaigmfsdcPU");
    EntityManager entityManager = emf.createEntityManager();    

    public Sigmfsdc() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        direita = new javax.swing.JPanel();
        autenticacao = new javax.swing.JLabel();
        nomeUsuario = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        entrarBtn = new javax.swing.JButton();
        usernameTXt = new javax.swing.JLabel();
        senhTxt = new javax.swing.JLabel();
        esquerda = new javax.swing.JPanel();
        republica = new javax.swing.JLabel();
        provincia2 = new javax.swing.JLabel();
        emblema = new javax.swing.JLabel();
        lema = new javax.swing.JLabel();
        servico = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        nomeUsuario1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AUTENTICAÇÃO");

        direita.setPreferredSize(new java.awt.Dimension(700, 400));

        autenticacao.setText("AUTENTICAÇÃO");
        autenticacao.setFocusable(false);

        nomeUsuario.setForeground(new java.awt.Color(0, 153, 204));

        senha.setForeground(new java.awt.Color(0, 153, 204));

        entrarBtn.setText("ENTRAR");
        entrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarBtnActionPerformed(evt);
            }
        });

        usernameTXt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        usernameTXt.setText("USERNAME");

        senhTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        senhTxt.setText("SENHA");

        javax.swing.GroupLayout direitaLayout = new javax.swing.GroupLayout(direita);
        direita.setLayout(direitaLayout);
        direitaLayout.setHorizontalGroup(
            direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(direitaLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(autenticacao, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entrarBtn)
                    .addGroup(direitaLayout.createSequentialGroup()
                        .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(usernameTXt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(senhTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(senha)))))
        );
        direitaLayout.setVerticalGroup(
            direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(direitaLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(autenticacao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(direitaLayout.createSequentialGroup()
                        .addComponent(nomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(senhTxt)))
                    .addComponent(usernameTXt))
                .addGap(18, 18, 18)
                .addComponent(entrarBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        direitaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {entrarBtn, nomeUsuario, senhTxt, senha, usernameTXt});

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

        nomeUsuario1.setForeground(new java.awt.Color(254, 0, 0));

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
                        .addGap(118, 118, 118)
                        .addComponent(nomeUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(nomeUsuario1)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(direita, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(direita, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
            .addComponent(esquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private int tentativasIncorretas = 0;
    private void entrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarBtnActionPerformed
        var mensagem="";
        var user = nomeUsuario.getText();        
        var senhaArray = senha.getPassword();
        var senhaDigitada = new String(senhaArray);
        if (user.isEmpty()) {
            tentativasIncorretas++;
            mensagem ="O nome de usuario nao pode estar vazio  \nTentativas: " + tentativasIncorretas + " de 3.";
            
            showMessageDialog(this, mensagem, "Campo vazio", ERROR_MESSAGE);
           
        } else if (senhaDigitada.isEmpty()) {
                       tentativasIncorretas++;

            mensagem ="A senha nao pode estar vazia  \nTentativas: " + tentativasIncorretas + " de 3.";

            showMessageDialog(this, mensagem, "Campo vazio", ERROR_MESSAGE);
        } else {
            var jpql = "SELECT u FROM Usuario u WHERE u.username = :nomeUsuario AND u.senha = :senhaDigitada";
            var query = entityManager.createQuery(jpql, Usuario.class);
            query.setParameter("nomeUsuario", user);
            query.setParameter("senhaDigitada", senhaDigitada);
            
            try {
                var usuario = query.getSingleResult();
                if (usuario != null) {
                    showMessageDialog(this, " Bem-vindo! " + usuario.getNome());
                    var escolherAccao = new EscolherAccao(usuario);
                    escolherAccao.setLocationRelativeTo(null);
                    escolherAccao.setVisible(true);
                    this.setVisible(false);                    
                } else {
                    tentativasIncorretas++;
                    showMessageDialog(this, "Senha incorreta ou usuário não encontrado. Tente novamente \nTentativas: " + tentativasIncorretas + " de 3.");
                   
                }
            } catch (NoResultException e) {
                 tentativasIncorretas++;
                showMessageDialog(this, "Senha incorreta ou usuário não encontrado. Tente novamente \nTentativas: " + tentativasIncorretas + " de 3.");
               
            }
            
            
        }
        if (tentativasIncorretas == 3) {
            showMessageDialog(this, "Atingiu o numero de tentativas permitidas", "Campos Bloqueados", ERROR_MESSAGE);
                entrarBtn.setVisible(false);
                senha.setVisible(false);
                nomeUsuario.setVisible(false);               
                senhTxt.setVisible(false);
                usernameTXt.setVisible(false);
                autenticacao.setText("Login Bloqueado Por Atingit O numero Maimo de Tentativas");
                
               
            } 
    }//GEN-LAST:event_entrarBtnActionPerformed
    
    public static void main(String args[]) {
        
        try {
            for (var info : getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            getLogger(Sigmfsdc.class.getName()).log(SEVERE, null, ex);
        }
        
        invokeLater(() -> {
            var sistema = new Sigmfsdc();
            sistema.pack();
            sistema.setLocationRelativeTo(null);
            sistema.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autenticacao;
    private javax.swing.JPanel direita;
    private javax.swing.JLabel emblema;
    private javax.swing.JButton entrarBtn;
    private javax.swing.JPanel esquerda;
    private javax.swing.JLabel lema;
    private javax.swing.JTextField nomeUsuario;
    private javax.swing.JLabel nomeUsuario1;
    private javax.swing.JLabel provincia2;
    private javax.swing.JLabel republica;
    private javax.swing.JLabel senhTxt;
    private javax.swing.JPasswordField senha;
    private javax.swing.JLabel servico;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel usernameTXt;
    // End of variables declaration//GEN-END:variables
    private static final Logger LOG = Logger.getLogger(Sigmfsdc.class.getName());
}
