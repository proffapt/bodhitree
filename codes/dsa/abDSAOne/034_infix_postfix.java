import java.util.*

class Main {
  public static void main(String[] args) {
    
  }

  static int evalPostfix(String expression){
    ArrayDeque<Character> stack = new ArrayDeque<>();
    for (char c : expression.toCharArray()) {
      if (/*Is not an operator*/)
        stack.push(c);
      else {
        
      }
    }
  }
}
