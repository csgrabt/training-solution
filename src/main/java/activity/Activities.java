package activity;


import java.util.List;

public class Activities {
    private final List<Activity> activitiesList;

    public Activities(List<Activity> activities) {
        this.activitiesList = activities;
    }


    public List<Report> distancesByTypes() {
        Report[] reports = new Report[ActivityType.values().length];
        for (int g = 0; g < reports.length; g++) {
            reports[g] = new Report(ActivityType.values()[g], 0.0);
        }
        double distance = 0.0;
        ActivityType activityType;

        for (Activity activity : activitiesList) {
            activityType = activity.getType();
            if (activity instanceof ActivityWithTrack) {
                distance = activity.getDistance();
            }
            reports[activityType.ordinal()] = new Report(activityType, (distance + reports[activityType.ordinal()].getDistance()));
            distance = 0;
        }
        return List.of(reports);
    }


    public int numberOfTrackActivities() {
        int count = 0;
        for (Activity activity : activitiesList
        ) {
            if (activity instanceof ActivityWithTrack) {
                count++;
            }
        }
        return count;
    }

    public int numberOfWithoutTrackActivities() {
        int count = 0;
        for (Activity activity : activitiesList
        ) {
            if (activity instanceof ActivityWithoutTrack) {
                count++;
            }
        }
        return count;
    }
}








