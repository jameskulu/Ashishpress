/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ashishpress;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author James
 */
public class PurchaseHistory extends javax.swing.JFrame {

    /**
     * Creates new form PurchaseHistory
     */
    public PurchaseHistory() {
        initComponents();
        show_purchase_history_table();
    }
    
    
         public ArrayList<PurchaseSets> purchaseList(){
        ArrayList<PurchaseSets> purchaseList = new ArrayList<>();
        try{
        Database db = new Database();
        String query="select * from purchase_history";
        Statement st =db.conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        PurchaseSets purchase;
        while(rs.next()){
            purchase=new PurchaseSets(rs.getInt("purchased_id"),
                    rs.getString("date"),
                    rs.getString("party_name"),
                    rs.getString("invoice_no"),
                     rs.getString("payment_method"),       
                    rs.getString("purchased_item"),
                    rs.getString("quantity"),      
                    rs.getDouble("debit"),
                    rs.getDouble("credit"),
                     rs.getDouble("amount"),
                    rs.getString("remarks")        
            );
            purchaseList.add(purchase);
        }
        }
        catch(Exception ex){
        }
        return purchaseList;
    }
   
    
    public void show_purchase_history_table(){
        ArrayList<PurchaseSets> list = purchaseList();
        DefaultTableModel model =(DefaultTableModel)jtablephistory.getModel();
        Object[] row = new Object[11];
        for(int i=0; i<list.size();i++){
            row[0]=list.get(i).getId();
            row[1]=list.get(i).getdate();
            row[2]=list.get(i).getparty_name();
            row[3]=list.get(i).getinvoice_no();
            row[4]=list.get(i).getpayment_method();
            row[5]=list.get(i).getpurchased_item();
            row[6]=list.get(i).getquantity();
            row[7]=list.get(i).getdebit();
            row[8]=list.get(i).getcredit();
            row[9]=list.get(i).getamount();
            row[10]=list.get(i).getremarks();
            
            model.addRow(row);
        }
    }
    
    public double parseDouble(String s){
    if(s == null || s.isEmpty()) 
        return 0.0;
    else
        return Double.parseDouble(s);
}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablephistory = new javax.swing.JTable();
        searchPurchasedHistoryTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("Purchase History");

        jtablephistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.N", "Date", "Party Name", "Invoice No", "Payment Method", "Purchased Item", "Quantity", "Debit", "Credit", "Amount", "Remarks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtablephistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablephistoryMouseClicked(evt);
            }
        });
        jtablephistory.setRowHeight(jtablephistory.getRowHeight() + 20);
        jtablephistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtablephistory);

        searchPurchasedHistoryTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchPurchasedHistoryTxtKeyReleased(evt);
            }
        });

        jLabel11.setText("Search:");

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Delete all history");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete Row");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(366, 366, 366))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(searchPurchasedHistoryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1029, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel5)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchPurchasedHistoryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtablephistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablephistoryMouseClicked

    }//GEN-LAST:event_jtablephistoryMouseClicked

    private void searchPurchasedHistoryTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchPurchasedHistoryTxtKeyReleased
           DefaultTableModel table = (DefaultTableModel)jtablephistory.getModel();
       String search = searchPurchasedHistoryTxt.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        jtablephistory.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" +search));
    }//GEN-LAST:event_searchPurchasedHistoryTxtKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Database db = new Database();
         int a = JOptionPane.showConfirmDialog(null,"Do you sure want to delete all the history ?","Delete History",JOptionPane.YES_NO_OPTION);
        if(a==0){ 
        db.delete_purchase_history();
        JOptionPane.showMessageDialog(null,"Deleted all the history");
        
         DefaultTableModel model = (DefaultTableModel)jtablephistory.getModel();
         model.setRowCount(0);
         show_purchase_history_table();
        }
       
        
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int a = JOptionPane.showConfirmDialog(null,"Do you sure want to delete this ?","Delete",JOptionPane.YES_NO_OPTION);
        if(a==0){ 
        int row = jtablephistory.getSelectedRow();
       if(row!=-1)
       {
           String NOMER = jtablephistory.getValueAt(row, 0).toString();
           System.out.println(NOMER);

           String sql = "DELETE FROM purchase_history WHERE purchased_id='"+NOMER+"'";
           String resetno = "ALTER TABLE purchase_history DROP purchased_id";                            
           String consecutivenumbers="ALTER TABLE purchase_history ADD purchased_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY FIRST";
           System.out.println(resetno);
           try {
               Database.koneksiDb().createStatement().execute(sql);
               Database.koneksiDb().createStatement().execute(resetno);
               Database.koneksiDb().createStatement().execute(consecutivenumbers);
               
    
                DefaultTableModel model = (DefaultTableModel)jtablephistory.getModel();
                      model.setRowCount(0);
                      show_purchase_history_table();
                      JOptionPane.showMessageDialog(null,"Deleted");

                    
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex);
           }
           
       }
      }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PurchaseHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurchaseHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtablephistory;
    private javax.swing.JTextField searchPurchasedHistoryTxt;
    // End of variables declaration//GEN-END:variables
}
