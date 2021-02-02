package collectionsqueue.job;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class JobDispatcher {


    public PriorityQueue<Job> addJob(Job job, Job... jobs) {
        PriorityQueue<Job> list = new PriorityQueue<>();

        list.add(job);

        for (Job item : jobs
        ) {
            list.add(item);

        }


        return list;
    }

    public Job dispatchNextJob(Queue<Job> jobs) {
        if (jobs.isEmpty()) {
        throw  new NoJobException("No job available, get a rest!");}
        return jobs.remove();
    }


    public static void main(String[] args) {

        JobDispatcher jd = new JobDispatcher();

        Job job = new Job(10, "alma");
        Job job1 = new Job(9, "alma");
        Job job2 = new Job(8, "alma");
        Job job3 = new Job(7, "alma");
        Job job4 = new Job(6, "alma");


        PriorityQueue<Job> jobs = jd.addJob(job, job1, job2, job3, job4);


        System.out.println(jobs.remove());
        System.out.println(jobs.remove());
        System.out.println(jobs.remove());
        System.out.println(jobs.remove());
        System.out.println(jobs.remove());




    }






}
