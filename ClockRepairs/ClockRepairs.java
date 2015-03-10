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
