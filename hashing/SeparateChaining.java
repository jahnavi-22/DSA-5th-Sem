package hashing;

public class SeparateChaining {

    private class HashNode{
        private Integer key;
        private String value;

        private HashNode next;
        public HashNode(Integer key, String value){
            this.key = key;
            this.value = value;
        }
    }

    private HashNode[] buckets;

    private int size;
    private int bucketIndex;
    private int totalBucketSize;

    private int emptyBuckets;
    private int occupiedBuckets;

    public SeparateChaining(int capacity){
        this.size = 0;
        this.totalBucketSize = capacity;
        this.buckets = new HashNode[totalBucketSize];
    }


    private int hashCode(Integer key){
        return key%totalBucketSize;
    }

    private boolean isEmpty(){
        return size == 0;
    }

    private int getSize() {
        return size;
    }

    private int getBucketIndex(Integer key) {
        return hashCode(key);
    }

    private int getTotalBucketSize() {
        return totalBucketSize;
    }

    private int getEmptyBuckets() {
        return emptyBuckets;
    }

    private int getOccupiedBuckets() {
        return occupiedBuckets;
    }

    public void put(Integer key, String value){
        bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];

        while (head!=null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }
        head = buckets[bucketIndex];

        HashNode node = new HashNode(key,value);
        node.next = head;
        buckets[bucketIndex] = node;
        size++;
    }

    public String get(Integer key){
        bucketIndex = getBucketIndex(key);

        HashNode head = buckets[bucketIndex];

        while (head!=null){
            if(head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }
        return null;
    }


    public String search(Integer key){
        bucketIndex = getBucketIndex(key);

        HashNode head = buckets[bucketIndex];

        while (head!=null){
            if(head.key.equals(key)){
                return head.value;
            }
            else{
                head = head.next;
            }
        }
        return "No Data Found";
    }

    public String delete(Integer key){
        bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        HashNode prev = null;

        while (head!=null){
            if(head.key.equals(key)) {
                break;
            }
            prev = head;
            head = head.next;
        }

        if(head==null){
            return null;
        }

        if(prev!=null){
            prev.next = head.next;
        }
        else {
            buckets[bucketIndex] = head.next;
        }
        size--;
        return head.value;
    }

    public void getBucketDetails(){
        for(int bIndex = 0;bIndex<totalBucketSize;bIndex++){
            System.out.println("[ " + bIndex + " ]");
            HashNode head = buckets[bIndex];

            while (head!=null){
                ++occupiedBuckets;
                System.out.println("\t" + head.key + " - " + head.value);
                head = head.next;
            }
            emptyBuckets = totalBucketSize - occupiedBuckets;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SeparateChaining hashTable = new SeparateChaining(10);
        hashTable.put(1, "Value1");
        hashTable.put(2, "Value2");
        hashTable.put(11, "Value11");
        hashTable.put(12, "Value12");
        hashTable.put(21, "Value21");

        hashTable.getBucketDetails();

        System.out.println("Value for key 2: " + hashTable.get(2));
        System.out.println("Value for key 12: " + hashTable.get(12));
        System.out.println("Value for key 5: " + hashTable.get(5));

        System.out.println("Search for key 2: " + hashTable.search(2));
        System.out.println("Search for key 12: " + hashTable.search(12));
        System.out.println("Search for key 5: " + hashTable.search(5));

        String deletedValue = hashTable.delete(2);
        System.out.println("Deleted value for key 2: " + deletedValue);

        hashTable.getBucketDetails();

        System.out.println("Value for key 2 after deletion: " + hashTable.get(2));
    }
}