import java.util.Arrays;
import java.util.Scanner;

public class Question9 {
    //pattern printing
    char[][] pattern;
    public static void main(String[] arg)
    {
        Question9 q = new Question9();
        q.doProcess();
    }
    void doProcess()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();
        pattern = new char[n][n];
        makePattern(n);
        for(char[] line : pattern)
        {
            for(int i=0; i<n; i++)
                System.out.print(line[i]+" ");
            System.out.println();
        }
    }
    void makePattern(int n)
    {
        //flags for array traversal direction
        int left = 0, right = n-1, up = 0, down = n-1, count=0;
        int size = n*n;
        boolean b = true;
        while(count<size)
        {
            for(int i=left; i<=right; i++)
            {
                pattern[up][i]=b?'1':'0';
                count++;
            }
            up++;
            for(int i=up; i<=down; i++)
            {
                pattern[i][right] = b?'1':'0';
                count++;
            }
            right--;
            for(int i=right; i>=left; i--)
            {
                pattern[down][i] = b?'1':'0';
                count++;
            }
            down--;
            for(int i=down; i>=up; i--)
            {
                pattern[i][left] = b?'1':'0';
                count++;
            }
            left++;
            b = !b;
        }
    }
}