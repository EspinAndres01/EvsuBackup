
package ec.edu.espe.evsustore.view;

import ec.edu.espe.evsustore.controller.CatalogController;
import ec.edu.espe.evsustore.controller.HardwareComponentController;
import ec.edu.espe.evsustore.model.Catalog;
import ec.edu.espe.evsustore.utils.ViewManager;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author Andres Espin, KillChain, DCOO-ESPE
 */
public class PnelSalesCatalog extends javax.swing.JPanel {

    HardwareComponentController componentController = HardwareComponentController.getInstance();
    CatalogController catalogController = CatalogController.getInstance();
    
    
    /**
     * Creates new form PnelSales
     */
    public PnelSalesCatalog() {
        initComponents();
    
        displayCatalogTable();
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
        pnelViewInfo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCatalog = new javax.swing.JTable();
        pnelSearchBar = new javax.swing.JPanel();
        txtSearchBar = new javax.swing.JTextField();
        pnelButtons = new javax.swing.JPanel();
        btnSell = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        tblCatalog.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tblCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Descripcion del producto", "Cantidad", "PVP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCatalog.setRowHeight(30);
        tblCatalog.setSelectionBackground(new java.awt.Color(169, 104, 216));
        tblCatalog.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(tblCatalog);

        javax.swing.GroupLayout pnelViewInfoLayout = new javax.swing.GroupLayout(pnelViewInfo);
        pnelViewInfo.setLayout(pnelViewInfoLayout);
        pnelViewInfoLayout.setHorizontalGroup(
            pnelViewInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnelViewInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnelViewInfoLayout.setVerticalGroup(
            pnelViewInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelViewInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(26, 26, 26))
        );

        txtSearchBar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnelSearchBarLayout = new javax.swing.GroupLayout(pnelSearchBar);
        pnelSearchBar.setLayout(pnelSearchBarLayout);
        pnelSearchBarLayout.setHorizontalGroup(
            pnelSearchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelSearchBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
        );
        pnelSearchBarLayout.setVerticalGroup(
            pnelSearchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnelSearchBarLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(txtSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        btnSell.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnSell.setText("Vender");
        btnSell.setEnabled(false);
        btnSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnBack.setText("Volver al Menú de Ventas");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnelButtonsLayout = new javax.swing.GroupLayout(pnelButtons);
        pnelButtons.setLayout(pnelButtonsLayout);
        pnelButtonsLayout.setHorizontalGroup(
            pnelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelButtonsLayout.createSequentialGroup()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSell, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        pnelButtonsLayout.setVerticalGroup(
            pnelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSell, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnelContentLayout = new javax.swing.GroupLayout(pnelContent);
        pnelContent.setLayout(pnelContentLayout);
        pnelContentLayout.setHorizontalGroup(
            pnelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelContentLayout.createSequentialGroup()
                .addGroup(pnelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnelSearchBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnelViewInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 15, Short.MAX_VALUE))
            .addGroup(pnelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnelButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnelContentLayout.setVerticalGroup(
            pnelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelContentLayout.createSequentialGroup()
                .addComponent(pnelSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnelViewInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellActionPerformed
        ArrayList<HashMap<Object, Object>> selectedComponents = getSelectedComponents();
        PnelOrderConfirmation pnelOrderConfirmation = new PnelOrderConfirmation(selectedComponents);
        ViewManager.showPanel(pnelContent, pnelOrderConfirmation);
    }//GEN-LAST:event_btnSellActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        PnelStart pnelStart=new PnelStart();
        showPanel(pnelStart);
    }//GEN-LAST:event_btnBackActionPerformed

    
    
    private void addListeners(){
        TableRowSorter rowSorter = new TableRowSorter(tblCatalog.getModel());
        tblCatalog.setRowSorter(rowSorter);
        
        
        SearchBarListener searchBarListener = new SearchBarListener(tblCatalog, txtSearchBar);
        txtSearchBar.getDocument().addDocumentListener(searchBarListener);
        
        ArrayList<JButton> btnsToEnable = new ArrayList<>();
        btnsToEnable.add(btnSell);
        SelectedListener selectedListener = new SelectedListener(btnsToEnable);
        tblCatalog.getSelectionModel().addListSelectionListener(selectedListener);
    }
    
    private void displayCatalogTable(){
        ArrayList<HashMap<Object, Object>> catalog = catalogController.obtainAll();
        ArrayList<HashMap<Object, Object>> catalogWithStock = new ArrayList<>();
        
        for(HashMap<Object, Object> catalogProduct : catalog){
            if (Integer.parseInt(catalogProduct.get("quantity").toString()) != 0){
                catalogWithStock.add(catalogProduct);
            }
        }
        
        ViewManager.displayTableWithoutIds(tblCatalog, catalogWithStock);
        
        TableColumnModel tblColumnModel = tblCatalog.getColumnModel();
        
        tblColumnModel.moveColumn(2, 0);
        tblColumnModel.moveColumn(3, 1);
        
    }
    
    private ArrayList<HashMap<Object, Object>> getSelectedComponents() {
        int[] selectedRowIndexes = tblCatalog.getSelectedRows();
        ArrayList<HashMap<Object, Object>> products = new ArrayList<>();
        for(int rowIndex : selectedRowIndexes){
            int id = Integer.parseInt(tblCatalog.getValueAt(rowIndex, 0).toString());
            
            HashMap<Object, Object> product = catalogController.obtain(id);
            
            products.add(product);
        }
        return products;
    }
    
     private void showPanel(JPanel panelUI) {
        panelUI.setSize(900, 675);
        panelUI.setLocation(0, 0);
        pnelContent.removeAll();
        pnelContent.add(panelUI, BorderLayout.CENTER);
        pnelContent.revalidate();
        pnelContent.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSell;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnelButtons;
    private javax.swing.JPanel pnelContent;
    private javax.swing.JPanel pnelSearchBar;
    private javax.swing.JPanel pnelViewInfo;
    private javax.swing.JTable tblCatalog;
    private javax.swing.JTextField txtSearchBar;
    // End of variables declaration//GEN-END:variables
}
