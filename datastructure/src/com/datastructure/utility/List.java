package com.datastructure.utility;

public class List {

	NodeN n = new NodeN();

	/**
	 * 
	 * @param value
	 *           element to be added
	 * @param key
	 *           is the hash key where element will be added
	 */
	public void add(int value, int key) {
		/**
		 * allocates memory for node and put value in data part of node
		 */
		NodeN new_node = new NodeN();
		new_node.data = value;
		/**
		 * if head is null then make the new node as head.
		 */
		if (n.arr[key] == null) {
			new_node.next = null;
			n.arr[key] = new_node;

		} else {
			NodeN ptr = n.arr[key];
			while (ptr.next != null)
				ptr = ptr.next;
			ptr.next = new_node;
		}
	}

	/**
	 * prints the list having hashKey=key
	 */
	public void printList() {
		for (int key = 0; key < 11; key++) {
			NodeN current = n.arr[key];
			if (current != null){
				System.out.print(key + " = " + current.data);
				current=current.next;
			while (current != null) {
				System.out.print("->" + current.data);
				current = current.next;
			}
			System.out.println();
			}
		}
	}

	/**
	 * search for item if present then return true otherwise returns false
	 * 
	 * @param item
	 * @return boolean
	 */
	public boolean contains(int key, int item) {
		NodeN temp = n.arr[key];
		while (temp != null) {
			if (temp.data == item)
				return true;
			temp = temp.next;
		}
		return false;
	}

	/**
	 * remove element which is present in the list at hashkey=key
	 * 
	 * @param key
	 * @param item
	 *           - element to be removed
	 */
	public void remove(int key, int item) {
		NodeN temp = n.arr[key];
		NodeN pre = null;
		while (temp != null) {
			if (temp.data == item) {
				if (pre == null) {
					n.arr[key] = temp.next;
					break;
				}
				pre.next = temp.next;
			}
			pre = temp;
			temp = temp.next;
		}
	}
}
