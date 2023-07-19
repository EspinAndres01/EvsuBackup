package ec.edu.espe.evsustore.controller;


import com.mongodb.client.MongoDatabase;
import ec.edu.espe.evsustore.model.HardwareComponent;
import ec.edu.espe.evsustore.utils.DatabaseManager;
import java.util.ArrayList;
import com.mongodb.client.MongoCollection;
import ec.edu.espe.evsustore.model.Clothing;
import ec.edu.espe.evsustore.utils.PasswordUtils;
import org.bson.Document;
/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class DatabaseController {
    String clientURL;
    String databaseName;
    MongoDatabase database;

    private static DatabaseController instance;
    
    private DatabaseController() {
        this.clientURL = "mongodb+srv://jcobena:jcobena@cluster0.mhpiaao.mongodb.net/";
        this.databaseName = "EVSUStore";
        this.database = DatabaseManager.connectToDatabase(clientURL, databaseName);
    }
    
    public synchronized static DatabaseController getInstance (){
        if (instance==null){
            instance = new DatabaseController();
        }
        
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
    
    
    
    public void insertComponent(HardwareComponent hardwareComponent){
        MongoCollection collection = DatabaseManager.connectToCollection(database, "HardwareComponents");
        DatabaseManager.insertOne(collection, hardwareComponent);
    }
    
    public HardwareComponent obtainComponent(int id){
        MongoCollection collection = DatabaseManager.connectToCollection(database, "HardwareComponents");
        HardwareComponent componentInDB = DatabaseManager.obtainComponent(collection, id);
        
        return componentInDB;
    }
    
    public ArrayList<HardwareComponent> obtainAllComponents(){
        MongoCollection collection = DatabaseManager.connectToCollection(database, "HardwareComponents");
        ArrayList<HardwareComponent> componentsInDB = DatabaseManager.obtainAllComponents(collection);
        
        return componentsInDB;
    }
    
    public ArrayList<HardwareComponent> obtainComponentsCoincidence(String field){
        MongoCollection collection = DatabaseManager.connectToCollection(database, "HardwareComponents");
        ArrayList<HardwareComponent> componentsCoincidence = DatabaseManager.foundComponentCoincidences(collection, field);
        
        return componentsCoincidence;
    }
    public ArrayList<Clothing> obtainClothingsCoincidence(String field){
        MongoCollection collection = DatabaseManager.connectToCollection(database, "Clothins");
        ArrayList<Clothing> clothinsCoincidence = DatabaseManager.foundComponentCoincidences(collection, field);
        
        return clothinsCoincidence;
    }
    
    public void update(HardwareComponent component) {
        MongoCollection collection = DatabaseManager.connectToCollection(database, "HardwareComponents");
        DatabaseManager.update(collection, component);
    }
    
    public void delete(HardwareComponent component) {
        MongoCollection collection = DatabaseManager.connectToCollection(database, "HardwareComponents");
        DatabaseManager.delete(collection, component.getId());
    }
    
    public void save(HardwareComponent component) {
        MongoCollection collection = DatabaseManager.connectToCollection(database, "HardwareComponents");
        DatabaseManager.insertOne(collection, component);
    }

    public MongoDatabase getDatabase() {
        return database;
    }

    public void setDatabase(MongoDatabase database) {
        this.database = database;
    }
    

    PasswordUtils passwordUtils=new PasswordUtils();
    public boolean checkCredentials(String username, String password) {
        MongoCollection<Document> collection = DatabaseManager.connectToCollection(database, "Users");
        return passwordUtils.checkCredentials(username, password, collection);
    }

    public void migratePasswordsToBCrypt() {
        MongoCollection<Document> collection = DatabaseManager.connectToCollection(database, "Users");
        passwordUtils.migratePasswordsToBCrypt(collection);
    }

    public boolean createUser(String name, String lastName, String username, String password) {
        MongoCollection<Document> collection = DatabaseManager.connectToCollection(database, "Users");
        return passwordUtils.createUser(name, lastName, username, password, collection);
    }

    public boolean changePassword(String confirmPassword) {
        MongoCollection<Document> collection = DatabaseManager.connectToCollection(database, "Users");
        return passwordUtils.changePassword(confirmPassword, collection);
    }

    public void setNewPassword(String newPassword) {
        passwordUtils.setNewPassword(newPassword);
    }

    public String getPasswordByUsername(String username) {
        MongoCollection<Document> collection = DatabaseManager.connectToCollection(database, "Users");
        return passwordUtils.getPasswordByUsername(username, collection);
    }

    public String generateTemporaryPassword() {
        return passwordUtils.generateTemporaryPassword();
    }

    public String generateRandomPassword() {
        return passwordUtils.generateRandomPassword();
    }

    public boolean updatePassword(String username, String newPassword, String temporaryPassword) {
        MongoCollection<Document> collection = DatabaseManager.connectToCollection(database, "Users");
        return passwordUtils.updatePassword(username, newPassword, temporaryPassword, collection);
    }
}
