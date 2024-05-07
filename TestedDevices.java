class TestedDevices {
    public int countTestedDevices(int[] nums) {
        int count = 0;
        int red = 0;

        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i]-red;
            if(nums[i]>0){
                count++;
                red++;
            }
        }
        return count;
    }
}
