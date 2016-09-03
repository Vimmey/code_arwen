//Given an array A[] and a number x, check for pair in A[] with sum as x
import java.io.*;
import java.util.Arrays;
class gfg1
{
	public static void main(String args[]) throws IOException {
   	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());
            int sum = Integer.parseInt(br.readLine());
            int a[] = new int[n];

            for (int i = 0; i < n; i++) {

                 //String arr[] = x.split(" ");                 
			     
				 a[i] = Integer.parseInt(br.readLine());	
				 //System.out.println(a[i]);  
               
            }

                 Arrays.sort(a);

                 int l = 0;
                 int r = n-1; 
                 while (l < r)
                  {
                    if(a[l] + a[r] == sum) {
                       System.out.println(a[l] + " " + a[r]);  
                       l++;
                       r--;
                    } 
                    else if(a[l] + a[r] < sum)
                    l++;
                    else 
                    r--;
                  }
    }    
}
