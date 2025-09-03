public class TrianglularLoop {
        public static void main(String[] args) {
            int n = 4;

            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }