package com.stacksnqueues;

public class QueueDemo {

	LinkedList list = new LinkedList();

	public void enQueue(Object data) {
		list.addFirstNode(data);
	}

	public void display() {
		list.display();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Stack and Queue Data structure");
		QueueDemo queue = new QueueDemo();
		queue.enQueue(70);
		queue.enQueue(30);
		queue.enQueue(56);
		queue.display();
	}
}