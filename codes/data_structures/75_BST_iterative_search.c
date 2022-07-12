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

tree* searchIter(tree *ptr, int key){
	while(ptr!=NULL){
		if(key<ptr->data) ptr=ptr->left;
		else if(key>ptr->data) ptr=ptr->right;
		else return ptr;
	}
	if(ptr==NULL) return NULL;
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
	// calling of search function
	tree *f=searchIter(p, 9);
	tree *k=searchIter(p, 6);
	if (f==NULL) printf("That key doesn't exist in the tree.\n");
	else printf("I found %d.\n", k->data);
	if (k==NULL) printf("That key doesn't exist in the tree.\n");
	else printf("I found %d.\n", k->data);
	return 0;
}
