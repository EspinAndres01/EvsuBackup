
package ec.edu.espe.evsustore.view;

import ec.edu.espe.evsustore.controller.CustomerController;
import ec.edu.espe.evsustore.model.Customer;
import ec.edu.espe.evsustore.utils.ViewManager;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class PnelCustomer extends javax.swing.JPanel {

    CustomerController customerController = CustomerController.getInstance();
    ArrayList<HashMap<Object, Object>> orderedProducts;
    
    
    
    /**
     * Creates new form PnelCustomer
     * @param orderedProducts
     */
    public PnelCustomer(ArrayList<HashMap<Object, Object>> orderedProducts) {
        this.orderedProducts = orderedProducts;
        
        initComponents();
        
        int generatedId = customerController.generateId();
        txtId.setText(String.valueOf(generatedId));
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        xxxxxddd = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtIdCardNumber = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        cmbBoxCustomers = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnContinue = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("CLIENTE DEL PEDIDO");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setText("Nombres:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setText("Apellidos:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setText("N° de Cédula:");

        xxxxxddd.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        xxxxxddd.setText("Teléfono:");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setText("Email:");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setText("Dirección:");

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtId.setEnabled(false);

        txtName.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        txtLastName.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        txtIdCardNumber.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtIdCardNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCardNumberActionPerformed(evt);
            }
        });

        txtLocation.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        txtPhoneNumber.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        txtEmail.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        cmbBoxCustomers.setEditable(true);
        cmbBoxCustomers.setOpaque(false);
        cmbBoxCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBoxCustomersActionPerformed(evt);
            }
        });

        jLabel6.setText("Elegir cliente ya existente:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 412, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(297, 297, 297))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdCardNumber)
                                    .addComponent(txtLastName)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtEmail))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(xxxxxddd))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLocation)
                                    .addComponent(txtPhoneNumber))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbBoxCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(178, 178, 178)))
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBoxCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIdCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xxxxxddd)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        btnClear.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnClear.setText("Limpiar Campos");

        btnBack.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnBack.setText("Volver al Pedido");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnContinue.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnContinue.setText("Continuar");
        btnContinue.setEnabled(false);
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnelContentLayout = new javax.swing.GroupLayout(pnelContent);
        pnelContent.setLayout(pnelContentLayout);
        pnelContentLayout.setHorizontalGroup(
            pnelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnelContentLayout.setVerticalGroup(
            pnelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelContentLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void txtIdCardNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCardNumberActionPerformed
        //  
    }//GEN-LAST:event_txtIdCardNumberActionPerformed

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        Customer customer = read();
        PnelPayConfirmation pnelPayConf = new PnelPayConfirmation(customer, orderedProducts);
        ViewManager.showPanel(pnelContent, pnelPayConf);
    }//GEN-LAST:event_btnContinueActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MainPanel mainPanel = new MainPanel();
        ViewManager.showPanel(pnelContent, mainPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbBoxCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBoxCustomersActionPerformed

        int customerId = Integer.parseInt(cmbBoxCustomers.getSelectedItem().toString().split(" ")[0]);
        HashMap<Object, Object> customer = customerController.obtainFromDb(customerId);
        fillFields(customer);
    }//GEN-LAST:event_cmbBoxCustomersActionPerformed
    
    
    private void addListeners(){
        KeyTypeListener intKeyTypeListener = new KeyTypeListener("int");
        KeyTypeListener doubleKeyTypeListener = new KeyTypeListener("Double");
        KeyTypeListener charKeyTypeListener = new KeyTypeListener("char");
        KeyTypeListener emailKeyTypeListener = new KeyTypeListener("email");
        FilledListener allFieldsFilledListener = new FilledListener(this);
        
        txtName.addKeyListener(charKeyTypeListener);
        txtLastName.addKeyListener(charKeyTypeListener);
        txtIdCardNumber.addKeyListener(intKeyTypeListener);
        txtPhoneNumber.addKeyListener(intKeyTypeListener);
        txtEmail.addKeyListener(emailKeyTypeListener);
        
        
        txtName.getDocument().addDocumentListener(allFieldsFilledListener);
        txtLastName.getDocument().addDocumentListener(allFieldsFilledListener);
        txtIdCardNumber.getDocument().addDocumentListener(allFieldsFilledListener);
        txtLocation.getDocument().addDocumentListener(allFieldsFilledListener);
        txtPhoneNumber.getDocument().addDocumentListener(allFieldsFilledListener);
        txtEmail.getDocument().addDocumentListener(allFieldsFilledListener);
    
    }
    
    private void fillFields(HashMap<Object, Object> customer){
        txtId.setText(customer.get("id").toString());
        txtName.setText(customer.get("name").toString());
        txtLastName.setText(customer.get("lastName").toString());
        txtLocation.setText(customer.get("location").toString());
        txtPhoneNumber.setText(customer.get("phoneNumber").toString());
        txtEmail.setText(customer.get("email").toString());
        txtIdCardNumber.setText("idCardNumber");
    }
    
    private Customer read(){
        int id = Integer.parseInt(txtId.getText());
        String name = txtName.getText();
        String lastName = txtLastName.getText();
        String idCardNumber =txtIdCardNumber.getText();
        
        
        String phoneNumber = txtPhoneNumber.getText();
        String location = txtLocation.getText();
        String email = txtEmail.getText();
        
        Customer customer = new Customer(id, name, lastName, phoneNumber, idCardNumber, email, location);
        
        return customer;
    }
    
     private void chargeCustomers(){
        ArrayList<HashMap<Object, Object>> customers = customerController.obtainAllFromDb();
        ArrayList<String> customersEssentialInfo = new ArrayList<>();
        for(HashMap<Object, Object> customer : customers){
            customersEssentialInfo.add(customer.get("id") + " " + customer.get("name") + " " + customer.get("lastName") + " " + customer.get("idCardNumber"));
        }
        
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
        comboModel.addAll(customersEssentialInfo);
        cmbBoxCustomers.setModel(comboModel);
    }
    
    
    public void checkFields(){
        if(txtId.getText().isEmpty() || txtName.getText().isEmpty() || txtLastName.getText().isEmpty()
                || txtLocation.getText().isEmpty() || txtPhoneNumber.getText().isEmpty() 
                || txtEmail.getText().isEmpty() || txtIdCardNumber.getText().isEmpty())
        {
            btnContinue.setEnabled(false); 
            btnContinue.setToolTipText("No puede guardar el componente si faltan datos por llenar");
        }
        else if(!txtPhoneNumber.getText().matches("[0-9]{10}")){
            btnContinue.setEnabled(false); 
        }
        else if(!txtIdCardNumber.getText().matches("[0-9]{10}")){
            btnContinue.setEnabled(false); 
        }
        else if(!txtEmail.getText().matches("[-A-Za-z0-9!#$%&'*+/=?^_`{|}~]+(?:\\.[-A-Za-z0-9!#$%&'*+/=?^_`{|}~]+)*@(?:[A-Za-z0-9](?:[-A-Za-z0-9]*[A-Za-z0-9])?\\.)+[A-Za-z0-9](?:[-A-Za-z0-9]*[A-Za-z0-9])?")){
            btnContinue.setEnabled(false); 
        }
        else {
            btnContinue.setEnabled(true);
            btnContinue.setToolTipText("Guardar el componente en la base de datos");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnContinue;
    private javax.swing.JComboBox<String> cmbBoxCustomers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnelContent;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdCardNumber;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JLabel xxxxxddd;
    // End of variables declaration//GEN-END:variables
}
