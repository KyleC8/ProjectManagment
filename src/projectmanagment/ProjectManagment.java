package projectmanagment;

import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProjectManagment {
    
    public static void main(String[] args) {
        String input = "";
        boolean cont = true; 
        boolean studyCont = true; 
        String menuInput = ""; 
        String studyInput = ""; 
        
        while (cont) {
            menuInput = JOptionPane.showInputDialog("Main Mneu\n"
                + "1. Study Notes\n"
                + "2. Quiz\n"
                + "3. Exit"); 
            
            if (menuInput.equals("1")) {
                notesMenu();
                
            }else if (menuInput.equals("2")) {
                
            }else if (menuInput.equals("3")) {
                JOptionPane.showMessageDialog(null, "Good luck on your Test"); 
                cont = false; 
            }else {
                JOptionPane.showMessageDialog(null, "Please enter a number option", 
                        "Invalid Input", JOptionPane.ERROR_MESSAGE); 
            }
        }
    }



    
    public static void notesMenu() {
        String input = "";
        while(!input.equals("3") || !input.equalsIgnoreCase("exit")) {
            input = JOptionPane.showInputDialog("Study Menu\n"
                        + "1. Topic 1\n"
                        + "2. Topic 2\n"
                        + "3. Exit");
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
    
