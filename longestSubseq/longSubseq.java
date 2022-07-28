package longestSubseq;

public class longSubseq {
	
		static int lis(int arr[], int n)
	    {
	        int lis[] = new int[n];
	        int i, j, max = 0;
	 
	        for (i = 0; i < n; i++)
	            lis[i] = 1;
	 
	        
	        for (i = 1; i < n; i++)
	            for (j = 0; j < i; j++)
	                if (arr[i] > arr[j] && lis[i] <= lis[j])
	                    lis[i] = lis[j] + 1;
	 
	        
	        for (i = 0; i < n; i++)
	            if (max < lis[i])
	                max = lis[i];
	 
	        return max;
	    }
		public static void main(String args[]) {
			
			int arr[] = { 22, 9, 33, 21, 50, 41, 60, 80};
			int n = 8;
			System.out.println("The longest increasing subsequence : "+lis(arr, n));
		}
}
