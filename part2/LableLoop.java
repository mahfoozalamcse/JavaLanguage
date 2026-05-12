package part2;

public class LableLoop {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        outer:
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                if (i == 2 && j == 2) {
                    break outer;
                }
                System.out.print(" " + i + "," + j);
            }
        }
    }
    
}
