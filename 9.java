class Solution {
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        String newString = "";
        for(int i = num.length() - 1; i >= 0; i -= 1){
            newString += num.charAt(i);
        }
        if(newString.equals(num)){return true;}
        else {return false;}
    }
}
