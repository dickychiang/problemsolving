public class RosePetals
{
    public static int getScore(int[] dice)
    {
        int res = 0;
        int temp = 0;

        for (int i = 0; i < dice.length; i++)
        {
            temp = dice[i];

            if(temp == 3)
                res = res + 2;
            if (temp == 5)
                res = res + 4;
        }
        return res;
    }
}
