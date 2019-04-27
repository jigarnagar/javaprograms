package com.javaprogram.practice.datastructure;

/**
 * 
 * Linked List Own Implementation
 * 
 * @author Jigar Nagar
 *
 */
public class LinkedListExample {

	public static void main(String[] args) {
		OwnLinkedList<Integer> list = new OwnLinkedList<Integer>();
		list.insert(10);
		list.insert(11);
		list.insert(12);

		list.show();
	}
}

/**
 * 
 * @author Jigar Nagar
 *
 */
class OwnLinkedList<T> {

	Node<T> head;

	/**
	 * Insert data in List
	 * 
	 * @param data
	 */
	public void insert(T data) {
		Node<T> node = new Node<T>();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			// create temparory node and put all head value
			Node<T> n = head;
			// tranvser the node
			while (n.next != null) {
				n = n.next;
			}
			// Now n.next is null and node reference here
			n.next = node;
		}

	}

	/**
	 * 
	 */
	public void show() {
		Node<T> n = head;
		while (n.next != null) {
			System.out.println("Value " + n.data);
			n = n.next;
		}
		System.out.println("Value " + n.data);
	}
}

/**
 * 
 * @author Jigar Nagar
 *
 * @param <T>
 */
class Node<T> {

	T data;
	Node<T> next;

}
