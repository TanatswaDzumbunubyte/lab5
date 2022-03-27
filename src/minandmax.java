public class minandmax {
    public static void main(String[] args){

        int array[] = new int[101];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = i + 1;
        }
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}

