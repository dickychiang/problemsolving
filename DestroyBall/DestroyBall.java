public class DestroyBall
{
    public static String ballColor(long r, long g, long b, long k)
    {
        long min = Math.min(r, Math.min(g, b));
        
        if(k <= (3 * min))
        {
            k = k % 3;
            if(k == 1)
                return "RED";
            else if (k == 2) 
                return "GREEN";
            else 
                return "BLUE";
        }
        else
        {
            k = k - (3*min);
            r = r - min;
            g = g - min;
            b = b - min;

            //both of the colors are zero
            if(g == 0 && b == 0)
                return "RED";
            else if (r == 0 && b == 0)
                return "GREEN";
            else if (r == 0 && g == 0)
                return "BLUE";
            
            //single of the color is zero
            else if(r == 0)
            {
                long min_2 = Math.min(g, b);
                if(k <= (2 * min_2))
                {
                    k = k % 2;
                    if( k == 1)
                        return "GREEN";
                    else 
                        return "BLUE";
                }
                else if(g == min_2)
                    return "BLUE";
                else
                    return "GREEN";
            }
            else if(g == 0)
            {
                long min_3 = Math.min(r, b);
                if(k <= (2 * min_3))
                {
                    k = k % 2 ;
                    if( k == 1)
                        return "RED";
                    else 
                        return "BLUE";
                }
                else if(r == min_3)
                    return "BLUE";
                else
                    return "RED";
            }
            else if(b == 0)
            {
                long min_4 = Math.min(r, g);
                if(k <= (2 * min_4))
                {
                    k = k % 2 ;
                    if( k == 1)
                        return "RED";
                    else 
                        return "GREEN";
                }
                else if(r == min_4)
                    return "GREEN";
                else
                    return "RED";
            }
            
        }
        return null;
    }
}
