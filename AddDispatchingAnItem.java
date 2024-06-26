/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dispatchdesktopapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author meahm
 */
public class AddDispatchingAnItem extends javax.swing.JFrame {

    /**
     * Creates new form dispatchingAnItem
     */
    public AddDispatchingAnItem() {
        initComponents();
    }
 private int VerifyData(String dataTobeMatched,
           String FileName)
    {
       ArrayList< String> array=new ArrayList<>();
        FileReader fr = null;
        BufferedReader br = null;
                
        try{
            fr = new FileReader(FileName);
            br = new BufferedReader(fr);           
            String line;
            while((line = br.readLine())!=null)
            {
                array.add(line);
                String arr[] = line.split(",");
                if(arr[0].equals(dataTobeMatched)){
                return 1;
                }
            }
        }catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        finally{
            if(br!= null)
            {
                try {
                    br.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            if(fr != null){
                try {
                    fr.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        return 0;
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
        jPanel1 = new javax.swing.JPanel();
        inputDispatchDestination = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        inputDispatchTruckId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        inputDispatchItemId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputDispatchDescription = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        inputDispatchSourceLocation = new javax.swing.JTextField();
        btnCancelSaving = new javax.swing.JButton();
        btnVerifyAndSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        inputDispatchDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDispatchDestinationActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Destination:");

        inputDispatchTruckId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDispatchTruckIdActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Source Location:");

        jLabel2.setText(" Truck ID:");

        jLabel3.setText("Dispatch information:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel7.setText("Dispatch Management");

        inputDispatchItemId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDispatchItemIdActionPerformed(evt);
            }
        });

        inputDispatchDescription.setColumns(20);
        inputDispatchDescription.setRows(5);
        jScrollPane1.setViewportView(inputDispatchDescription);

        jLabel4.setText(" Item ID:");

        inputDispatchSourceLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDispatchSourceLocationActionPerformed(evt);
            }
        });

        btnCancelSaving.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelSaving.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelSaving.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelSaving.setText("Cancel");
        btnCancelSaving.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelSavingActionPerformed(evt);
            }
        });

        btnVerifyAndSave.setBackground(new java.awt.Color(0, 0, 0));
        btnVerifyAndSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVerifyAndSave.setForeground(new java.awt.Color(255, 255, 255));
        btnVerifyAndSave.setText("Verify And Save");
        btnVerifyAndSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyAndSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputDispatchTruckId, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputDispatchDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputDispatchSourceLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputDispatchItemId, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(btnCancelSaving)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVerifyAndSave))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(26, 26, 26))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel3))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(69, 69, 69)
                                                .addComponent(jLabel2)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputDispatchTruckId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(inputDispatchItemId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputDispatchSourceLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputDispatchDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelSaving)
                    .addComponent(btnVerifyAndSave))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(250, 250, 250))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputDispatchSourceLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDispatchSourceLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDispatchSourceLocationActionPerformed

    private void inputDispatchItemIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDispatchItemIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDispatchItemIdActionPerformed

    private void btnCancelSavingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelSavingActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater( new Runnable(){
            public void run(){
                new DispatchMainMenu().setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_btnCancelSavingActionPerformed

    private void btnVerifyAndSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyAndSaveActionPerformed
        // TODO add your handling code here:
        String DispatchTruckId=inputDispatchTruckId.getText().trim();
        String DispatchItemId=inputDispatchItemId.getText().trim();
        String DispatchDescription=inputDispatchDescription.getText().trim();
        String DispatchSourceLocation=inputDispatchSourceLocation.getText().trim();
        String DispatchDestination=inputDispatchDestination.getText().trim();
        int checkTruck=VerifyData(DispatchTruckId,GlobalVariables.TRUCKFILE);
        int checkItem=VerifyData(DispatchItemId,GlobalVariables.itemFile);
        if(checkTruck==1 && checkItem==1){
            if(DispatchTruckId.isEmpty() || DispatchItemId.isEmpty() ||
                DispatchDescription.isEmpty() || DispatchSourceLocation.isEmpty()
                || DispatchDestination.isEmpty()){

                JOptionPane.showMessageDialog(rootPane, "Something is Missing....");
            }
            else{
                int confirm=JOptionPane.showConfirmDialog(rootPane, "Do you really want to save?");
                if(confirm==0){
                    FileWriter fw = null;
                    BufferedWriter bf=null;
                    try {
                        fw=new FileWriter(GlobalVariables.DispatchsFile,true);
                        bf=new BufferedWriter(fw);
                        bf.write(DispatchTruckId+","+DispatchItemId+","+ DispatchDescription
                            +","+DispatchSourceLocation +","+DispatchDestination);
                        bf.newLine();

                    } catch (Exception e) {
                        System.out.println(e.getMessage());

                    } finally {
                        if(bf != null)
                        {
                            try {
                                bf.close();
                            } catch (IOException ex) {
                                System.out.println(ex.getMessage());
                            }
                        }
                        if(fw != null){
                            try {
                                fw.close();
                            } catch (IOException ex) {
                                System.out.println(ex.getMessage());
                            }
                        }
                    }

                }
            }
            JOptionPane.showMessageDialog(rootPane, "Data Added...");
            java.awt.EventQueue.invokeLater( new Runnable(){
                public void run(){
                    new DispatchMainMenu().setVisible(true);
                }
            });
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(rootPane," not found");
        }

    }//GEN-LAST:event_btnVerifyAndSaveActionPerformed

    private void inputDispatchTruckIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDispatchTruckIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDispatchTruckIdActionPerformed

    private void inputDispatchDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDispatchDestinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDispatchDestinationActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelSaving;
    private javax.swing.JButton btnVerifyAndSave;
    private javax.swing.JTextArea inputDispatchDescription;
    private javax.swing.JTextField inputDispatchDestination;
    private javax.swing.JTextField inputDispatchItemId;
    private javax.swing.JTextField inputDispatchSourceLocation;
    private javax.swing.JTextField inputDispatchTruckId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
