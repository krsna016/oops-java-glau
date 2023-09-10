class CharCount
{
    public int count_char(String str)
    {
        return str.length();
    }
}
public class Assignment_2_char_count
{
    public static void main(String[] args) {
        CharCount cc = new CharCount();
        int k = cc.count_char("Anurag Anurag");
        System.out.printf("The number of characters in the string : %d\n",k);

    }
}