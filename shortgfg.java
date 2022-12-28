
public class shortgfg {

	public static void main(String[] args) {
		int arr [] = {1,1,2,3,1,2,3}; int n = 7; 
		 String a = "1abc23"; System.out.println(Integer.parseInt(a)); 
//	       while (c<k) { 
//	           for (int i = 0; i<n-1-c; i++) {
//	               if (arr[i]>arr[i+1]) { int temp = arr[i+1] ; arr[i+1] = arr[i] ; arr[i] = temp;}
//	          } a[c] = arr[n-1-c];  c = c+1 ;   System.out.println( arr[n-1-c] + " " + a[c]);
//	      } 
  for (int i =0; i<n; i++) {int count = 1;
	  
	  for (int j =i+1; j<n; j++) { 
		  if (arr[i] == arr[j]) { count++;
			 
		  }  
	  } if (count%2!=0) {System.out.println(arr[i]); break;}
  }
	}

}
