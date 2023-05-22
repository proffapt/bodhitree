import java.util.*;

class Main {
  public static void main(String[] args) {
    String s = "([{[]}])";
    System.out.println(parenthesis_checker(s));
  }

  // Remember the 1:3 conditions
  static boolean parenthesis_checker(String exp) {
    Deque<Character> s = new ArrayDeque<>();

    for (char c : exp.toCharArray()) {
      if (isOpening(c)) // Opening bracket mila stack mein dala
        s.push(c);
      else { // Closing bracket mila
        if (s.isEmpty()) { // Lekin stack khali hai
          return false;
        } else if (!isMatching(c, s)) { // Lekin stack mein pair nahi hai
          return false;
        } else { // Stack mein pair bhi hai
          s.pop();
        }
      }
    }
    return s.isEmpty();
  }
  // Storing out these conditions in a separate function to make the code look cleaner

  static boolean isOpening(char c){
    // Spaces don't matter ¯\_(ツ)_/¯ 
    return c == '(' || 
           c == '[' || 
           c == '{';
  }

  static boolean isMatching(char c, Deque<Character> s){
    return (c == ')' && s.peek() == '(') ||
           (c == ']' && s.peek() == '[') ||
           (c == '}' && s.peek() == '{');
  }
}
