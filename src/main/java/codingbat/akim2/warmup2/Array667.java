package codingbat.akim2.warmup2;

public class Array667 {
    public int array667(int[] nums) {
        int countSix = 0;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == 6 && nums[i+1] == 6 || nums[i] == 6 && nums[i+1] == 7){
                countSix++;
            }
        } return countSix;
    }
}
