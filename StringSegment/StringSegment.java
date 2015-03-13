public class StringSegment
{
    public static double average(String s)
    {
        int count = 1;
        double buffer = 0;
        double segment = 0;
        double sum = 0;

        char c = s.charAt(0);
        
        for(int i = 1; i < s.length(); i++)
        {
            if( c == s.charAt(i))
            {
                count++;
            }
            else
            {
                buffer = buffer + count;
                count = 0;
                c = s.charAt(i);
                count++;
                segment++;
            }
        }
         buffer = buffer + count;
        segment++;
        System.out.println("buffer =" + buffer);
        System.out.println("segment =" + segment);
        sum = buffer / segment;
        return sum;
    }
}
