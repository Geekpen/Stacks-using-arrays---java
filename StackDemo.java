package implementationUsingArrays;

public class StackDemo {

	public static void main(String[] args) {
		Stack numbers = new Stack();
		
		numbers.stackPush(1);
		numbers.stackPush(2);
		numbers.stackPush(3);
		numbers.stackPush(4);
		numbers.stackPush(5);
		
		numbers.stackRead();
		
		numbers.stackPop();
		
		numbers.stackRead();
		
		System.out.println(numbers.stackPeek());
		
		numbers.stackRead();

	}

}
