/*
   Problem Statement

   The pony George is going to raise a new stable . The stable will consist of N sections in a row. Some of the sections will be empty, others will contain a single cow each. You are given a String str with N characters. This string describes the desired layout of the stable : the character 'c' represents a section with a cow, and the character '.' represents an empty section.



   After he raises the stable , George will build a wall that will divide the stable into two separate parts: one containing the first k sections and the other containing the last N-k sections, for some integer k. Each part must contain at least one section. (I.e., k must be between 1 and N-1, inclusive.) Additionally, George wants both parts to contain exactly the same number of cows.



   Return the number of possible positions for the wall. In other words, return the number of choices for the integer k such that all the conditions above are satisfied.

   Definition


Class:	CowFarm
Method:	howMany
Parameters: String
Returns:    int
Method signature:   int howMany(String str)
(be sure your method is public)


Constraints

-   str will contain between 2 and 50 characters, inclusive.
-   Each character in str will be 'c' or '.'.

Examples

0)  

"cc..c.c"
Returns: 3
George can choose k=2, k=3, or k=4. The three corresponding solutions are shown below, with '|' representing the wall between the two parts.
cc|..c.c
cc.|.c.c
cc..|c.c
1)  

"c....c....c"
Returns: 0
There is an odd number of cows. It is impossible to divide them into two equal halves.
2)  

"............"
Returns: 11
This is a stable with 12 empty sections. It can be divided in 11 different ways: into 1+11 sections, 2+10 sections, ..., or 11+1 sections.
3)  

".c.c...c..ccc.c..c.c.cc..ccc"
Returns: 3
 */

public class CowFarm
{
    /*
    public static void main(String[] args)
    {
        int res=0;
	int cow=0;
	int count_right=0,right_section=0,count_left=0,left_section=0;
        String s = new String();
	//s = ".c.c...c..ccc.c..c.c.cc..ccc";
	s = "c....c....c";

	if(s.contains("c"))
	{
	    for(int i = 0; i < s.length(); i++)
	    {
		if(s.charAt(i) == 'c')
	    		cow++;
	    }
	    if((cow %2) != 0) {
		res = 0;
	    }
	    else
	    {
		for(int i = 0; i < s.length(); i++)
		{
		    if(s.charAt(i) == 'c')
			count_left++;

		    if(count_left == cow/2) {
			left_section = i;
			break;
		    }

		}
		for(int j = s.length()-1; j >= 0 ; j--)
		{
		    if(s.charAt(j) == 'c')
			count_right++;
		    if((count_right) == (cow/2)) {
			right_section = j;
			break;
		    }
		}
		res = right_section - left_section;
	    }
	}
	else
	    res = s.length() - 1;

	System.out.println("res ="+res);
    }
    */
    public static int howMany(String str)
    {
        int res=0;
	int cow=0;
	int count_right=0,right_section=0,count_left=0,left_section=0;
        String s = new String();
	//s = ".c.c...c..ccc.c..c.c.cc..ccc";
	//s = "c....c....c";
	s = str;

	if(s.contains("c"))
	{
	    for(int i = 0; i < s.length(); i++)
	    {
		if(s.charAt(i) == 'c')
	    		cow++;
	    }
	    if((cow %2) != 0) {
		res = 0;
	    }
	    else
	    {
		for(int i = 0; i < s.length(); i++)
		{
		    if(s.charAt(i) == 'c')
			count_left++;

		    if(count_left == cow/2) {
			left_section = i;
			break;
		    }

		}
		for(int j = s.length()-1; j >= 0 ; j--)
		{
		    if(s.charAt(j) == 'c')
			count_right++;
		    if((count_right) == (cow/2)) {
			right_section = j;
			break;
		    }
		}
		res = right_section - left_section;
	    }
	}
	else
	    res = s.length() - 1;

	return res;
    }
}
