package com.datastructure.utility;
/**
 * 
 * @author bridgelabz
 *
 * @param <T> generic parameter
 */
class Node<T>
{
	T data;
	Node<T> next;
}
public class LinkedList<T>
{
	/**
	 * head of the list
	 */
	Node<T> head; 
	/**
	 * Insert a node at the end of list
	 */
	public void add(T value)
	{
		/**
		 * allocates memory for node and put value in data part of node
		 */
		Node<T> new_node=new Node<T> ();
		new_node.data=value;
		/**
		 * if head is null then make the new node as head.
		 */
		if(head==null)
		{
			new_node.next=null;
			head=new_node;
		}
		else
		{
		Node<T> ptr=head;
		while(ptr.next!=null)
			ptr=ptr.next;
		ptr.next=new_node;
		}
		//return head.data;
	}
	/**
	 * prints the list
	 */
	public void printList()
	{
		Node<T> current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	/**
	 * search for  item if present then return true otherwise returns false
	 * @param item
	 * @return boolean
	 */
	public boolean contains(T item)
	{
		Node<T> temp=head;
		System.out.println(temp.data);
		System.out.println(item);
		while(temp!=null)
		{
			if(temp.data.equals(item))
				return true;	
			temp=temp.next;
		}
		return false;
	}
	/**
	 * remove item from list
	 * @param item
	 */
	public void remove(T item)
	{
		Node<T> temp=head;
		Node<T> pre=null;
		while(temp!=null)
		{
			if(temp.data.equals(item))
			{
				pre.next=temp.next;
			}
			pre=temp;
			 temp=temp.next;
		}
	}
	/**
	 * add elements to the list in ascending order
	 * @param item
	 */
	public void  addInAscending(T item)
	{
		Node<T> new_node=new Node<T> ();
		new_node.data=item;
		if(head==null)
		{
			new_node.next=null;
			head=new_node;
		}
		else if((int)head.data>(int)item) /** if value of head is greater than item**/
		{
			new_node.next=head;
			head=new_node;
		}
		else
		{
		Node<T> ptr=head;
		Node<T> pre=head,nxt=null;
		while(ptr!=null && (int)ptr.data<(int)item)
		{
			pre=ptr;
			ptr=ptr.next;
		}
		nxt=pre.next;
		pre.next=new_node;
		new_node.next=nxt;
		
		}
	}
}


