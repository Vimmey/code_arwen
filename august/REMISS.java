import java.io.*;
class REMISS {

	public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++) {

			String x= br.readLine();
            String len[] = x.split(" "); 

            int a = Integer.parseInt(len[0]);
			int b = Integer.parseInt(len[1]);	   

			System.out.println(Math.max(a,b) + " " + (a+b));
		}

	}      
}