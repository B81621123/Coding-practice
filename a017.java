import java.util.LinkedList;
import java.util.Scanner;

public class a017 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String store = toPostfix(input.nextLine().split(" "));
			System.out.println(eval(store.split(" ")));
		}
	}
	
	private static int priority(String c) {
        return c.equals("+") || c.equals("-") ? 1 : c.equals("*") || c.equals("/") || c.equals("%") ? 2 : 0;
    }
	
	private static String toPostfix(String infix[]) {
		String output = "";
		LinkedList<String> stack = new LinkedList<>();
		
		for(String c : infix) {
			if(c.equals("(")) {
				stack.add(c);
			}
			else if("+-*/%".indexOf(c) != -1) {
				while(!stack.isEmpty() && priority(stack.getLast()) >= priority(c)) {
					output = output + stack.removeLast() + " ";
				}
				stack.add(c);
			}
			else if(c.equals(")")) {
				while(!stack.getLast().equals("(")) {
					output = output + stack.removeLast() + " ";
				}
				stack.removeLast();
			}
			else {
				output = output + c + " ";
			}
		}
		
		while(!stack.isEmpty()) {
			if(stack.size() == 1) {
				output = output + stack.removeLast();
				break;
			}
			output = output + stack.removeLast() + " ";
		}
		return output;
	}
	
	private static int cal(String op, int p1, int p2) {
        switch(op) { 
            case "+": return p1 + p2; 
            case "-": return p1 - p2; 
            case "*": return p1 * p2; 
            case "/": return p1 / p2;
            case "%": return p1 % p2;
            default:  throw new ArithmeticException(op + " not defined");
        }
    }
	
	public static int eval(String expr[]) {
		LinkedList<Integer> stack = new LinkedList<>();
		for(String c : expr) {
			if("+-*/%".indexOf(c) != -1) {
				int p2 = stack.removeLast();
				int p1 = stack.removeLast();
				stack.add(cal(c, p1, p2));
			} else {
				stack.add(Integer.parseInt(c));
			}
		}
		return stack.getLast();
	}
}