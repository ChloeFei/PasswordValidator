package com.example.chloefei.myapplication;

public class Validator {

    String s;

    public Validator(String str){
        this.s=str;
    }

    public int Name(){

        if(s.equals("password"))
            return 0;   //weak pwd
        else
            return 1;   //strong

    }

    public int Length(){
        if(s.length()>=8)
            return 1;
        else
            return 0;
    }


    public int ContainsSpecial(){
        //"#"||"@"||"$"||"%"||"^"||"&"||"*"
        if(s.contains("#")||s.contains("@")||s.contains("$")||s.contains("%")||s.contains("^")||
                s.contains("&")||s.contains("*")||s.contains("!")||s.contains(","))
            return 1;
        else
            return 0;
    }

    public int Digits(){
        if (s.matches(".*\\d+.*"))
            return 1;
        else
            return 0;
    }

    public int Case(){
        if (s.equals(s.toLowerCase())||s.equals(s.toUpperCase()))
            return 0;
        else
            return 1;
    }

    public int pass(){
        return Name()+Length()+ContainsSpecial()+Digits()+Case();
    }

}
