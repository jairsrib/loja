/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author iband
 */
public class FrMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrMenu
     */
    public FrMenu() {
        initComponents();

        //Abre a tela centralizada
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

        jPanel1 = new javax.swing.JPanel();
        barMenu = new javax.swing.JMenuBar();
        meCadastro = new javax.swing.JMenu();
        miCadEstoque = new javax.swing.JMenuItem();
        miCadRoupa = new javax.swing.JMenuItem();
        miCadTamanho = new javax.swing.JMenuItem();
        miSair = new javax.swing.JMenuItem();
        meConsulta = new javax.swing.JMenu();
        miConUsuario = new javax.swing.JMenuItem();
        miConRoupa = new javax.swing.JMenuItem();
        miConTamanho = new javax.swing.JMenuItem();
        meSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        meCadastro.setText("Cadastro");
        meCadastro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        miCadEstoque.setText("Estoque");
        miCadEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadEstoqueActionPerformed(evt);
            }
        });
        meCadastro.add(miCadEstoque);

        miCadRoupa.setText("Roupa");
        miCadRoupa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miCadRoupaMouseClicked(evt);
            }
        });
        miCadRoupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadRoupaActionPerformed(evt);
            }
        });
        meCadastro.add(miCadRoupa);

        miCadTamanho.setText("Tamanho");
        miCadTamanho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miCadTamanhoMouseClicked(evt);
            }
        });
        miCadTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadTamanhoActionPerformed(evt);
            }
        });
        meCadastro.add(miCadTamanho);

        miSair.setText("Sair");
        miSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        meCadastro.add(miSair);

        barMenu.add(meCadastro);

        meConsulta.setText("Consulta");
        meConsulta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        miConUsuario.setText("Usuário");
        miConUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConUsuarioActionPerformed(evt);
            }
        });
        meConsulta.add(miConUsuario);

        miConRoupa.setText("Roupa");
        miConRoupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConRoupaActionPerformed(evt);
            }
        });
        meConsulta.add(miConRoupa);

        miConTamanho.setText("Tamanho");
        miConTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConTamanhoActionPerformed(evt);
            }
        });
        meConsulta.add(miConTamanho);

        barMenu.add(meConsulta);

        meSobre.setText("Sobre");
        meSobre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        meSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                meSobreMouseClicked(evt);
            }
        });
        barMenu.add(meSobre);

        setJMenuBar(barMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void miConUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConUsuarioActionPerformed
      //crio uma tela de cadastro de usuário
      FrConUsuario telaConsulta = new FrConUsuario(this, rootPaneCheckingEnabled);

      //Torno a tela visível
      telaConsulta.setVisible(true);
  }//GEN-LAST:event_miConUsuarioActionPerformed

  private void miConRoupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConRoupaActionPerformed
      FrConRoupa telaRoupa = new FrConRoupa(this, rootPaneCheckingEnabled);

      //Torno a tela visível
      telaRoupa.setVisible(true);  }//GEN-LAST:event_miConRoupaActionPerformed

  private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      URL caminhoImagem = getClass().getResource("/images/menu.png");

      ImageIcon icon = new ImageIcon(caminhoImagem);

      // Define o ícone da janela
      this.setIconImage(icon.getImage());
  }//GEN-LAST:event_formWindowOpened

  private void miSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSairActionPerformed
      this.dispose();
  }//GEN-LAST:event_miSairActionPerformed

  private void meSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meSobreMouseClicked
      FrSobre telaSobre = new FrSobre(this, rootPaneCheckingEnabled);

      telaSobre.setVisible(true);
  }//GEN-LAST:event_meSobreMouseClicked

    private void miCadRoupaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miCadRoupaMouseClicked
        FrCadRoupa telaRoupa = new FrCadRoupa(this, rootPaneCheckingEnabled);

        //Torno a tela visível
        telaRoupa.setVisible(true);
    }//GEN-LAST:event_miCadRoupaMouseClicked

    private void miCadTamanhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miCadTamanhoMouseClicked
        FrCadTamanho telaTamanho = new FrCadTamanho(this, rootPaneCheckingEnabled);

        //Torno a tela visível
        telaTamanho.setVisible(true);
    }//GEN-LAST:event_miCadTamanhoMouseClicked

    private void miCadRoupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadRoupaActionPerformed
        FrCadRoupa telaRoupa = new FrCadRoupa(this, rootPaneCheckingEnabled);

        //Torno a tela visível
        telaRoupa.setVisible(true);
    }//GEN-LAST:event_miCadRoupaActionPerformed

    private void miCadTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadTamanhoActionPerformed
        FrCadTamanho telaTamanho = new FrCadTamanho(this, rootPaneCheckingEnabled);

        //Torno a tela visível
        telaTamanho.setVisible(true);
    }//GEN-LAST:event_miCadTamanhoActionPerformed

    private void miConTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConTamanhoActionPerformed
        FrConTamanho telaTamanho = new FrConTamanho(this, rootPaneCheckingEnabled);

        //Torno a tela visível
        telaTamanho.setVisible(true);
    }//GEN-LAST:event_miConTamanhoActionPerformed

    private void miCadEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miCadEstoqueActionPerformed

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
            java.util.logging.Logger.getLogger(FrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu meCadastro;
    private javax.swing.JMenu meConsulta;
    private javax.swing.JMenu meSobre;
    private javax.swing.JMenuItem miCadEstoque;
    private javax.swing.JMenuItem miCadRoupa;
    private javax.swing.JMenuItem miCadTamanho;
    private javax.swing.JMenuItem miConRoupa;
    private javax.swing.JMenuItem miConTamanho;
    private javax.swing.JMenuItem miConUsuario;
    private javax.swing.JMenuItem miSair;
    // End of variables declaration//GEN-END:variables
}
