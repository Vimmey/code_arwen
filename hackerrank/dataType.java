import java.io.*;

class dataType {

    public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        int i = 4;
        double d = 4.0;
        String s = "Hackerank";

        int i1 = Integer.parseInt(br.readLine());
        double d1 = Double.parseDouble(br.readLine());
        String s1 = br.readLine();

        System.out.println (i+i1);
        System.out.println (d+d1);
        System.out.println (s+" " +s1);
    }
}


