package singlelinkedlist;

public class Singli_Linked_list 
{
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			this.data = d;
			this.next = null;
		}
	}
	public Node last = null;
// add nodes to list	
	public void addNode(int data)
	{
		Node newnode = new Node(data);
		if(head == null)
		{
			head = newnode;
			last = newnode;
		}
		else
		{
			last.next = newnode;
			last = newnode;
		}
	}
// print list nodes
	public void printList()
	{
		Node current = head;
		if(head == null)
		{
			System.out.println("List is empty");
		}
		System.out.println("Nodes of list are :");
		while(current != null)
		{
			System.out.println(current.data);
			current = current.next;
		}
	}
//Add at first
	public void addfirst(int data)
	{
		Node newnode = new Node(data);
		if(head == null)
		{
			head = newnode;
			last = newnode;
		}
		else
		{
			Node temp = head;
			head = newnode;
			head.next = temp;
		}
	}
// add at last
	public void addLast(int data)
	{
		Node newnode = new Node(data);
		if(head == null)
		{
			head = newnode;
			last = newnode;
		}
		else
		{
			last.next = newnode;
			last = newnode;
		}
	}
// add at position
	public void addAtPos(int data, int pos)
	{
		Node newnode = new Node(data);
		Node prev = head;
		/*
		 * for(int i=0; i<pos-2; i++) { temp = temp.next; }
		 */
		int count =1;
		while(count < pos-1)
		{
			prev = prev.next;
			count++;
		}
		Node current = prev.next;
		newnode.next = current;
		prev.next= newnode;
		System.out.println("Node "+newnode.data +" at position "+pos);
	}
//remove node
	public void remove(int key)
	{
		Node current = head;
		Node prev = null;
		if(current != null && current.data == key)
		{
			current = current.next;
		}
		while(current != null && current.data != key)
		{
			prev= current;
			current = current.next;
		}
		prev.next = current.next;
	}
//remove node
	public void removeFirst()
	{
		Node current = head;
		if(head == null)
		{
			System.out.println("list is empty");
		}
		else
		{
			head = head.next;
		}
		
	}
//remove last
	public void removeLast()
	{
		Node current = head;
		Node prev = null;
		if(head == null)
		{
			System.out.println("list is empty");
		}
		while(current.next != null)
		{
			prev = current;
			current = current.next;
		}
		prev.next = null;
	}
//find middle of list
	public void findMid()
	{
		Node current = head;
		int count =1;
		if(head == null)
		{
			System.out.println("list is empty");
		}
		while(current.next != null)
		{
			count++;
			current = current.next;
		}
		int midpos = (count/2);
		
			current = head;
			for(int i=1; i<= midpos; i++)
			{
				current = current.next;
			}
		System.out.println("Middle element of list is : "+current.data);
	}
//remove middle of list
	public void removeMid()
	{
		Node current = head;
		Node prev = null;
		int count =1;
		if(head == null)
		{
			System.out.println("list is empty");
		}
		while(current.next != null)
		{
			count++;
			current = current.next;
		}
		int midpos = (count/2);
		
			current = head;
			for(int i=1; i<= midpos; i++)
			{
				prev = current;
				current = current.next;
			}
			prev.next = current.next;
		System.out.println("Middle element of list is removed : "+current.data);
	}
	public static void main(String[] args)
	{
		Singli_Linked_list list = new Singli_Linked_list();
		list.addNode(11);
		list.addNode(22);
		list.addNode(33);
		list.addNode(66);
		list.printList();
		
		list.addfirst(5);
		list.printList();
		
		list.addLast(55);
		list.printList();
		
		list.addAtPos(70, 4);
		list.printList();
		
		list.remove(11);
		list.printList();
		
		list.removeFirst();
		list.printList();
		
		list.removeLast();
		list.printList();
		list.addNode(88);
		
		list.findMid();
		list.removeMid();
		list.printList();
		
	} 

}
