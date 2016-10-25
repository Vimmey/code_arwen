import java.io.*;

class helloWorld {

    public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        String s =br.readLine();

        System.out.println ("Hello world" + "\n" + s);
    }
}