package xiecheng;

import java.util.HashMap;

class DoubleLinkedNode{
	String key;
	int value;
	DoubleLinkedNode pre;
	DoubleLinkedNode next;
}
//LRUCache实现
/*
 * 采用双向链表+hashmap的方式进行存储
 * 
 */
public class LRUCache {
	private HashMap<String, DoubleLinkedNode> cache =
				new HashMap<String,DoubleLinkedNode>();
	private int count;
	private int capacity;
	private DoubleLinkedNode head,tail;
	public LRUCache(int capacity) {
		// TODO Auto-generated constructor stub
		count = 0;
		this.capacity = capacity;
		
		head = new DoubleLinkedNode();
		tail = new DoubleLinkedNode();
		head.pre = null;
		tail.next = null;
		head.next = tail;
		tail.pre = head;
	}
	public void set(String key,int value) {
		DoubleLinkedNode node = cache.get(key);
		if(node == null) {
			node = new DoubleLinkedNode();
			node.key = key;
			node.value = value;
			cache.put(key, node);
			this.addNode(node);
			count++;
			if(count>capacity) {
				DoubleLinkedNode tail = this.popTail();
				cache.remove(tail.key);
				count--;
			}
		}else {
			node.value = value;
			this.moveToHead(node);
		}
	}
	private void addNode(DoubleLinkedNode node) {
		node.pre = head;
		node.next = head.next;
		head.next.pre = node;
		head.next = node;
	}
	private void moveToHead(DoubleLinkedNode node) {
		this.removeNode(node);
		this.addNode(node);
	}
	private void removeNode(DoubleLinkedNode node) {
		DoubleLinkedNode pre = node.pre;
		DoubleLinkedNode next = node.next;
		pre.next = next;
		next.pre = pre;
	}
	private DoubleLinkedNode popTail() {
		DoubleLinkedNode node = tail.pre;
		this.removeNode(node);
		return node;
	}
}
