package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties configFile;

    static {
        try {
            FileInputStream input = new FileInputStream("configuration.properties");
            configFile = new Properties();
            configFile.load(input);
            input.close();
        } catch (Exception e){
            System.out.println("Failed to load properties file!");
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){
        return configFile.getProperty(key);
    }
}
