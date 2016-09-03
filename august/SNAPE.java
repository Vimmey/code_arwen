import java.io.*;
class SNAPE {

	public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++) {

			String x= br.readLine();
            String len[] = x.split(" ");            
            int b,ls;
            double rs1,rs2;
           
			b = Integer.parseInt(len[0]);
			ls = Integer.parseInt(len[1]);			

			rs1 = Math.sqrt((b*b)+(ls*ls));
			rs2 = Math.sqrt(Math.abs((b*b)-(ls*ls)));			

			System.out.println(rs2 + " " + rs1);
		}
	}
}








