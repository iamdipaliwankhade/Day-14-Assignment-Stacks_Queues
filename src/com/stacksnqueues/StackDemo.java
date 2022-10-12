package com.stacksnqueues;

public class StackDemo {

	LinkedList list = new LinkedList();

	public void push(Object data) {
		list.addLast(data);
	}

	public void pop() {
		list.deleteFirst();
	}

	public void display() {
		list.display();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Stack and Queue Data structure");
		StackDemo stack = new StackDemo();
		stack.push(56);
		stack.push(30);
		stack.push(70);
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
	}
}