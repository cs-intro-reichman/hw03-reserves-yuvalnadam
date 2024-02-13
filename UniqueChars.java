/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {

        String st = s;
        int ln = st.length();
        String newstr = "";

        for (int i = 0; i < ln; i++ ) {

                if(newstr.indexOf(st.charAt(i)) == -1)
                newstr += st.charAt(i);

                else
                {
                     if(st.charAt(i) == ' ')
                    newstr += ' ';


                }
              

        }

        return newstr;
    }
}