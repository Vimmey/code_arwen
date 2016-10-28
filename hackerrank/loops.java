import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class loops {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int table;
        for (int i=1; i<11; i++) {
            table = n*i;
            System.out.println(n+ " x " + i + " = " + table);
        }
    }
}
