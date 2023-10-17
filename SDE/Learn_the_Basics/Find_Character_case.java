

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        // Character <---- Raw byte
        InputStreamReader is = new InputStreamReader(System.in);
        // buffer the input Stream from is
        BufferedReader bf = new BufferedReader(is);
        // readline will return String
        String inputRecived = bf.readLine();
        //System.out.println(inputRecived);
        char ch = inputRecived.charAt(0);
        if(ch >=97 && ch <= 122)
        {
            System.out.println("0");
        }
        else if (ch >=65 && ch <= 90)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("-1");
        }

    }

}

