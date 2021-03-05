package closingproject.presentationlayer;

import closingproject.businesslogiclayer.ProjectConfig;
import closingproject.businesslogiclayer.language.Language;
import closingproject.businesslogiclayer.language.LanguageConfiguration;
import org.flywaydb.core.Flyway;
import java.util.Scanner;

import static closingproject.presentationlayer.TheMenu.menu;


public class VaccinationMain {


    public static void main(String[] args) {
        ProjectConfig config = new ProjectConfig();
        Flyway flyway = Flyway.configure().dataSource(config.getCd().getDataSource()).load();
        flyway.migrate();
        String language;
        Scanner scanner = config.getScanner();
        do {
            System.out.println( config.getLg().getMessage("select")+ config.getLg().getMessage("newRow") +
                    config.getLg().getMessage("A") + config.getLg().getMessage("newRow") +
                    config.getLg().getMessage("B"));
            language = scanner.nextLine();
        } while (
                !(config.getLanguageMenu().contains(language.toUpperCase()))
        );


        config.setLg(new LanguageConfiguration(Language.valueOf(language.toUpperCase()).getFilename()));


        menu(config, scanner);
    }
}




