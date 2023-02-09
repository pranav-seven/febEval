import java.util.Scanner;
import java.util.ArrayList;
public class Question10 {
    int[] array;
    Scanner sc;
    ArrayList<ArrayList<Integer>> pairList;
    public static void main(String[] arg)
    {
        Question10 q = new Question10();
        q.doProcess();
    }
    void doProcess()
    {
        sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        array = new int[size];
        System.out.println("Enter array: ");
        for(int i=0; i<size; i++)
            array[i] = sc.nextInt();
        pairList = new ArrayList<ArrayList<Integer>>();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        findPairs(k);
        System.out.println("The pairs that meet the criteria: "+pairList);
    }
    void findPairs(int k)
    {
        for(int i = 0; i<array.length-1; i++)
            for(int j=i+1; j<array.length; j++)
                if((array[i]+array[j])%k==0)
                {
                    ArrayList<Integer> pair = new ArrayList<>(2);
                    pair.add(array[i]);
                    pair.add(array[j]);
                    pairList.add(pair);
                }
    }
}