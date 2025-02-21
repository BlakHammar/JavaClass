/* 
7.10 (Sales Commissions) Use a one-dimensional array to solve the following problem: A com-
pany pays its salespeople on a commission basis. The salespeople receive $200 per week plus 9% of
their gross sales for that week. For example, a salesperson who grosses $5,000 in sales in a week re-
ceives $200 plus 9% of $5,000, or a total of $650. Write an application (using an array of counters)
that determines how many of the salespeople earned salaries in each of the following ranges (assume
that each salesperson's salary is truncated to an integer amount):
a) $200-299
b) $300-399
c) $400-499
d) $500-599
e) $600-699
f) $700-799
g) $800-899
h) $900-999
$1,000 and over

For Exercise 7.10, assume that there are 10 salespeople with sales (in dollars) 
5000, 7000, 5500, 10500, 2000, 4000, 4500, 8000, 11000, and 6000.  
Encode this data into your main method as an int array called something like salesArray.
*/

public class hw4q1 {
    public static void main(String[] args) 
    {
        int[] salesArray = {5000, 7000, 5500, 10500, 2000, 4000, 4500, 8000, 11000, 6000};

        double[] amountMade = new double[salesArray.length];

        for (int i = 0; i < salesArray.length; i++)
        {
            amountMade[i] = salesArray[i] * 0.09 + 200;
        }

        int[] range = new int[amountMade.length];

        for (int i = 0; i < amountMade.length; i++)
        {
            if (amountMade[i] >= 200 && amountMade[i] <= 299)
            {
                range[0]++;
            }
            else if (amountMade[i] >= 300 && amountMade[i] <= 399)
            {
                range[1]++;
            }
            else if (amountMade[i] >= 400 && amountMade[i] <= 499)
            {
                range[2]++;
            }
            else if (amountMade[i] >= 500 && amountMade[i] <= 599)
            {
                range[3]++;
            }
            else if (amountMade[i] >= 600 && amountMade[i] <= 699)
            {
                range[4]++;
            }
            else if (amountMade[i] >= 700 && amountMade[i] <= 799)
            {
                range[5]++;
            }
            else if (amountMade[i] >= 800 && amountMade[i] <= 899)
            {
                range[6]++;
            }
            else if (amountMade[i] >= 900 && amountMade[i] <= 999)
            {
                range[7]++;
            }
            else if (amountMade[i] >= 1000)
            {
                range[8]++;
            }
        
        }

        for (int i = 0; i < range.length; i++)
        {
            System.out.println("Number of salespeople in range " + (i + 1) + ": " + range[i]);
        }

    }
       
}