class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() == 0 || s.length() == 1) return false;
        if (s.charAt(0) == ')' || s.charAt(0) == '}' ||  s.charAt(0) == ']') return false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' ||  s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                char c = s.charAt(i);
                if (stack.size() == 0) return false;
                if (c == '}' && stack.peek() != '{') {
                    return false;
                } else if (c == ']' && stack.peek() != '[') {
                    return false;
                } else if (c == ')' && stack.peek() != '(') {
                    return false;
                }
                if (stack.size() != 0) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (stack.size() == 0) return true;
        return false;
    }
}
