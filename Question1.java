import static java.lang.System.*;
import java.util.*;
//to find pairs of ice cream flavors that costs exactly the amount the friends have
public class Question1 {
    Scanner sc;
    int[] cost;
    // single letter variables are used for indices or if given in the question
    ArrayList<ArrayList<Integer>> pairList; // arraylist to store the pairs
    public static void main(String[] arg)
    {
        Question1 question = new Question1();
        question.doProcess();
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
        // try all possible combinations
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
