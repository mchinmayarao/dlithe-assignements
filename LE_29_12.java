package Assignments;



public class LE_29_12 {
	public static int[] findArraySum(int[] a, int n, int[] b, int m) {
		int ans[] = new int[Math.max(n, m)];
		int carry = 0;
		int sum = 0;
		int k = ans.length - 1;
		int i = n - 1;
        int j = m - 1;
        
		while (i >= 0 || j >= 0) {
			sum = 0;
            
          
			if (i >= 0) {
				sum += a[i];
				i--;
			}
            
          
			if (j >= 0) {
				sum += b[j];
				j--;
			}
            
			sum += carry;
			int lastDigit = sum % 10;
			carry = sum / 10;
			ans[k--] = lastDigit;
		}
        
       
		if (carry != 0) {
			int[] newAns = new int[ans.length + 1];
			newAns[0] = carry;
            
			for (int p = 1; p < newAns.length; p++) {
				newAns[p] = ans[p - 1];
			}
			return newAns;
		}
		return ans;
	}

}
