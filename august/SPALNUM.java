import java.io.*;
class SPALNUM {

	public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++) {

			String x = br.readLine();
            String len[] = x.split(" ");            
            int l,r,y,sum=0,count=0,sum1=0;
            
           
			l = Integer.parseInt(len[0]);
			r = Integer.parseInt(len[1]);
			
			int p = l;
 
		    while (l<=r) {
		   	    int q=l;
			    while (q>0)	{   
				   y = q%10;  
				   sum=(sum*10)+y;    
				   q=q/10;
			    }
			    System.out.println(sum);

			    if ( sum == p)	
			       sum1 = sum1 + p;	 
			    l++;
			}
			System.out.println(sum1);

		}
	}
} 


			  