/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Access.Connector;
import Access.DataHolder;
import Access.DataHolder.Data;
import Access.DataSet;
import Access.Downloader;
import Domain.ImageAnalyzer;
import java.awt.Color;
import java.awt.Image;
import java.awt.Label;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.Platform.exit;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.json.JSONException;
import org.neuroph.core.NeuralNetwork;

/**
 *
 * @author Minudika
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    String nnetPath;
    String imagePath;
    NeuralNetwork nnet;
    ImageAnalyzer imageAnalizer;
    Downloader downloader;
    Connector connector;

    public Main() {
        initComponents();

        downloader = new Downloader();
        connector = new Connector();
        jButton_loadImage.setEnabled(true);
        imageAnalizer = new ImageAnalyzer(Data.filePath_downloadNnet);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel_displayImage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton_loadImage = new javax.swing.JButton();
        jLabel_displayRating = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_modelVersion = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_newsFeed_displayImageBefore = new javax.swing.JLabel();
        jLabel_newsFeed_displayImageAfter = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton_next = new javax.swing.JButton();
        jButton_prev = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel_doctorName = new javax.swing.JLabel();
        jLabel_hospitalName = new javax.swing.JLabel();
        jLabel_hospitalContact = new javax.swing.JLabel();
        jProgressBar_rating = new javax.swing.JProgressBar();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel_status = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel_displayImage.setAutoscrolls(true);
        jLabel_displayImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Image");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel_displayImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_displayImage, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton_loadImage.setText("Load Image");
        jButton_loadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loadImageActionPerformed(evt);
            }
        });

        jLabel_displayRating.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_displayRating.setToolTipText("");
        jLabel_displayRating.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Rating");

        jLabel4.setText("Model Version :");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel_newsFeed_displayImageBefore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_newsFeed_displayImageBefore.setText("No News Available");
        jLabel_newsFeed_displayImageBefore.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel_newsFeed_displayImageAfter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_newsFeed_displayImageAfter.setText("No News Available");
        jLabel_newsFeed_displayImageAfter.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Doctor's Name          :");

        jLabel5.setText("Hospital Name          :");

        jLabel6.setText("Hospital Contact No :");

        jLabel7.setText("Before");

        jLabel8.setText("After");

        jButton_next.setText("Next");
        jButton_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nextActionPerformed(evt);
            }
        });

        jButton_prev.setText("Previous");
        jButton_prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_prevActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_doctorName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(170, 170, 170))
                            .addComponent(jLabel_hospitalName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_hospitalContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_newsFeed_displayImageBefore, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_newsFeed_displayImageAfter, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(437, 437, 437)
                        .addComponent(jButton_prev, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_next, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_newsFeed_displayImageBefore, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_newsFeed_displayImageAfter, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_doctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addComponent(jLabel_hospitalName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel_hospitalContact, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_prev)
                    .addComponent(jButton_next))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jProgressBar_rating.setMaximum(10);
        jProgressBar_rating.setToolTipText("");

        jLabel10.setText("Bad");

        jLabel11.setText("Good");

        jLabel_status.setToolTipText("status");
        jLabel_status.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setText("Status");

        jMenu1.setText("File");

        jMenuItem5.setText("Exit");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Option");

        jMenuItem4.setText("Update Model");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(91, 91, 91)
                                            .addComponent(jLabel_modelVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel1))
                                    .addGap(267, 267, 267))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(80, 80, 80)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel_displayRating, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton_loadImage))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11))
                                .addComponent(jProgressBar_rating, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel_status, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_modelVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_displayRating, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_loadImage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar_rating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_status, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(141, 141, 141))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_loadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loadImageActionPerformed
        // TODO add your handling code here:
        
        JFileChooser fc = new JFileChooser();
        Double rating;
        
        int returnVal = fc.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            imagePath = fc.getSelectedFile().getAbsolutePath();
            rating=imageAnalizer.getRating(imagePath);
            int r=getRating(rating);
            
            setTextRating(r);
            populateProgressBar(r);
            try {
                setImage(imagePath);
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            getNews();
            

        } else {
            JOptionPane.showMessageDialog(null, "Please select an image of valid format", "Error", JOptionPane.WARNING_MESSAGE);
        }
        
        

        //System.out.println(rating);

    }//GEN-LAST:event_jButton_loadImageActionPerformed

    private int getRating(Double d) {
        int rating = 0;
        if (d > 0.59550000) {
            rating = 10;
        } else if (d > 0.55550000) {
            rating = 9;
        } else if (d > 0.54550000) {
            rating = 8;
        } else if (d > 0.53550000) {
            rating = 7;
        } else if (d > 0.52550000) {
            rating = 6;
        } else if (d > 0.51550000) {
            rating = 5;
        } else if (d > 0.50550000) {
            rating = 4;
        } else if (d > 0.49550000) {
            rating = 3;
        } else if (d > 0.48550000) {
            rating = 2;
        } else if (d > 0.47550000) {
            rating = 1;
        } else {
            rating = 0;
        }
        return rating;
    }

    public void populateProgressBar(int rating) {
        int i = 0;

        while (i <= rating) {
            jProgressBar_rating.setValue(i);
            i = i + 1;
        }
    }    private void getNews(){
        //setStatus("Getting news...");
        try {            
            nameList = downloader.downloadImageSet();
            System.out.println("news set loaded");
            setData(0, "next");
           // setStatus("Completed");

        } catch (JSONException ex) {
            setStatus("Getting news was failed");
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            setStatus("Getting news was failed");
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    int cnt = 0;
    private void jButton_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nextActionPerformed
        // TODO add your handling code here:
        setData(cnt++, "next");
    }//GEN-LAST:event_jButton_nextActionPerformed

    private void jButton_prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_prevActionPerformed
        // TODO add your handling code here:
        setData(cnt--, "prev");
    }//GEN-LAST:event_jButton_prevActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        boolean check = false;
        setStatus("Updating model started..");
        try {
            check = downloader.download_nnet();
            imageAnalizer = new ImageAnalyzer(downloader.getFileName_nnet());
            jLabel_modelVersion.setText(downloader.getModelVersion());
            
        } catch (JSONException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (check) {
            setStatus("Update completed successfully");
            //jButton_loadImage.setEnabled(true);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
       System.exit(0);
    }//GEN-LAST:event_jMenuItem5ActionPerformed
    
    private void setStatus(String s){
        jLabel_status.setText(s);
    }
    ArrayList<String> nameList = null;

    public void setData(int cnt, String btnOption) {
        ArrayList<DataSet> dataset = downloader.getDataset();
        ArrayList<String> nameList = downloader.getNameList();
        if (cnt < 0) {
            cnt = -1 * cnt;
        }
        if (btnOption.toLowerCase().equals("next")) {
            cnt = cnt % dataset.size();
        } else {
            cnt = cnt % dataset.size();

            if (cnt == 0) {
                cnt = dataset.size() - 1;
            } else {
                cnt--;
            }

        }
        System.out.println("dataset size :" + dataset.size());

        jLabel_doctorName.setText(dataset.get(cnt).getDoctorName());
        jLabel_hospitalName.setText(dataset.get(cnt).getHospitalName());
        jLabel_hospitalContact.setText(dataset.get(cnt).getHospitalName());

        String imageA = ".\\data\\newsSet\\" + nameList.get(2 * cnt);
        String imageB = ".\\data\\newsSet\\" + nameList.get(2 * cnt + 1);
        System.out.println(imageA);

        File imageFileA = new File(imageA);
        File imageFileB = new File(imageB);

        BufferedImage bufImgA = null;
        BufferedImage bufImgB = null;

        try {
            bufImgA = ImageIO.read(imageFileA);
            bufImgB = ImageIO.read(imageFileB);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image scaledImgA = bufImgA.getScaledInstance(jLabel_newsFeed_displayImageAfter.getWidth(), jLabel_newsFeed_displayImageAfter.getHeight(), Image.SCALE_DEFAULT);
        Image scaledImgB = bufImgB.getScaledInstance(jLabel_newsFeed_displayImageBefore.getWidth(), jLabel_newsFeed_displayImageBefore.getHeight(), Image.SCALE_DEFAULT);

        jLabel_newsFeed_displayImageAfter.setIcon(new ImageIcon(scaledImgA));
        jLabel_newsFeed_displayImageBefore.setIcon(new ImageIcon(scaledImgB));
    }

    private void setImage(String path) throws IOException {
        BufferedImage bi = ImageIO.read(new File(path));
        jLabel_displayImage.setIcon(new ImageIcon(bi));
        jLabel_displayImage.setHorizontalAlignment(JLabel.CENTER);
        jLabel_displayImage.setVerticalAlignment(JLabel.CENTER);
    }

    private void setTextRating(int r) {
        String rating = Integer.toString(r);
        jLabel_displayRating.setText(rating);
        jLabel_displayRating.setHorizontalAlignment(JLabel.CENTER);
        jLabel_displayRating.setVerticalAlignment(JLabel.CENTER);
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_loadImage;
    private javax.swing.JButton jButton_next;
    private javax.swing.JButton jButton_prev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_displayImage;
    private javax.swing.JLabel jLabel_displayRating;
    private javax.swing.JLabel jLabel_doctorName;
    private javax.swing.JLabel jLabel_hospitalContact;
    private javax.swing.JLabel jLabel_hospitalName;
    private javax.swing.JLabel jLabel_modelVersion;
    private javax.swing.JLabel jLabel_newsFeed_displayImageAfter;
    private javax.swing.JLabel jLabel_newsFeed_displayImageBefore;
    private javax.swing.JLabel jLabel_status;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar_rating;
    // End of variables declaration//GEN-END:variables
}
