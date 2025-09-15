class Solution {
    public int solution(int a, int b) {
        String ab = String.valueOf(a) + String.valueOf(b);
        int num = 2 * a * b;
        if(Integer.parseInt(ab) > num) {
            return Integer.parseInt(ab);
        } else if(Integer.parseInt(ab) == num) {
            return Integer.parseInt(ab);
        } else {
            return num;
        }
    }
}