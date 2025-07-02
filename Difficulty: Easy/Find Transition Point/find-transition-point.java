class Solution {
    int transitionPoint(int arr[]) {
        // code here
        int n=arr.length;
        if(arr[0]==1) return 0;
        if(arr[n-1]==0) return -1;
        int low=0, high=n-1, saddle=-2;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==1){
                saddle=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return saddle;
    }
}