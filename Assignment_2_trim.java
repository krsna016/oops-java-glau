class Trim
{
    public String trim_string(String str)
    {
        char[] char_arr = str.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < char_arr.length; i++) {
            if(char_arr[i] != ' ')
            {
                result.append(char_arr[i]);
            }
        }
        return result.toString();
    }
}
public class Assignment_2_trim
{
    public static void main(String[] args) {
        trim tr = new trim();
        String k = tr.trim_string("Hello World   ");
        System.out.printf("The Trimmed String is : %s\n",k);
    }
}