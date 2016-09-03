import java.io.*;
class PRB01 {

	public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++) {
           
			int n = Integer.parseInt(br.readLine());
            int count = 0;

            for(int j=1;j<=n;j++) {	
               if (n%j==0)
               count++;	
            }	

            if (count == 2)
			    System.out.println("yes");
			else
			      System.out.println("no");
			}
		}
	}


