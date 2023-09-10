class EqualsTo
{
    public boolean is_equals(String s1,String s2)
    {
        boolean flag = false;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        if(s1.length() == s2.length())
        {
            for (int i = 0; i < c1.length; i++) {
                if(c1[i] == c2[i])
                flag = true;
                else
                return false;
            }
        }
        return flag;
    }
}

public class Assignment_2_equalsTo 
{
    public static void main(String[] args) {
        EqualsTo et = new EqualsTo();
        boolean k = et.is_equals("Hello", "World");
        boolean m = et.is_equals("Hello", "Hello");
        System.out.printf("Strings are equal ? : %b\n",k);
        System.out.printf("Strings are equal ? : %b\n",m);

    }
}
