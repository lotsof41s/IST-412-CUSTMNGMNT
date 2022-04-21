package util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import model.Customer;

/**
 *
 * @author jaredb
 */
public class JsonUtil {
    public static List<Customer> readJSON() {
        List<Customer> customers = null;
        
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            Reader reader = Files.newBufferedReader(Paths.get("customers.json"));

            customers = gson.fromJson(reader, new TypeToken<List<Customer>>(){}.getType());

            reader.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return customers;
    }
    
    public static void writeJSON(List<Customer> customers) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Writer writer = Files.newBufferedWriter(Paths.get("customers.json"));
            
            gson.toJson(customers, writer);
            
            writer.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
