
public class String1 {

	 public static String getSmallestAndLargest(String s,int k) {
	        String smallest = "";  String largest  = "";
//	         String a [] = new String[s.length()-k+1];
//	        for (int i = 0; i<s.length()-k+1; i++) { a[i] = s.substring(i,i+k);   } 
//	        for (int p=0; p<s.length()-k; p++) {if (a[p].compareTo(a[p+1])>=0) { String temp = a[p+1]; a[p+1] = a[p]; a[p] = temp;
//	         largest = a[p+1]; } }
//        for (int q=0; q<s.length()-k; q++) {if(a[q].compareTo(a[q+1])<0) { String temp = a[q+1]; a[q+1] = a[q]; a[q] = temp;
//	        smallest = a[q+1]; } }
	         smallest = s.substring(0,k);
	       
	        for(int i=0;i<s.length()-k+1;i++){
	        if(s.substring(i,i+k).compareTo(smallest) <0) smallest = s.substring(i,i+k);
	        if(s.substring(i,i+k).compareTo(largest) >0) largest = s.substring(i,i+k); 
	                }
	         
	        return smallest + "\n"+ largest;
	        
	    }
	public static void main(String[] args) {  System.out.println(getSmallestAndLargest("asdgfdgdfg",4));
	}

}
