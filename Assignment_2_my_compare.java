class MyCompare
{
    public int compare_it(String s1,String s2)
    {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        if(c1[0] > c2[0])
        {
            return -1;
        }
        else if(c1[0] < c2[0])
        {
            return 1;
        }
        else
        return 0;
    }
}
public class Assignment_2_my_compare 
{
    public static void main(String[] args) 
    {
        MyCompare mc = new MyCompare();
        int k = mc.compare_it("Anurag", "Pareek");    
        System.out.printf("Comparing two strings returns : %d\n",k);
    }
}
