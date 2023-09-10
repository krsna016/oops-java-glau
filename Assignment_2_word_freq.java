class WordFreq
{
    public int count_word(String str,String word)
    {
        char[] c = str.toCharArray();
        int count = 0;
        int l = word.length();
        for (int i = 0; i <= c.length-l; i++) {
            String subs = str.substring(i, i+l);
            if(word.equals(subs))
            {
                count ++;
            }
        }
        return count;
    }
}

public class Assignment_2_word_freq
{
    public static void main(String[] args) {
        WordFreq wf = new WordFreq();
        int k = wf.count_word("AnuragAnu", "Anu");
        System.out.printf("The number of words in the string are : %d\n",k);
    }
}