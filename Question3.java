import static java.lang.System.*;
import java.util.Scanner;
public class Question3 {
    int[] expenditure;
    int count;
    Scanner sc;
    public static void main(String[] arg)
    {
        Question3 q = new Question3();
        q.doProcess();
    }
    void doProcess()
    {
        sc = new Scanner(in);
        // as given in problem, number of days -> n,
        // min number of days -> d
        out.print("Enter n: ");
        int n = sc.nextInt();
        expenditure = new int[n];
        out.print("Enter d: ");
        int d = sc.nextInt();
        out.print("Enter expenditure array: ");
        for(int i=0; i<n; i++)
            expenditure[i] = sc.nextInt();
        if(d>=n)
        {
            out.println(0);
            return;
        }
        //get twice the median value so that no need to multiply here
        int median2x = getMedian(d);
        for(int i=d; i<n; i++)
            if(expenditure[i]>=median2x)
                count++;
        out.println(count);
    }
    int getMedian(int days)
    {
        for(int i=1; i<days; i++)
        {
            int temp = expenditure[i];
            int j = i-1;
            while(j>=0 && expenditure[j]>temp)
            {
                expenditure[j+1] = expenditure[j];
                j--;
            }
            expenditure[j+1] = temp;
        }
        int median = expenditure[days/2];
        if(days%2==0)
                median += expenditure[days/2-1];
        else
                median = median<<1;
        return median;
    }
}