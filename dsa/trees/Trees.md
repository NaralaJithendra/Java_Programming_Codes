# **Trees**

A **tree** is a non-linear data structure that represents a hierarchy. It consists of nodes connected by edges. The topmost node is called the **root**, and every node can have child nodes. Tree is considered as non-linear because the data in the tree are not stored in a sequential manner.

### **Key Terminology:**

1. **Root** – The topmost node in the tree.
2. **Parent** – A node that has children.
3. **Child** – A node that has a parent.
4. **Leaf** – A node with no children.
5. **Subtree** – A tree formed by a node and its descendants.
6. **Height of a Tree** – The number of edges on the longest path from the root to a leaf.
7. **Depth of a Node** – The number of edges from the root to that node.
8. **Binary Tree** – A tree where each node has at most two children (left and right).
9. **Internal Node** - A node with atleast one child node.
10. **Ancestor of a Node** - Any Predecessor Nodes on the path of the root to that node.
11. **Level of Node** - The count of edges on the path from root node to that node. The root node has Level 0.
12. **Descendent** - A node that is a child, grandchild, or further removed from given Node.
13. **Neighbour of a Node** - Parent or child nodes of that node.

---

### **Types of Trees**

1. **General Tree** – No restriction on the number of children a node can have.
2. **Binary Tree** – Each node has at most two children.
3. **Binary Search Tree (BST)** – A binary tree where:
   - Left child has a smaller value than the parent.
   - Right child has a greater value than the parent.
4. **Balanced Tree** – A tree where the height difference between left and right subtrees is minimal (e.g., AVL Tree).
5. **Heap Tree** – A complete binary tree that follows the heap property.
6. **Trie** – A tree used for storing strings efficiently.

---

### **Implementation of a Binary Tree in Java**

```java
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    // Inorder Traversal (Left -> Root -> Right)
    void inorder(Node node) {
        if (node == null)
            return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder Traversal: ");
        tree.inorder(tree.root);
    }
}
```

**Output:**

```
Inorder Traversal:
4 2 5 1 3
```

---

### **Implementation of a Binary Search Tree (BST)**

```java
class BST {
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node root;

    BST() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal of the BST:");
        tree.inorder();
    }
}
```

**Output:**

```
Inorder traversal of the BST:
20 30 40 50 60 70 80
```

---

### **Tree Traversals**

1. **Inorder (Left, Root, Right)** – Used in BSTs to get sorted order.
2. **Preorder (Root, Left, Right)** – Used for copying the tree structure.
3. **Postorder (Left, Right, Root)** – Used for deleting a tree.
4. **Level Order (Breadth-First Search - BFS)** – Traverses level by level.

---

### **Common Operations in Trees**

- **Insertion**: Adding a new node.
- **Deletion**: Removing a node and maintaining tree properties.
- **Searching**: Finding an element in a tree.
- **Traversal**: Visiting all nodes in a specific order.

### **Height of a Tree in Java**

The **height** of a tree is the number of edges on the longest path from the root node to a leaf node.

- If a tree has only one node, its height is **0**.
- If a tree is empty (i.e., root is `null`), its height is **-1**.
- Height of a node is determined by:
    `Height = 1 + max(height of left subtree, height of right subtree)`

### **📝 Example Tree**
```
        1
       / \
      2   3
     / \
    4   5
```
- **Height of tree** (root node `1`): **2**  
- **Height of node `2`**: **1**  
- **Height of node `4` and `5`**: **0** (leaf nodes)
---

Sample Code -[Trees](https://github.com/NaralaJithendra/Java_Programming_Codes/tree/main/dsa/trees)
