/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmanagment;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Quiz {
    private Question questions[];
    
    public Quiz(Question questions[]){
        this.questions = questions;
    }
    
    public void doQuiz(){
        DecimalFormat percent = new DecimalFormat("#,##0%");
        String answer;
        int length = questions.length;
        int numCorrect = 0;
        for(int i = 0; i < length; i ++){
            answer = JOptionPane.showInputDialog(null, questions[i]);
            if(questions[i].isGuessed(answer)){
                numCorrect ++;
                JOptionPane.showMessageDialog(null, "You got it correct!!! " 
                        + (length - i) + " question left");
            } else{
                JOptionPane.showMessageDialog(null, 
                        "You got it wrong :( the correct answer was " + questions[i].getAnswer()
                        + (length - i) + " question left");
            }
        }
        JOptionPane.showMessageDialog(null, "You got " + numCorrect
                + " out of " + length + " (" + percent.format(numCorrect / length) + ")");
    }
    
    public String toString(){
        String output = "Quiz";
        for(int i = 0; i < questions.length; i ++){
            output += "\n" + questions[i].toString();
        }
        return output;
    }
}
