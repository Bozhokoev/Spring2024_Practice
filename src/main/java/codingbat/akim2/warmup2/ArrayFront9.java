package codingbat.akim2.warmup2;

public class ArrayFront9 {
    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            if(nums.length <= 2 && nums[i] == 9){
                return true;
            }
        }
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i]==9){
                return true;
            }
        } return false;
    }
}
