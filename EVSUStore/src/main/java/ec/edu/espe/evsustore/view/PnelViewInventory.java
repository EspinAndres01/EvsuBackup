package ec.edu.espe.evsustore.view;



import ec.edu.espe.evsustore.controller.ViewController;
import ec.edu.espe.evsustore.model.HardwareComponent;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class PnelViewInventory extends javax.swing.JPanel {

    public PnelViewInventory( ) {
        initComponents();
        
        displayTableComponents();
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
        pnelViewInfo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblComponents = new javax.swing.JTable();
        pnelTableButtons = new javax.swing.JPanel();
        btnUpdateTble = new javax.swing.JButton();
        btnBacktToInventoryMenu = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        Content.setBackground(new java.awt.Color(18, 9, 24));
        Content.setForeground(new java.awt.Color(18, 9, 24));
        Content.setPreferredSize(new java.awt.Dimension(900, 675));

        tblComponents.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tblComponents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cantidad", "Nombre", "Modelo", "Costo", "Precio"
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
        tblComponents.setMaximumSize(new java.awt.Dimension(300, 25));
        tblComponents.setOpaque(false);
        tblComponents.setRowHeight(25);
        tblComponents.setSelectionBackground(new java.awt.Color(169, 104, 216));
        tblComponents.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblComponents.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblComponents.getTableHeader().setReorderingAllowed(false);
        tblComponents.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblComponentsPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tblComponents);

        javax.swing.GroupLayout pnelViewInfoLayout = new javax.swing.GroupLayout(pnelViewInfo);
        pnelViewInfo.setLayout(pnelViewInfoLayout);
        pnelViewInfoLayout.setHorizontalGroup(
            pnelViewInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnelViewInfoLayout.setVerticalGroup(
            pnelViewInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
        );

        pnelTableButtons.setBackground(new java.awt.Color(18, 9, 24));

        btnUpdateTble.setText("Actualizar");
        btnUpdateTble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTbleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnelTableButtonsLayout = new javax.swing.GroupLayout(pnelTableButtons);
        pnelTableButtons.setLayout(pnelTableButtonsLayout);
        pnelTableButtonsLayout.setHorizontalGroup(
            pnelTableButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnelTableButtonsLayout.createSequentialGroup()
                .addContainerGap(612, Short.MAX_VALUE)
                .addComponent(btnUpdateTble, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        pnelTableButtonsLayout.setVerticalGroup(
            pnelTableButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelTableButtonsLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnUpdateTble, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        btnBacktToInventoryMenu.setBackground(new java.awt.Color(133, 44, 194));
        btnBacktToInventoryMenu.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnBacktToInventoryMenu.setText("Volver al Menú de Inventario");
        btnBacktToInventoryMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBacktToInventoryMenuActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(133, 44, 194));
        btnDelete.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnDelete.setText("Borrar");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(133, 44, 194));
        btnUpdate.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnUpdate.setText("Actualizar");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addComponent(pnelTableButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnelViewInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
            .addGroup(ContentLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(btnBacktToInventoryMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addComponent(pnelTableButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(pnelViewInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnBacktToInventoryMenu))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        HardwareComponent selectedComponent = getSelectedComponent();
        PnelSaveHardwareComponent frmComponentToUpdate = new PnelSaveHardwareComponent(selectedComponent);
        showPanel(frmComponentToUpdate);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        HardwareComponent selectedComponent = getSelectedComponent();
        ViewController.deleteComponentInDB(selectedComponent);
        displayTableComponents();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblComponentsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblComponentsPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblComponentsPropertyChange

    private void btnUpdateTbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTbleActionPerformed
        displayTableComponents();
    }//GEN-LAST:event_btnUpdateTbleActionPerformed

    private void btnBacktToInventoryMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBacktToInventoryMenuActionPerformed
        PnelInventory pnelInventory=new PnelInventory();
        showPanel(pnelInventory);
    }//GEN-LAST:event_btnBacktToInventoryMenuActionPerformed
    
    private void showPanel(JPanel panelUI) {
        panelUI.setSize(900, 675);
        panelUI.setLocation(0, 0);
        Content.removeAll();
        Content.add(panelUI, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }
    private void displayTableComponents() {                                          
        ArrayList<HardwareComponent> componentsInDb = ViewController.obtainAllComponents();
        DefaultTableModel tblModel = ViewController.writeTable(componentsInDb, tblComponents);
        ListSelectionListener selectionListener = new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int selectedRowIndex = tblComponents.getSelectedRow();
                int numberOfRows = tblComponents.getRowCount();
                if(selectedRowIndex >= 0 && selectedRowIndex<=numberOfRows){
                    btnUpdate.setEnabled(true);
                    btnDelete.setEnabled(true);
                }
                else{
                
                }
            }
        };
        
        tblModel.addTableModelListener(tblComponents);
        tblComponents.setModel(tblModel);
        tblComponents.setDefaultEditor(Object.class, null);
        
        tblComponents.getSelectionModel().addListSelectionListener(selectionListener);
        
    }
    
    private HardwareComponent getSelectedComponent() {
        int selectedRowIndex = tblComponents.getSelectedRow();
        int id = (int) tblComponents.getValueAt(selectedRowIndex, 0);
        HardwareComponent selectedComponent = ViewController.obtainComponent(id);
        return selectedComponent;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JButton btnBacktToInventoryMenu;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateTble;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnelTableButtons;
    private javax.swing.JPanel pnelViewInfo;
    private javax.swing.JTable tblComponents;
    // End of variables declaration//GEN-END:variables
}