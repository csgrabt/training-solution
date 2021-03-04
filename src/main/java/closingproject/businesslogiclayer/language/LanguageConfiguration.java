package closingproject.businesslogiclayer.language;

import closingproject.businesslogiclayer.DatabaseConfiguration;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class LanguageConfiguration {

    private static final String ENCODING_UTF8 = "UTF-8";
    private Properties config;
    private String language = "/eng.txt";


    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public LanguageConfiguration() {
        try (
                InputStream resource = DatabaseConfiguration.class.getResourceAsStream(language);
        ) {
            load(resource);
        } catch (IOException ioe) {
            throw new RuntimeException("Cannot read file from classpath", ioe);
        }
    }

    public LanguageConfiguration(String string) {
        try (
                InputStream resource = DatabaseConfiguration.class.getResourceAsStream(string);
        ) {
            load(resource);
        } catch (IOException ioe) {
            throw new RuntimeException("Cannot read file from classpath", ioe);
        }
    }

    private Properties load(InputStream inputStream) {
        config = new Properties();
        try (
                InputStreamReader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        ) {
            config.load(reader);
            return config;
        } catch (IOException ioe) {
            throw new RuntimeException("Cannot read properties file from inputstream", ioe);
        }
    }

    public String getTest() {
        return config.getProperty("test");
    }

public String get1(){
        return  config.getProperty("1");
}

}
