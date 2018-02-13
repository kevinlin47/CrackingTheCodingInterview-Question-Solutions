package pkg.stack;
import java.util.*;

public class StackWithMin extends Stack<NodeWithMin>{
	

	
	public int min()
	{
		if (this.isEmpty())
		{
			return Integer.MAX_VALUE;
		}
		else
		{
			return peek().min;
		}
	}
	
	public void push(int value)
	{
		int newMin=Math.min(value, min());
		
		NodeWithMin newNode=new NodeWithMin(value,newMin);
		super.push(newNode);
	}
	
	public static void main (String[] args)
	{
		StackWithMin sWM=new StackWithMin();
		
		sWM.push(3);
		sWM.push(19);
		sWM.push(1995);
		sWM.push(2018);
		sWM.push(5);
		
		System.out.println(sWM.min());
		
		sWM.push(0);
		sWM.push(-19);
		System.out.println(sWM.min());
		sWM.pop();
		System.out.println(sWM.min());
		
	}


}
