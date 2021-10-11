package com.fclass.userinput;
import java.util.Scanner;

public class IO {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int rollInt = 0;
        float gpaFloat = 0.0f;
        String name;
        boolean flag = false;

        do{

            System.out.println("Enter your name: " );
            name = scanner.nextLine();
            System.out.println("Enter your rollno: ");
            String rollno = scanner.nextLine();
            System.out.println("Enter your GPA : ");
            String gpa = scanner.nextLine();
            try{

                rollInt = Integer.parseInt(rollno);
                gpaFloat = Float.parseFloat(gpa);
                flag = true;
            }catch(NumberFormatException nfe){
                System.out.println("You didn't enter a number, stupid");
                System.out.println(nfe);
            }catch (Exception e) {
                System.out.println(e);
            }
        }while(flag == false);
        scanner.close();
        System.out.println("Name : "+ name + "; Roll no : " + rollInt + " ; GPA : " + gpaFloat);

    }
}
