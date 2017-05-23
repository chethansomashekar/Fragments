package com.example.chethan.fragments;

/**
 * Created by Chethan on 5/20/2017.
 */

public class Contact {

    //private variables
    int id;
    String name;


    // Empty constructor
    public Contact(){

    }
    // constructor
    public Contact(int id, String name){
        this.id = id;
        this.name = name;

    }

    // constructor
    public Contact(String name){
        this.name = name;

    }
    // getting ID
    public int getID(){
        return this.id;
    }

    // setting id
    public void setID(int id){
        this.id = id;
    }

    // getting name
    public String getName(){
        return this.name;
    }

    // setting name
    public void setName(String name){
        this.name = name;
    }

}