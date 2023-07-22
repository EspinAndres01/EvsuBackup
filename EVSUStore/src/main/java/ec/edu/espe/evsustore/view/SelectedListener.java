
package ec.edu.espe.evsustore.view;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class SelectedListener implements ListSelectionListener{

    ArrayList<JButton> buttonsToEnableInSelection;

    public SelectedListener(ArrayList<JButton> buttonsToEnableInSelection) {
        this.buttonsToEnableInSelection = buttonsToEnableInSelection;
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
        for(JButton button : buttonsToEnableInSelection){
            button.setEnabled(true);
        }
    }
    
}
