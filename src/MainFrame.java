import java.awt.Desktop;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sebas
 */
public class MainFrame extends javax.swing.JFrame {

    private Project projectGlobal = null;
    Singleton singleton = Singleton.getInstance();

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        llenarLista();
        jList1.getSelectionModel().addListSelectionListener(e -> {
            mostrarImagenes();
        });
        close();
        //loadProjects();
        // jList1.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnNewProject = new javax.swing.JButton();
        lblImg1 = new javax.swing.JLabel();
        lblImg2 = new javax.swing.JLabel();
        btnProperties1 = new javax.swing.JButton();
        btnProperties2 = new javax.swing.JButton();
        btnPlugins1 = new javax.swing.JButton();
        btnPlugins2 = new javax.swing.JButton();
        btnWatchImg1 = new javax.swing.JButton();
        btnWatchImg2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Proyectos creados");

        jScrollPane1.setViewportView(jList1);

        jLabel2.setText("Original");

        jLabel3.setText("Postal");

        btnNewProject.setText("Crear proyecto");
        btnNewProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewProjectActionPerformed(evt);
            }
        });

        btnProperties1.setText("Propiedades");
        btnProperties1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProperties1ActionPerformed(evt);
            }
        });

        btnProperties2.setText("Propiedades");
        btnProperties2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProperties2ActionPerformed(evt);
            }
        });

        btnPlugins1.setText("Plugins");
        btnPlugins1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlugins1ActionPerformed(evt);
            }
        });

        btnPlugins2.setText("Plugins");
        btnPlugins2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlugins2ActionPerformed(evt);
            }
        });

        btnWatchImg1.setText("Ver en tamaño completo");
        btnWatchImg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWatchImg1ActionPerformed(evt);
            }
        });

        btnWatchImg2.setText("Ver en tamaño completo");
        btnWatchImg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWatchImg2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(106, 106, 106))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(lblImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(btnWatchImg1)
                                .addGap(48, 48, 48)
                                .addComponent(btnWatchImg2)))
                        .addContainerGap(21, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(btnNewProject)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProperties1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnPlugins1)))
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProperties2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnPlugins2)
                        .addGap(16, 16, 16)))
                .addGap(85, 85, 85))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNewProject))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImg1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnWatchImg2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnWatchImg1))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnProperties1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPlugins1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnProperties2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPlugins2)))))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewProjectActionPerformed
        NewProject newProject = new NewProject();
        newProject.setVisible(true);
        newProject.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnNewProjectActionPerformed

    private void btnProperties1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProperties1ActionPerformed

        /*OutputStream out = new FileOutputStream(new File(imgdirectory + fileName));
        BufferedImage img = ImageIO.read(is);
        BufferedImage scaledImg;

        int width = img.getWidth();
        int height = img.getHeight();*/

 /*try {
            InputStream input = new FileInputStream("C:\\Users\\Usuario\\Downloads\\okabe.jpg");
            BufferedImage img = ImageIO.read(input);
            img.get
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No encontrado");
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("F");
        }*/
        JOptionPane.showMessageDialog(null, projectGlobal.getOriginalImage().getInfo());
    }//GEN-LAST:event_btnProperties1ActionPerformed

    private void btnProperties2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProperties2ActionPerformed

        JOptionPane.showMessageDialog(null, projectGlobal.getOutputImage().getInfo());
    }//GEN-LAST:event_btnProperties2ActionPerformed

    private void btnPlugins1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlugins1ActionPerformed
        singleton.setImageActual(projectGlobal.getOriginalImage());
        MainPlugins plugin = new MainPlugins();
        plugin.setVisible(true);
        plugin.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnPlugins1ActionPerformed

    private void btnPlugins2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlugins2ActionPerformed
        singleton.setImageActual(projectGlobal.getOutputImage());
        MainPlugins plugin = new MainPlugins();
        plugin.setVisible(true);
        plugin.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnPlugins2ActionPerformed

    private void btnWatchImg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWatchImg1ActionPerformed
        singleton.setImageActual(projectGlobal.getOriginalImage());
        try {
            String Imagen = singleton.getImageActual().getRuta();
            File archivo = new File(Imagen);
            Desktop desktop = Desktop.getDesktop();
            desktop.open(archivo);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnWatchImg1ActionPerformed

    private void btnWatchImg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWatchImg2ActionPerformed
        singleton.setImageActual(projectGlobal.getOutputImage());
        try {
            String Imagen = singleton.getImageActual().getRuta();
            File archivo = new File(Imagen);
            Desktop desktop = Desktop.getDesktop();
            desktop.open(archivo);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnWatchImg2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewProject;
    private javax.swing.JButton btnPlugins1;
    private javax.swing.JButton btnPlugins2;
    private javax.swing.JButton btnProperties1;
    private javax.swing.JButton btnProperties2;
    private javax.swing.JButton btnWatchImg1;
    private javax.swing.JButton btnWatchImg2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImg1;
    private javax.swing.JLabel lblImg2;
    // End of variables declaration//GEN-END:variables

    private void llenarLista() {
        ArrayList<Project> proyectos = singleton.getProjects();

        DefaultListModel<String> model = new DefaultListModel<>();
        for (Project project : proyectos) {
            model.addElement(project.getNombreProyecto());
        }
        jList1.setModel(model);
    }

    private void mostrarImagenes() {
        /*try {
            ImageIcon ImgIcon = new ImageIcon();
            Icon icon = new ImageIcon(ImgIcon.getImage().getScaledInstance());
            jLabel4.setIcon(icon);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al abrir "+ex);
        }*/

        String name = jList1.getSelectedValue();
        Project project = singleton.getProject(name);
        projectGlobal = project;

        try {

            if (project != null) {
                ImageIcon origen = new ImageIcon(project.getOriginalImage().getRuta());
                ImageIcon output = new ImageIcon(project.getOutputImage().getRuta());
                ImageIcon iconOri = new ImageIcon(origen.getImage().getScaledInstance(lblImg1.getWidth(), lblImg1.getHeight(), Image.SCALE_DEFAULT));
                ImageIcon iconPostal = new ImageIcon(output.getImage().getScaledInstance(lblImg2.getWidth(), lblImg2.getHeight(), Image.SCALE_DEFAULT));
                lblImg1.setIcon(iconOri);
                lblImg2.setIcon(iconPostal);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al abrir " + ex);
        }
    }

    private void close() {
        try {

            this.setDefaultCloseOperation(MainFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent e) {
                    saveProjects();
                    salir();
                }
            });
        } catch (Exception e) {
            System.out.println("Se callo");
        }
    }

    private void salir() {
        System.exit(0);
    }

    private void saveProjects() {
        try {
            FileOutputStream fos = new FileOutputStream("projectsData.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(singleton.getProjects());
            oos.close();
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}