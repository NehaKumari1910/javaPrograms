/**
 * 
 */
package com.datastructure.utility;

/**
 * @author bridgelabz
 *
 */
public class Dequeue {
	int size;
	int arr [];
	int front;
	int rear;
	public  Dequeue(int size)
	{
	      front=-1;
	      rear=0;
	      this.size=size;
	      arr =new int[this.size];
	      
	}
	public boolean isEmpty()
	{
		if(front==-1)
			return true;
		return false;
	}
	public boolean isFull()
	{
		if((front==0 && rear==size-1)||(front==rear+1))
			return true;
		return false;
	}
	public void addFront(int item)
	{
		
		if(isFull())
		{
			System.out.println("Overflow");
			return;
		}
		if(front==-1)
		{
			front=0;
			rear=0;
		}
		else if(front==0)
			front=size-1;
		else
			front=front-1;
		arr[front]=item;
	}
	public void addRear(int item)
	{
		if(isFull())
		{
			System.out.println("Overflow");
			return;
		}
		if(front==-1)
		{
			rear=0;
			front=0;
			System.out.println("hdfdgfdhg");
		}
		else if(rear==size-1)
			rear=0;
		else
			rear=rear+1;
		arr[rear]=item;
	}
	public void removeFront()
	{
		if(isEmpty())
		{
			System.out.println("UnderFlow");
				return;
		}
		if(front==rear)
		{
			front=-1;
			rear=0;
		}
		else if(front==size-1)
			front=0;
		else
			front=front+1;
	}
	public void removeRear()
	{
		if(isEmpty())
		{
			System.out.println("Underflow");
			return;
		}
		if(front==rear)
		{
			front=-1;
			rear=-1;
		}
		else if(rear==0)
			rear=size-1;
		else
			rear=rear-1;
	}
	public int getFront()
	{
		if(isEmpty())
		{
			System.out.println("UnderFlow");
			return -1;
		}
		return arr[front];
	}
	public int getRear()
	{
		if(isEmpty() || rear<0)
		{
			System.out.println("UnderFlow");
			return -1;
		}
		return arr[rear];
		}

}
