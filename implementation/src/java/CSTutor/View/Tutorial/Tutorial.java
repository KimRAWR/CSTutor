/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSTutor.View.Tutorial;

import CSTutor.Model.Tutorial.*;
import java.awt.Color;
import java.util.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JList;

/**
 * Contains the elements of the tutorial view
 * 
 * @author Kim Arre (karre@calpoly.edu)
 * @version 31May2015
 */
public class Tutorial extends javax.swing.JPanel {
    /** Overall structure containing tutorial content */
    private TutorialTrack tutorialTrack = new TutorialTrack();
    private int currentIndex = 0;
    
    DefaultListModel listItems = new DefaultListModel();
    
    /** Provides a quick way to jump between tutorial lessons */
    public RoadmapModule sideModule;
    
    /**
     * Creates new Tutorial with two sample initial tutorials
     */
    public Tutorial() {
        initComponents();
       
        sideModule = new RoadmapModule();
        initRoadmapContent();
        setAllTheThings(tutorialTrack.database.getTutorialData(currentIndex));
        
        this.setVisible(true);
    }
    
    /**
     * Creates a new one page tutorial with the given TutorialData
     * @param pageData Data to fill the tutorial content with.
     */
    public Tutorial(TutorialData pageData) {
        initComponents();
        initRoadmapContent();
        setAllTheThings(pageData);
    }
    
    /**
     * Sets all components of the tutorial
     * @param pageData Contains the tutorial elements to set
     */
    public void setAllTheThings(TutorialData pageData) {
        titleLabel.setText("<html><b>" + pageData.title + "</b></html>");
        descText.setText("<html><body style='width: 300px'>" + pageData.getDescription() + "</body></html>");
        syntaxText.setText("<html><body style='width: 300px'>" + pageData.getSyntax() + "</body></html>");
        sampleCodeText.setText("<html><body style='width: 300px'>" + pageData.getExampleCode() + "</body></html>");
        outputText.setText("<html><body style='width: 300px'>" + pageData.getExampleOutput() + "</body></html>");
        tryItText.setText("<html><body style='width: 300px'>" + pageData.tryItYourself + "</body></html>");
    }
    
    /** 
     * Adds a given pageData element to the tutorial track linked list
     * @param pageData The element to be added to the tutorial track
     */
    public void addTutorial(TutorialData pageData) {
        pageData.pageId = tutorialTrack.getNextID();
        tutorialTrack.database.setTutorialData(pageData);
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
        toEndButton = new javax.swing.JButton();
        toBeginningButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        roadmapList = new javax.swing.JList();
        descriptionPanel = new javax.swing.JPanel();
        sampleCodeLabel = new javax.swing.JLabel();
        sampleOutputLabel = new javax.swing.JLabel();
        syntaxLabel = new javax.swing.JLabel();
        descLabel = new javax.swing.JLabel();
        TryItYourself = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        codeInputText = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        consoleText = new javax.swing.JTextArea();
        runButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tryItText = new javax.swing.JLabel();
        descText = new javax.swing.JLabel();
        syntaxText = new javax.swing.JLabel();
        sampleCodeText = new javax.swing.JLabel();
        outputText = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        previousLessonButton = new javax.swing.JButton();
        nextLessonButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        toEndButton.setText("Jump to End");
        toEndButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toEndButtonActionPerformed(evt);
            }
        });
        jPanel1.add(toEndButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 512, 159, 40));

        toBeginningButton.setText("Jump to Beginning");
        toBeginningButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toBeginningButtonActionPerformed(evt);
            }
        });
        jPanel1.add(toBeginningButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 17, 160, 40));

        roadmapList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                roadmapListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(roadmapList);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 150, 450));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 10, -1, 588));

        descriptionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sampleCodeLabel.setText("<html><b>Code Example</html></b>");
        descriptionPanel.add(sampleCodeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 297, -1, -1));

        sampleOutputLabel.setText("<html><b>Output</html></b>");
        descriptionPanel.add(sampleOutputLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 409, -1, -1));

        syntaxLabel.setText("<html><b>Syntax</html></b>");
        descriptionPanel.add(syntaxLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        descLabel.setText("<html><b>Description</b></html>");
        descriptionPanel.add(descLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 71, -1, -1));

        TryItYourself.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codeInputText.setColumns(20);
        codeInputText.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        codeInputText.setRows(5);
        codeInputText.setText("1 \n2 \n3 \n4 \n5 \n6 \n7 \n8 \n9 \n");
        jScrollPane3.setViewportView(codeInputText);

        TryItYourself.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 109, 388, 204));

        consoleText.setColumns(20);
        consoleText.setRows(5);
        jScrollPane4.setViewportView(consoleText);

        TryItYourself.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 360, 388, 116));

        runButton.setText("Run");
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });
        TryItYourself.add(runButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 325, -1, -1));

        jLabel1.setText("<html><b>Try It Yourself!</html></b>");
        TryItYourself.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        tryItText.setText("jLabel2");
        TryItYourself.add(tryItText, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 28, -1, -1));

        descriptionPanel.add(TryItYourself, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 400, -1));

        descText.setText("jLabel2");
        descriptionPanel.add(descText, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 93, -1, -1));

        syntaxText.setFont(new java.awt.Font("Courier", 0, 13)); // NOI18N
        syntaxText.setText("jLabel2");
        descriptionPanel.add(syntaxText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        sampleCodeText.setFont(new java.awt.Font("Courier", 0, 13)); // NOI18N
        sampleCodeText.setText("jLabel2");
        descriptionPanel.add(sampleCodeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 319, -1, -1));

        outputText.setFont(new java.awt.Font("Courier", 0, 13)); // NOI18N
        outputText.setText("jLabel2");
        descriptionPanel.add(outputText, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 431, -1, -1));

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        descriptionPanel.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 23, -1, -1));

        add(descriptionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 10, 789, -1));

        previousLessonButton.setText("Previous Lesson");
        previousLessonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousLessonButtonActionPerformed(evt);
            }
        });
        add(previousLessonButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 550, 160, 43));

        nextLessonButton.setText("Next Lesson");
        nextLessonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextLessonButtonActionPerformed(evt);
            }
        });
        add(nextLessonButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 550, 150, 43));
    }// </editor-fold>//GEN-END:initComponents
    /** 
     * Update the tutorial to the current roadmap selection. 
     */
    private void RoadmapContentListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_RoadmapContentListValueChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_RoadmapContentListValueChanged
    
    public void initRoadmapContent() {
        //listItems.removeAllElements();
        System.out.println("There are " + tutorialTrack.track.size() + " items in the list");
        for (int i = 0; i < tutorialTrack.track.size(); i++) {
            listItems.addElement(tutorialTrack.database.getTutorialData(tutorialTrack.track.get(i)).title);
        } 
        roadmapList.setModel(listItems);
    }
    
    /** 
     * Jump to the end of the tutorial track.
     */
    private void toEndButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toEndButtonActionPerformed
        //sideModule.toEnd();
        currentIndex = tutorialTrack.maxIndex-1;
        setAllTheThings(tutorialTrack.database.getTutorialData(currentIndex));
        System.out.println("Tutorial " + (currentIndex+1) + "/" + tutorialTrack.maxIndex);
    }//GEN-LAST:event_toEndButtonActionPerformed
    
    /** Disables buttons for the purpose of previewing the tutorial. */
    public void disableButtons() {
        nextLessonButton.setEnabled(false);
        previousLessonButton.setEnabled(false);
        toBeginningButton.setEnabled(false);
        toEndButton.setEnabled(false);
        runButton.setEnabled(false);
    }
    
    /**
     * Load content for the previous lesson.
     */
    private void previousLessonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousLessonButtonActionPerformed
        if (currentIndex > 0) {
            currentIndex--;
        }
        setAllTheThings(tutorialTrack.database.getTutorialData(currentIndex));
        System.out.println("Tutorial " + (currentIndex+1) + "/" + tutorialTrack.maxIndex);
    }//GEN-LAST:event_previousLessonButtonActionPerformed

    /**
     * Load content for the next lesson
     */
    private void nextLessonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextLessonButtonActionPerformed
        if (currentIndex < tutorialTrack.maxIndex-1) {
            currentIndex++;
        }
        setAllTheThings(tutorialTrack.database.getTutorialData(currentIndex));
        System.out.println("Tutorial " + (currentIndex+1) + "/" + tutorialTrack.maxIndex);
    }//GEN-LAST:event_nextLessonButtonActionPerformed

    /**
     * Jump to the beginning of the tutorial track
     */
    private void toBeginningButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toBeginningButtonActionPerformed
        //sideModule.toBeginning(tutorialTrack);
        currentIndex = 0;
        setAllTheThings(tutorialTrack.database.getTutorialData(0));
        System.out.println("Tutorial " + (currentIndex+1) + "/" + tutorialTrack.maxIndex);
    }//GEN-LAST:event_toBeginningButtonActionPerformed

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
        System.out.println("Run!");
    }//GEN-LAST:event_runButtonActionPerformed

    private void roadmapListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_roadmapListValueChanged
        System.out.println("Selection: " + roadmapList.getSelectedIndex());
        int ndx = tutorialTrack.track.get(roadmapList.getSelectedIndex());
        currentIndex = roadmapList.getSelectedIndex();
        setAllTheThings(tutorialTrack.database.getTutorialData(ndx));
        System.out.println("Selected index: " + ndx);//setAllTheThings(tutorialTrack.database.getTutorialData(ndx));
    }//GEN-LAST:event_roadmapListValueChanged

    /**
     * Opens and shows the Tutorial
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
            java.util.logging.Logger.getLogger(EditingTools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditingTools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditingTools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditingTools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tutorial().setVisible(true);
            }
        });
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TryItYourself;
    private javax.swing.JTextArea codeInputText;
    private javax.swing.JTextArea consoleText;
    private javax.swing.JLabel descLabel;
    private javax.swing.JLabel descText;
    private javax.swing.JPanel descriptionPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton nextLessonButton;
    private javax.swing.JLabel outputText;
    private javax.swing.JButton previousLessonButton;
    private javax.swing.JList roadmapList;
    private javax.swing.JButton runButton;
    private javax.swing.JLabel sampleCodeLabel;
    private javax.swing.JLabel sampleCodeText;
    private javax.swing.JLabel sampleOutputLabel;
    private javax.swing.JLabel syntaxLabel;
    private javax.swing.JLabel syntaxText;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton toBeginningButton;
    private javax.swing.JButton toEndButton;
    private javax.swing.JLabel tryItText;
    // End of variables declaration//GEN-END:variables
}
