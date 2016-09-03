import java.io.*;
class TEST {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(n != 42) {
			System.out.println(n);
			n = Integer.parseInt(br.readLine());
		}
	}
}
