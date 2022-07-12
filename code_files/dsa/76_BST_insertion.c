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

// Insertion will always be done as a leaf node.. in every scenario.. that's just how the BST is build
void insert(tree *root, int key){
	tree *ptr=NULL;
	while(root!=NULL){
		ptr=root;
		if(root->data==key) return;
		else if(key>root->data) root=root->right;
		else root=root->left;
	}
	if(key>ptr->data) ptr->right=createNode(key);
	else ptr->left=createNode(key);
}

void inOrderTraversal(tree *p){
	if(p!=NULL){
		inOrderTraversal(p->left);
		printf("%d > ", p->data);
		inOrderTraversal(p->right);
	}
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
	inOrderTraversal(p);
	printf("\b\b \n");
	insert(p, 7);
	inOrderTraversal(p);
	printf("\b\b \n");
	insert(p, 4);
	inOrderTraversal(p);
	printf("\b\b \n");
	insert(p, 0);
	inOrderTraversal(p);
	printf("\b\b \n");
	insert(p, 2);
	inOrderTraversal(p);
	printf("\b\b \n");
	return 0;
}
