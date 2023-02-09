import static java.lang.System.*;
import java.util.*;
public class Question7 {
    Scanner sc; 
    int[] subset;
    ArrayList<ArrayList<Integer>> powerSet;
    public static void main(String[] arg)
    {
        Question7 q = new Question7();
        q.doProcess();
    }
    void doProcess()
    {
        powerSet = new ArrayList<ArrayList<Integer>>();
        sc = new Scanner(in);
        out.print("Enter number of elements: ");
        int size = sc.nextInt();
        subset = new int[size];
        out.println("Enter array: ");
        for(int i=0; i<size; i++)
            subset[i] = sc.nextInt();
        Arrays.sort(subset);
        addSubset(0, new ArrayList<Integer>());
        System.out.println(powerSet);
        
    }
    void addSubset(int i, ArrayList<Integer> temp)
    {
        powerSet.add(new ArrayList<>(temp));
        if(i==subset.length)
            return;
        for(; i<subset.length; i++)
        {
            temp.add(subset[i]);
            addSubset(i+1, temp);
            temp.remove(temp.size()-1);
        }
    }
}