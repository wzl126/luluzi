package text;

public class romanToInt {
	public int romanToInt(String s) {
		int sum=0;
		int curnum=getValue(s.charAt(0));
		for(int i=1;i<s.length();i++)
		{
			int num=getValue(s.charAt(i));
			if(curnum<num)
			{
				sum=sum-curnum;
			}
			else 
			{
				sum=sum+curnum;
			}
			curnum=num;
		}
		sum=sum+curnum;
		return sum;
    }
	private int getValue(char ch)
	{
		switch(ch)
		{
		case 'I': return 1;
		case 'V': return 5;
		case 'X': return 10;
		case 'L': return 50;
		case 'C': return 100;
		case 'D': return 500;
		case 'M': return 1000;
		default: return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
