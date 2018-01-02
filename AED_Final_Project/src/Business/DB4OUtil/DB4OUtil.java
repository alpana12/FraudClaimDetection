/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DB4OUtil;

import Business.ConfigureASystem;
import Business.EcoSystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;

/**
 *
 * @author anusha
 */
public class DB4OUtil {
    
    private static final String FILENAME = System.getProperty("user.dir")+"\\DataBank1.db4o";
    private static DB4OUtil db4oUtil;
    
    public synchronized static DB4OUtil getInstance(){
        if(db4oUtil == null){
            db4oUtil = new DB4OUtil();
        }
        return db4oUtil;
    }
    
    protected synchronized static void shutdown(ObjectContainer conn){
        if(conn != null){
            conn.close();
        }
    }
    
    private ObjectContainer createContainer(){
        try{
            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            config.common().activationDepth(Integer.MAX_VALUE);
            config.common().updateDepth(Integer.MAX_VALUE);
            config.common().objectClass(EcoSystem.class).cascadeOnUpdate(true);
            ObjectContainer db = Db4oEmbedded.openFile(config,FILENAME);
            return db;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public synchronized void storeSystem(EcoSystem system){
        ObjectContainer conn = createContainer();
        conn.store(system);
        conn.commit();
        conn.close();
    }
    
    public EcoSystem retrieveSystem(){
        ObjectContainer conn = createContainer();
        ObjectSet<EcoSystem> systems = conn.query(EcoSystem.class);
        EcoSystem system;
        if(systems.size() == 0){
            system = ConfigureASystem.configure();
        }else{
            system = systems.get(systems.size() - 1);
        }
        conn.close();
        return system;
    }
}
