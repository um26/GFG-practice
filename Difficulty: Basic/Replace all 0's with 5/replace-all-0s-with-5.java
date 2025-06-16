class Solution {
    int convertfive(int num) {
        // Your code here
        int sum=0;
        int flag=1;
        if(num==0) sum=5;
        else{
            for(int i=num;i>0;i/=10){
                int s=i%10;
                if(s==0){
                    s=5;
                }
                sum=sum+s*flag;
                flag*=10;
            }
        }
        return sum;
    }
}