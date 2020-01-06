package implementationUsingArrays;
public class Stack {
	int index = -1;
	int[] numbers = new int[20];
	
	public void stackPush(int data) {
		index +=1;
		numbers[index] = data;
	}
	
	public void stackPop() {
		numbers[index] = 0;
		index -=1;
	}
	
	public int stackPeek() {
		return numbers[index];
	}
	
	public int stackLengh() {
		return index;
	}
	
	public void stackRead() {
		System.out.print("[");
		int i = index;
		while(i != -1) {
			if(i == 0) {
				System.out.print(numbers[i] + "]");
			}
			else {
				System.out.print(numbers[i]+ " , ");
			}
			i--;
		}
		
		System.out.println();
	}

}
