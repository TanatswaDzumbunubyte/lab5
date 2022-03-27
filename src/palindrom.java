import java.util.Scanner;

public class palindrom {

    public static void main(String[] args){
        //code here
        System.out.print("Enter a string please" );
        Scanner tj = new Scanner(System.in);

        String og = tj.nextLine();
        int length = og.length();
        og=og.toLowerCase();

        boolean isPalindrom=true;

        for (int beginIndex = 0; beginIndex < length; beginIndex++)
        {
            if(og.charAt(beginIndex) !=og.charAt(length-1-beginIndex))

            {
                System.out.println("STRING IS NOT A PALINDROM!");
                isPalindrom=false;
                break;
            }
            {
                if(isPalindrom)
                {
                    System.out.println("THE STRING ENTERED IS A PALINDROME");
                }

            }
        }}
    }

