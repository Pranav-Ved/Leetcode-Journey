class Solution {
    public int maxArea(int[] height) {
        int maxvol = 0;
        int l = 0;
        int r =  height.length - 1;
        int ch = 0;

        while(l < r){
            int w = r - l;
            
            if(height[l] < height[r] ){
                ch = height[l];
            } else {
                ch = height[r];
            }

            int cvol = w * ch ;
            if(cvol > maxvol){
                maxvol = cvol;
            }
            else{
                maxvol = maxvol;
            }

            if(height[l] < height[r]){
                l++;
            } else{
                r--;
            }
        }
        return maxvol;
    }
}