import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) {
    	String line = "abca.nmh"; 
    	 int al [] =  new int[256];  char ch='e';
         for (char c : line.toCharArray()){
             int index = (int)c; al[index]++; 
         } int x =0;
         for (int i=0; i<256; i++) x=Math.max(x,al[i]);
         for (int i=0; i<256; i++) {
             if (al[i]==x)  {ch = (char)i; System.out.println(i);break;}
    } System.out.println(x);
       System.out.println(ch);
    }}