package collectionsqueue.job;

import java.util.PriorityQueue;
import java.util.Queue;

public class JobDispatcher {


    public Queue<Job> addJob(Job... jobs){

        PriorityQueue<Job> list = new PriorityQueue<>();

        for (Job item:jobs
             ) {list.add(item);

        }


   return list;}

    public void dispatchNextJob(PriorityQueue<Object> objects) {

    }
}
