class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int n=arr.length;
        int low=0, high=n-1,temp=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                temp=mid;
                high=mid-1;
            }
            
            else if(arr[mid]<k) {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return temp;
    }
}