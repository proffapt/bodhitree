#include<stdio.h>
#include<stdlib.h>

// What propperties to satisfy in order to be a BST
/*
	- All the nodes in the left subtree must be lesser.
	- All the nodes in the right subtree must be greater.
	- Should not have duplicate nodes(ALREADY SATISFIED when the first two are valid).
	- Left and right subtrees must also be BST(ALREADY SATISFIED when the first two are valid).
	IMPORTANT::
	InOrder Traversal of a BST gives a an ascendingly sorted sequences.
		Just do this and you will know whether A binary tree is BST or not..
*/

typedef struct node{
	int data;
	struct node *left;
	struct node *right;
} tree;

tree* createNode(int x){
	tree *ptr=(tree*)malloc(sizeof(tree));
	ptr->data=x;
	ptr->left=NULL;
	ptr->right=NULL;
	return ptr;
}

int isBST(tree *p){
	static int hai=1, counter=0, prev=0;
	if(p!=NULL){
		isBST(p->left); // for left-subtree
		// replacing printing by logic for checking 
		// initialising only for the first time
		if(!counter) prev=p->data;
		// anywyas increase the counter
		counter++;
		if (p->data>prev) {
			// now modified on every iteration with new logic
			prev=p->data;
			// increase this only when the order remains intact
			hai++;
		}
		isBST(p->right); // for right subtree
	}
	else return 1;
	// if each and every comparison was ascending then only is BST else it is not BST
	if(hai==counter) return 1;
	else return 0;
}

int main(){
	// Creating the nodes
	tree *p=createNode(5);
	tree *p1=createNode(3);
	tree *p2=createNode(6);
	tree *p3=createNode(1);
	tree *p4=createNode(4);
	// Linking the nodes
	p->left=p1;
	p->right=p2;
	p1->left=p3;
	p1->right=p4;
	// Is the BT a BST?
	int is_it=isBST(p);
	printf("\nIs it a BST?: ");	
	if(is_it) printf("YES!\n");
	else printf("NO!");

	return 0;
}
