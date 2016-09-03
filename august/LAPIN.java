//Find the Number Occurring Odd Number of Timesimport java.io.*;
import java.io.*;
import java.util.Arrays;
class LAPIN
{
	public static void main(String args[]) throws IOException {
   	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            
            int t=Integer.parseInt(br.readLine());

            for (int k = 0; k < t; k++) {

            String x = br.readLine();
            char[] a,b;
            // String b="";
            int sum1=0,sum2=0;
            // int i=0;
            
            int n = x.length();
            int mid=(n/2)+1;

            if ( n%2==0) {
                a = x.substring(0,n/2).toCharArray();
                b = x.substring(n/2,n).toCharArray(); 
                

            } else {
               a = x.substring(0,n/2).toCharArray();
               b = x.substring((n/2)+1,n).toCharArray(); 
               
              }    
           
                Arrays.sort(a);
                Arrays.sort(b);
                boolean ans = Arrays.equals(a, b);
                if(ans){
                  System.out.println("YES");
                } else{
                  System.out.println("NO");
                }            
      }
    }
}
