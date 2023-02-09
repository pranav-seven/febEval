import java.util.Scanner;
import java.util.ArrayList;
    // to find pairs whose sum is divisible by k
public class Question10 {
    //single letter variables are used for indices or if given in the question
    int[] array;
    Scanner sc;
    ArrayList<ArrayList<Integer>> pairList;  //arraylist to store all pairs
    public static void main(String[] arg)
    {
        Question10 question = new Question10();
        question.doProcess();
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
        // try all pairs in the array
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
