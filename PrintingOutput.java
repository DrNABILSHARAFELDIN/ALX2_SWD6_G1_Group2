package basics;

import java.util.Scanner;

public class PrintingOutput {
    public static void main(String[] args) {

    /*    int age = 10;

        if (age >= 18){
            System.out.println("You can register ");
        } else {
            System.out.println("You can't register ");
        }
        System.out.println("End");


        Scanner input = new Scanner(System.in);
        System.out.println("Enter score");
        int score = input.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Grade: A");
            int gpa = score +10 /2;
            System.out.println(gpa);
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }



        Scanner input = new Scanner(System.in);
        System.out.println("Enter age");
        int age1 = input.nextInt();

        if (age1>=18){
            System.out.println("Do you have ID? true or false.");
            boolean id = input.nextBoolean();

            if(id){
                System.out.println("age >= 18 & id is ok");
            }else {
                System.out.println("age >= 18 & id is invalid");
            }
        }else {
            System.out.println("age < 18");
        }
*/
        Scanner dayInput = new Scanner(System.in);
        System.out.println("enter day number (1, 2, 3)");
        int day = dayInput.nextInt();

        switch (day) {
            case 1:
                System.out.println("Hello");
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        System.out.println("End");

/*
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.nextLine();

        System.out.println("Hello " + name + " Your age is " + age);
        System.out.printf("Hello %S Your age is %d years ",name, age);
        System.out.println("End");
*/
    }
    }


