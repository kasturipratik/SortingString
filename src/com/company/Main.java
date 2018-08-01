package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an string to be sorted");
        String input = scan.nextLine();

        //splitting the user input into an array separated by space
        String [] a = input.split(" ");

        //sorting the array in alphabetical order
        Arrays.sort(a);
        //empty string to store the sorted array
        String sorting = "";

        //looping through the array to replace it into a string
        for(int j =0; j < a.length;j++){

            sorting = new String(a[j]) + " " + sorting;
        }
        //printing the sorted string
        System.out.println(sorting);

        //empty string to store the sorted string by character
        String sorted = "";

        //loop to sort the string by character
        for(int i =0; i < a.length ;i ++){
            //split the string into individual character array
            char[] arr = a[i].toCharArray();

            //sort the character array
            Arrays.sort(arr);

            //concat the sorted array into a string
            sorted = new String(arr)+" "+sorted ;
        }


        System.out.println(sorted);
    }
}
