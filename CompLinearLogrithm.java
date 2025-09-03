public class CompLinearLogrithm {
        public static void main(String[] args) {
            int n = 8;

            for (int i = 0; i < n; i++) { // O(n)
                for (int j = 1; j < n; j = j * 2) { // O(log n)
                    System.out.println(i + " " + j);
                }
            }
        }
    }

