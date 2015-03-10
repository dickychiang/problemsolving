public class FunnyFence {

    public int getLength(String s)
    {
        boolean x;
        int temp = 1;
        int ret = 0;
	//int length = s.length;
	
	//String[] reverse;
	//reverse = new String[50];
	//reverse = s;
	//x = (reverse[0] == "|")? true : false;
	  
        System.out.println("s.length() =" +s.length());
        for( int i = 0; i < s.length(); i++)
        {
        /*
            if (reverse[i] == "-" && x == true) {
                temp++;
                x = false;
            } else if (reverse[i] == "|" && x == false) {
                temp++;
                x = true;
            } 
            else
            {
                if (temp > ret)
                    ret = temp;
                temp = 1;
            }
            */
        }
        if (temp > ret) ret = temp;
        return ret;
    }
}
