public class BoxesOfBooks{

    public static int boxes(int[] weights, int maxWeight)
    {
        int numBoxes = 0;
        int temp = 0;
        for (int i = 0; i < weights.length; i++)
        {
            temp += weights[i];
            if (temp > maxWeight)
            {
                numBoxes++;
                temp = weights[i];
            }
            else if (temp == maxWeight)
            {
                numBoxes++;
                temp = 0;
            }
        }

        while(true)
        {
            if ( temp > 0 )    
            {
                temp = temp - maxWeight;
                numBoxes++;
            }
            else break;
        }
        return numBoxes;
    }
}
