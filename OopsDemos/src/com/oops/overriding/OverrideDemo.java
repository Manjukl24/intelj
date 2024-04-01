package com.oops.overriding;

public class OverrideDemo {
    public static  void  main(String[] args){
        String choice ="indoor";
        Sports sports=null;
        if(choice.equals("Indoor"))
             sports = new Indoor();
        else if (choice.equals("Outdoor"));
             sports = new Outdoor();
        //else
            sports = new Sports();
        String[] games = sports.showTypes();
        if(games !=null)
        for (String game:games){
            System.out.println(game);
        }
    }
}
