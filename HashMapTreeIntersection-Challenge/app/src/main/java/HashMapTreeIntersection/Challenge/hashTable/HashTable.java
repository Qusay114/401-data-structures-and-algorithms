package HashMapTreeIntersection.Challenge.hashTable;

import java.util.ArrayList;
import java.util.Objects;

public class HashTable<K , V> {
    private ArrayList<HashNode<K , V>> bucketArray ;
    private int numOfBuckets ;
    private int size ;

    public HashTable(){
        this.bucketArray = new ArrayList<>();
        numOfBuckets = 10 ;
        size = 0 ;

        for (int i= 0 ; i < numOfBuckets ; i++)
            bucketArray.add(null);
    }

    public int hashCode(K key){
        return Objects.hashCode(key);
    }

    private int getBucketIndex(K key){
        int hashCode = hashCode(key);
        int index = hashCode % numOfBuckets ;

        index = index < 0 ? index*-1 : index ;
        return index ;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return getSize() == 0 ;
    }

    public void add(K key , V value){
        int bucketIndex = getBucketIndex(key) ;
        int hashCode = hashCode(key);

        HashNode<K , V> head = bucketArray.get(bucketIndex);

        while (head != null){
            if (head.getKey().equals(key) && head.getHashcode() == hashCode){
                head.setValue(value);
                return;
            }
            head = head.getNext();
        }

        size++ ;

        head = bucketArray.get(bucketIndex);
        HashNode<K , V> newNode = new HashNode<>(key , value , hashCode);
        newNode.setNext(head);
        bucketArray.set(bucketIndex , newNode);

        if((1.0 * size) / numOfBuckets >= 0.7){
            ArrayList<HashNode<K , V>> temp = bucketArray ;
            bucketArray = new ArrayList<>();
            numOfBuckets = 2 * numOfBuckets ;
            size = 0 ;

            for (int i = 0 ; i < numOfBuckets ; i++)
                bucketArray.add(null);

            for (HashNode<K , V> headNode : temp){
                while (headNode != null){
                    add(headNode.getKey() , headNode.getValue());
                    headNode = headNode.getNext() ;
                }
            }
        }
    }

    public V get(K key){
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);
        HashNode<K , V> head = bucketArray.get(bucketIndex);

        while (head != null){
            if(head.getKey().equals(key) && head.getHashcode() == hashCode)
                return head.getValue();
            head = head.getNext();
        }

        return null ;
    }

    public V remove(K key){
        int bucketIndex = getBucketIndex(key) ;
        int hashCode = hashCode(key);
        HashNode<K , V> head = bucketArray.get(bucketIndex);
        HashNode<K , V> prev = null ;

        while (head != null){
            if(head.getKey().equals(key) && head.getHashcode() == hashCode)
                break;
            prev = head ;
            head = head.getNext();
        }

        if(head == null) return null ;

        size--;
        if (prev != null)
            prev.setNext(head.getNext());
        else
            bucketArray.set(bucketIndex , head.getNext());
        return head.getValue() ;
    }

    public Boolean contains(K key){
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);
        HashNode<K , V> head = bucketArray.get(bucketIndex);

        while (head != null){
            if(head.getKey().equals(key) && head.getHashcode() == hashCode)
                return true;
        head = head.getNext();
    }

        return false ;
    }
}
