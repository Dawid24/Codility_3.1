public class Solution {

    public static int frogJumps(int x, int y, int d) {

        int startPosition = x;
        int count = 0;

        if (y < x) {
            System.out.println("x must be bigger than y");
            return -1;
        } else if (x == y) {
            return 0;
        } else {

            while (startPosition < y) {
                startPosition += d;
                count++;
            }

        }

        return count;
    }

}
