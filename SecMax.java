class Solution {
    public static Integer secondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        return (second == Integer.MIN_VALUE) ? null : second;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};
        System.out.println(secondLargest(arr)); // 45
    }
}