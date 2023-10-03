/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author VietBao
 */
public class Student {
    private String name;
    private int id;
    private boolean gender;
    private double mark;

    public Student() {
    }    
    
    public Student(String name, int id, boolean gender, double mark) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
    
    public String getStatus(){
        if(mark >= 5){
            return "Pass";
        }else{
            return "Fail";
        }
    }
}
