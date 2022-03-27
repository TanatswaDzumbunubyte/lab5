package com.company;
//cant find way to print it out other than a list
public class twodimensionalarray {
    public static void main(String[] args) {
        int diagonal = 0;
        int[][] arr = {

                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 3, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 4, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 5, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 6, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 8, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 9}


        };
        int[][] matrix = new int[10][10];

        for (int i = 0; i < arr.length; i++) {
            for (int tj = 0; tj < arr.length; tj++) {
                matrix[i][tj] = arr[i][tj];
                if (i == tj) diagonal += arr[i][tj];

                //to
                System.out.println(arr[i][tj]);
            }
        }
        System.out.println("      ");
        System.out.println("The sum of the diagonal is: " + diagonal);
    }
}
