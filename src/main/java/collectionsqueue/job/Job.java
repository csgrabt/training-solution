package collectionsqueue.job;

public class Job implements Comparable<Job> {

    private final int priority;
    private final String jobDescription;
    private final boolean urgent;


    public Job(int priority, String jobDescription) {
        this.priority = priority;
        this.jobDescription = jobDescription;
        if (priority < 5) {
            this.urgent = true;
        } else {
            this.urgent= false;
        }
    }



    public int getPriority() {
        return priority;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public boolean isUrgent() {
        return urgent;
    }

    @Override
    public int compareTo(Job job) {
       // System.out.println(priority + " - " + job.priority + " " + (this.priority - job.priority));
        return this.priority - job.priority;
    }

    @Override
    public String toString() {
        return priority + " " +
                jobDescription ;
    }
}
