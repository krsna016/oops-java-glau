class VowelCount
{
    public int count_vowels(String s1)
    {
        int count = 0;
        s1 = s1.toUpperCase();
        char[] c = s1.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i] == 'A'|| c[i] == 'E'|| c[i] == 'I'|| c[i] == 'O'|| c[i] == 'U')
            {
                count ++;
            }
        }
        return count;
    }
}
public class Assignment_2_vowelCount 
{
    public static void main(String[] args) {
        VowelCount vc = new VowelCount();
        int k = vc.count_vowels("Hello World");
        System.out.printf("The number of vowels in the string are : %d\n",k);
    }    
}
