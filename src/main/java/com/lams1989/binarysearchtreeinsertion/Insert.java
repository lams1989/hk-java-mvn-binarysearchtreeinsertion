package com.lams1989.binarysearchtreeinsertion;

import java.util.Scanner;

public class Insert {
	public static Node insert1(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert1(root.left, data);
				root.left = cur;
			} else {
				cur = insert1(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int data2 = 6;
		Node root = null;
		while (t-- > 0) {
			int data = scan.nextInt();
			root = insert1(root, data);
		}
		scan.close();

		insert2(root, data2);

	}

	static Node insert2(Node root, int data) {
		if (root == null) {
			Node newNode = new Node(data);
			newNode.data = data;
			return newNode;
		} else {
			if (root.data >= data) {
				root.left = insert2(root.left, data);
			} else {
				root.right = insert2(root.right, data);
			}
			return root;
		}
	}

}
