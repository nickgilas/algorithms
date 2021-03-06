package com.nick.algorithms.datastructers;

import java.util.Iterator;

/**
 * a list in which the next item to be removed is the item most recently stored
 * (LIFO)
 *
 * Backed by a single linked list
 */
public class PushDownStack<T> implements Iterable<T> {

	private class Node {
		T item;
		Node nextNode;
	}

	private Node firstNode;

	private int index;

	public boolean isEmpty() {
		return index == 0;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public T pop() {
		// remove the top item on the stack
		T t = firstNode.item;
		// update the top element to be the next item in the list
		firstNode = firstNode.nextNode;
		index--;
		return t;
	}

	public void push(T t) {
		Node oldFirst = firstNode;
		firstNode = new Node();
		firstNode.item = t;
		firstNode.nextNode = oldFirst;
		index++;
	}

	public int size() {
		return index;
	}
}
