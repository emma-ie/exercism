class ReverseString {

    String reverse(String inputString) {
        StringBuilder sb = new StringBuilder();
        char[] stringArr = inputString.toCharArray(); 
        int len = stringArr.length;
        
        for (int i = 1; i <= len; i++){
            sb.append(stringArr[len - i]);
        }
        
        return sb.toString();
    }
}
