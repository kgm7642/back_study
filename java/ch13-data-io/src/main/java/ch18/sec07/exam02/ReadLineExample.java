package ch18.sec07.exam02;

import java.io.*;

public class ReadLineExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader
                (new FileReader("c:/temp/test3.txt"));
        int lineNo = 1;
        while(true) {
            String str = br.readLine();
            if(str == null) break;
            System.out.println
            (lineNo++ + ": " + str);
        }
        br.close();
    }
}
