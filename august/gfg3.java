//Find the Number Occurring Odd Number of Timesimport java.io.*;
import java.io.*;
import java.util.Arrays;
class gfg3
{
	public static void main(String args[]) throws IOException {
   	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

            //int n = Integer.parseInt(br.readLine());
            

            String x = br.readLine();
            String arr[] = x.split(" ");
            int n = arr.length;
            int a[] = new int[n];

             for ( int i=0; i<n; i++) {
                 a[i]=Integer.parseInt(arr[i]);
                //System.out.println(" " +a[i]); 
            }           
            
              for ( int i=0; i<n; i++) {
                   int count=0;
                for ( int j=i+1; j<n; j++) {

                 if ( a[i] == a[j]) {
                    count++;
                 }
                 }
                 if (count%2==0)
                 System.out.println(" " +a[i]);                    
                 
              }

    }
}
