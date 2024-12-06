public class Task29 {
    public static void main(String[] args) {


        int x = 64, y = 77, z = 45;

        int max;
        int middle;
        int min;

        if (x > y && x > z) {
            max = x;
        } else if (y > x && y > z) {
            max = y;
        }else {
            max = z;
        }

        if (x < y && x < z) {
            min = x;
        } else if (y < x && y < z) {
            min = y;
        }else {
            min = z;
        }

        if (x > min && x < max) {
            middle = x;
        } else if (y > min && y < max) {
            middle = y;
        }else {
            middle = z;
        }
        System.out.println("min = " + min);
        System.out.println("middle = " + middle);
        System.out.println("max = " + max);
    }
}



