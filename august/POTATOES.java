import java.io.*;
class POTATOES {

	public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++) {

			String x1 = br.readLine();
            String len[] = x1.split(" "); 
            int x,y,count=0,sum=0,sum1=0,sums;
            
            x = Integer.parseInt(len[0]);
		    y = Integer.parseInt(len[1]);
             
            sum=x+y;
            sums=sum;

            for (int j=2; j<sum; j++) {
            	
            	if (sum%j == 0)
            		sum++;
            	else{
            		count = sum;
                    System.out.println("count " + count);
                    if (sum ==sums) {
                    	sum++;
                    	continue;
                    }  
            	}
            }   
                    sum1 = sums-count;
                    System.out.println(sum1);
        }
    }
}






			