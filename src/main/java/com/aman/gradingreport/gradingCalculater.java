package com.aman.gradingreport;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class gradingCalculater {
    private String LetterGrade;

    @RequestMapping
    public String GradingCalc() {

        String StudentNumber;
        String StudentName;
        Double testScore;



        Scanner keyboard = new Scanner(System.in);
        StudentNumber = keyboard.nextLine();



        keyboard = new Scanner(System.in);
        StudentName = keyboard.nextLine();
        keyboard = new Scanner(System.in);
        testScore = keyboard.nextDouble();
        keyboard.nextLine();
        
        System.out.println(" Please Enter Your Number , Name and TestScore");
                
        if (testScore >= 45 && testScore <= 50) {
             LetterGrade = "A";
            System.out.println(StudentNumber + ""  + StudentName + " " + LetterGrade);
        }
        else if (testScore >= 40 && testScore < 45) {
             LetterGrade = "B";
            System.out.println(StudentNumber + StudentName + LetterGrade);
        }
        else if (testScore >= 35 && testScore < 40) {
             LetterGrade = "C";
            System.out.println(StudentNumber + StudentName + LetterGrade);
        }
        else if (testScore >= 30 && testScore < 35) {
             LetterGrade = "D";
            System.out.println(StudentNumber + StudentName + LetterGrade);
        }
        else {
            System.out.print("You are Failed");


        }


        return StudentNumber + StudentName +  LetterGrade ;

    }


}


