package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a fruit: ");
        String frui = input.next();
        fruitName fr = new fruitName(frui);
        if (fr.calCount() == 0){
            System.out.println("Sorry,we don't know how many calories " + frui + " has.");
        }
        System.out.println("Your fruit has " + fr.calCount() + " calories.");
    }
}
