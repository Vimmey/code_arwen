import java.io.*;
class RECIPE {

	public static void main(String agrs[]) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int j=0; j<t; j++)  {
        	int count = 0;
        	String x= br.readLine();
            String len[] = x.split(" ");
            int n = Integer.parseInt(len[0]);
            int r[] = new int[n];
            int a[] = new int[n];


            for (int i=0; i<n; i++)  {
            	r[i] = Integer.parseInt(len[i+1]);
            	//System.out.println(r[i]);

            }
            int smallest = r[0];
            for (int i = 1; i < n; i++) {
                if (r[i] < smallest) {
                smallest = r[i];
            }
        }
           //System.out.println(smallest);


            for (int i=0; i<n; i++)  {
            	if (r[i] % smallest == 0) 
            	count++; 
            }

            for (int i=0; i<n; i++)  {            

                if (count == n) {
                   a[i] = (r[i] / smallest);
            	   System.out.print(a[i] + " ");
            	} else
            	   System.out.print(r[i] + " ");

            }
            	System.out.println();

		}

	}
}
            	