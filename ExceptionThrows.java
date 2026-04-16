import java.util.*;

import java.io.*;
public class ExceptionThrows
{
    public static void main(String args[]) throws IOException
    {
        char ch;
        InputStreamReader inSR = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inSR);
        System.out.println("Enter character 'q' to quit");
        do{
            ch = (char)br.read();
            System.out.println(ch);
        }
        while(ch!='q');
        
        
    }
}