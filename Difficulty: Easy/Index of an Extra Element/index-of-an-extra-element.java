/*Complete the function below*/
class Solution {
    public int findExtra(int a[], int b[]) {
        // add code here.
        int n=b.length;
        int low=0, high=n-1,ans=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(a[mid]==b[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
                ans=mid;
            }
        } return ans;
    }
}