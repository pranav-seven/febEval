import static java.lang.System.in;
import static java.lang.System.out;
import java.util.*;

public class Question8 {
    Scanner sc;
    int[] array;
    int size;
    public static void main(String[] arg)
    {
        Question8 q = new Question8();
        q.doProcess();
    }
    void doProcess()
    {
        sc = new Scanner(in);
        out.print("Enter array size: ");
        size = sc.nextInt();
        array = new int[size];
        out.println("Enter array:");
        for(int i=0; i<size; i++)
            array[i] = sc.nextInt();
        out.println("Output: ");
        insertionSortDemo();
    }
    void insertionSortDemo()
    {
        out.println("Given array:");
        out.println(Arrays.toString(array));
        for(int i=1; i<size; i++)
        {
            int temp = array[i];
            int j = i-1;
            while(j>=0 && array[j]>temp)
            {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
            out.println("Array after "+i+" iterations: ");
            out.println(Arrays.toString(array));
        }
    }
}