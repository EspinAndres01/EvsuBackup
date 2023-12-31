
package ec.edu.espe.evsustore.view;

import ec.edu.espe.evsustore.controller.CustomerController;
import ec.edu.espe.evsustore.controller.HardwareComponentController;
import ec.edu.espe.evsustore.controller.SaleController;
import ec.edu.espe.evsustore.controller.TransactionsController;
import ec.edu.espe.evsustore.model.HardwareComponent;
import ec.edu.espe.evsustore.model.Sale;
import ec.edu.espe.evsustore.utils.ViewManager;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class PnelCashPay extends javax.swing.JPanel {

    HardwareComponentController componentController = HardwareComponentController.getInstance();
    CustomerController customerController = CustomerController.getInstance();
    SaleController saleController = SaleController.getInstance();
    
    Sale sale;
    
    /**
     * Creates new form PnelCashPay
     */
    public PnelCashPay(Sale sale) {
        this.sale = sale;
        
        initComponents();
        fillFields();
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

        pnelContent = new javax.swing.JPanel();
        pnelMoney = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSaleTotal = new javax.swing.JTextField();
        txtCashReceived = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtChange = new javax.swing.JTextField();
        pnelButtons = new javax.swing.JPanel();
        btnComplete = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("CANTIDAD DE DINERO RECIBIDO:");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("PRECIO A COBRAR DE LA VENTA:");

        txtSaleTotal.setEditable(false);
        txtSaleTotal.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtSaleTotal.setEnabled(false);
        txtSaleTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaleTotalActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setText("CAMBIO A DEVOLVER:");

        txtChange.setEditable(false);
        txtChange.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChangeActionPerformed(evt);
            }
        });

        btnComplete.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnComplete.setText("Completar transacción");
        btnComplete.setEnabled(false);
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnelButtonsLayout = new javax.swing.GroupLayout(pnelButtons);
        pnelButtons.setLayout(pnelButtonsLayout);
        pnelButtonsLayout.setHorizontalGroup(
            pnelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnelButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnelButtonsLayout.setVerticalGroup(
            pnelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnelMoneyLayout = new javax.swing.GroupLayout(pnelMoney);
        pnelMoney.setLayout(pnelMoneyLayout);
        pnelMoneyLayout.setHorizontalGroup(
            pnelMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelMoneyLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(pnelMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnelMoneyLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                        .addGap(108, 108, 108)))
                .addGap(18, 18, 18)
                .addGroup(pnelMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSaleTotal)
                    .addComponent(txtCashReceived, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(txtChange))
                .addContainerGap(299, Short.MAX_VALUE))
            .addComponent(pnelButtons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnelMoneyLayout.setVerticalGroup(
            pnelMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelMoneyLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(pnelMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCashReceived, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(pnelMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSaleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101)
                .addGroup(pnelMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtChange, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(pnelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnelContentLayout = new javax.swing.GroupLayout(pnelContent);
        pnelContent.setLayout(pnelContentLayout);
        pnelContentLayout.setHorizontalGroup(
            pnelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnelMoney, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnelContentLayout.setVerticalGroup(
            pnelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnelContentLayout.createSequentialGroup()
                .addComponent(pnelMoney, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChangeActionPerformed
       
    }//GEN-LAST:event_txtChangeActionPerformed

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        PnelSaleBill pnelSaleBill = new PnelSaleBill(sale);
        ViewManager.showPanel(pnelContent, pnelSaleBill);
        
        customerController.save(sale.getCustomer());
        componentController.updateQuantities(sale.getSoldComponents());
        saleController.save(sale);
    }//GEN-LAST:event_btnCompleteActionPerformed

    private void txtSaleTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaleTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaleTotalActionPerformed

        private void fillFields(){
            double saleTotal = sale.getSalePrice();
            txtSaleTotal.setText(String.valueOf(saleTotal));
        }

        private void addListeners(){
            FilledListener filledListener = new FilledListener(this);
            txtCashReceived.getDocument().addDocumentListener(filledListener);
            
            KeyTypeListener doubleKeyTypeListener = new KeyTypeListener("Double");
            txtCashReceived.addKeyListener(doubleKeyTypeListener);
        }
        
        public void checkFields(){
            if (!txtCashReceived.getText().isEmpty()) {
                double saleTotal = Double.parseDouble(txtSaleTotal.getText());
                double cashReceived = Double.parseDouble(txtCashReceived.getText());
                if(cashReceived<saleTotal){   
                    btnComplete.setEnabled(false);
                    txtChange.setText("");
                }
                else{
                    String exchangeText = String.format("%.2f", TransactionsController.calcExchange(saleTotal, cashReceived));
                    txtChange.setText(exchangeText);
                    btnComplete.setEnabled(true);
                }
            }
            else{
                btnComplete.setEnabled(false);
            }
        }


   

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComplete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel pnelButtons;
    private javax.swing.JPanel pnelContent;
    private javax.swing.JPanel pnelMoney;
    private javax.swing.JTextField txtCashReceived;
    private javax.swing.JTextField txtChange;
    private javax.swing.JTextField txtSaleTotal;
    // End of variables declaration//GEN-END:variables
}
