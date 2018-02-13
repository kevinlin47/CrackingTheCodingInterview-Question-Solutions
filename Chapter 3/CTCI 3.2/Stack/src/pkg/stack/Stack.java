package pkg.stack;
import java.util.*;

public class Stack<T> {
	
	private Node<T> top;
	
	public Stack() {
		top=null;
	}
	
	public T pop() throws EmptyStackException
	{
		if (top==null)
		{
			throw new EmptyStackException();
		}
		else
		{
			T item=top.data;
			top=top.next;
			return item;
		}
	}
	
	public void push(T data)
	{
		Node<T> newNode=new Node<T>(data);
		
		if (top==null)
		{
			top=newNode;
		}
		else
		{
			newNode.next=top;
			top=newNode;
		}
	}
	
	public T peek()
	{
		if (top==null)
		{
			throw new EmptyStackException();
		}
		else
		{
			return top.data;
		}
	}
	
	public boolean isEmpty()
	{
		return top==null;
	}
}
