/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
public class Numbers
{
// Reads in an array of integers, sorts them, // then prints them in sorted order.
// -------------
public static void main (String[] args)
    {
        //int, char, boolean, float, double, short, byte, long primitivedirler, obje değiller
        //int -> Integer
        //char -> Character
        Integer[] intList;
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print ("\nHow many integers do you want to sort? "); size = scan.nextInt();
        intList = new Integer[size];
        System.out.println ("\nEnter the numbers..."); for (int i = 0; i < size; i++)
        intList[i] = scan.nextInt();
        System.out.println ("\nYour numbers in sorted order...");
        for (int i = 0; i < size; i++)
            System.out.print(intList[i] + "  ");
       System.out.println ();

        Sorting.selectionSort(intList);
       }

}
