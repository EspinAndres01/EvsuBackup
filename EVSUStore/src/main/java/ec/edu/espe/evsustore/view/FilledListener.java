
package ec.edu.espe.evsustore.view;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class FilledListener implements DocumentListener{

    PnelCustomer pnelCustomer;

    public FilledListener(PnelCustomer pnelCustomer) {
        this.pnelCustomer = pnelCustomer;
    }
    
    @Override
    public void insertUpdate(DocumentEvent e) {
        pnelCustomer.checkFields();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        pnelCustomer.checkFields();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        pnelCustomer.checkFields();
    }
    
}
