import java.util.Scanner;

public class marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int [] arr = {15,2,16,10,18,6,11,19,193,1,7,20,4,4,8,18}; int n = arr.length;
		 int x =0,y=0; String str =""; String s =""; boolean t =false;
	        for(int i=0;i<n;i++)
	           { x=Math.max(x,arr[i]); y=Math.min(y,arr[i]);
	               str = str+Integer.toString(arr[i]);
	           }System.out.println(str);
	        for(int i=y;i<=x;i++)  { s = s+Integer.toString(y); y++;} System.out.println(s);
	        for(int i=0;i<s.length()-1;i++){
	            if(str.contains(s.substring(i,i+1))) t=true;
	            else  {System.out.println("No"); break;}
	            }if ((str.contains(s.substring(s.length()-1)))==false) t=false;
	    if(t) System.out.println("yes");
	    else System.out.println("No");
	}

}
