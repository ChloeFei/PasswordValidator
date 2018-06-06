package com.example.chloefei.myapplication;

public class Validator {

    String s;

    public int Name(){

        if(s.equals("password"))
            return 0;
        else
            return 1;

    }

    public int Length(){
        if(s.length()>=8)
            return 1;
        else
            return 0;
    }

    public int pass(){
        return Name()+Length();
    }

}
