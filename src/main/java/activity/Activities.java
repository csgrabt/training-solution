package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {
private List<Activity> activities;


    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public List<Activity> getActivities() {
        return activities;
    }


public void addActivity(Activity activity){

        activities.add(activity);



}






    public List<Report> distancesByTypes() {
   Report[] reports = new Report[ActivityType.values().length];
for (int g = 0; g < reports.length; g++){
    reports[g] = new Report(ActivityType.values()[g], 0.0);

}


    double distance = 0.0;
    ActivityType activityType;

    for(int i =0; i <activities.size(); i++){
        activityType = activities.get(i).getType();
            if(activities.get(i) instanceof ActivityWithTrack){
                distance = activities.get(i).getDistance();
            }

                reports[activityType.ordinal()] = new Report(activityType, (distance + reports[activityType.ordinal()].getDistance() ));

distance = 0;
            }


List<Report> reports1 = new ArrayList<>();
        for (Report report:reports
             ) {reports1.add(report);

        }



return reports1;}





    public int numberOfTrackActivities() {
int count = 0;
        for (Activity activity:activities
             ) { if (activity instanceof ActivityWithTrack){count++;}

        }


    return count;}

    public int numberOfWithoutTrackActivities() {
        int count = 0;
        for (Activity activity:activities
        ) { if (activity instanceof ActivityWithoutTrack){count++;}

        }


        return count;}
    }








