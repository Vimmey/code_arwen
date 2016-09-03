import java.io.*;
import java.util.Arrays;

class ERROR {

    public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for (int k=0; k<t; k++) {

            String x = br.readLine();
            int count = 0;

            for(int i=0;i<x.length()-2;i++){
			    if((x.charAt(i)=='1' && x.charAt(i+1)=='0' && x.charAt(i+2)=='1')||
				   (x.charAt(i)=='0' && x.charAt(i+1)=='1' && x.charAt(i+2)=='0')) {
                    
                    count++;
				    break;
				} 
			}

				if (count>0)
					System.out.println("Good");
					else
                    System.out.println("Bad");

			
		}
	}
}

	