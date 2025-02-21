/*
 Create a two-dimensional array with six rows and four columns where the cells in the first five rows 
 and three columns are filled with random integers between 0 and 9, the first 5 cells of the fourth column 
 contain the sums of the integers in the cells of the corresponding rows, the first three cells of the sixth row contain 
 the sums of the integers in the corresponding column, and the lower right cell, position (6,4), is set to 0.
 */
public class Two_D_Array 
{
    public static void main(String[] args) 
    {
        int[][] arr = new int[6][4];
        
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                if(i < 5 && j < 3)
                {
                    arr[i][j] = (int)(Math.random() * 10);
                }
                else if(i < 5 && j == 3)
                {
                    arr[i][j] = arr[i][j - 1] + arr[i][j - 2] + arr[i][j - 3];
                }
                else if(i == 5 && j < 3)
                {
                    arr[i][j] = arr[i - 1][j] + arr[i - 2][j] + arr[i - 3][j] + arr[i - 4][j] + arr[i - 5][j];
                }
                else if(i == 5 && j == 3)
                {
                    arr[i][j] = 0;
                }
            }
        }
        
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
