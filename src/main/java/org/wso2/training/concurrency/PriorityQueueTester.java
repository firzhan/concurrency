package org.wso2.training.concurrency;

import org.wso2.training.concurrency.queue.PriorityQueue;

/**
 * Created by firzhan on 9/14/14.
 */
public class PriorityQueueTester {

    public static void main(String[] args){

        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.populateQueue();
        priorityQueue.pollQueue();
    }
}
