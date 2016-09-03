import java.io.*;
class CHCHCL {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int k=0; k<t; k++)  {
        	String x = br.readLine();
        	String ch[] = x.split(" ");

            int m = Integer.parseInt(ch[0]);
            int n = Integer.parseInt(ch[1]);

            if ((n*m-1)%2==0)
                System.out.println("No"); 
            else
                System.out.println("Yes");  
        }
    }
}


