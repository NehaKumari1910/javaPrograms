package com.datastructure.utility;


public class QueueLinkedList<T>
{

//head of the list
			private Node<T> front=null,rear=null; 
			
			/**
			 * This method for insert data into LinkedList algo.
			 * @param value Generic value
			 */
			private class Node<T>
			{
					private T data;
					private Node<T> next;
					public Node(T data) {
						super();
						this.data = data;
						this.next = null;
				}
}
			public void push(T value)
			{
				/**
				 * allocates memory for node and put value in data part of node
				 */
				Node<T> new_node=new Node<T> (value);
				/**
				 * if head is null then make the new node as head.
				 */
				if(front==null)
				{
					new_node.next=null;
					front=new_node;
					rear=new_node;
				}
				else
				{
					rear.next=new_node;
					rear=new_node;
				}
			}
			/**
			 * prints the list
			 */
			public void printList()
			{
				Node<T> current=front;
				while(current!=null)
				{
					System.out.print(current.data+" ");
					current=current.next;
				}
				System.out.println();
			}
			/**
			 * pop element from list
			 * @param item
			 */
			public void pop()
			{
				if(!isEmpty()){
				front=front.next;
				}
			}
			public boolean isEmpty()
			{
				if(front==null)
					return true;
				return false;
			}
			public void printCalendar(int day)
			{
				Node<T> current=front;
				while(current!=null)
				{
					if((int)current.data==0)
						     System.out.print(" " );
					else
							System.out.print(current.data+" ");
					if(((int)current.data+day)%7==0)
						   System.out.println();
					current=current.next;
				}
				System.out.println();
			}
	}


