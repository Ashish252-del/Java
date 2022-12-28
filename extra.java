
public class extra {

	public static void main(String[] args) {
		 String A = ""; int n = 8;int a[]= {5,13,14,15,51,59,83,97}; int b[]= {13,14,15,51,59,83,97}; 
	        for(int i =0; i<n-1; i++)
	            A = A+Integer.toString(b[i])+" "; System.out.println(A); System.out.println(A.charAt(0));
	        for(int i =0; i<n; i++){
	            if(A.contains(Integer.toString(a[i]))==false) System.out.println(i);
	        }
	}

}
