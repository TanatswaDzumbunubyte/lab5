package com.company;
import java.util.Arrays;
import java.util.Random;
public class minandmax {
    public static void main(String[] args)
    {
        int array[] = new int [10];

        Random tj= new Random();

        for (int i = 0; i<array.length; i++){
            array[i]= tj.nextInt(100);

        }
        System.out.println(Arrays.toString(array));

        int min = array[0];
        int max = array[0];

        for (int i = 1;i< array.length; i++){
            if (array[i]>max) max=array[i];
            else if (array[i]<min) min = array[i];

        }

        System.out.println("The biggest value is " + max);
        System.out.println("The smallest value is" + min);
    }

}
