package exercises.lesson2;

import org.launchcode.java.demos.lsn4classes2.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner reader = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter student (or ENTER to finish): ");

        do{
            System.out.print("Student: ");
            newStudent = reader.nextLine();

            if(!newStudent.equals("")){
                System.out.print("ID: ");
                int idNum = reader.nextInt();
                students.put(idNum, newStudent);

                reader.nextLine();
            }
        } while(!newStudent.equals(""));

        System.out.println("Class Roster:");
        for(Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println(student.getKey() + " " + student.getValue());
        }

    }

}
