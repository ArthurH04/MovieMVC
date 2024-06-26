/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import view.movie.MovieRegistrationScreen;
import view.movie.MovieQueryScreen;
import view.actor.ActorRegistrationScreen;
import view.actor.ActorQueryScreen;
import view.actorFilm.ActorMovieAssociation;

public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuRegister = new javax.swing.JMenu();
        jMenuActorRegister = new javax.swing.JMenuItem();
        jMenuMovieRegister = new javax.swing.JMenuItem();
        jMenuQuery = new javax.swing.JMenu();
        jMenuActorQuery = new javax.swing.JMenuItem();
        jMenuMovieQuery = new javax.swing.JMenuItem();
        jMenuAssociation = new javax.swing.JMenu();
        jMenuExit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Screen");
        setResizable(false);

        jMenuRegister.setText("Register");

        jMenuActorRegister.setText("Actor");
        jMenuActorRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActorRegistration(evt);
            }
        });
        jMenuRegister.add(jMenuActorRegister);

        jMenuMovieRegister.setText("Movie");
        jMenuMovieRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMovieRegistration(evt);
            }
        });
        jMenuRegister.add(jMenuMovieRegister);

        jMenuBar1.add(jMenuRegister);

        jMenuQuery.setText("Query");

        jMenuActorQuery.setText("Actor");
        jMenuActorQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActorQuery(evt);
            }
        });
        jMenuQuery.add(jMenuActorQuery);

        jMenuMovieQuery.setText("Movie");
        jMenuMovieQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMovieQuery(evt);
            }
        });
        jMenuQuery.add(jMenuMovieQuery);

        jMenuBar1.add(jMenuQuery);

        jMenuAssociation.setText("Association");
        jMenuAssociation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openActorMovieAssociation(evt);
            }
        });
        jMenuBar1.add(jMenuAssociation);

        jMenuExit.setText("Exit");
        jMenuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit(evt);
            }
        });
        jMenuBar1.add(jMenuExit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void openActorRegistration(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActorRegistration

        this.setVisible(false);
        ActorRegistrationScreen actorRegistrationScreen = new ActorRegistrationScreen(this);
        actorRegistrationScreen.setVisible(true);

    }//GEN-LAST:event_openActorRegistration

    private void openActorQuery(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActorQuery
        this.setVisible(false);
        ActorQueryScreen actorQueryScreen = new ActorQueryScreen(this);
        actorQueryScreen.setVisible(true);
    }//GEN-LAST:event_openActorQuery

    private void openMovieRegistration(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMovieRegistration
        this.setVisible(false);
        MovieRegistrationScreen movieRegistrationScreen = new MovieRegistrationScreen(this);
        movieRegistrationScreen.setVisible(true);
    }//GEN-LAST:event_openMovieRegistration

    private void exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit
        System.exit(0);
    }//GEN-LAST:event_exit

    private void openMovieQuery(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMovieQuery
        this.setVisible(false);
        MovieQueryScreen movieQueryScreen = new MovieQueryScreen(this);
        movieQueryScreen.setVisible(true);
    }//GEN-LAST:event_openMovieQuery

    private void openActorMovieAssociation(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openActorMovieAssociation
        this.setVisible(false);
        ActorMovieAssociation actorMovieAssociation = new ActorMovieAssociation(this);
        actorMovieAssociation.setVisible(true);
    }//GEN-LAST:event_openActorMovieAssociation

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuActorQuery;
    private javax.swing.JMenuItem jMenuActorRegister;
    private javax.swing.JMenu jMenuAssociation;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuExit;
    private javax.swing.JMenuItem jMenuMovieQuery;
    private javax.swing.JMenuItem jMenuMovieRegister;
    private javax.swing.JMenu jMenuQuery;
    private javax.swing.JMenu jMenuRegister;
    // End of variables declaration//GEN-END:variables
}
