package com.company;

import java.util.ArrayList;
import java.util.Scanner;
// note to self: figure out how to store all the book details, how to do 2D arrays using ArrayList
public class Main {

    public static void main(String[] args) {
	// write your code here

        //System.out.println(getBookTitle());
        //System.out.println(getISBN());
        //System.out.println(getAuthor());
        //System.out.println(getGenre());

        //ArrayList<String> array = new ArrayList<>();
        //array.add(getBookTitle());
        //array.add(getISBN());
        //array.add(getAuthor());
        //array.add(getGenre());
        //System.out.println("Your book is: " + array);

        ArrayList<String> array = new ArrayList<>();
        String title = getBookTitle();
        String ISBN = getISBN();
        String author = getAuthor();
        String genre = getGenre();
        String book = title+", "+ISBN+", "+author+", "+genre;
        System.out.println("Your book is: " + book);
        array.add(book);
    }

    public static String getBookTitle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book title:");
        return scanner.nextLine();
    }

    public static String getISBN() { // ISBN is a serial number for a book
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ISBN:");
        return scanner.nextLine();
    }

    public static String getAuthor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter author:");
        return scanner.nextLine();
    }

    public static String getGenre() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter genre:");
        return scanner.nextLine();
    }


}

/*
package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<String> students = new ArrayList<>();

    public static void main(String[] args) {
        int studentsToAdd = Integer.parseInt(getInput("How many students do you want to add?"));
        for (int i = 0; i < studentsToAdd; i++) {
            students.add(getStudentDetails());
        }
        printStudentEmails();
    }

    public static String getStudentDetails() {
        int studentID = Integer.parseInt(getInput("Enter your student ID"));
        String studentName = getInput("Enter your name");
        String studentEmail = getInput("Enter your Email address");
        return (studentID + "," + studentName + "," + studentEmail);
    }

    public static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    //Using the split method to split the string into parts
    public static void printStudentEmails() {
        for (int i = 0; i < students.size(); i++) {
            String[] studentDetails = students.get(i).split(",");
            System.out.println(studentDetails[2]);
        }
    }
}

 */