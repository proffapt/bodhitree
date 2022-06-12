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

tree* search(tree *ptr, int key){
	if(ptr==NULL) return NULL;
	if(ptr->data==key) return ptr;
	else if(key>ptr->data) return search(ptr->right, key);
	else return search(ptr->left, key);
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
	tree *f=search(p, 9);
	tree *k=search(p, 6);
	if (f==NULL) printf("That key doesn't exist in the tree.\n");
	else printf("I found %d.\n", k->data);
	if (k==NULL) printf("That key doesn't exist in the tree.\n");
	else printf("I found %d.\n", k->data);
	return 0;
}
