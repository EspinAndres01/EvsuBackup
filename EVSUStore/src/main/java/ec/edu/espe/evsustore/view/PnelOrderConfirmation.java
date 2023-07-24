 package ec.edu.espe.evsustore.view;

import ec.edu.espe.evsustore.controller.CatalogController;
import ec.edu.espe.evsustore.controller.TransactionsController;
import ec.edu.espe.evsustore.utils.DecimalsControl;
import ec.edu.espe.evsustore.utils.HashMapManger;
import ec.edu.espe.evsustore.utils.ViewManager;
import java.awt.BorderLayout;
import java.awt.Panel;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.table.TableColumnModel;


/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class PnelOrderConfirmation extends javax.swing.JPanel {

    CatalogController catalogController = CatalogController.getInstance();
    ArrayList<HashMap<Object, Object>> orderedProducts = new ArrayList<>();
    String productsResume = "";
    Double total = 0.0;
    ArrayList<HashMap<Object, Object>> selectedProducts;
    ArrayList<HashMap<Object, Object>> actualProducts;
    int actualPage;
    
    /**
     * Creates new form PnelOrderConfirmation
     * @param selectedProducts
     */
    public PnelOrderConfirmation(ArrayList<HashMap<Object, Object>> selectedProducts) {
        this.selectedProducts = selectedProducts;
        this.actualPage = 1;
        
        initComponents();
        
        spinnerQuantity.setVisible(false);
        btnAdd.setVisible(false);
        
        displayProductsTable();
        btnNext.setEnabled(areNextElements());
        
        addListeners();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Content = new javax.swing.JPanel();
        pnelProducts = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        spinnerQuantity = new javax.swing.JSpinner();
        btnAdd = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        pnelOrderVerification = new javax.swing.JPanel();
        txtTotal = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResume = new javax.swing.JTextArea();
        pnelBtns = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnContinue = new javax.swing.JButton();

        tblProducts.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblProducts.setRowHeight(35);
        tblProducts.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblProducts.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblProducts);

        spinnerQuantity.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        spinnerQuantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, 0, 1));
        spinnerQuantity.setEnabled(false);

        btnAdd.setText("Añadir");
        btnAdd.setEnabled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnNext.setText(">");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setText("<");
        btnPrevious.setEnabled(false);
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnelProductsLayout = new javax.swing.GroupLayout(pnelProducts);
        pnelProducts.setLayout(pnelProductsLayout);
        pnelProductsLayout.setHorizontalGroup(
            pnelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelProductsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnelProductsLayout.createSequentialGroup()
                        .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spinnerQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        pnelProductsLayout.setVerticalGroup(
            pnelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelProductsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnelProductsLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(pnelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrevious)
                    .addComponent(btnNext))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        txtTotal.setEditable(false);
        txtTotal.setEnabled(false);

        txtResume.setColumns(20);
        txtResume.setRows(5);
        jScrollPane2.setViewportView(txtResume);

        javax.swing.GroupLayout pnelOrderVerificationLayout = new javax.swing.GroupLayout(pnelOrderVerification);
        pnelOrderVerification.setLayout(pnelOrderVerificationLayout);
        pnelOrderVerificationLayout.setHorizontalGroup(
            pnelOrderVerificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelOrderVerificationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        pnelOrderVerificationLayout.setVerticalGroup(
            pnelOrderVerificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelOrderVerificationLayout.createSequentialGroup()
                .addGroup(pnelOrderVerificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnelOrderVerificationLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnelOrderVerificationLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnContinue.setText("Continuar con el pedido");
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnelBtnsLayout = new javax.swing.GroupLayout(pnelBtns);
        pnelBtns.setLayout(pnelBtnsLayout);
        pnelBtnsLayout.setHorizontalGroup(
            pnelBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelBtnsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        pnelBtnsLayout.setVerticalGroup(
            pnelBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelBtnsLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(pnelBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnelProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnelOrderVerification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnelBtns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addComponent(pnelProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnelOrderVerification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnelBtns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        this.actualPage = this.actualPage + 1;
        displayProductsTable();
        btnNext.setEnabled(areNextElements());
        btnPrevious.setEnabled(arePreviousElements());
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        this.actualPage = this.actualPage - 1;
        displayProductsTable();
        btnNext.setEnabled(areNextElements());
        btnPrevious.setEnabled(arePreviousElements());
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        addProducts();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        PnelCustomer pnelCustomer = new PnelCustomer(orderedProducts);
        ViewManager.showPanel(Content, pnelCustomer);
    }//GEN-LAST:event_btnContinueActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PnelSalesCatalog pnelSalesCatalog=new PnelSalesCatalog();
        showPanel(pnelSalesCatalog);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void showPanel(JPanel panelUI) {
        panelUI.setSize(900, 675);
        panelUI.setLocation(0, 0);
        Content.removeAll();
        Content.add(panelUI, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }
    
    private void addProducts(){
        int selectedRowIndex = tblProducts.getSelectedRow();
        int id = Integer.parseInt(tblProducts.getValueAt(selectedRowIndex, 0).toString());
        
        HashMap<Object, Object> catalogProduct = catalogController.obtain(id);
        catalogProduct.replace("quantity", spinnerQuantity.getValue());
        productsResume = productsResume + " \n " + HashMapManger.toSring(catalogProduct);
        total = total + TransactionsController.calcTotal(catalogProduct);
        String totalText = "$ " + String.format ("%.2f", DecimalsControl.roundToTwoTenths(total)); 
        
        txtResume.setText(productsResume);
        txtTotal.setText(totalText);
        
        orderedProducts.add(catalogProduct);
    }
    
    private void addListeners(){
        
        ArrayList<JButton> buttonsToEnable = new ArrayList<>();
        buttonsToEnable.add(btnAdd);
        SelectedListener selectedListener = new SelectedListener(buttonsToEnable, spinnerQuantity, tblProducts);
        tblProducts.getSelectionModel().addListSelectionListener(selectedListener);
    
    }
    
    private void displayProductsTable(){
        if(selectedProducts.size()>=actualPage*7){
            this.actualProducts = new ArrayList<>(selectedProducts.subList((actualPage*7)-7, actualPage*7));
        }
        else{
            this.actualProducts = new ArrayList<>(selectedProducts.subList((actualPage*7)-7, selectedProducts.size()));
        }
        
        
        ViewManager.displayTable(tblProducts, actualProducts);
        
        TableColumnModel tblColumnModel = tblProducts.getColumnModel();
        
        //ReorderColumns
        tblColumnModel.moveColumn(3, 1);
        tblColumnModel.moveColumn(3, 1);
    }
    
    
    
    private boolean areNextElements(){
        if(actualProducts.size()<7){
             return false;
        }
        else if(actualProducts.size()*actualPage == selectedProducts.size()){
            return false;
        }
        else{
            return true;
        }
    }
    
    private boolean arePreviousElements(){
        if(actualPage == 1){
            return false;
        }
        else{
            return true;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnContinue;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnelBtns;
    private javax.swing.JPanel pnelOrderVerification;
    private javax.swing.JPanel pnelProducts;
    private javax.swing.JSpinner spinnerQuantity;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextArea txtResume;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
