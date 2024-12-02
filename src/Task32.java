public class Task32 {
    public static void main(String[] args) {

        int x = 66, y = 77, z = 88, b = 99;
        if (x < y && x < z && x < b){
            System.out.println(x);}
        else if (y < x && y < z && y < b) {
            System.out.println(y);}
        else if (b < x && b < y && b < z) {
            System.out.println(b);

        } else {
            System.out.println(z);
        }

    }
}
