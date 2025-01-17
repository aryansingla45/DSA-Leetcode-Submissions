class BitwiseXORofAllPairings {
    public int xorAllNums(int[] nums1, int[] nums2) {

        int l1 = nums1.length;
        int l2 = nums2.length;

        int xor = 0;
        
        if(l2 % 2 != 0){
            for(int num : nums1){
                xor ^= num;
            }
        }

        if(l1 % 2 != 0){
            for(int num : nums2){
                xor ^= num;
            }
        }

        return xor;
        
    }

    public static void main(String args[]){
        
    }
}
