class SpaceCount
{
    public static int count_space(String s1)
    {
        int count = 0;
        char[] c = s1.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i] == ' ')
            count ++;
        }
        return count;
    }
}
public class Assignment_2_spaceCount 
{
    public static void main(String[] args) {
        SpaceCount sc = new SpaceCount();
        int k = sc.count_space("Hello      World ");
        System.out.printf("The number of spaces in the string are : %d\n",k);

    }    
}
