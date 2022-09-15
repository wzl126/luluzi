package text;

public class ispalindrome {
	public boolean isPalindrome(int x) {
		if(x<0)
			return false;
		String s=x+"";
		int front=0;
		int behind=s.length()-1;
		while(front<behind)
			if(s.charAt(front++)!=s.charAt(behind--))
				return false;
		return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
