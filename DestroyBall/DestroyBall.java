/*
Problem Statement

Bob is playing with his ball destroyer robot. Initially, Bob has r red balls, g green balls and b blue balls. The robot will repeat the following 3-step program until there are no balls left:


If there is at least one red ball available, destroy one red ball.
If there is at least one green ball available, destroy one green ball.
If there is at least one blue ball available, destroy one blue ball.
You are given the longs r, g and b. You are also given a long k. Find the color of the k-th ball (1-index based) that will be destroyed.
If the color of the k-th ball to be destroyed is red, return "RED" (quotes for clarity, returned values are case-sensitive).
If the color is green, return "GREEN".
If the color is blue, return "BLUE".

Definition


Class:  DestroyBall
Method: ballColor
Parameters: long, long, long, long
Returns:    String
Method signature:   String ballColor(long r, long g, long b, long k)
(be sure your method is public)


Constraints

-   r, g and b will each be between 1 and 1000000000000 (10^12), inclusive.
-   k will be between 1 and r+g+b, inclusive.

Examples

0)  

1
1
1
3
Returns: "BLUE"
The order in which the balls are destroyed is: Red, green and blue. The third ball was blue.
1)  

3
4
5
4
Returns: "RED"
The order in which the balls are destroyed is: Red, green, blue, red, green, blue, red, green, blue, green, blue and blue.
2)  

7
7
1
7
Returns: "GREEN"
3)  

1000000000000
1
1
1000000000002
Returns: "RED"
Once the only green and blue balls are destroyed, all of the remaining balls will be red.
4)  

653
32
1230
556
Returns: "BLUE"
*/
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
