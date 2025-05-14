/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmanagment;

public class Question {
    private String question;
    private String answer;
    
    public Question(String question, String answer){
        this.question = question;
        this.answer = answer;
    }
    
    public String getQuestion(){
        return question;
    }
    
    public String getAnswer(){
        return answer;
    }
    
    public boolean isGuessed(String guess){
        return guess.equals(answer);
    }
    
    public boolean equals(Question q){
        return q.answer.equals(answer) && q.question.equals(question);
    }
    
    public Question clone(){
        return new Question(question, answer);
    }
    
    public String toString(){
        return "Question: " + question + "\nAnswer: " + answer;
    }
}
