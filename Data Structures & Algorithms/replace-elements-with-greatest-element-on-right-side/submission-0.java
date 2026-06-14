class Solution {
    public int[] replaceElements(int[] arr) {
        int local_max = arr[arr.length-1];
        arr[arr.length-1] = -1;
        for(int i = arr.length - 2; i>=0; i--){
            int temp = arr[i];
            arr[i] = local_max;
            local_max = Math.max(local_max, temp);
        }

        return arr;
    }
}