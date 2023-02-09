import static java.lang.System.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Question2 { 
    StringList[] list;
    Scanner sc;
    public static void main(String[] arg)
    {
        Question2 q = new Question2();
        q.doProcess();
    }
    void doProcess()
    {
        sc = new Scanner(in);
        out.print("Enter n: ");
        int n = sc.nextInt();
        list = new StringList[n];
        out.println("Enter number and string: ");
        for(int i=0; i<n; i++)
            list[i] = new StringList(sc.nextInt(), sc.nextLine());
        stringHyphenate(n>>1);
        stringSort(n);
        out.println("Output: ");
        for(int i=0; i<n; i++)
        {
            out.print(list[i].str);
        }
    }
    void stringHyphenate(int n)
    {
        for(int i=0; i<n; i++)
            list[i].str = "-";
    }
    void stringSort(int n)
    {
        ArrayList<ArrayList<StringList>> count = new ArrayList<ArrayList<StringList>>();
        for(int i=0; i<10; i++)
            count.add(new ArrayList<StringList>());
        for(int i=0; i<n; i++)
            count.get(list[i].value).add(list[i]);
        int i=0;
        for(ArrayList<StringList> listOfList : count)
        {
            for(StringList temp : listOfList)
            {
                list[i] = temp;
                i++;
            }
        }
    }
}
class StringList
{
    int value;
    String str;
    StringList(int i, String s)
    {
        value = i;
        str = s;
    }
}
