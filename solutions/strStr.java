
public class strStr {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */

    public int strStr(String source, String target) {
        // write your code here

        //method 1
        if (source == null || target == null ) {
            return -1;
        }

        if (source.length() < target.length()) {
            return -1;
        }

        // char s[] = source.toCharArray();
        // char t[] = target.toCharArray();

        int i = 0;
        int j = 0;

        while (i < source.length() &&  j < target.length()) {

            if (target.charAt(j) == source.charAt(i)) {
                i++;
                j++;
            }

            else {
                i = i-(j-1);
                j=0;
            }


        }


        if (j == target.length()) {
            return i-j;
        }  else {
            return -1;
        }


        //method2
        public int strStr(String haystack, String needle) {


            if (haystack == null ||  needle == null ) {
                return -1;
            }

            if (haystack.length() < needle.length() ) {
                return -1;
            }

            for (int i=0;i<haystack.length()-needle.length()+1;i++) {

                int j=0;
                for (j=0;j<needle.length();j++) {
                    if (haystack.charAt(i+j) != needle.charAt(j)) {
                        break;
                    }
                }

                //finish loop，
                if ( j == needle.length()) { //
                    return i;
                }
            }

            return -1;
        }
    }
}
