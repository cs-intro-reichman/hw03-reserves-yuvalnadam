/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        
        String str1 = s;
        int ln = str1.length() - 1;
        String newStr = "";

        for (int i = 0; i <= ln ;i++ )
         {
            if (str1.charAt(i) >= 65 && str1.charAt(i) <= 90)
            {

            char low = (char)(str1.charAt(i) + 32);
            newStr += low;
            }
            
            else
                newStr += str1.charAt(i);
        }


        return newStr;
    }
}