class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int sum=0;
        int n=arr.length;
        if(n==0 || n==1) return -1;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            arr[i]=sum;
        }
        
        for(int i=1;i<n;i++){
            if(arr[i-1]==arr[n-1]-arr[i]){
                return i;
            }
        }
        return -1;
    }
}
