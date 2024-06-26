/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dispatchdesktopapp;

/**
 *
 * @author meahm
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewItems extends javax.swing.JFrame {

    /**
     * Creates new form ViewItems
     */
    DefaultTableModel itemsModel;
    ArrayList< String> items;
    String oldData;
    public ViewItems() {
        initComponents();
        itemsModel=(DefaultTableModel)TableItems.getModel();
        items=new ArrayList<>();
        loadData();
        pnlUpdateItem.setVisible(false);
    }
  private void loadData()
    {
        
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader(GlobalVariables.itemFile);
            br = new BufferedReader(fr);           
            String line;
            int serial = 1;
            while((line = br.readLine())!=null)
            {
                //System.out.println(line);
                items.add(line);
                String arr[] = line.split(",");
                Object data[] = new Object[]{serial, arr[0], arr[1], arr[2],arr[3]};
                
                itemsModel.addRow(data); // populate table with data one by one
                
               serial++;
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
        TableItems = new javax.swing.JTable();
        pnlUpdateItem1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        inputItemQuantityUpdate1 = new javax.swing.JTextField();
        inputItemIdUpdate1 = new javax.swing.JTextField();
        inputItemNameUpdate1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        inputIteamDescriptionUpdate1 = new javax.swing.JTextArea();
        btnCancel1 = new javax.swing.JButton();
        btnSaveItemChanges1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnAddNewItem = new javax.swing.JButton();
        btnDeleteItem = new javax.swing.JButton();
        btnUpdateItem = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        TableItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr#", "Item ID", "Item Name", "Quantity", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableItems);

        pnlUpdateItem1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Description:");

        inputIteamDescriptionUpdate1.setColumns(20);
        inputIteamDescriptionUpdate1.setRows(5);
        jScrollPane3.setViewportView(inputIteamDescriptionUpdate1);

        btnCancel1.setBackground(new java.awt.Color(255, 0, 0));
        btnCancel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancel1.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel1.setText("Cancel");
        btnCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSaveItemChanges1.setBackground(new java.awt.Color(51, 255, 51));
        btnSaveItemChanges1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSaveItemChanges1.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveItemChanges1.setText("Update");
        btnSaveItemChanges1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveItemChangesActionPerformed(evt);
            }
        });

        jLabel7.setText("Item Id:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel8.setText("Add An Item");

        jLabel9.setText("Item Name:");

        jLabel10.setText("Quantity:");

        javax.swing.GroupLayout pnlUpdateItem1Layout = new javax.swing.GroupLayout(pnlUpdateItem1);
        pnlUpdateItem1.setLayout(pnlUpdateItem1Layout);
        pnlUpdateItem1Layout.setHorizontalGroup(
            pnlUpdateItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUpdateItem1Layout.createSequentialGroup()
                .addGap(0, 122, Short.MAX_VALUE)
                .addGroup(pnlUpdateItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUpdateItem1Layout.createSequentialGroup()
                        .addGroup(pnlUpdateItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(pnlUpdateItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlUpdateItem1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnlUpdateItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputItemNameUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputItemIdUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputItemQuantityUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlUpdateItem1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUpdateItem1Layout.createSequentialGroup()
                        .addComponent(btnCancel1)
                        .addGap(38, 38, 38)
                        .addComponent(btnSaveItemChanges1)
                        .addGap(39, 39, 39))))
            .addGroup(pnlUpdateItem1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlUpdateItem1Layout.setVerticalGroup(
            pnlUpdateItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUpdateItem1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUpdateItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(inputItemIdUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlUpdateItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(inputItemNameUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUpdateItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputItemQuantityUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGroup(pnlUpdateItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUpdateItem1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel6))
                    .addGroup(pnlUpdateItem1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(pnlUpdateItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel1)
                    .addComponent(btnSaveItemChanges1))
                .addGap(18, 18, 18))
        );

        btnAddNewItem.setBackground(new java.awt.Color(0, 0, 0));
        btnAddNewItem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddNewItem.setForeground(new java.awt.Color(255, 255, 255));
        btnAddNewItem.setText("Add New Item");
        btnAddNewItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewItemActionPerformed(evt);
            }
        });

        btnDeleteItem.setBackground(new java.awt.Color(0, 0, 0));
        btnDeleteItem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDeleteItem.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteItem.setText("Delete");
        btnDeleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteItemActionPerformed(evt);
            }
        });

        btnUpdateItem.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdateItem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdateItem.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateItem.setText("Update An Item");
        btnUpdateItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateItemActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(102, 0, 102));
        btnBack.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<-Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdateItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddNewItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnBack)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(pnlUpdateItem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnAddNewItem, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateItem, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteItem, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnBack)))
                .addGap(53, 53, 53)
                .addComponent(pnlUpdateItem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateItemActionPerformed
        // TODO add your handling code here:
       int row=TableItems.getSelectedRow();
        if(row!=-1){
            oldData=itemsModel.getValueAt(row,1).toString()+","+
            itemsModel.getValueAt(row,2).toString()+","+
            itemsModel.getValueAt(row,3).toString()+","+
            itemsModel.getValueAt(row,4).toString();
            pnlUpdateItem.setVisible(true);
            inputItemIdUpdate.setText(itemsModel.getValueAt(row,1).toString());
            inputItemNameUpdate.setText(itemsModel.getValueAt(row,2).toString());
            inputItemQuantityUpdate.setText(itemsModel.getValueAt(row,3).toString());
            inputIteamDescriptionUpdate.setText(itemsModel.getValueAt(row,4).toString());
        }else{
            JOptionPane.showMessageDialog(rootPane, "Please Select Row....");

        }
    }//GEN-LAST:event_btnUpdateItemActionPerformed

    private void btnDeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteItemActionPerformed
        int row = TableItems.getSelectedRow();
        if(row!=-1){
            int confirm = JOptionPane.showConfirmDialog(rootPane, "Do you want to delete the data in this row?");
            if (confirm == JOptionPane.YES_OPTION) {
                items.remove(row);
                itemsModel.removeRow(row);
                writeItemsIntoFile();
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Please select a row to delete.");
        }

    }//GEN-LAST:event_btnDeleteItemActionPerformed

    private void btnAddNewItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewItemActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddANewItem().setVisible(true);

            }
        });
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddNewItemActionPerformed

    private void btnSaveItemChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveItemChangesActionPerformed
        // TODO add your handling code here:
        String itemId=inputItemIdUpdate.getText().trim();
        String itemName=inputItemNameUpdate.getText().trim();
        String ItemQuantity=inputItemQuantityUpdate.getText().trim();
        String itemDescription=inputIteamDescriptionUpdate.getText().trim();

        if(itemId.isEmpty() || itemName.isEmpty() ||
            ItemQuantity.isEmpty() || itemDescription.isEmpty() ){
            JOptionPane.showMessageDialog(rootPane, "Something is Missing....");
        }
        else
        {
            items.remove(oldData);
            items.add(itemId+","+itemName+","+ItemQuantity+","+itemDescription);

            writeItemsIntoFile();

        }
    }//GEN-LAST:event_btnSaveItemChangesActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        java.awt.EventQueue.invokeLater( new Runnable(){
            public void run(){
                new ViewItems().setVisible(true);
            }
        });dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new ItemsMainMenu().setVisible(true);
            }
        });dispose();
    }//GEN-LAST:event_btnBackActionPerformed

                
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableItems;
    private javax.swing.JButton btnAddNewItem;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCancel1;
    private javax.swing.JButton btnDeleteItem;
    private javax.swing.JButton btnSaveItemChanges;
    private javax.swing.JButton btnSaveItemChanges1;
    private javax.swing.JButton btnUpdateItem;
    private javax.swing.JTextArea inputIteamDescriptionUpdate;
    private javax.swing.JTextArea inputIteamDescriptionUpdate1;
    private javax.swing.JTextField inputItemIdUpdate;
    private javax.swing.JTextField inputItemIdUpdate1;
    private javax.swing.JTextField inputItemNameUpdate;
    private javax.swing.JTextField inputItemNameUpdate1;
    private javax.swing.JTextField inputItemQuantityUpdate;
    private javax.swing.JTextField inputItemQuantityUpdate1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel pnlUpdateItem;
    private javax.swing.JPanel pnlUpdateItem1;
    // End of variables declaration//GEN-END:variables
 private void writeItemsIntoFile() {
            FileWriter fw = null;
            BufferedWriter bw = null;
                try{
                    fw = new FileWriter(GlobalVariables.itemFile);
                    bw = new BufferedWriter(fw);
                    
                    for(String t:items)
                    {
                        bw.write(t);
                        bw.newLine();
                    }
                    
                    JOptionPane.showMessageDialog(rootPane, "Data updated successfully");
                    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewItems().setVisible(true);
            }
        });
        dispose();
                }
                catch(IOException e)
                {
                    //e.printStackTrace();
                    System.out.println(e.getMessage());
                }
                finally{
                    if(bw != null)
                    {
                        try {
                            bw.close();
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
