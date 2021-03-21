package activity;

public class ActivityWithoutTrack implements Activity {
    private final ActivityType activityType;

    public ActivityWithoutTrack(ActivityType activityType) {
        this.activityType = activityType;
    }

    public ActivityType getType() {
        return activityType;
    }


    @Override
    public double getDistance() {
        return 0;
    }
}
