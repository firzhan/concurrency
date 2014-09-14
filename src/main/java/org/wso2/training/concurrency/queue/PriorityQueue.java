package org.wso2.training.concurrency.queue;

import org.wso2.training.concurrency.objects.Student;

import java.util.Queue;
import java.util.Random;

/**
 * Created by firzhan on 9/14/14.
 */
public class PriorityQueue {

    public static final int PRIORITY_QUEUE_SIZE = 10;


    StudentComparator studentComparator = null;
    Queue<Student> studentQueue = null;

    public PriorityQueue(){

        studentComparator = new StudentComparator();
        studentQueue = new java.util.PriorityQueue<Student>(PRIORITY_QUEUE_SIZE,studentComparator);
    }

    public void populateQueue(){

        Random random = new Random();
        for(int i =0; i < PRIORITY_QUEUE_SIZE; i++)
        {
            int randomNumber = random.nextInt(100) + 1;
            System.out.println(randomNumber);

            studentQueue.add(new Student("ABC", randomNumber));
        }
    }

    public void pollQueue(){

        while (true){

            Student student = studentQueue.poll();

            if(student == null)
                break;

            System.out.println("Student Polled ID="+student.getId());

        }
    }
}
