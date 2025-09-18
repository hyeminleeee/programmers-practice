class Solution {
    public String solution(String code) {
        String answer = "";
        char[] arr=code.toCharArray();
        
        int mode = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == '1') {
                mode = 1 - mode;
            } else if(i % 2 == mode) {
                answer += arr[i] +"";
            }
        }
        
        if(answer.equals("")) {
            return "EMPTY";
        }
        return answer;
    }
}