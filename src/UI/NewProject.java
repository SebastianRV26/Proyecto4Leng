/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Classes.Image;
import Classes.Project;
import Classes.Singleton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Sebas
 */
public class NewProject extends javax.swing.JFrame {

    Singleton singleton = Singleton.getInstance();

    /**
     * Creates new form NewProject
     */
    public NewProject() {
        initComponents();
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
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCreateProject = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        btnLoadImage = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre del proyecto");

        jLabel2.setText("Imagen");

        jLabel3.setText("Tipo de letra");

        jLabel4.setText("Tamaño de letra");

        jLabel5.setText("Texto superior");

        jLabel6.setText("Texto inferior");

        btnCreateProject.setText("Crear proyecto");
        btnCreateProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateProjectActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Letra pequeña", "Letra grande" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Times New Roman", "Nirvana", "Arial" }));

        btnLoadImage.setText("Cargar");
        btnLoadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadImageActionPerformed(evt);
            }
        });

        jTextField4.setEnabled(false);

        btnClose.setText("Atrás");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(btnCreateProject))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(95, 95, 95)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(jTextField4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLoadImage))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnClose)))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnLoadImage)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCreateProject)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                .addComponent(btnClose)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    File archivo;

    private void btnCreateProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateProjectActionPerformed
        if (validateFields()) {

            String typeText;
            String sizeText;
            //jComboBox2.getSelectedItem();
            String typeTextS = String.valueOf(jComboBox2.getSelectedItem());
            switch (typeTextS) {
                case "Arial":
                    typeText = "0";
                    break;
                case "Times New Roman":
                    typeText = "1";
                    break;
                case "Nirvana":
                    typeText = "2";
                    break;
                default:
                    typeText = "0";
                    break;
            }
            String sizeTextS = String.valueOf(jComboBox1.getSelectedItem());
            switch (sizeTextS) {
                case "Letra pequeña":
                    sizeText = "0";
                    break;
                case "Letra grande":
                    sizeText = "1";
                    break;
                default:
                    sizeText = "0";
                    break;
            }
            String project = jTextField1.getText();
            String text1 = jTextField2.getText();
            if (text1.equals("")) {
                text1 = " ";
            }
            String text2 = jTextField3.getText();
            System.out.println("text2 " + text2);
            if (text2.equals("")) {
                text2 = " ";
            }
            System.out.println("sizeText " + sizeText + " typeText " + typeText + " text1 " + text1 + " text2 " + text2);
            String ruta = jTextField4.getText();
            ruta = ruta.replace("\\", "\\\\");
            String output = "output\\" + project + "Despues.png";
            try {
                Process process = new ProcessBuilder("BackendProject4Leng\\cmake-build-debug\\BackendProject4Leng.exe",
                        sizeText, typeText, text1, text2, ruta, output).start();
                Image originalImage = createImage(ruta, getExtention(ruta), getWeight(ruta), getLasstModification(ruta));

                Thread.sleep(1000);

                Image outputImage = createImage(output, "PNG", getWeight(output), getDateNow());
                createProject(project, originalImage, outputImage);
            } catch (IOException ex) {
                Logger.getLogger(NewProject.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
            } catch (InterruptedException ex) {
                Logger.getLogger(NewProject.class.getName()).log(Level.SEVERE, null, ex);
            }
            changeFrame();
            //saveProjects();
        } else {
            JOptionPane.showMessageDialog(null, "Favor escribir el nombre del proyecto y seleccionar una imagen");
        }
    }//GEN-LAST:event_btnCreateProjectActionPerformed

    private void btnLoadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadImageActionPerformed
        int resultado;
        FileChooser buscador = new FileChooser();
        FileNameExtensionFilter format = new FileNameExtensionFilter("JPG, PNG, BMP", "jpg", "png", "bmp");
        buscador.jFileChooser1.setFileFilter(format);
        resultado = buscador.jFileChooser1.showOpenDialog(null);
        if (JFileChooser.APPROVE_OPTION == resultado) {
            archivo = buscador.jFileChooser1.getSelectedFile();
            String direction = archivo.getAbsolutePath();
            jTextField4.setText(direction);
        }
    }//GEN-LAST:event_btnLoadImageActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        changeFrame();
    }//GEN-LAST:event_btnCloseActionPerformed

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
            java.util.logging.Logger.getLogger(NewProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewProject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnCreateProject;
    private javax.swing.JButton btnLoadImage;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

    private boolean validateFields() {
        if (jTextField1.getText().isEmpty() || jTextField4.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    private void changeFrame() {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);
        dispose();
    }

    private void createProject(String nameProject, Image originalImage, Image outputImage) {

        Project project = new Project(nameProject, originalImage, outputImage);
        singleton.addProject(project);
    }

    private Image createImage(String ruta, String extencion, double weigth, String lastModification) {
        ImageIcon img = new ImageIcon(ruta);
        Image image = new Image(ruta, extencion, weigth, Integer.toString(img.getIconWidth()), Integer.toString(img.getIconHeight()), lastModification);

        return image;
    }

    private String getExtention(String ruta) {
        String[] splt = ruta.split("\\.");
        String extencion = splt[splt.length - 1].toUpperCase();
        return extencion;
    }

    private double getWeight(String ruta) {
        File fichero = new File(ruta);
        double weigth = fichero.length();
        return weigth;
    }

    private String getLasstModification(String ruta) {
        File file = new File(ruta);

        BasicFileAttributes attrs;
        try {
            attrs = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
            FileTime time = attrs.creationTime();
            String pattern = "yyyy-MM-dd HH:mm:ss";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String formatted = simpleDateFormat.format(new Date(time.toMillis()));
            return formatted;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    private String getDateNow() {
        try {
            String pattern = "yyyy-MM-dd HH:mm:ss";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String formatted = simpleDateFormat.format(new Date());
            return formatted;
        } catch (Exception e) {

        }
        return "";
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
}
