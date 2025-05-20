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
        return q.answer.equals(answer);
    }
    
    public Question clone(){
        return new Question(question, answer);
    }
    
    public String toString(){
        return "Question: " + question + "\nAnswer: " + answer;
    }
}
