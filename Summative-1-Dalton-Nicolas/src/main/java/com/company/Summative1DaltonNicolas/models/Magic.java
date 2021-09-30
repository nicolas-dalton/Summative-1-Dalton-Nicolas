package com.company.Summative1DaltonNicolas.models;

public class Magic {
    private int id;
    private String question;
    private String answer;
    //CONSTRUCTOR
    public Magic(int id, String question, String answer){
        this.id= id;
        this.question= question;
        this.answer= answer;
    }
    //GETTERS AND SETTERS
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id= id;
    }
    public String getQuestion(){
        return question;
    }
    public void setQuestion(String question){
        this.question= question;
    }
    public String getAnswer(){
        return answer;
    }
    public void setAnswer(String answer){
        this.answer= answer;
    }
}
