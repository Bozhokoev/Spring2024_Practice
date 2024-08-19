package codingbat.akbar.warmup2;

public class ArrayFront9 {
    public boolean arrayFront9(int[] nums) {
        boolean res = false;
        if(nums.length <= 4){
            for(int i = 0; i < nums.length; i++ ){
                if(nums[i]==9){
                    res = true;
                }
            }

        }
        else{
            for(int i = 0; i < 4; i++ ){
                if(nums[i]==9){
                    res = true;
                }
            }
        }
        return res;
    }
}
