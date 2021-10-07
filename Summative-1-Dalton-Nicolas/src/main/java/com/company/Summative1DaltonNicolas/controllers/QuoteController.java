package com.company.Summative1DaltonNicolas.controllers;

import com.company.Summative1DaltonNicolas.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {
    private List<Quote> quotes;
    private static int idCounter= 1;
    public QuoteController(){
        // in-memory DAO
        quotes= new ArrayList<>();
        quotes.add(new Quote(idCounter++,"Linus Torvalds","Talk is cheap. Show me the code."));
        quotes.add(new Quote(idCounter++,"John F. Kennedy","Every accomplishment starts with the decision to try."));
        quotes.add(new Quote(idCounter++,"Albert Einstein","Imagination is more important than knowledge."));
        quotes.add(new Quote(idCounter++,"John Lennon","Life is what happens to you while you're busy making other plans."));
        quotes.add(new Quote(idCounter++,"Martin Luther King Jr","Injustice anywhere is a threat to justice everywhere."));

        quotes.add(new Quote(idCounter++,"Bob Ross","We don't make mistakes, just happy little accidents."));
        quotes.add(new Quote(idCounter++,"Charles V","I speak Spanish to God, Italian to women, French to men, and German to my horse."));
        quotes.add(new Quote(idCounter++,"Nelson Mandela","It always seems impossible until it's done."));
        quotes.add(new Quote(idCounter++,"Mahatma Gandhi","When restraint and courtesy are added to strength, the latter becomes irresistible."));
        quotes.add(new Quote(idCounter++,"George Washington","It is better to offer no excuse than a bad one."));


    }
    @RequestMapping(value= "/quote", method= RequestMethod.GET)
    @ResponseStatus(value= HttpStatus.OK)
    public Quote getQuote(){
        // Creates Random object
        Random rand= new Random();
        // Generates Random integer
        int index= rand.nextInt(quotes.size());
        return quotes.get(index);
    }
}
