package Hashing;

import java.util.LinkedList;

public class HashMap<K,V> {
    private class HMNode{
        K key;
        V value;

        public HMNode(K key, V value){
            this.key = key;
            this.value = value;
        }
        @Override
        public String toString(){
            return this.key + "@" + this.value;
        }

    }
    //making an array of linkedList
    private LinkedList<HMNode>[] bucketArray;
    private int size;
    public HashMap(){
        this(5);
    }
    public HashMap(int cap){
        this.bucketArray = (LinkedList<HMNode>[]) new LinkedList[cap];
        this.size=0;
        for (int i = 0; i < bucketArray.length; i++) {
            bucketArray[i] = new LinkedList<HMNode>();

        }
    }
    public void put(K key, V value){
        //this key will be the unique index in the array
        int bi = hashFunction(key);
        //get the linkedList ar the index bi
        LinkedList<HMNode> bucket = bucketArray[bi];
        // check if the value is present in the hashMap or not
        int fi = findInBucket(bucket, key);
        if(fi == -1) {
            HMNode nn = new HMNode(key, value);
            this.size++;

            //adding the new node to the end of the linkedList
            bucket.addLast(nn);
        }else{
            //get the node
            HMNode ntbu = bucket.get(fi);
            //updating the value of the node
            ntbu.value = value;
        }
        //calculate the load factor again
        //and if the value of load factor is greater than 1,
        //then do rehashing here.

        //load factor denotes the ratio of no of elements in the hashMap
        //divide by the size of hashMap
        double loadFactor = (double) (this.size/ this.bucketArray.length);
        if(loadFactor>1){
            rehash();
        }
    }
    private void rehash(){
        //store the previous array first
        LinkedList<HMNode>[] oba = this.bucketArray;

        //create a new array of double size
        this.bucketArray = (LinkedList<HMNode>[]) new LinkedList[2*oba.length];

        //size of the new array is currently 0
        this.size =0;
        for (int i = 0; i < bucketArray.length; i++) {
            bucketArray[i] = new LinkedList<HMNode>();
        }
        //put all the previous values in the new array
        for (int i = 0; i <oba.length ; i++) {
            LinkedList<HMNode> bucket = oba[i];

            //for every linkedList , we are iterating over every node.
            for (int j = 0; j < bucket.size(); j++) {
                HMNode node = bucket.get(i);
                put(node.key,node.value);
            }
        }
    }

    private int findInBucket(LinkedList<HMNode> bucket, K key) {
        //iterating over the given linkedList
        //to check if the given key
        //is already present or not
        for (int i = 0; i < bucket.size(); i++) {
            HMNode pn = bucket.get(i);
            if(pn.key.equals(key)){
                return i;
            }
        }
        return -1;
    }

    private int hashFunction(K key){
        //give a value to hashCode it returns a unique key for that value
        int hc = key.hashCode();
        int bi = Math.abs(hc) % bucketArray.length;
        return bi;
    }
    public void display(){
        System.out.println("-----------------------");
        for (int i = 0; i < bucketArray.length; i++) {
            LinkedList<HMNode> bucket = bucketArray[i];
            System.out.print("B "+ i + " => ");
            for (int j = 0; j < bucket.size(); j++) {
                HMNode node = bucket.get(j);

                System.out.print(node + ", ");
            }
            System.out.println(".");
        }
            System.out.println("-----------------------");
    }
    //given a key, we need to return its value
    public V get(K key){
        int bi = hashFunction(key);
        LinkedList<HMNode> bucket = bucketArray[bi];
        //checking if the key is present in the linkedList or not
        int fi = findInBucket(bucket, key);
        if (fi == -1) {

            return null;
        } else{
            return bucket.get(fi).value;
        }
    }
}
