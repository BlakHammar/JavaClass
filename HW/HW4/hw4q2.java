/*
Write an application that calculates the product of a series
of integers that are passed to method product using a variable-length argument list. 
Test your method with several calls, each with a different number of arguments.
*/

public class hw4q2 
{
    public static void calProduct(int... nums) 
    {
        int product = 1;

        for(int num : nums)
        {
            product *= num;
        }

        System.out.println(product);
    }

    public static void main(String[] args) 
    {
        calProduct(5, 3, 6, 7, 8);

        calProduct(5, 3, 6, 7, 8, 9);

        calProduct(5, 3, 6, 7, 8, 9, 1);

        calProduct( 6, 7, 8);
        
        
    }
    
}
