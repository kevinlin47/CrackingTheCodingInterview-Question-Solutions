package pkg.stack;

public class StackDriver {



	public static void main(String[] args) {
		
		Stack<Integer> myStack=new Stack<Integer>();
		
		for (int i=0;i<20;++i)
		{
			myStack.push(i);
		}
		
		System.out.println(myStack.peek());
		System.out.println(myStack.isEmpty());
		
		for (int i=0;i<20;++i)
		{
			System.out.print(myStack.pop()+" ");
		}

	}

}
