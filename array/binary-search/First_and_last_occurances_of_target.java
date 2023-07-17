class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1}; 
        
        //function call
        ans[0] = binarySearch(nums, target, true);
        ans[1] = binarySearch(nums, target, false);

        return ans;
        
    }

    public int binarySearch(int[] nums, int target, boolean startIndex) {
        int start = 0;
        int end = nums.length-1;
        int result = -1; //initially result is -1, if not found anything return this

        //start binary search
        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid]>target){
                end = mid-1;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            //Below condition executes if mid==target
            else{
                // if we got a target, then just update the result
                result = mid;

                //if we want to find the start index then traverse towards left 
                //by making end = mid-1, so that there may be occourances of the target

                if(startIndex){ // if we need the start index / first occourances
                    end = mid-1;
                }
                else{ // if we need the last index / last occourances
                    start = mid+1;
                }
                
            }

        } //while closes if start is > end
        return result; // return result if we found the occourances else -1 will be returned
    }


}