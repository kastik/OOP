package com.kastik.askisi4;

public class Employee {
    private String onoma,eponimo;
    private int kodikos;
    private double misthos;
    Employee(String onoma,String eponimo,int kodikos, double misthos){
        this.onoma=onoma;
        this.eponimo=eponimo;
        this.kodikos=kodikos;
        this.misthos=misthos;
    }
    public String getOnoma(){
        return onoma;
    }
    public String getEponimo(){
        return eponimo;
    }
    public int getKodikos(){
        return kodikos;
    }
    public double getMisthos(){
        return misthos;
    }
    @Override
    public String toString(){
        return onoma+" " +eponimo+" " +kodikos+" "+misthos;
    }
        
}

