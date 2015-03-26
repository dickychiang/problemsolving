/*
   Problem Statement

   Given a group of dancers' heights, arrange a circle formation that minimizes the maximum height difference between each pair of neighboring dancers. Write a class CircleDance with a method arrangeDancers that takes a int[], heights, and returns the maximum height difference between neighboring dancers.

   Definition


Class:	CircleDance
Method:	arrangeDancers
Parameters: int[]
Returns:    int
Method signature:   int arrangeDancers(int[] heights)
(be sure your method is public)


Constraints

-   heights will contain between 3 and 20 elements inclusive.
-   Each element of heights will be between 150 and 210 inclusive.

Examples

0)  

{180,183,178,185}
Returns: 5
The dancers may be arranged in a circle like this:
180
/   \
185     178
\   /
183
Their height differences are shown below:
180
(5)/   \(2)
185     178
(2)\   /(5)
183
The maximum difference is 5. Other arrangements may not lead to an optimal solution. For example, the following one has a maximum difference of 7:
180
(3)/   \(2)
183     178
(2)\   /(7)
185
1)    

{170,180,190}
Returns: 20
Any arrangement is equivalent to the following one:
180
(10)/ \(10)
170 - 190
(20)
So the result is 20.
2)	

{180,180,180,180,180}
Returns: 0
3)  

{184,165,175,186,192,200,176,192,194,168,205,201}
Returns: 10
*/
import java.util.*;
public class CircleDance
{
    public static int arrangeDancers(int[] number)
    //public static void main(String[] args)
    {
	int count=0;
	int res=0;
	int min=0,max=0;
	//int[] number = {180, 183, 178, 185};
	//int[] number = {170, 180, 190};
	//int[] number = {184,165,175,186,192,200,176,192,194,168,205,201};

	Arrays.sort(number);	
	max = number[1] - number[0];
	for(int i=2; i< number.length; i++)
	{
	    max = Math.max(max, number[i] - number[i-2]);
	}
	
	res = Math.max(max, number[number.length-1] - number[number.length-2]);
	System.out.println(res);
	return res;
    }
}
