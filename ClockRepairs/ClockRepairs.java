/*
Problem Statement

    	
When a clock breaks, it is sent to the widget repair shop, which is capable of repairing at most numPerDay widgets per day. Given a record of the number of clocks that arrive at the shop each morning, your task is to determine how many days the shop must operate to repair all the clocks, not counting any days the shop spends entirely idle.

For example, suppose the shop is capable of repairing at most 8 clocks per day, and over a stretch of 5 days, it receives 10, 0, 0, 4, and 20 widgets, respectively. The shop would operate on days 1 and 2, sit idle on day 3, and operate again on days 4 through 7. In total, the shop would operate for 6 days to repair all the widgets.

Create a class ClockRepairs containing a method days that takes a sequence of arrival counts arrivals (of type int[]) and an int numPerDay, and calculates the number of days of operation.

 
Definition

    	
Class:	ClockRepairs
Method:	days
Parameters:	int[], int
Returns:	int
Method signature:	int days(int[] arrivals, int numPerDay)
(be sure your method is public)
    
 
Constraints

-	arrivals contains between 1 and 20 elements, inclusive.
-	Each element of arrivals is between 0 and 100, inclusive.
-	numPerDay is between 1 and 50, inclusive.
 
Examples

0)	
    	
{ 10, 0, 0, 4, 20 }
8
Returns: 6
The example above.
1)	
    	
{ 0, 0, 0 }
10
Returns: 0
2)	
    	
{ 100, 100 }
10
Returns: 20
3)	
    	
{ 27, 0, 0, 0, 0, 9 }
9
Returns: 4
4)	
    	
{ 6, 5, 4, 3, 2, 1, 0, 0, 1, 2, 3, 4, 5, 6 }
3
Returns: 15
*/


public class ClockRepairs {

	public int days(int[] arrivals, int numPerDay)
	{
		int temp = 0;
		int sum = 0;
        int buff = 0;
        int last_num = 0;

        for (int i=0; i < arrivals.length ; i++)
        {
            if (arrivals[i] == 0 && buff == 0)
            {
                System.out.println("Idle");
            }
            else
            {
                arrivals[i] = buff + arrivals[i];
                temp = arrivals[i] - numPerDay; 
                if (temp < 0)
                    temp = 0;

                buff = temp; 
                sum++;
            }
        }

        while(buff > 0)
        {
            buff = buff - numPerDay;
            //if (buff >= 0)
            sum++;
        }

        return sum;
	}
}
