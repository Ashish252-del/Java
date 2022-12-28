package imochaquestions;

import java.util.Scanner;

public class printPosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int nums[] = new int[n];
		for(int i =0; i<n; i++) nums[i] = sc.nextInt();
		int l =0, h = nums.length-1;
        int max = Integer.MIN_VALUE;
        int ans = 0;
        while(h>=l){
            int mid = (l+h)/2;
            if (nums[mid]>=nums[l]){ if(nums[mid]>max) {ans = mid+1; max = nums[mid];}
                                 l=mid+1;}
            else  if (nums[mid]<=nums[h]) { if(nums[h]>max) {ans = h+1; max = nums[h];}
                                 h=mid-1;}
        
            

	}
        System.out.println(ans);

}
}
