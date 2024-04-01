package com.oops.inheritance;

public class TeamOne extends  Project{
    String techStack = "Java FullStack";

    public  TeamOne(String techStack){
        this.techStack = techStack;
    }
    String[] showTechStack(){
        String[] skills ={"java","spring","JDBS","Servlets"};
        return skills;
    }
}
