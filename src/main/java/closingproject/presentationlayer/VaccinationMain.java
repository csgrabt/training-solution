package closingproject.presentationlayer;
import closingproject.businesslogiclayer.ProjectConfig;
import org.flywaydb.core.Flyway;
import static closingproject.presentationlayer.TheMenu.menu;


public class VaccinationMain {


    public static void main(String[] args) {
        ProjectConfig config = new ProjectConfig();
        Flyway flyway = Flyway.configure().dataSource(config.getCd().getDataSource()).load();
        flyway.migrate();
        menu(config);
    }
}




