class replace
{
    public void replace_it(String str,char replace_this,char with_this)
    {
        char c[] = str.toCharArray();
        for (int i = 0; i < c.length; i++) 
        {
            if(c[i] == replace_this)
            {
                c[i] = with_this;
            }
        }
        String str1 = new String(c);
        System.out.println(str1);
    }
}

public class Assignment_2_replace
{
    public static void main(String[] args) {
        replace r = new replace();
        r.replace_it("Hello World", 'H', 'W');
    }    
}
