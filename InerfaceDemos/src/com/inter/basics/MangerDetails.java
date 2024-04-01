package com.inter.basics;

import com.inter.basics.IEntertainment;

public class MangerDetails implements IEntertainment {
    @Override
    public void showGames(String type) {

            if(type.equals("outdoor")){
                System.out.println("Cricket and Hockey Available");
            }else{
                System.out.println("Football");
            }
    }

    @Override
    public void showActivity() {
        System.out.println("Weekly trip with Manger");
    }
}
