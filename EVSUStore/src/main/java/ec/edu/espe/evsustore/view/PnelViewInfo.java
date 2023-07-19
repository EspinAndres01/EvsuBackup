
package ec.edu.espe.evsustore.view;
import ec.edu.espe.evsustore.controller.ViewController;
import ec.edu.espe.evsustore.model.HardwareComponent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class PnelViewInfo extends javax.swing.JPanel {
    
    public PnelViewInfo() {
        initComponents();
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
        jTable1 = new javax.swing.JTable();
        pnlViewInfo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblComponents = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnSearchComponents = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setPreferredSize(new java.awt.Dimension(625, 250));

        pnlViewInfo.setBackground(new java.awt.Color(18, 9, 24));
        pnlViewInfo.setForeground(new java.awt.Color(18, 9, 24));

        tblComponents.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tblComponents.setForeground(new java.awt.Color(169, 104, 216));
        tblComponents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Quantity", "Name", "Model", "Cost ($)", "Price ($)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblComponents.setToolTipText("");
        tblComponents.setDragEnabled(true);
        tblComponents.setRowHeight(25);
        tblComponents.setSelectionBackground(new java.awt.Color(169, 104, 216));
        jScrollPane2.setViewportView(tblComponents);

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearchComponents.setText("Search");
        btnSearchComponents.setToolTipText("Click here to search by the text in the next field");
        btnSearchComponents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchComponentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlViewInfoLayout = new javax.swing.GroupLayout(pnlViewInfo);
        pnlViewInfo.setLayout(pnlViewInfoLayout);
        pnlViewInfoLayout.setHorizontalGroup(
            pnlViewInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlViewInfoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlViewInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                    .addGroup(pnlViewInfoLayout.createSequentialGroup()
                        .addComponent(btnSearchComponents, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch)))
                .addGap(29, 29, 29))
        );
        pnlViewInfoLayout.setVerticalGroup(
            pnlViewInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlViewInfoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlViewInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchComponents, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(txtSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlViewInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlViewInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnSearchComponentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchComponentsActionPerformed
        String search = txtSearch.getText();
        ArrayList<HardwareComponent> componentsCoincidences = ViewController.obtainComponentsCoincidences(search);
        
    }//GEN-LAST:event_btnSearchComponentsActionPerformed
    
    public void writeTableComponents(){
        ArrayList<HardwareComponent> componentsInDB = ViewController.obtainAllComponents();
        
        DefaultTableModel componentsTableModel = new DefaultTableModel();
        
        int i = 0;
        Object[] componentData = new Object[tblComponents.getColumnCount()];
        tblComponents.setModel(componentsTableModel);
        
        String[] header = {"ID","Quantity","Name","Model","Cost","Price"};
        
        componentsTableModel.setColumnIdentifiers(header);
        
        for(HardwareComponent component: componentsInDB){
            
            componentData[0] = component.getId();
            componentData[1] = component.getQuantity();
            componentData[2] = component.getName();
            componentData[3]= component.getModel();
            componentData[4] = component.getCost();
            componentData[5] = component.getPrice();
            
            componentsTableModel.addRow(componentData);
            
        }
        
       
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchComponents;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pnlViewInfo;
    private javax.swing.JTable tblComponents;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
