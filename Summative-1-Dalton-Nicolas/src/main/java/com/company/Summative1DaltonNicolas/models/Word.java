package com.company.Summative1DaltonNicolas.models;

public class Word {
    private int id;
    private String word;
    private String definition;
    //CONSTRUCTOR
    public Word(int id, String word, String definition){
        this.id= id;
        this.word= word;
        this.definition= definition;
    }
    //GETTERS AND SETTERS
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id= id;
    }
    public String getWord(){
        return this.word;
    }
    public void setWord(String word){
        this.word= word;
    }
    public String getDefinition(){
        return this.definition;
    }
    public void setDefinition(String definition){
        this.definition= definition;
    }
}
