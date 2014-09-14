package org.wso2.training.concurrency.objects;

/**
 * Created by firzhan on 9/14/14.
 */
public class Student {


    private int id;
    private String name;

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
