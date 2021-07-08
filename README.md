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


