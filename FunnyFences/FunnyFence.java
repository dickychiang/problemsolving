public class FunnyFence {

    public int getLength(String s)
    {
        boolean x = true; // true = "|" ; false = "-"
        boolean fence = true; // true = "|" ; false = "-"
        int temp = 0;
        int ret = 0;
        

        for( int i = 0; i < s.length(); i++)
        {
            int len = 1;
            int j = i;
            for ( j = i ; j < s.length()-1; j++)
                if ( s.charAt(j) == s.charAt(j+1) )
                    break;
            len = j - i + 1;
            if ( len > temp )
                temp = len;
        }
        ret = temp;
        return ret;
    }
}
