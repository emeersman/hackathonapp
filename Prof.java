package com.example.proffice_hours; 
 
public class Prof {
     
    //private variables
    int _id;
    String _school;
    String _department;
    String _name;
    String _location;
    String _monday;
    String _tuesday;
    String _wednesday;
    String _thursday;
    String _friday;
    
    // Empty constructor
    public Prof(){
         
    }
    // constructor
    public Prof(int id, String name, String school){
        this._id = id;
        this._name = name;
        this._school = school;
    }
    // constructor
    public Prof(int id, String school, String department, String name, String location, String monday, String tuesday, 
    		String wednesday, String thursday, String friday){
        this._id = id;
        this._department = department;
        this._name = name;
        this._school = school;
        this._location = location;
        this._monday = monday;
        this._tuesday = tuesday;
        this._wednesday = wednesday;
        this._thursday = thursday;
        this._friday = friday;
    }
    // constructor
    public Prof(String name, String school){
        this._name = name;
        this._school = school;
    }
    // constructor
    public Prof(String school, String department, String name, String location, String monday, String tuesday, 
    		String wednesday, String thursday, String friday){
        this._department = department;
        this._name = name;
        this._school = school;
        this._location = location;
        this._monday = monday;
        this._tuesday = tuesday;
        this._wednesday = wednesday;
        this._thursday = thursday;
        this._friday = friday;
    }
    // getting ID
    public int getID(){
        return this._id;
    }
     
    // setting id
    public void setID(int id){
        this._id = id;
    }
    
    // getting school
    public String getSchool(){
        return this._school;
    }
     
    // setting school
    public void setSchool(String school){
        this._school = school;
    }
    
    // getting department
    public String getDepartment(){
        return this._department;
    }
     
    // setting school
    public void setDepartment(String department){
        this._department = department;
    }
    
    // getting name
    public String getName(){
        return this._name;
    }
     
    // setting name
    public void setName(String name){
        this._name = name;
    }
     
    // getting location
    public String getLocation(){
        return this._location;
    }
     
    // setting location
    public void setLocation(String location){
        this._location = location;
    }
    
    // getting monday
    public String getMonday(){
        return this._monday;
    }
     
    // setting monday
    public void setMonday(String monday){
        this._monday = monday;
    }
    
    // getting tuesday
    public String getTuesday(){
        return this._tuesday;
    }
     
    // setting tuesday
    public void setTuesday(String tuesday){
        this._tuesday = tuesday;
    }
    
    // getting wednesday
    public String getWednesday(){
        return this._wednesday;
    }
     
    // setting wednesday
    public void setWednesday(String wednesday){
        this._wednesday = wednesday;
    }
    
    // getting thursday
    public String getThursday(){
        return this._thursday;
    }
     
    // setting thursday
    public void setThursday(String thursday){
        this._thursday = thursday;
    }
    
    // getting friday
    public String getFriday(){
        return this._friday;
    }
     
    // setting friday
    public void setFriday(String friday){
        this._friday = friday;
    }
}
