package reinstall.rental;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static java.time.chrono.JapaneseEra.values;

public class CanoeRental {

    public static final double PRICEPERHOURS = 5000;
    private String name;
    private CanoeType canoeType;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private boolean active = true;

    public CanoeRental(String name, CanoeType canoeType, LocalDateTime startTime) {
        this.name = name;
        this.canoeType = canoeType;
        this.startTime = startTime;
    }


    public String getName() {
        return name;
    }

    public CanoeType getCanoeType() {
        return canoeType;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public boolean isActive() {
        return active;
    }


    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
        this.active = false;
    }


    public double calculateRentalSum(LocalDateTime endTime) {
        this.endTime = endTime;

        double time = Duration.between(this.startTime, this.endTime).toHours();

        return time * PRICEPERHOURS * canoeType.getFactor();
    }
}
