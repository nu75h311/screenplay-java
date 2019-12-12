package screenplay.models;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class WebdriverFinder {

    public static void loadConfigFile() {
        try (InputStream propFile = WebdriverFinder.class.
            getClassLoader().getResourceAsStream("config.properties")) {

            Properties props = new Properties();

            if (propFile == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }

            props.load(propFile);
            props.forEach((key, value) -> System.setProperty(key.toString(), value.toString()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
