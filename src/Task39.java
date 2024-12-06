public class Task39 {
    public static void main(String[] args) {

        int x = 2, y = 4, z = 8, b = 10;
        int max;
        int middle;
        int penultimate;
        int min;


        if (x > y && x > z && x > b) {
            max = x;
        } else if (y > x && y > z && y > b) {
            max = y;
        } else if (b > x && b > y && b > z) {
            max = b;
        } else {
            max = z;
        }


        if (x < y && x < z && x < b) {
            min = x;
        } else if (y < x && y < z && y < b) {
            min = y;
        } else if (b < x && b < y && b < z) {
            min = b;
        } else {
            min = z;
        }


    }
}





