class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        Map<Integer,Integer> hash= new HashMap<>();
        int n=arr.length, sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            arr[i]=sum;
        }
        for(int i=0;i<n;i++){
            if(arr[i]==0) return true;
            if(hash.containsKey(arr[i])){
                return true;
            }
            else{
                hash.put(arr[i],1);
            }
        }
        return false;
    }
}