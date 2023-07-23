/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.evsustore.utils;

import javax.swing.JTextField;

/**
 *
 * @author Andres Espin, KillChain, DCOO-ESPE
 */
public class TextFieldValidator {
    public static boolean isTextFieldEmpty(JTextField textField) {
        return textField.getText().trim().isEmpty();
    }
}
