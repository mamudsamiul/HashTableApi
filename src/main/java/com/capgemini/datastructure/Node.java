package com.capgemini.datastructure;

public class Node<K> implements INode<K> {
	private Node next;
	private K key;

	public Node(K key) {
		this.key = key;
		this.setNext(null);
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;

	}

	@Override
	public void setNext(INode next) {
		this.next=(Node) next;
	}
}
