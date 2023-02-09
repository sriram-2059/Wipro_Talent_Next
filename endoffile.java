import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
              Scanner sc = new Scanner(System.in);
               int c =1;
               while(sc.hasNext()){
               String s = sc.nextLine();
               System.out.println(c+" "+s);
               c++;
            }
        }
   }
   
   
   
   
   
   #sample input
   
 Hello world
 I am a file
 Read me until end-of-file.
 
 #sample output
 
 1 Hello world
 2 I am a file
 3 Read me until end-of-file.
