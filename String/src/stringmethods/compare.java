package stringmethods;

public class compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="csk";
		String s2="csk";
		int c=0;
		//char[] str1=s1.toCharArray();
		//char[] str2=s2.toCharArray();
		System.out.println(s1.length());
		if(s1.length()==s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)==s2.charAt(i))
				{
					c++;
				}
			}
		}
		/*if(str1==str2)
		{
			for(int i=0;i<str1.length;i++) {
				if(str1[i]==str2[i])
				{
					c++;
				}
			}
		}*/
if(c==s1.length()) {
	System.out.println("same");
}
	else {
		System.out.println("diff");
	}
}
	}


