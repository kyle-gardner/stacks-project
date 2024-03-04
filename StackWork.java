// package textbook;

public class StackWork {
	private int[] S0;
	private int S0top;
	private int S0length;

	private int[] S1;
	private int S1top;
	private int S1length;

	private int[] S2;
	private int S2top;
	private int S2length;

	// Precondition: S0size, S1size, and S2size are greater than 0.
	// Postcondition: The stacks S0, S1, and S2, are created, 
	// 				  and their respective lengths are initialized.
	public StackWork(int S0size, int S1size, int S2size) {
		if (S0size > 0 && S1size > 0 && S2size > 0) {
			S0 = new int[S0size];
			S0length = 0;
			S0top = 0;

			S1 = new int[S1size];
			S1length = 0;
			S1top = 0;
			
			S2 = new int[S2size];
			S2length = 0;
			S2top = 0;
		}
	}

	// Precondition: StackSelector is equal to 0, 1, or 2.
	// Postcondition: If StackSelector is 0, then the new element x is inserted is stack S0. If StackSelector is 1,
	// then the new element x is inserted in stack S1. If StackSelector is 2, then the new element x is inserted in stack S2.
	public void Push(int StackSelector, int x) {
		if (StackSelector == 0) {
			S0[S0top] = x;
			S0top++;
		} else if (StackSelector == 1) {
			S1[S1top] = x;
			S1top++;
		} else if (StackSelector == 2) {
			S2[S2top] = x;
			S2top++;
		}
	}

	// Precondition: StackSelector is equal to 0, 1, or 2.
	// Postcondition: If StackSelector is 0, then an element is taken out of stack
	// S0 and is returned to the caller.
	// If StackSelector is 1, then an element is taken out of stack S1 and is
	// returned to the caller.
	// If StackSelector is 2, then an element is taken out of stack S2 and is
	// returned to the caller.

	public int Pop(int StackSelector) {
		int toReturn;
		if (StackSelector == 0) {
			toReturn = S0[S0top];
			S0top--;
			return toReturn;
		} else if (StackSelector == 1) {
			toReturn = S1[S1top];
			S1top--;
			return toReturn;
		} else if (StackSelector == 2) {
			toReturn = S2[S2top];
			S2top--;
			return toReturn;
		}
		throw new ArrayIndexOutOfBoundsException();
	}

	// Precondition:
	// Postcondition: The elements of the stack S0 are displayed, followed by the
	// elements of the stack S1, and in the end
	// the elements of the Stack S2.
	public void displayStackData() {
		System.out.println("S0 data:");
		for (int i : S0) {
			System.out.println(i);
		}
		
		System.out.println("\nS1 data:");
		for (int i : S1) {
			System.out.println(i);
		}

		System.out.println("\nS2 data:");
		for (int i : S2) {
			System.out.println(i);
		}
	}

	// Precondition: The StackWork object exists.
	// Postcondition: The instance variable S0top is returned.
	public int getS0top() {
		return S0top;
	}
}