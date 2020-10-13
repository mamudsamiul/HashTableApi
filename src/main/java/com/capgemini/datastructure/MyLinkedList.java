package com.capgemini.datastructure;


public class MyLinkedList<K> {

	public INode head;
	public INode tail;
	public int counter=0;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode myNode) {
		if(this.tail==null)
			this.tail=myNode;
		if(this.head==null)
			this.head=myNode;
		else {
			INode tempNode=this.head;
			this.head=myNode;
			this.head.setNext(tempNode);
			counter++;
		}
	}
	public void append(INode newNode) {
		
		if(this.tail==null)
			this.tail=newNode;
		if(this.head==null)
			this.head=newNode;
		else {
			this.tail.setNext(newNode);
			this.tail=newNode;
		}
		counter++;
	}
	public void addMiddle(INode newNode) {
		if(this.tail==null)
			this.tail=newNode;
		if(this.head==null)
			this.head=newNode;
		else {
			int mid=counter/2;
			int mid2=0;
			INode temp=head;
			INode temp2=head.getNext();
			while(mid2++!=mid) {
				temp=temp.getNext();
				temp2=temp2.getNext();
			}
			temp.setNext(newNode);
			newNode.setNext(temp2);
		}
		
	}
	public void insert(INode myNode,INode newNode) {
		INode tempNode=myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	public INode pop() {
		INode tempNode=this.head;
		this.head=head.getNext();
		counter--;
		return tempNode;
	}
	public INode popLast() {
		INode tempNode=head;
		while(!tempNode.getNext().equals(tail)) {
			tempNode=tempNode.getNext();
		}
		this.tail=tempNode;
		tempNode=tempNode.getNext();
		counter--;
		return tempNode;
	}
	
//	public void printMyNodes() {
//		INode temp=head;
//		System.out.println();
//		while(temp!=null) {
//			System.out.print(temp.getKey()+"->");
//			temp=temp.getNext();
//		}
//	}
	public INode<K> search(K data) {
		INode<K> tempNode = this.head;
		while (tempNode!=null && tempNode.getNext()!=null) {
			if (tempNode.getKey().equals(data))
				return tempNode;
			tempNode=tempNode.getNext();
		}
		return null;
	}
	public void printMyNodes() {
		System.out.println("My nodes: "+head);
	}
	@Override
	public String toString() {
		return "MyLinkedListNodes{ "+head+"}";
	}
}
