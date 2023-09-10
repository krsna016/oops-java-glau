class Freq
{
    public int count_word(String str,char ch)
    {
        char[] s = str.toCharArray();
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if(s[i] == ch)
            count ++;
        }
        return count;
    }
}
public class Assignment_2_freq
{
    public static void main(String[] args) {
        Freq wf = new Freq();
        int k = wf.count_word("AnuragAAAA", 'A');
        System.out.printf("The number of character in the string is : %d\n",k);
    }
}