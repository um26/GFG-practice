// User function Template for Java

class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        // int max=0;
        // for(int j=0;j<=arr.length-k;j++){
        //     int sum=0;
        //     for(int i=j;i<j+k;i++){
        //         sum+=arr[i];
        //     }
            
        //     if(sum>max){
        //         max=sum;
        //     }
        // }
        // return max;
        
        int sum=0;
        int n=arr.length;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int max=sum;
        for(int i=k;i<n;i++){
            sum+=arr[i]-arr[i-k];
            max=Math.max(sum,max);
        }
        return max;
    }
}