import java.util.*;
public class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.next();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
            s.charAt(i)=Character.toUpperCase(s.charAt(i));
            else
            s.charAt(i)=Character.toLowerCase(s.charAt(i));
        }
         System.out.println(s);
    }
}
