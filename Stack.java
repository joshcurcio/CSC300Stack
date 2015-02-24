
public class Stack 
{
	private Node head;
	private Node tail;
	private int count;
	
	public Stack()
	{
		this.head = null;
		this.tail = null;
		this.count = 0;
	}
	
	public void push (int payload)
	{
		Node n = new Node(payload);
		if(head == null)
		{
			head = n;
			tail = n;
		}
		else
		{
			n.setNextNode(head);
			head.setPrevNode(n);
			head = n;
		}
		this.count++;
	}
	
	//pop(removeFront)
	public int pop() throws Exception
	{
		if(head == null)
		{
			throw new Exception("Can Not Remove Front: Empty List");
		}
		else if(this.count == 1)
		{
			int payloadToReturn = this.head.getPayload();
			this.head = null;
			this.tail = null;
			this.count = 0;
			return payloadToReturn;
		}
		else
		{
			Node curr = head;
			curr.getNextNode().setPrevNode(null);
			head = curr.getNextNode();
			curr.setNextNode(null);
			this.count--;
			return curr.getPayload();
		}
	}
	
	//peek(get at index(0))
	public void peek()
	{
		System.out.println(this.head.getPayload());
	}
}
