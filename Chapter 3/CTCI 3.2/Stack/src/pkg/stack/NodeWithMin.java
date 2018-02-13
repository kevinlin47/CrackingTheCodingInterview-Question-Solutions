package pkg.stack;

public class NodeWithMin {
	
	int value;
	int min;
	NodeWithMin next=null;
	
	NodeWithMin(int value, int min)
	{
		this.value=value;
		this.min=min;
		next=null;
	}
}
