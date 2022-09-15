package text;

public class lengthOfLastWord {
	public int lengthOfLastWord(String s) {
		int count=0;
		if(s.length() == 0)
		{
			return 0;
		}
		for(int i=s.length()-1; i>=0; i--)
		{
			if(s.charAt(i)==' '&& count!=0)
			{
				return count;
			}
			else if(s.charAt(i)==' ')
			{
				count=0;
			}
			     else 
			     {
				     count++;
			     }
		}
		return count;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
