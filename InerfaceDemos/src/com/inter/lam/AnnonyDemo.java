package com.inter.lam;

public class AnnonyDemo {
    public static void main(String[] args) {
        IGreeter iGreeter = new GreeterImpl();
        iGreeter.greetMessage("Welcome to lamda");

        IGreeter iGreeter1 = new IGreeter() {
            @Override
            public void greetMessage(String message) {
              System.out.println(message);
            }
        };
        iGreeter1.greetMessage("great day");
    }
}
