class Solution {
    public int maximumWealth(int[][] arr) {
        
        int maxWealth = 0 ;
        for(int i = 0 ; i<arr.length ; i++){

            int currentCustomerWealth = 0;

            for(int j = 0 ;j < arr[i].length ;j++){
                currentCustomerWealth += arr[i][j];

            }
            if(currentCustomerWealth > maxWealth){

                maxWealth = currentCustomerWealth;
            }
        }
        return maxWealth;
    }
}