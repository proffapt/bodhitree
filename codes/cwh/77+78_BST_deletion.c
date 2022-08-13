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

tree *inOrderPredecessor(tree *p){
	// left subtree ka.. left gaye
	p=p->left;
	// rightmost element is the required value.. right jate rahenge jab tak end na ajaye
	while(p->right!=NULL) p=p->right;
	return p;
}

// Why need to do tree* type? why not Void?
// Without this everything will work except after deleting the leaf node, we won't get NULL inplace of it
tree* delete(tree *root, int key){
	// Recursive apporach is the best, other approaches will fuck the mind
	// Base Conditions
	if(root==NULL){
		printf("There exist no such node with %d as it's key\n", key);
		return NULL;
	}
	else if (root->data==key && root->right==NULL && root->left==NULL) {
		free(root);
		return NULL;
	}
	// First traversing to the node having the key
	if(key>root->data) root->right=delete(root->right, key);
	else if (key<root->data) root->left=delete(root->left, key);
	// Now as we have traversed it's time for deletion
	else{
		// using by default the in order predecessor to replace the data with
		tree *inpre=inOrderPredecessor(root);
		// replacing the root's data
		root->data=inpre->data;
		// since inorder predecessor has been used, it should be deleted, which exists in the left sub-BST.
		root->left=delete(root->left, inpre->data);
	}
	return root;
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
	delete(p, 7);
	inOrderTraversal(p);
	printf("\b\b \n");
	delete(p, 5);
	inOrderTraversal(p);
	printf("\b\b \n");
	delete(p, 4);
	inOrderTraversal(p);
	printf("\b\b \n");
	return 0;
}
