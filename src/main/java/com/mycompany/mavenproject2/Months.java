/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author mariumbinteibrahim
 */
public enum Months {
    JANUARY("January",31), FEBRUARY("February",28), MARCH("March",31), APRIL("April",30), MAY("May",31),
    JUNE("June",30),JULY("July",31), AUGUST("August",31),SEPTEMBER("September",30), OCTOBER("October",31),
    NOVEMBER("November",30), DECEMBER("December",31);
    
    private String title;
    private int daysInMonth;
    
    private Months(String title, int days){
        this.title=title;
        daysInMonth=days;
        
    }
    public String title(){
        return this.title;
    }
    public int daysInMonth(){
        return this.daysInMonth;
    }
    public String getShortName(){
        return (this.title.substring(0,3));
    }
    
    public static Months parse(String s){
        if(s.isEmpty() || s==null)
            return null;
        
        s=s.toUpperCase();
        try{
            return valueOf(s);
        }
        catch(Exception e){
            for(Months month: values()){
                String tl=month.getShortName().toUpperCase();
                if(s.equals(tl))
                    return month;
            }
            
        }
       
        
       return null;
    }


    
}
