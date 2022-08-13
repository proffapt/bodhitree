#include<stdio.h>
#include<stdlib.h>

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

// output: 4 > 1 > 5 > 2 > 6
void preOrderTraversal(tree *p){
	if(p!=NULL){
		printf("%d > ", p->data);
		preOrderTraversal(p->left);
		preOrderTraversal(p->right);
	}
}

// output: 5 > 2 > 1 > 6 > 4
void postOrderTraversal(tree *p){
	if(p!=NULL){
		postOrderTraversal(p->left);
		postOrderTraversal(p->right);
		printf("%d > ", p->data);
	}
}

// output: 5 > 2 > 1 > 4 > 6
void inOrderTraversal(tree *p){
	if(p!=NULL){
		inOrderTraversal(p->left);
		printf("%d > ", p->data);
		inOrderTraversal(p->right);
	}
}

int main(){
	// Creating the nodes
	tree *p=createNode(4);
	tree *p1=createNode(1);
	tree *p2=createNode(6);
	tree *p3=createNode(5);
	tree *p4=createNode(2);
	// Linking the nodes
	p->left=p1;
	p->right=p2;
	p1->left=p3;
	p1->right=p4;
	// Traversing
	printf("\nPreorder traversal --: Root > Left > Right\n");
	preOrderTraversal(p);
	printf("\b\b \n");
	printf("\nPostorder traversal --: Left > Right > Root \n");
	postOrderTraversal(p);
	printf("\b\b \n");
	printf("\nInorder traversal --: Left > Root > Right \n");
	inOrderTraversal(p);
	printf("\b\b \n");

	return 0;
}
