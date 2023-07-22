
package ec.edu.espe.evsustore.controller;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.evsustore.utils.PasswordUtils;


/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class SessionController {
    DatabaseController database;
    MongoCollection collection;
    
    private static SessionController instance;
    
    private SessionController() {
        this.database = DatabaseController.getInstance();
        this.collection = this.database.changeCollection("Users");
    }
    
    public synchronized static SessionController getInstance (){
        if (instance != null){
        
        } 
        else {
            instance = new SessionController();
        }
        
        return instance;
    }
    
    PasswordUtils passwordUtils=new PasswordUtils();
    public boolean checkCredentials(String username, String password) {
        return passwordUtils.checkCredentials(username, password, collection);
    }

    public void migratePasswordsToBCrypt() {
        passwordUtils.migratePasswordsToBCrypt(collection);
    }

    public boolean createUser(String name, String lastName, String username, String password) {
        return passwordUtils.createUser(name, lastName, username, password, collection);
    }

    public boolean changePassword(String confirmPassword) {
        return passwordUtils.changePassword(confirmPassword, collection);
    }

    public void setNewPassword(String newPassword) {
        passwordUtils.setNewPassword(newPassword);
    }

    public String getPasswordByUsername(String username) {
        return passwordUtils.getPasswordByUsername(username, collection);
    }

    public String generateTemporaryPassword() {
        return passwordUtils.generateTemporaryPassword();
    }

    public String generateRandomPassword() {
        return passwordUtils.generateRandomPassword();
    }

    public boolean updatePassword(String username, String newPassword, String temporaryPassword) {
        return passwordUtils.updatePassword(username, newPassword, temporaryPassword, collection);
    }
}
