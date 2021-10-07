package com.company.Summative1DaltonNicolas.controllers;

import com.company.Summative1DaltonNicolas.models.Definition;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class WordController {
    private List<Definition> words;
    private static int idCounter= 1;
    public WordController(){
        // in-memory DAO
        words= new ArrayList<>();
        words.add(new Definition(idCounter++, "abate","to become less active, less intense, or less in amount."));
        words.add(new Definition(idCounter++, "bolster","to support, strengthen, or fortify."));
        words.add(new Definition(idCounter++, "clout","influence or power, especially in politics or business."));
        words.add(new Definition(idCounter++, "demur","raise doubts or objections or show reluctance."));
        words.add(new Definition(idCounter++, "egregious","outstandingly bad; shocking."));

        words.add(new Definition(idCounter++, "ignominious","publicly shameful or humiliating."));
        words.add(new Definition(idCounter++, "promulgate","to put into law or formally declare."));
        words.add(new Definition(idCounter++, "omnipotent","to support, strengthen, or fortify"));
        words.add(new Definition(idCounter++, "suspicious","having or showing a cautious distrust of someone or something."));
        words.add(new Definition(idCounter++, "savvy","having practical intelligence or knowledge."));
    }
    @RequestMapping(value= "/word", method= RequestMethod.GET)
    @ResponseStatus(value= HttpStatus.OK)
    public Definition getWord(){
        // Creates Random object
        Random rand= new Random();
        // generates Random integer
        int index= rand.nextInt(words.size());
        return words.get(index);
    }
}
