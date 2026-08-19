import java.util.ArrayList;
import java.util.List;

public class HashChainingRehashing {
    private int bucketCount;

    private int numOfElements;

    private List<List<Integer>> table;

    // Constructor to initialize the table
    public HashChainingRehashing(int buckets) {
        bucketCount = buckets;
        numOfElements = 0;
        table = new ArrayList<>();
        for (int i = 0; i < bucketCount; i++) {
            table.add(new ArrayList<>());
        }
    }

    // Insert a key into the hash table
    public void insert(int key) {
        // If load factor exceeds 0.5, perform rehashing
        while (getLoadFactor() > 0.5) {
            rehash();
        }

        // Compute index for the key
        int index = getHashIndex(key);

        // Insert key into the corresponding bucket
        table.get(index).add(key);

        // Increase element count
        numOfElements++;
    }

    // Remove a key from the hash table
    public void remove(int key) {
        // Get index of the key
        int index = getHashIndex(key);

        // Remove the key from its bucket if it exists
        table.get(index).remove((Integer) key);
        numOfElements--;
    }

    // Display all buckets and elements
    public void display() {
        for (int i = 0; i < bucketCount; i++) {
            System.out.print(i);
            for (int key : table.get(i)) {
                System.out.print(" --> " + key);
            }
            System.out.println();
        }
    }

    // Hash function to map key to index
    private int getHashIndex(int key) {
        return key % bucketCount;
    }

    // Calculate current load factor
    private float getLoadFactor() {
        return (float) numOfElements / bucketCount;
    }

    // Rehash: double size and re-insert all elements
    private void rehash() {
        List<List<Integer>> oldTable = table;
        bucketCount *= 2;
        table = new ArrayList<>();
        for (int i = 0; i < bucketCount; i++) {
            table.add(new ArrayList<>());
        }
        numOfElements = 0;
        for (List<Integer> bucket : oldTable) {
            for (int key : bucket) {
                insert(key);
            }
        }
    }

    public static void main(String[] args) {
        int[] keys = {15, 11, 27};

        HashChainingRehashing hashTable = new HashChainingRehashing(5);

        for (int key : keys) {
            hashTable.insert(key);
        }

        hashTable.remove(11);
        hashTable.display();
        hashTable.insert(19);
        
        System.out.println("\nAfter rehashing:");
        hashTable.display();
    }
}
