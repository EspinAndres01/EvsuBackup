
package ec.edu.espe.evsustore.view;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class FilledListener implements DocumentListener{

    PnelCustomer pnelCustomer;
    PnelCashPay pnelCashpay;

    public FilledListener(PnelCustomer pnelCustomer) {
        this.pnelCustomer = pnelCustomer;
    }
    
    public FilledListener(PnelCashPay pnelCashpay) {
        this.pnelCashpay = pnelCashpay;
    }
    
    @Override
    public void insertUpdate(DocumentEvent e) {
        if(pnelCustomer!=null){
            pnelCustomer.checkFields();
        }
        if(pnelCashpay!=null){
            pnelCashpay.checkFields();
        }
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        if(pnelCustomer!=null){
            pnelCustomer.checkFields();
        }
        if(pnelCashpay!=null){
            pnelCashpay.checkFields();
        }
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        if(pnelCustomer!=null){
            pnelCustomer.checkFields();
        }
        if(pnelCashpay!=null){
            pnelCashpay.checkFields();
        }
    }
    
}
