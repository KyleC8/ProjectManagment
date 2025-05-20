package projectmanagment;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Quiz {
    private Question[] questions;

    public Quiz(Question[] questions) {
        this.questions = questions;
    }

    public void doQuiz() {
        DecimalFormat percent = new DecimalFormat("#,##0%");
        String answer;
        int length = questions.length;
        int numCorrect = 0;

        for (int i = 0; i < length; i++) {
            answer = JOptionPane.showInputDialog(null, questions[i].getQuestion());
            if (questions[i].isGuessed(answer)) {
                numCorrect++;
                JOptionPane.showMessageDialog(null,
                        "You got it correct! " + (length - i - 1) + " question(s) left.");
            } else {
                JOptionPane.showMessageDialog(null,
                        "You got it wrong :( The correct answer was: " + questions[i].getAnswer()
                        + ". " + (length - i - 1) + " question(s) left.");
            }
        }

        double score = (double) numCorrect / length;
        JOptionPane.showMessageDialog(null,
                "You got " + numCorrect + " out of " + length + " (" + percent.format(score) + ")");
    }

    public String toString() {
        String output = "Quiz";
        for (int i = 0; i < questions.length; i++) {
            output += "\n" + questions[i].toString();
        }
        return output;
    }   
}
