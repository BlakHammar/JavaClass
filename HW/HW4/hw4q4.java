/*
Write an application that uses an enhanced for statement 
to sum the double values passed by the command-line arguments. 
[Hint: Use the static method parseDouble of class Double to convert a String to a double value.]
*/
public class hw4q4 
{
    public static void main(String[] args) 
    {
        double sum = 0;
        for (String s : args) 
        {
            sum += Double.parseDouble(s);
        }
        System.out.println(sum);
    }
}
