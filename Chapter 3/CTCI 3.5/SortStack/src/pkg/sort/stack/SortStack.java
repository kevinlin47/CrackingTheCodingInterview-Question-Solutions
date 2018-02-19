package pkg.sort.stack;
import java.util.*;

public class SortStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		//Create original stack to sort
		Deque<Integer> stack1=new ArrayDeque();
		
		//Create a temporary stack
		Deque<Integer> stack2=new ArrayDeque();
		
		//I will use a queue to print the original stack 
		Deque<Integer> queue=new ArrayDeque();
		
		//Push 10 random values into stack 1
		Random rn=new Random();
		
		for (int i=0;i<10;++i)
		{
			Integer randomValue=rn.nextInt(100);
			stack1.push(randomValue);
			queue.addLast(randomValue);
		}
		
		//display values in original stack
		while(queue.size()>0)
		{
			System.out.print(queue.removeFirst()+" ");
		}
		
		//Stack sorting algorithm
		if (stack1.size()==0)
		{
			throw new EmptyStackException();
		}
		else
		{	
			while(stack1.size()>0)
			{
				int temp=stack1.pop();
				
				while (stack2.size()>0 && temp<stack2.peekFirst())
				{
					stack1.addFirst(stack2.removeFirst());
				}
				
				stack2.addFirst(temp);
			}
			
			while (stack2.size()>0)
			{
				stack1.addFirst(stack2.removeFirst());
			}
			
		}
		
		//display our sorted stack
		System.out.println();
		while(stack1.size()>0)
		{
			System.out.print(stack1.removeFirst()+" ");
		}

	}

}
