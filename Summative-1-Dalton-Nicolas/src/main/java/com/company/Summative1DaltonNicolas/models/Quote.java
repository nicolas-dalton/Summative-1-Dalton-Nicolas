package com.company.Summative1DaltonNicolas.models;

public class Quote {
    private int id;
    private String author;
    private String quote;
    //CONSTRUCTOR
    public Quote(int id, String author, String quote){
        this.id= id;
        this.author= author;
        this.quote= quote;
    }
    //GETTERS & SETTERS
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id= id;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author= author;
    }
    public String getQuote(){
        return quote;
    }
    public void setQuote(String quote){
        this.quote= quote;
    }
}
