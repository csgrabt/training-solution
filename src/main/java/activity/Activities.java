package activity;


import java.util.List;

public class Activities {
    private List<Activity> activitieslist;


    public Activities(List<Activity> activities) {
        this.activitieslist = activities;
    }


    public List<Report> distancesByTypes() {
        Report[] reports = new Report[ActivityType.values().length];
        for (int g = 0; g < reports.length; g++) {
            reports[g] = new Report(ActivityType.values()[g], 0.0);

        }

        double distance = 0.0;
        ActivityType activityType;

        for (int i = 0; i < activitieslist.size(); i++) {
            activityType = activitieslist.get(i).getType();
            if (activitieslist.get(i) instanceof ActivityWithTrack) {
                distance = activitieslist.get(i).getDistance();
            }

            reports[activityType.ordinal()] = new Report(activityType, (distance + reports[activityType.ordinal()].getDistance()));

            distance = 0;
        }


        return List.of(reports);
    }


    public int numberOfTrackActivities() {
        int count = 0;
        for (Activity activity : activitieslist
        ) {
            if (activity instanceof ActivityWithTrack) {
                count++;
            }

        }


        return count;
    }

    public int numberOfWithoutTrackActivities() {
        int count = 0;
        for (Activity activity : activitieslist
        ) {
            if (activity instanceof ActivityWithoutTrack) {
                count++;
            }

        }


        return count;
    }
}








