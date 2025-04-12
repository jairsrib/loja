/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UsuarioController;
import java.net.URL;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Usuario;
import utils.Utils;

/**
 *
 * @author iband
 */
public class FrCadUsuario extends javax.swing.JDialog {

  /**
   * Creates new form FrCadUsuario
   */
  public FrCadUsuario(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    
    //tira a referência da posição, abrindo centralizado
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
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        edtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblConfirmaSenha = new javax.swing.JLabel();
        lblDataNasc = new javax.swing.JLabel();
        edtConfirmaSenha = new javax.swing.JPasswordField();
        edtSenha = new javax.swing.JPasswordField();
        edtDataNasc = new javax.swing.JFormattedTextField();
        chkAtivo = new javax.swing.JCheckBox();
        lblPreenchimento = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        lblCPF = new javax.swing.JLabel();
        edtCPF = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        edtTelefone = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuário");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(590, 80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("C A D A S T R O ");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(51, 51, 51));
        lblNome.setText("*Nome");
        jPanel1.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        edtNome.setBackground(new java.awt.Color(255, 255, 255));
        edtNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edtNome.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(edtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 460, -1));

        edtEmail.setBackground(new java.awt.Color(255, 255, 255));
        edtEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edtEmail.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(edtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 460, -1));

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(51, 51, 51));
        lblEmail.setText("*Email");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        lblSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(51, 51, 51));
        lblSenha.setText("*Senha");
        jPanel1.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        lblConfirmaSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblConfirmaSenha.setForeground(new java.awt.Color(51, 51, 51));
        lblConfirmaSenha.setText("*Confirma senha");
        jPanel1.add(lblConfirmaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, -1));

        lblDataNasc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDataNasc.setForeground(new java.awt.Color(51, 51, 51));
        lblDataNasc.setText("*Data de Nascimento");
        jPanel1.add(lblDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        edtConfirmaSenha.setBackground(new java.awt.Color(255, 255, 255));
        edtConfirmaSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edtConfirmaSenha.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(edtConfirmaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 460, -1));

        edtSenha.setBackground(new java.awt.Color(255, 255, 255));
        edtSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edtSenha.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(edtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 460, -1));

        edtDataNasc.setBackground(new java.awt.Color(255, 255, 255));
        edtDataNasc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        edtDataNasc.setForeground(new java.awt.Color(0, 0, 0));
        edtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        edtDataNasc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(edtDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 460, 30));

        chkAtivo.setBackground(new java.awt.Color(255, 255, 255));
        chkAtivo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkAtivo.setForeground(new java.awt.Color(0, 0, 0));
        chkAtivo.setText("Ativo");
        jPanel1.add(chkAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, -1, -1));

        lblPreenchimento.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblPreenchimento.setForeground(new java.awt.Color(204, 0, 51));
        lblPreenchimento.setText("*preenchimento obrigatórios");
        jPanel1.add(lblPreenchimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 203, -1));

        btnVoltar.setBackground(new java.awt.Color(204, 204, 204));
        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(0, 0, 0));
        btnVoltar.setText("VOLTAR");
        btnVoltar.setBorderPainted(false);
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 70));

        lblCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(51, 51, 51));
        lblCPF.setText("*CPF");
        jPanel1.add(lblCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        edtCPF.setBackground(new java.awt.Color(255, 255, 255));
        edtCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edtCPF.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(edtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 460, -1));

        lblTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(51, 51, 51));
        lblTelefone.setText("*Telefone");
        jPanel1.add(lblTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        edtTelefone.setBackground(new java.awt.Color(255, 255, 255));
        edtTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edtTelefone.setForeground(new java.awt.Color(0, 0, 0));
        edtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtTelefoneActionPerformed(evt);
            }
        });
        jPanel1.add(edtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 460, -1));

        btnSalvar.setBackground(new java.awt.Color(0, 0, 0));
        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("CADASTRAR");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, 590, 80));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    URL caminhoImagem = getClass().getResource("/images/cadastro.png");

    ImageIcon icon = new ImageIcon(caminhoImagem);

    // Define o ícone da janela
    this.setIconImage(icon.getImage()); 
  }//GEN-LAST:event_formWindowOpened

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        //verificar os campos se estão preenchidos corretamente
        if(verificarCampos()){
            //Se estiverem corretos vou gravar
            gravar();
        }
        //Senão nada acontece
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void edtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtTelefoneActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnVoltarMouseClicked

  public void gravar(){
    //criar uma instância da classe Usuario 
    //vou preencher os campos
    Usuario usu = new Usuario();
    
    String lSenha = new String(edtSenha.getPassword());
    String lHashSenha = Utils.calcularHash(lSenha); 
    
    //conversão de String para Date
    Date dataNasc = Utils.converterStringToDate(edtDataNasc.getText()); 
    
    usu.setNome(edtNome.getText());
    usu.setCpf(edtCPF.getText());
    usu.setTelefone(edtTelefone.getText());
    usu.setEmail(edtEmail.getText());
    usu.setDataNasc(dataNasc);
    usu.setSenha(lHashSenha); 
    usu.setAtivo(chkAtivo.isSelected());
    //depois passo o objeto para o controller e ele irá gravar no banco de dados
    UsuarioController controller = new UsuarioController();
    
    if(controller.inserirUsuario(usu)){
      JOptionPane.showMessageDialog(null,
              "Usuário gravado com sucesso");
      this.dispose();
    }else{
      JOptionPane.showMessageDialog(null,
              "O cadastro não foi gravado");
    }      
  }
  
  public boolean verificarCampos(){
    //Se eu conseguir passar pelas validações retorna true
    
    //Nome - não pode ter números ou caracteres especiais, apenas letras e espaço
    //Email - ter um formato de email a@a.com
    //Senha - pelo menos 6 dígitos
    //Data - verificar se está no formato de data dd/mm/aaaa
        
    if (!edtNome.getText().matches("^[\\p{L} ]+$")) {//a-
      JOptionPane.showMessageDialog(null,
              "O campo 'Nome' possui formato inválido");
      return false;
    }
    

    if (!edtCPF.getText().matches("^[0-9]{3}\\.([0-9]{3})\\.([0-9]{3})-([0-9]{2})$")) {
    JOptionPane.showMessageDialog(null, 
            "O campo 'CPF' possui formato inválido");
    return false;
}
    
    if (!edtEmail.getText().matches("^[a-z0-9._-]+@[a-z0-9._-]+.[a-z._]+$")) {
      JOptionPane.showMessageDialog(null,
              "O campo 'Email' possui formato inválido");
      return false;
    }
    
    
    if(new String(edtSenha.getPassword()).equals("")){
      JOptionPane.showMessageDialog(null, "O campo 'Senha' em branco");
      return false;
    }
    
    String lSenha = new String(edtSenha.getPassword());
    String lConfirmaSenha = new String(edtConfirmaSenha.getPassword());
    
    if(! lSenha.equals(lConfirmaSenha)){
      JOptionPane.showMessageDialog(null, "As senhas não são iguais");
      return false;
    }
    
    if (lSenha.length() < 6) {
      JOptionPane.showMessageDialog(null,
              "O campo 'Senha' deve ter mais de 6 caracteres");
      return false;
    }
    
    if (edtDataNasc.getText().equals("")) {
      JOptionPane.showMessageDialog(null,
              "O campo 'Data de Nascimento' em branco");
      return false;
    }
    
    return true;
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
      java.util.logging.Logger.getLogger(FrCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(FrCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(FrCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FrCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        FrCadUsuario dialog = new FrCadUsuario(new javax.swing.JFrame(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
          @Override
          public void windowClosing(java.awt.event.WindowEvent e) {
            System.exit(0);
          }
        });
        dialog.setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox chkAtivo;
    private javax.swing.JTextField edtCPF;
    private javax.swing.JPasswordField edtConfirmaSenha;
    private javax.swing.JFormattedTextField edtDataNasc;
    private javax.swing.JTextField edtEmail;
    private javax.swing.JTextField edtNome;
    private javax.swing.JPasswordField edtSenha;
    private javax.swing.JTextField edtTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblConfirmaSenha;
    private javax.swing.JLabel lblDataNasc;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPreenchimento;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
