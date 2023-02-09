import java.util.*;
public class Question5 {
    int q;  // days
	int l, r;  //left, right
	String s; //sequence;
    int count;
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Question5 q = new Question5();
		q.doProcess();
	}
	
	void doProcess()
	{
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		q = sc.nextInt();
		for(int i=0; i<q; i++)
		{
			l = sc.nextInt();
            r = sc.nextInt();
            HashSet<String> stringList = new HashSet<String>();
            maxPalindromes(s.substring(l-1,r-1), stringList, r-l-1, 0);
            System.out.println(count);
		}
		sc.close();
	}
    void maxPalindromes(String s, HashSet<String> stringList, int size, int limit)
    {
        if(size==0)
            return;
        for(int i=0, j=size; i<=limit; i++, j++)
        {
            String temp = s.substring(i, j);
            if(stringList.contains(s))
                continue;
            if(isPalindrome(temp))
                count++;
        }
        if(count==0)
            maxPalindromes(s, stringList, size-1, limit+1);

    }
    boolean isPalindrome(String s)
    {
        char[] temp = s.toCharArray();
        for(int i=0; i<temp.length>>1; i++)
            if(temp[i] != temp[temp.length-1-i])
                return false;
        return true;
    }
}