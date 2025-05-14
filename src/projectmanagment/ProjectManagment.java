package projectmanagment;

import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProjectManagment {
    
    public static void main(String[] args) {
        String input = "";
        while(!input.equals("3") || !input.equalsIgnoreCase("exit")) {
            input = JOptionPane.showInputDialog("""
                                                Welcome to the project management study tool:Enter your choice as a #:
                                                1. Quiz
                                                2. Study Notes
                                                3. Exit""");
            
            if(input.equals("1")) {
            
            }
            else if(input.equals("2")) {
            
            
            }
            else if(input.equals("3")) {
                JOptionPane.showMessageDialog(null, "Goodbye!");  
                System.exit(0);
            
            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid Input: Please enter the a number (Eg. 1)");  
            }
        
        }
    }



    
    public static void loadNotes() {
        String input = "";
        while(!input.equals("3") || !input.equalsIgnoreCase("exit")) {
            input = JOptionPane.showInputDialog("Welcome to the notes menu: Enter your choice as a #:\n1. Study Note 1\n2. Study Notes 2\n3. Exit");
            if(input.equals("1")) {
            
            }
            else if(input.equals("2")) {
            
            
            }
            else if(input.equals("3")) {
                return;
            
            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid Input");
            }
        }
    }
    
    public String[] loadStudyNotes() {
        String[] notes = new String[2];
        try {
            String note1 = "";
            String note2 = "";
            File F1 = new File("src\\projectmanagement\\StudyNote1.txt");
            Scanner s1 = new Scanner(F1);
            File F2 = new File("src\\projectmanagement\\StudyNote2.txt");
            Scanner s2 = new Scanner(F1);
            while(s1.hasNextLine()) {
                note1 += s1.nextLine() + "\n";
            }
            while(s2.hasNextLine()) {
                note2 += s2.nextLine() + "\n";
            }
            notes[0] = note1;
            notes[1] = note2;
        }
        catch(FileNotFoundException e) {
            System.out.println("Error: " + e);
        
        }
        return notes;
    }
    
}
    
}
