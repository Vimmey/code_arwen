import java.io.*;
class MOVIEWKN {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int j=0; j<t; j++)  {
        	
            int n = Integer.parseInt(br.readLine());
            int l[] = new int[n];
            int r[] = new int[n];
            int rate = r[0];
            int max = 0,index=0;
           
              
        	String x= br.readLine();
            String len[] = x.split(" ");       
                 
            
            String y = br.readLine();
            String rt[] = y.split(" ");                
          
                        
            for (int i=0; i<n; i++)  {
            	l[i] = Integer.parseInt(len[i]);  
            	r[i] = Integer.parseInt(rt[i]); 

			 	if (l[i] * r[i] > max) {
				max = l[i] * r[i];
				index = i;
				rate = r[i];
			    } else if (l[i] * r[i] == max) {

				  if (r[i] > rate) { 
					rate = r[i];
					index = i;
				}
			}
		}
        System.out.println(index+1);
      }
  }
}

            