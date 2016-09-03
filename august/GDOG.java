import java.io.*;
class GDOG {

	public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++) {

			String x = br.readLine();
            String len[] = x.split(" "); 
            int n,k;
            int r = 0;

            n = Integer.parseInt(len[0]);  
            k = Integer.parseInt(len[1]); 

            for(int j=2;j<=k;j++) {			
				if((n%j)>r) 
				   r=n%j;				
			}
			System.out.println(r);
		}
	}
}