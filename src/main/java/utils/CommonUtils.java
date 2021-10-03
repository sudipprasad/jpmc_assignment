package utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class CommonUtils {


    public static Properties readPropertiesFile(String path){
        try {
            FileReader reader = new FileReader(path);

            Properties p = new Properties();
            p.load(reader);

            return p;
        }catch (IOException e){
            System.out.println("ERROR! Reading properties file!");
        }
        return null;
    }

}
