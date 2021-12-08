package com.company;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        file(); // creates/checks file

        ArrayList<String> array = new ArrayList<>();

        for (int i = 0;i < 2; i++) {

            String title = getBookTitle();
            String ISBN = getISBN();
            String author = getAuthor();
            String genre = getGenre();

            String book = title + ", " + ISBN + ", " + author + ", " + genre + "\n";
            System.out.println("Your book is: " + book);
            array.add(book);
            System.out.println(i); // to check what i currently is
            System.out.println(array.get(i));

            writeToFile(book);
        }
        System.out.println("should print contents of file now");
        readFile();

    }

    public static String getBookTitle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book title:");
        return scanner.nextLine();
    }

    public static String getISBN() { // ISBN is a like serial number for a book
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

    public static void file() {
        try {
            File library = new File("library.txt");
            if (library.createNewFile()) {
                System.out.println("File created: " + library.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    } // creates/checks file

    public static void writeToFile(String book) {
        try {
            FileWriter myWriter = new FileWriter("library.txt", true);
            myWriter.write(book);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void readFile() {
        try {
            File myObj = new File("library.txt");
            Scanner scanner = new Scanner(myObj);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
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