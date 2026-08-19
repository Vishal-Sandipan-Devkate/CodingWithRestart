import java.util.Arrays;

public class QuadraticProbing{
    static void quadProbing(int[] table, int tsize, int[] arr) {
        
        int n = arr.length;

        for (int i = 0; i < n; i++) {
        
            // Hash function
            int hv = arr[i] % tsize;

            // Place directly if slot is empty
            if (table[hv] == -1)
                table[hv] = arr[i];
            else {
                
                // Quadratic probing in case of collision
                for (int j = 1; j <= tsize; j++) {
                   
                    // Compute new index using quadratic probing
                    int t = (hv + j * j) % tsize;

                    // Place element if new slot is empty
                    if (table[t] == -1) {
                        table[t] = arr[i];
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 50, 700, 76, 85, 92, 73, 101 };

        int tsize = 11;

        int[] table = new int[tsize];
        Arrays.fill(table, -1);

        quadProbing(table, tsize, arr);

        for (int val : table) {
            System.out.print(val + " ");
        }
    }
}
