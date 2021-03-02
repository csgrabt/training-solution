package closingproject;
import org.flywaydb.core.Flyway;
import static closingproject.TheMenu.menu;


public class VaccinationMain {


    public static void main(String[] args) {
        SysClosing sys = new SysClosing();
        Flyway flyway = Flyway.configure().dataSource(sys.getDataSource()).load();
        flyway.migrate();
        String progress;

        menu(sys);
    }
}




