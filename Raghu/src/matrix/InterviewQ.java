package matrix;

import java.util.*;

public class InterviewQ {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Count the number of string to be enterred");
		int n=in.nextInt();
		in.nextLine();
		ArrayList<String> ans=new ArrayList<String>(n);

		while(n>0) {
			String st=in.nextLine();
			String[] words = st.split(" ");
			String rs="";
			for(int i=0; i<words.length; i++) {
				if(isPalindrome(words[i])==true)
					continue;
				/* rs=rs + new StringBuilder(words[i]).reverse().toString()+" ";
	can be replaced with reversing the string		
				 */				for(int j=words[i].length()-1;j>=0;j--) {
					 rs=rs+words[i].charAt(j);
				 }
				 rs=rs+ " ";
			}
			ans.add(rs);
			n--;
		}
		for(Object obj:ans)
			System.out.println(obj);
	}

	private static boolean isPalindrome(String st) {
		int i=0,j=st.length()-1;
		while(i<j) {
			if(st.charAt(i)!=st.charAt(j))
				return false;
			i++;
			j--;
		}
		return false;
	}
}
