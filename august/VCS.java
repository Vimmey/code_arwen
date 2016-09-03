import java.io.*;
class VCS {

	public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++) {

			String x1 = br.readLine();
            String len1[] = x1.split(" "); 
            int n,m,k,count1=0,count2=0;

            n = Integer.parseInt(len1[0]);  
            m = Integer.parseInt(len1[1]); 
            k = Integer.parseInt(len1[2]); 

            int a[] = new int[m];
            int b[] = new int[k];
            int c[] = new int[n];
            
            String x2 = br.readLine();              
            String len2[] = x2.split(" ");

            String x3 = br.readLine();  
            String len3[] = x3.split(" ");


            for (int j=0; j<m; j++)  {                
                a[j] = Integer.parseInt(len2[j]); 
            }      

            for (int j=0; j<k; j++)  {                
                b[j] = Integer.parseInt(len3[j]); 
            }      

            int p=1,l=0,j=0,q=0;
           
                
             while (l<m)  { 
                if (a[l] == p) {
                   c[l] = 1; 
                   l++;
                } else
                  p++;
            }
            
            for (int s=0; s<m; s++)  { 
                System.out.println(c[s]);
            }
               

            while (j<k)  { 
                if (a[j] == q) {
                    c[j] = 1; 
                    l++;
                } else
                  q++;
            }
            for (int s=0; s<k; s++)  { 
                System.out.println(c[s]);
            }


            for (int s=0; s<n; s++)  { 
                if (c[s] == 1)
                    count1++;
                else
                    count2++;
                              
                
            }
                    
            System.out.println(count1+" "+count2);  
       }
    } 
}



