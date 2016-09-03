import java.io.*;
class FRUITS {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int j=0; j<t; j++)  {
        	String x= br.readLine();
            String fr[] = x.split(" ");

            int m = Integer.parseInt(fr[0]);
            int n = Integer.parseInt(fr[1]);
            int k = Integer.parseInt(fr[2]);

            int diff = 0;

            int p =Math.abs(m-n);
            if (p>k)
              System.out.println(p-k);
            else
            System.out.println("0");



        //     while (k>0) {
        //     	if (n>m)
        //     		m++;
        //     	else
        //     		n++;
        //     	k--;
        //     	diff = n-m;
        //     	if (diff == 0)
        //     	break;
        //     }
             
        //     System.out.println(Math.abs(diff));
        }
    }
}




