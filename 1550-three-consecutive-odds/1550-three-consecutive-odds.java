class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n =  arr.length;
        for(int i = 0; i < (n - 2); i++){
            int n1 = arr[i];
            int n2 = arr[i+1];
            int n3 = arr[i+2];
            if(n1 % 2 != 0 && n2 % 2 != 0 && n3 % 2 != 0){
                return true;
            }
        }

        return false;
    }
}