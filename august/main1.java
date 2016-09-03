import java.io.*;
class TOTR
{
 public static void main(String args[]) throws Exception
 { 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().trim().split(" ");
		int t = Integer.parseInt(str[0]);
		String a = str[1];
		String b = a.toUpperCase();
		for (int k=0; k<t; k++) {
		
			String s = br.readLine();
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)>='a'&&s.charAt(i)<='z')
				{
					System.out.print(a.charAt(s.charAt(i)-'a'));
				}
	 
				else if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
				{
					System.out.print((b.charAt(s.charAt(i)-'A')));
				}
				else
					System.out.print(s.charAt(i)=='_'?" ":s.charAt(i));
			}
			System.out.println();
	}
 }	
}    