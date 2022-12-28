import java.util.Scanner;

public class Placement {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         while(t-->0)
             {
                 String s = sc.next();
                 Solu ob = new Solu();
                System.out.println(ob.newIPAdd(s));
             }
     }
}// } Driver Code Ends


//User function Template for Java

class Solu
{
 public String newIPAdd(String S)
 {
     String str [] = S.split("\\.");
     String s = ""; System.out.println(str.length);
     for(int i =0; i<str.length; i++){
    	 System.out.println(str[i]); boolean a = false;
        for(int j=0; j<str[i].length(); j++){ 
            if((str[i].charAt(j))>'0') 
            {s=s+str[i].substring(j,str[i].length()); a=true;}
            else if (a==false&&j==str[i].length()-1) s=s+'0';
        } 
     }
     return s;
 }


}
