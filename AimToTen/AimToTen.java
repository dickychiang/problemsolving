/*
 * Subject: AimToTen
 *
 * Description: You are given a int[] marks containing the grades you have received so far in a class. Each grade is between 0 and 10, inclusive. Assuming that you will receive a 10 on all future assignments, determine the minimum number of future assignments that are needed for you to receive a final grade of 10. You will receive a final grade of 10 if your average grade is 9.5 or higher.
 *
 * Definition: 
 * Class: AimToTen
 * Method: need
 * Parameters: int[]
 * Returns: int
 * Method signature: public int need(int[] marks)
 *
 * Constraints:
 * marks has between 1 and 50 elements, inclusive.
 * Each element of marks is between 0 and 10, inclusive.
 *
 */
public class AimToTen{
    public int need(int[] marks){
        double avg = 0.0;
        int total = 0;
        for(int i = 0; i < marks.length; i++){
            total += marks[i];
        }
        avg = total*1.0/marks.length;
        int count = 0;
	System.out.println("avg =" + avg);
        while(avg < 9.5){            
            count++;
            total += 10;
            avg = total*1.0/(marks.length+count);
        }
	
	System.out.println("count =" + count);
        return count;
    }
}
