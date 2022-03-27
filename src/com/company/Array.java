package com.company;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {

        int [] num= new int[10];

        for (int i=0; i< num.length; i++)
        {
            num [i]=num.length-1-i;
        }
        for (int c:num)
        {
            System.out.println("Array []"+ c + ":" + num[c]);

        }

}
}
