package HW.HW4;
/*
Rewrite Fig. 7.2 so that the size of the array is specified by the
first command-line argument. If no command-line argument is supplied, use 10 as the default size
of the array.
*/
public class hw4q3 {

    public static void main(String[] args) 
    {
        int size = 10;

        if(args.length > 0)
        {
            size = Integer.parseInt(args[0]);
        }

        int[] array = new int[size];

        System.out.printf("%s%8s%n", "Index", "Val");

        for(int counter = 0; counter < array.length; counter++ )
        {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
    
}
