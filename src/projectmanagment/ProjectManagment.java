package projectmanagment;

import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProjectManagment {

    public static void main(String[] args) {
        String menuInput = "";
        boolean cont = true;

        while (cont) {
            menuInput = JOptionPane.showInputDialog("Main Menu\n"
                + "1. Study Notes\n"
                + "2. Quiz\n"
                + "3. Exit");

            if (menuInput.equals("1")) {
                notesMenu();
            } else if (menuInput.equals("2")) {
                Question[] questions = new Question[10];
                questions[0] = new Question(
                    "What is the first step in project planning?\nA) Create a budget\nB) Assign tasks\nC) Hold a meeting\nD) Define project goals",
                    "D");

                questions[1] = new Question(
                    "What should you create to manage time?\nA) Risk assessment\nB) Gantt chart\nC) Stakeholder map\nD) A schedule",
                    "D");

                questions[2] = new Question(
                    "What is used to identify project resources?\nA) Resource map\nB) Resource plan\nC) Team structure\nD) Budget plan",
                    "B");

                questions[3] = new Question(
                    "Which document outlines project scope?\nA) Scope charter\nB) Project charter\nC) WBS\nD) Timeline",
                    "B");

                questions[4] = new Question(
                    "What helps visualize tasks over time?\nA) PERT chart\nB) RACI matrix\nC) Gantt chart\nD) SWOT chart",
                    "C");

                questions[5] = new Question(
                    "Which is part of risk management?\nA) WBS\nB) Risk register\nC) Team charter\nD) Quality report",
                    "B");

                questions[6] = new Question(
                    "Who approves the project deliverables?\nA) Stakeholder\nB) Team lead\nC) Sponsor\nD) Manager",
                    "C");

                questions[7] = new Question(
                    "What shows task dependencies?\nA) Gantt chart\nB) PERT chart\nC) Flowchart\nD) Timeline",
                    "B");

                questions[8] = new Question(
                    "What is the critical path?\nA) Longest task\nB) Task with most resources\nC) Path that delays project if late\nD) Shortest path",
                    "C");

                questions[9] = new Question(
                    "What should be updated regularly?\nA) Risk register\nB) Initial proposal\nC) Scope statement\nD) Charter",
                    "A");
                
                Quiz quiz = new Quiz(questions);
                quiz.doQuiz();

            } else if (menuInput.equals("3")) {
                JOptionPane.showMessageDialog(null, "Good luck on your test!");
                cont = false;
            } else {
                JOptionPane.showMessageDialog(null, "Please enter a number option",
                        "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void notesMenu() {
        String input = "";
        String[] notes = loadStudyNotes();
        while (!input.equals("3")) {
            input = JOptionPane.showInputDialog("Study Menu\n"
                    + "1. Project Management & SDLC Basics\n"
                    + "2. Tools, Risk Management & Roles\n"
                    + "3. Exit");
            if (input.equals("1")) {
                JOptionPane.showMessageDialog(null, notes[0]);
            } else if (input.equals("2")) {
                JOptionPane.showMessageDialog(null, notes[1]);
            } else if (input.equals("3")) {
                JOptionPane.showMessageDialog(null, "Returning to main menu");
                return;
            } else {
                JOptionPane.showMessageDialog(null, "Please enter a number option",
                        "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static String[] loadStudyNotes() {
        String[] notes = new String[2];
        try {
            String note1 = "";
            String note2 = "";
            File F1 = new File("src/projectmanagment/StudyNote1.txt");
            Scanner s1 = new Scanner(F1);
            File F2 = new File("src/projectmanagment/StudyNote2.txt");
            Scanner s2 = new Scanner(F2);
            while (s1.hasNextLine()) {
                note1 += s1.nextLine() + "\n";
            }
            while (s2.hasNextLine()) {
                note2 += s2.nextLine() + "\n";
            }
            s1.close();
            s2.close();
            notes[0] = note1;
            notes[1] = note2;
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        }
        return notes;
    }
}
