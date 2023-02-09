import java.util.*;
public class Question4 {
    String[] password;
    String loginAttempt;
    String answer;
    public static void main(String[] arg)
    {
        Question4 q = new Question4();
        q.doProcess();
    }
    void doProcess()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // no. of testcases
        for(int i=0; i<n; i++)
        {
            answer = "";
            int users = sc.nextInt();
            password = new String[users];
            for(int j=0; j<users; j++)
                password[j] = sc.next();
            TreeSet<String> pwdSet = new TreeSet<String>();
            for(String s : password)
                pwdSet.add(s);
            loginAttempt = sc.next();
            System.out.println(splitWords(loginAttempt, pwdSet)?answer:"WRONG PASSWORD");
        }
    }

    public boolean splitWords(String s, TreeSet<String> pwdSet) {
        int length = s.length();
        String temp = "";
        answer = "";
        boolean b = true;
        for(int i=0; i<length; i++)
        {
            temp = temp + s.charAt(i);
            if(pwdSet.contains(temp))
            {
                answer = temp + " ";
                temp = "";
            }
        }
        if(temp!="" && !pwdSet.contains(temp))
            b = false;
        return b;
    }
}