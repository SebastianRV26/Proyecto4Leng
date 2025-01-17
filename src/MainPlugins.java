
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sebas
 */
public class MainPlugins extends javax.swing.JFrame {

    File archivo;
    Singleton singleton = Singleton.getInstance();
    DefaultListModel<String> model = new DefaultListModel<>();

    /**
     * Creates new form MainPlugins
     */
    public MainPlugins() {
        initComponents();
        loadPlugins();
        close();
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
        btnAddPlugin = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        btnUsePlugin = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnRemovePlugin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Menú de plugins");

        jScrollPane1.setViewportView(jList1);

        btnAddPlugin.setText("Agregar plugin");
        btnAddPlugin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPluginActionPerformed(evt);
            }
        });

        jTextField1.setEnabled(false);

        btnUsePlugin.setText("Utilizar plugin");
        btnUsePlugin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsePluginActionPerformed(evt);
            }
        });

        btnClose.setText("Atrás");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnRemovePlugin.setText("Eliminar plugin");
        btnRemovePlugin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovePluginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAddPlugin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnUsePlugin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnClose))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnRemovePlugin)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddPlugin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUsePlugin)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemovePlugin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnClose)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPluginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPluginActionPerformed
        int resultado;
        FileChooser buscador = new FileChooser();
        FileNameExtensionFilter format = new FileNameExtensionFilter("class", "class");
        buscador.jFileChooser1.setFileFilter(format);
        resultado = buscador.jFileChooser1.showOpenDialog(null);
        if (JFileChooser.APPROVE_OPTION == resultado) {
            archivo = buscador.jFileChooser1.getSelectedFile();
            String direction = archivo.getAbsolutePath();
            jTextField1.setText(direction);
            System.out.println(archivo.getName());
            String[] splt = (archivo.getName()).split("\\.");
            String name = splt[0];

            // 
            String folder = direction.replace(archivo.getName(), "");
            System.out.println(folder);

            File srcDir = new File(folder);

            String destination = "src/";
            File destDir = new File(destination);

            copyFolder(srcDir, destDir);

            try {
                copyFileUsingStream(new File(direction), new File("src\\" + archivo.getName()));
            } catch (IOException ex) {
                Logger.getLogger(MainPlugins.class.getName()).log(Level.SEVERE, null, ex);
            }

            JOptionPane msg = new JOptionPane("Cargando Plugin", JOptionPane.WARNING_MESSAGE);
            final JDialog dlg = msg.createDialog("Advertencia");
            new Thread(() -> {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                }
                dlg.setVisible(false);
            }).start();
            dlg.setVisible(true);

            singleton.addPlugin(name);
            model.addElement(name);
        }
    }//GEN-LAST:event_btnAddPluginActionPerformed

    private void btnUsePluginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsePluginActionPerformed
        if (validateList()) {
            JavaClassLoader javaClassLoader = new JavaClassLoader();
            javaClassLoader.invokeClassMethod(jList1.getSelectedValue(), singleton.getImageActual().getRuta());
        }
    }//GEN-LAST:event_btnUsePluginActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnRemovePluginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovePluginActionPerformed
        if (validateList()) {
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de que desea eliminar ese plugin de la lista?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
            if (resp == 0) {
                singleton.removePlugin(jList1.getSelectedValue());
                model.remove(jList1.getSelectedIndex());
            }
        }
    }//GEN-LAST:event_btnRemovePluginActionPerformed

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
            java.util.logging.Logger.getLogger(MainPlugins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPlugins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPlugins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPlugins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPlugins().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPlugin;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnRemovePlugin;
    private javax.swing.JButton btnUsePlugin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void loadPlugins() {
        ArrayList<String> plugins = singleton.getPlugins();

        plugins.forEach((plugin) -> {
            model.addElement(plugin);
        });
        jList1.setModel(model);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
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
            FileOutputStream fos = new FileOutputStream("pluginsData.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(singleton.getPlugins());
            oos.close();
            fos.close();
        } catch (IOException ioe) {
        }
    }

    private boolean validateList() {
        if (jList1.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(null, "Seleccione un elemento");
            return false;
        }
        return true;
    }

    public static void copyFolder(File source, File destination) {
        if (source.isDirectory()) {
            if (!destination.exists()) {
                destination.mkdirs();
            }

            String files[] = source.list();

            for (String file : files) {
                File srcFile = new File(source, file);
                File destFile = new File(destination, file);

                copyFolder(srcFile, destFile);
            }
        } else {
            InputStream in = null;
            OutputStream out = null;

            try {
                in = new FileInputStream(source);
                out = new FileOutputStream(destination);

                byte[] buffer = new byte[1024];

                int length;
                while ((length = in.read(buffer)) > 0) {
                    out.write(buffer, 0, length);
                }
            } catch (Exception e) {
                try {
                    in.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

                try {
                    out.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
}
