package com.oops.overriding;

import java.util.concurrent.Callable;

public class Restaurant {
    public  static void main(String[] args) {

      Menu  menu = new Chinese();
        menu.showType("Strter");

        Chinese chinese = (Chinese) menu;
        chinese.showType("Lunch");



    }
}



