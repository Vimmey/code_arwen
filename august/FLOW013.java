import java.io.*;
class FLOW013 {

	public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++) {

			String x = br.readLine();
            String len[] = x.split(" "); 
            int sum =0,a,b,c;

            a = Integer.parseInt(len[0]);  
            b = Integer.parseInt(len[1]);  
            c = Integer.parseInt(len[2]); 


            if (a == 0 || b == 0  || c == 0)
			    System.out.println("NO");
			else {
				sum = a+b+c;
				if (sum == 180)
			      System.out.println("YES");
			    else
			    System.out.println("NO");
			}
		}
	}
}




