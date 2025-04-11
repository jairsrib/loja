/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UsuarioController;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import utils.Utils;

/**
 *
 * @author iband
 */
public class FrLogin extends javax.swing.JFrame {

  /**
   * Creates new form FrLogin
   */
  public FrLogin() {
    initComponents();
    
    this.setLocationRelativeTo(null);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblBarra2 = new javax.swing.JPanel();
        edtEmail = new javax.swing.JTextField();
        edtSenha = new javax.swing.JPasswordField();
        lblEmail = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        btnLogar = new javax.swing.JButton();
        lblImagem = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblAutenticacao = new javax.swing.JLabel();
        lblBarra1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCadastro = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autenticação");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblBarra2.setBackground(new java.awt.Color(255, 255, 255));
        lblBarra2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        edtEmail.setBackground(new java.awt.Color(255, 255, 255));
        edtEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBarra2.add(edtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 400, -1));

        edtSenha.setBackground(new java.awt.Color(255, 255, 255));
        edtSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtSenhaKeyPressed(evt);
            }
        });
        lblBarra2.add(edtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 400, -1));

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(51, 51, 51));
        lblEmail.setText("*Email");
        lblBarra2.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        lblSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(51, 51, 51));
        lblSenha.setText("*Senha");
        lblBarra2.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        btnLogar.setBackground(new java.awt.Color(0, 0, 0));
        btnLogar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnLogar.setForeground(new java.awt.Color(255, 255, 255));
        btnLogar.setText("ENTRAR");
        btnLogar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51), 2));
        btnLogar.setBorderPainted(false);
        btnLogar.setContentAreaFilled(false);
        btnLogar.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnLogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogarMouseClicked(evt);
            }
        });
        lblBarra2.add(btnLogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 400, 40));

        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        lblBarra2.add(lblImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 33, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        lblAutenticacao.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblAutenticacao.setForeground(new java.awt.Color(255, 255, 255));
        lblAutenticacao.setText("I D E N T I F I C A Ç Ã O");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(lblAutenticacao)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblAutenticacao)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        lblBarra2.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, -1));

        lblBarra1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblBarra1.setText("____________________");
        lblBarra2.add(lblBarra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 427, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("____________________");
        lblBarra2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 427, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ou");
        lblBarra2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 428, 36, -1));

        btnCadastro.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastro.setText("QUERO ME CADASTRAR");
        btnCadastro.setContentAreaFilled(false);
        lblBarra2.add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 476, 400, 49));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBarra2, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBarra2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void btnLogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogarMouseClicked
    realizarLogin();
  }//GEN-LAST:event_btnLogarMouseClicked

  private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    URL caminhoImagem = getClass().getResource("/images/logo_mini.png");

    ImageIcon icon = new ImageIcon(caminhoImagem);

    // Define o ícone da janela
    this.setIconImage(icon.getImage());
  }//GEN-LAST:event_formWindowOpened

  private void edtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtSenhaKeyPressed
    //verifico se foi pressionado ENTER
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
      //Se foi teclado ENTER tenta fazer login
      realizarLogin();
    }
  }//GEN-LAST:event_edtSenhaKeyPressed

  private void realizarLogin() {
    String email = edtEmail.getText();
    String senha = new String(edtSenha.getPassword());
    
    if (email.equals("")) {
      JOptionPane.showMessageDialog(null,
              "Campo 'Email' em branco!");
      return;
    }

    if (senha.equals("")) {
      JOptionPane.showMessageDialog(null,
              "Campo 'Senha' em branco!");
      return;
    }
    
    //Calcular o hash da senha
    senha = Utils.calcularHash(senha);

    UsuarioController controller = new UsuarioController();

    boolean autenticado = controller.autenticar(email, senha);

    if (autenticado) {
      //Se está autenticado cria a tela de menu
      FrMenu telaMenu = new FrMenu();
      telaMenu.setVisible(true);      
    } else {
      JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos");
    }
  }

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
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(FrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(FrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(FrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new FrLogin().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnLogar;
    private javax.swing.JTextField edtEmail;
    private javax.swing.JPasswordField edtSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAutenticacao;
    private javax.swing.JLabel lblBarra1;
    private javax.swing.JPanel lblBarra2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblSenha;
    // End of variables declaration//GEN-END:variables
}
