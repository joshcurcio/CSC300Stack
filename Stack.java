
public class Stack 
{
	private Node top;
	
	public Stack()
	{
		this.top = null;
	}
	
	public boolean isEmpty()
	{
		return this.top == null;
	}
	
	public void push (int payload)
	{
		Node n = new Node(payload);
		if(this.top == null)
		{
			this.top = n;
		}
		else
		{
			n.setNextNode(top);
			this.top = n;
		}
	}
	
	//pop(removeFront)
	public int pop() throws Exception
	{
		if(top == null)
		{
			throw new Exception("Empty Staack!!! Cry More");
		}
		else
		{
			int valToReturn = this.top.getPayload();
			this.top = this.top.getNextNode();
			return valToReturn;
		}

	}
	
	//peek(get at index(0))
	public int peek() throws Exception
	{
		if(top == null)
		{
			throw new Exception("Empty Staack!!! Cry More");
		}
		else
		{
			return this.top.getPayload();
		}
	}
}
