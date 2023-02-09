import static java.lang.System.*;
import java.util.*;
public class Question1 {
    Scanner sc;
    int[] cost;
    ArrayList<ArrayList<Integer>> pairList;
    public static void main(String[] arg)
    {
        Question1 q = new Question1();
        q.doProcess();
    }
    void doProcess()
    {
        sc = new Scanner(in);
        out.print("Enter m: ");
        int m = sc.nextInt();
        out.print("Enter cost array size: ");
        cost = new int[sc.nextInt()];
        out.print("Enter cost array: ");
        for(int i=0; i<cost.length; i++)
            cost[i] = sc.nextInt();
        pairList = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<cost.length-1; i++)
            for(int j=i+1; j<cost.length; j++)
                if(cost[i]+cost[j]==m)
                {
                    ArrayList<Integer> pair = new ArrayList<>(2);
                    pair.add(i+1);
                    pair.add(j+1);
                    pairList.add(pair);
                }
        out.println("The flavour pairs: "+pairList);
    }
}