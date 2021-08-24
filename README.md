# 401-data-structures-and-algorithms

### 1. [challenge 1 (Reverse Array)](https://github.com/Qusay114/401-data-structures-and-algorithms/blob/main/ArrayReverse-Challenge/src)




### 2. [challenge 2 (Array Insert Shift)](https://github.com/Qusay114/401-data-structures-and-algorithms/blob/main/ArrayInsertShift-challenge/src)



### 3. [challenge 3 (Binary Array Search)](https://github.com/Qusay114/401-data-structures-and-algorithms/blob/main/ArrayBinarySearch-Challenge/src) :



### 4. [Challenge 5 (LinkedList)](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/LinkedList-Challenge/app/src) :

#### Challenge description

Create a linked list data structure which has these methods :
* insert  --> to add data to your linked list
* include --> to check if the linkedlist has the data or not
* toString --> to convert your linkedlist to a list in a form like this<br>"{ a } -> { b } -> { c } -> NULL"

<b><br>
### 5. [Challenge 6 (append LinkedList)](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/LinkedListInsertions-Challenge/app/src) :



#### Challenge Summary
appending my linkedlist from previous challenge and add to it these methods :
* append  --> to add data to the end of your linked list
* insert before --> to insert data before a given value(exists in the linked list)
* insert after --> to insert data after a given value(exists in the linked list)

#### Whiteboard Process
[whiteboard](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/LinkedListInsertions-Challenge/app/src/main/java/CodeChallenge-6.png)


#### Solution:
to see these methods in action! you should create an instance of the LinkedList class and call the methods .

Example :

        LinkedList testList = new LinkedList();
        testList.append(-11);
        testList.append(2);
        testList.append(5);
        testList.append(10);
        testList.insertAfter(5 , -7);
        testList.insertBefore(2 , 9);



### 7. [Challenge 7 (linked-list-kth)](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/LinkedListInsertions-Challenge/app/src/main/java) :

#### Challenge Summary
* kthFromEnd  --> to get the data but from the last to the beginning of the list
  Example :
  1 -> 3 -> 8 -> 2 ->       input=0 , output=2


#### Whiteboard Process
[whiteboard](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/LinkedListInsertions-Challenge/app/src/main/java/CodeChallenge-7.png)

#### Solution :
to see the function in action! you should create an instance of the LinkedList class and call the method .

Example :

        LinkedList testList = new LinkedList();
        testList.append(-11);
        testList.append(2);
        testList.append(5);
        testList.append(10);
        testList.kthFromEnd(3)   // here is the method and will return -11



### 8. [Challenge 8 (zipLinkedList)](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/LinkedListZip-Challenge/app/src/main/java) :

#### Challenge Summary
* zip two linked list  as below :
  head -> [1] -> [3] -> [2] -> X	list1
  head -> [5] -> [9] -> [4] -> X	list2
  head -> [1] -> [5] -> [3] -> [9] -> [2] -> [4] -> X  ziped LinkedList

#### Whiteboard Process
[whiteboard](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/LinkedListZip-Challenge/app/src/main/java/CodeChallenge-8.png)

#### Solution :
to see the function in action! you should create an instance of the LinkedList class and call the method .

Example :

        LinkedList list1 = new LinkedList() ;
        list1.append(1);
        list1.append(3);
        list1.append(2);
        LinkedList list2 = new LinkedList() ;
        list1.append(4);
        list1.append(5);
        list1.append(6);
        zipedLinkedList(list1,list2)  // it will return linked list with these values:
        // 1 --> 4 --> 3 --> 5 --> 2 --> 6 --> null


### 10. [Challenge 10 (Stack And Queue )](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/Stack-Queue-Challenge/app/src/main/java) :

#### Stacks and Queues : 
<!-- Short summary or background information -->
Stack and Queue Linked lists data structure , where you can instantiate  , add and remove from them
#### Challenge :
<!-- Description of the challenge -->
* Create a Stack class that has a top property. It creates an empty Stack when instantiated.This object should be aware of a default empty value assigned to top when the stack is created.
<br><br>
* Create a Queue class that has a front property. It creates an empty Queue when instantiated. This object should be aware of a default empty value assigned to front when the queue is created.


## API
<!-- Description of each method publicly available to your Stack and Queue-->

Stack :
created Stack Linkedlist , where you can use these methods :
* push : where you can add on the top of the stack .
* pop  : where you can remove from the top of the stack .
* peek : where you can get the top of the stack .

Queue :
created Queue Linkedlist , where you can use these methods :
* enqueue  : where you can add in the front of the queue .
* dequeue  : where you can remove from the front of the queue .
* peek     : where you can get the front of the stack .


### 11. [Challenge 11 (Pseudo Queue )](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/Stack-Queue-Challenge/app/src/main/java) :

#### Pseudo Queue :
<!-- Short summary or background information -->
Pseudo Queue data structure , where it follows first in - first out approach
#### Challenge :
<!-- Description of the challenge -->
* Create a new class called pseudo queue. Do not use an existing Queue. Instead, this PseudoQueue class will implement our standard queue interface (the two methods listed below),  Internally, utilize 2 Stack instances to create and manage the queue

## API
<!-- Description of each method publicly available to your Stack and Queue-->

* Methods : 
* enqueue : Inserts value into the PseudoQueue, using a first-in, first-out approach.
* dequeue : Extracts a value from the PseudoQueue, using a first-in, first-out approach. 

#### Whiteboard Process
[whiteboard](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/Stack-Queue-Challenge/app/src/main/java/CodeChallenge-11.png)


## Run The Program : 
you can create an instance of the PseudoQueue class , and enqueue your data , and you can dequeue .
* RUN THE TESTS USING gradle test 
* RUN THE APP USING gradle run 

### 12. [Challenge 12 (AnimalShilter )](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/Stack-Queue-Challenge/app/src/main/java) :

#### AnimalShelter :
<!-- Short summary or background information -->
a data structure to hold cats and dogs objects where you can enqueue and dequeue
#### Challenge :
<!-- Description of the challenge -->
* Create a class called AnimalShelter which holds only dogs and cats. The shelter operates using a first-in, first-out approach.
## API
<!-- Description of each method publicly available to your Stack and Queue-->

* Methods :
* enqueue : Inserts cat or dog object into the animalShilter, using a first-in, first-out approach.
* dequeue : Extracts cat or dog object based on the pref ,  using a first-in, first-out approach.

#### Whiteboard Process
[whiteboard](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/Stack-Queue-Challenge/app/src/main/java/CodeChallenge-11.png)


## Run The Program :
you can create an instance of the AnimalShilter class , and enqueue your Animal objects , and you can dequeue .
* RUN THE TESTS USING gradle test
* RUN THE APP USING gradle run 

Example :

        AnimalShelter animalShelterTest = new AnimalShelter();
        Animal cat = new Animal("cat");
        Animal dog = new Animal("dog");
        Animal cat1 = new Animal("cat");
        Animal dog1 = new Animal("dog");
        animalShelterTest.enqueue(cat);
        animalShelterTest.enqueue(dog);
        animalShelterTest.enqueue(cat1);
        animalShelterTest.enqueue(dog1);
        animalShelterTest.dequeue("dog");
        System.out.println(animalShelter.toString());  // the animalSelter wil be "{ cat } -> { cat } -> { dog } -> NULL"



### 13. [Challenge 13 (Validate Brackets)](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/Stack-Queue-Challenge/app/src/main/java) :

#### Validate Brackets :
<!-- Short summary or background information -->
a function to check if the passed string has a validate opening and closing () {} []
#### Challenge :
<!-- Description of the challenge -->
* Write a function called validate brackets
  Arguments: string
  Return: boolean
  representing whether or not the brackets in the string are balanced

#### Whiteboard Process
[whiteboard](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/Stack-Queue-Challenge/app/src/main/java/CodeChallenge-11.png)


## Run The Program :
you can create an instance of App , and call validateBrackets method
* RUN THE TESTS USING gradle test
* RUN THE APP USING gradle run

Example :

        new App().validateBrackets("{}{Code}[Fellows](()")  //it will return false
        new App().validateBrackets("{}{Code}[Fellows](())") //it will return true


### 15. [Challenge 15 (Trees Data Structure)](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/Trees-Challenge/app/src/main/java) :

#### Binary Tree  :
<!-- Short summary or background information -->
a data structure to hold the data in tree representation , where each node can have the most two childs nodes 
#### Binary Search Tree  :
<!-- Short summary or background information -->
a data structure to hold the data in tree representation , where each node can have the most two childs nodes , but we add the data here in a sorted way

#### Challenge :
<!-- Description of the challenge -->
* Binary Tree:
Create a Binary Tree class
Define a method for each of the depth first traversals:
pre order
in order
post order which returns an array of the values, ordered appropriately.

* Binary Search Tree:
Create a Binary Search Tree class
This class should be a sub-class (or your languages equivalent) of the Binary Tree Class, with the following additional methods:
Add
Arguments: value
Return: nothing
Adds a new node with that value in the correct location in the binary search tree.
Contains
Argument: value
Returns: boolean indicating whether or not the value is in the tree at least once.


#### Whiteboard Process
[whiteboard](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/Trees-Challenge/app/src/main/java/CodeChallenge-11.png)


## Run The Program :
you can instantiate BinaryTree or BinarySearchTree object , then add data to it .

Example :

        //for BinaryTree
        BinaryTree binaryTree = new BinaryTree() ;
        binaryTree.setRoot(new Node("10"));
        binaryTree.getRoot().setLeft(new Node("20"));
        binaryTree.getRoot().setRight(new Node("30"));
        binaryTree.postOrderTraversals(binaryTree.getRoot());
        binaryTree.preOrderTraversals(binaryTree.getRoot());
        binaryTree.inOrderTraversals(binaryTree.getRoot());

        //for BinarySearchTree
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.add(10);
        binarySearchTree.add(20);
        binarySearchTree.add(30);



### 16. [Challenge 16 (Binary Tree Max Value)](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/Tree-Challenge/app/src/main/java) :

#### Max Value in the Binary Tree:
<!-- Short summary or background information -->
a method called getMax() inside BinaryTree and BinaryTreeSearch classes to get the max value in the tree
#### Challenge :
<!-- Description of the challenge -->
Write the following method for the Binary Tree class

find maximum value
Arguments: none
Returns: number

#### Whiteboard Process
[whiteboard](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/Tree-Challenge/app/src/main/java/CodeChallenge-16.png)


## Run The Program :
you can create an instance of BinaryTree , and call getMax method
* RUN THE TESTS USING gradle test
* RUN THE APP USING gradle run

Example :

                BinaryTree binaryTree = new BinaryTree();
                binaryTree.setRoot(new Node(80));
                binaryTree.getRoot().setLeft(new Node(50));
                binaryTree.getRoot().setRight(new Node(90));
                System.out.println(binaryTree.getMax()); // 90


### 16. [Challenge 17 (Tree Breadth First Traverse)](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/Tree-Challenge/app/src/main/java) :

#### Traverse on the tree using Breadth-First-Traverse approach :
<!-- Short summary or background information -->
a class called TreeBreadthFirst that has traverse method to traverse over the tree using Breadth-First-Traverse approach and return a list of its values .
#### Challenge :
<!-- Description of the challenge -->
Write a function called breadth first
Arguments: tree
Return: list of all values in the tree, in the order they were encountered

#### Whiteboard Process
[whiteboard](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/Tree-Challenge/app/src/main/java/CodeChallenge-17.png)


## Run The Program :
you can create an instance of BinaryTree , and call getMax method
* RUN THE TESTS USING gradle test
* RUN THE APP USING gradle run

Example :

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.setRoot(new Node(80));
        binaryTree.getRoot().setLeft(new Node(50));
        binaryTree.getRoot().setRight(new Node(90));

        TreeBreadthFirst treeBreadthFirst = new TreeBreadthFirst();
        System.out.println(treeBreadthFirst.traverse(binaryTree.getRoot())); // it will return [80,50,90]


### 26. [Challenge 26 (Insertion Sort)](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/Insertion-Sort-Challenge/app/src/main/java) :
#### [BLOG](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/Insertion-Sort-Challenge/BLOG.md)

### 27. [Challenge 27 (Merge Sort)](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/MergeSort-Challenge/app/src/main/java) :
#### [BLOG](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/MergeSort-Challenge/BLOG.md)

### 28. [Challenge 28 (Quick Sort)](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/QuickSort-Challenge/app/src/main/java) :
#### [BLOG](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/QuickSort-Challenge/BLOG.md)


### 30. [Challenge 30 (HashTable)](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/HashMapRepeatedWord-Challenge/app/src/main/java/HashMapRepeatedWord/Challenge/hashTable) :

#### HashTable :
<!-- Short summary or background information -->
 HashTable data structure to hold the data as key / value pairs , and has hashCode , add , get , remove and contains methods
#### Challenge :
<!-- Description of the challenge -->
Implement a Hashtable Class with the following methods:

add
Arguments: key, value
Returns: nothing
This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
get
Arguments: key
Returns: Value associated with that key in the table
contains
Arguments: key
Returns: Boolean, indicating if the key exists in the table already.
hash
Arguments: key
Returns: Index in the collection for that key

#### Whiteboard Process
[whiteboard](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/HashMapRepeatedWord-Challenge/app/src/main/java/CodeChallenge-30.png)


## Run The Program :
* RUN THE TESTS USING gradle test
* RUN THE APP USING gradle run

Example :

                HashTable<String , Integer> hashTable = new HashTable<>();
                hashTable.add("white" , 1);
                hashTable.add("black" , 2);
                hashTable.add("green" , 3);
                hashTable.add("blue" , 4);
                System.out.println(hashTable.remove("blue"));
                System.out.println(hashTable.get("green"));
        
                System.out.println(hashTable.contains("black"));



### 31. [Challenge 31 (Repeated Word)](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/HashMapRepeatedWord-Challenge/app/src/main/java/HashMapRepeatedWord/Challenge/RepeatedWords.java) :

#### HashTable :
<!-- Short summary or background information -->
this challenge to get the first repeated word from a string 
#### Challenge :
<!-- Description of the challenge -->
Write a function called repeated word that finds the first word to occur more than once in a string
Arguments: string
Return: string

#### Whiteboard Process
[whiteboard](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/HashMapRepeatedWord-Challenge/app/src/main/java/CodeChallenge-31.png)


## Run The Program :
* RUN THE TESTS USING gradle test
* RUN THE APP USING gradle run

Example :

                RepeatedWords repeatedWords = new RepeatedWords();
                String text = "first second  third second second" ;
                System.out.println(repeatedWords.firstRepeatedWord(text));




### 32. [Challenge 32 (Trees intersections)](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/HashMapTreeIntersection-Challenge/app/src/main/java/HashMapTreeIntersection/Challenge/TreeIntersection.java) :

#### HashTable :
<!-- Short summary or background information -->
to find the intersections between two trees
#### Challenge :
<!-- Description of the challenge -->
Find all values found to be in 2 binary trees

Write a function called tree intersection
Arguments: two binary trees
Return: array

#### Whiteboard Process
[whiteboard](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/HashMapTreeIntersection-Challenge/app/src/main/java/CodeChallenge-32.png)


## Run The Program :
* RUN THE TESTS USING gradle test
* RUN THE APP USING gradle run

Example :

                        BinaryTree tree1 = new BinaryTree();
                        tree1.setRoot(new Node(5));
                        tree1.getRoot().setLeft(new Node(10));
                        tree1.getRoot().setRight(new Node(15));
                
                        BinaryTree tree2 = new BinaryTree();
                        tree2.setRoot(new Node(5));
                        tree2.getRoot().setLeft(new Node(11));
                        tree2.getRoot().setRight(new Node(15));
                
                        TreeIntersection intersection = new TreeIntersection();
                        System.out.println(intersection.hashmapTreeIntersection(tree1 , tree2));




### 33. [Challenge 33 (Left Joins)](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/HashMapLeftJoin-Challenege/app/src/main/java/HashMapLeftJoin/Challenege/JoinHashMap.java) :


#### Challenge :
<!-- Description of the challenge -->
Write a function called left join
Arguments: two hash maps
The first parameter is a hashmap that has word strings as keys, and a synonym of the key as values.
The second parameter is a hashmap that has word strings as keys, and antonyms of the key as values.
Return: The returned data structure that holds the results is up to you.
It doesn’t need to exactly match the output below, so long as it achieves the LEFT JOIN logic

#### Whiteboard Process
[whiteboard](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/HashMapLeftJoin-Challenege/app/src/main/java/CodeChallenge-33.png)


## Run The Program :
* RUN THE TESTS USING gradle test
* RUN THE APP USING gradle run

Example :

                HashTable<String , Integer> leftMap = new HashTable<>();
                leftMap.add("a" , 1);
                leftMap.add("b" , 2);
                leftMap.add("c" , 3);
        
                HashTable<String , Integer> rightMap = new HashTable<>();
                rightMap.add("a" , 10);
                rightMap.add("d" , 20);
                rightMap.add("c" , 30);
        
                JoinHashMap joinHashMap = new JoinHashMap();
                System.out.println(joinHashMap.leftJoinHashMaps(leftMap , rightMap).toString());




### 35. [Challenge 35 (Graph)](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/Graph-Challenge/app/src/main/java/Graph/Challenge/Graph.java) :


# Graphs
A graph is a non-linear data structure that can be looked at as a collection of vertices (or nodes) potentially connected by line segments named edges.

Here is some common terminology used when working with Graphs:

1- Vertex - A vertex, also called a “node”, is a data object that can have zero or more adjacent vertices.
2- Edge - An edge is a connection between two nodes.
3- Neighbor - The neighbors of a node are its adjacent nodes, i.e., are connected via an edge.
4- Degree - The degree of a vertex is the number of edges connected to that vertex.

**Features**

Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:

**add node**

* Arguments: value
* Returns: The added node
* Add a node to the graph

**add edge**

* Arguments: 2 nodes to be connected by the edge, weight (optional)
* Returns: nothing
* Adds a new edge between two nodes in the graph

If specified, assign a weight to the edge. Both nodes should already be in the Graph

**get nodes**

* Arguments: none
* Returns all of the nodes in the graph as a collection (set, list, or similar)

**get neighbors**

* Arguments: node
* Returns a collection of edges connected to the given node

Include the weight of the connection in the returned collection

**size**

* Arguments: none
* Returns the total number of nodes in the graph

### 36. [Challenge 36 (Graph Breath First)](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/Graph-Challenge/app/src/main/java/GraphBusinessTrip/BusinessTrip.java) :

Write the following method for the Graph class:

* breadth first
* Arguments: Node
* Return: A collection of nodes in the order they were visited.
* Display the collection

## Whiteboard Process
[whiteboard](https://github.com/Qusay114/401-data-structures-and-algorithms/tree/main/Graph-Challenge/app/src/main/java/CodeChallenge-36.jpg)


## Approach & Efficiency

Traversing starts from a selected node (root) and traverse the graph exploring the neighbour nodes (connected to root).
Moving towards the next-level neighbour nodes.

Big (O)

Time Complexity : O(n+e)
space Complexity : O(n)