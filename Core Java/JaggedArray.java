public class JaggedArray {
    public static void main(String[] args) {
        int nums[][] = new int[3][];
        nums[0] = new int[2];
        nums[1] = new int[3];
        nums[2] = new int[4];

        for (int[] num : nums) {
            for (int j = 0; j < num.length; j++) {
                num[j] = (int)(Math.random() * 100);
            }
        }
        for(int n[]: nums){
           for(int m: n){
            System.out.print(m + " ");
           }
            System.out.println(); 
        }

        
    }
}
