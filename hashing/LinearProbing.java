package hashing;

public class LinearProbing {

    private int capacity;
    private int[] table;
    private int[] state; // 0 for empty and 1 for occupied

    public LinearProbing(int capacity){
        this.capacity = capacity;
        table = new int[capacity];
        state = new int[capacity];

        for(int i = 0; i < capacity; i++){
            state[i] = 0;
        }
    }

    private int hash(int key) {
        return key % capacity;
    }

    public void insert(int key){
        int index = hash(key);
        while(state[index] == 1){
            index = (index + 1) % capacity; // Linear probing
        }
        table[index] = key;
        state[index] = 1; // Mark the slot as occupied
    }

    public boolean search(int key) {
        int index = hash(key);
        while (state[index] != 0) {
            if (state[index] == 1 && table[index] == key) {
                return true; // Key found
            }
            index = (index + 1) % capacity;
        }
        return false; // Key not found
    }

    public void delete(int key) {
        int index = hash(key);

        while (state[index] != 0) {
            if (state[index] == 1 && table[index] == key) {
                state[index] = -1; // Mark the slot as deleted
                return;
            }
            index = (index + 1) % capacity;
        }
    }

    public void print(){
        for(int i = 0;i<capacity;i++){
            if(state[i] == 1){
                System.out.print("Slot " + i + ": " + table[i] + " || ");
            }
            else if(state[i] == -1){
                System.out.print("Slot " + i + ": deleted || ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinearProbing hashTable = new LinearProbing(10);

        hashTable.insert(5);
        hashTable.insert(15);
        hashTable.insert(25);

        hashTable.print();

        // Searching for a key
        System.out.println("Search 15: " + hashTable.search(15)); // Should print true
        System.out.println("Search 10: " + hashTable.search(10)); // Should print false

        // Deleting a key
        hashTable.delete(15);

        hashTable.print();
        System.out.println("Search 15 after deletion: " + hashTable.search(15)); // Should print false
    }
}