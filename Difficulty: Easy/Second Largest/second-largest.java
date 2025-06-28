class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=-1;
        int ans=-1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<max && ans<arr[i]){
                ans=arr[i];
            }
            else if(arr[i]>max){
                ans=max;
                max =arr[i];
            }
            
        }
        return ans;
    }
}