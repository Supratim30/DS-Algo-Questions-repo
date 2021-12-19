import java.util.*;
// Algorithm for Prefix to Infix: 

// Read the Prefix expression in reverse order (from right to left)
// If the symbol is an operand, then push it onto the Stack
// If the symbol is an operator, then pop two operands from the Stack 
// Create a string by concatenating the two operands and the operator between them. 
// string = (operand1 + operator + operand2) 
// And push the resultant string back to Stack
// Repeat the above steps until end of Prefix expression.
class Main {
  public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
String exp = scn.nextLine();

int l = exp.length();

Stack<String> str = new Stack<>();

for(int i = l-1;i>0;i--){
char ch = exp.charAt(i);

if (isOperator(ch)){

  String b = str.pop();
  String a = str.pop();
  String temp = a+ch+b;

  str.push(temp);
}else{
  str.push(ch+" ");
}

}
System.out.println(str.pop());
}
  
  static boolean isOperator(char x){
    switch(x){
      case '+':
      case '-':
      case '*':
      case '/':
           return true;
    }
    return false;
  }
}
