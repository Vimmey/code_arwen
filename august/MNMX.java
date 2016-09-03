import java.io.*;
import java.util.Arrays;
class MNMX {

	public static void main(String agrs[]) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

		for (int k=0; k<t; k++) {

            int n = Integer.parseInt(br.readLine());
            String len[] = br.readLine().split(" "); 

		    long a[]= new long[n];  
		    long min=0;

		    for (int i=0; i<n; i++) {		
			    a[i] = Integer.parseInt(len[i]); 
			}

		    for(int j=0; j<n; j++) {		    
	       
		        if(j == 0) 		        
		           min = a[0];
		        
		        else {
		        	if(a[j]<min) {
		            
		              min=a[j];
		            }  
		        }
		    }
			System.out.println(min*(n-1));

		}
	}
}

		