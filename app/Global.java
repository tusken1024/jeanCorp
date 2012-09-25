
import java.util.List;
import java.util.Map;

import models.Employee;
import play.Application;
import play.GlobalSettings;
import play.libs.Yaml;

import com.avaje.ebean.Ebean;

public class Global extends GlobalSettings {
    
	@Override
    public void onStart(Application app) {
        InitialData.insert(app);
    }
    
    static class InitialData {
        
        public static void insert(Application app) {
            if(Ebean.find(Employee.class).findRowCount() == 0) {
                 Map<String,List<Object>> all = (Map<String,List<Object>>) Yaml.load("initial-data.yml");

                // Insert users first
                Ebean.save(all.get("employees"));
            }
        }
    }
}