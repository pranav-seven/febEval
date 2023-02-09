import static java.lang.System.*;
import java.util.Scanner;
public class Question6 {
    Scanner sc;
    int n;
    int[][] matrix;
    public static void main(String[] arg)
    {
        Question6 q = new Question6();
        q.doProcess();   
    }
    void doProcess()
    {
        Scanner sc = new Scanner(in);
        out.print("Enter n: ");
        n = sc.nextInt();
        matrix = new int[n][n];
        out.println("Enter matrix: ");
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        rotate(n);
        out.println("Output: ");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                out.print(matrix[i][j]+" ");
            }
            out.println();
        }
    }
    void rotate(int n)
    {
        for(int i=0; i<n; i++)
            for(int j=i+1; j<n; j++)
                {
                    int t = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = t;
                }
        for(int i = 0; i<n>>1; i++)
        {
            int[] t = matrix[i];
            matrix[i] = matrix[n-i-1];
            matrix[n-i-1] = t;
        }
    }
}