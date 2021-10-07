package com.company.Summative1DaltonNicolas.controllers;

import com.company.Summative1DaltonNicolas.models.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class MagicController {
    private List<Answer> answers;
    private static int idCounter= 1;

    public MagicController(){
        answers= new ArrayList<>();
        answers.add(new Answer());
        answers.get(0).setAnswer("It is certain.");
        answers.get(0).setId(idCounter++);

        answers.add(new Answer());
        answers.get(1).setAnswer("Yes definitely.");
        answers.get(1).setId(idCounter++);

        answers.add(new Answer());
        answers.get(2).setAnswer("Ask again later.");
        answers.get(2).setId(idCounter++);

        answers.add(new Answer());
        answers.get(3).setAnswer("Cannot predict now.");
        answers.get(3).setId(idCounter++);

        answers.add(new Answer());
        answers.get(4).setAnswer("My reply is no.");
        answers.get(4).setId(idCounter++);

        answers.add(new Answer());
        answers.get(5).setAnswer("Don't count on it.");
        answers.get(5).setId(idCounter++);
    }
    @RequestMapping(value= "/magic", method= RequestMethod.POST)
    @ResponseStatus(value= HttpStatus.CREATED)
    public Answer getAnswer(@RequestBody Answer question){

        System.out.println(answers.size());
        Random rand= new Random();
        int index= rand.nextInt(answers.size());
        Answer answer= answers.get(index);
        answer.setQuestion(question.getQuestion());
        return answer;
    }

}
