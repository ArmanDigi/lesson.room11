public class Task35 {
    public static void main(String[] args) {


        int x = 5, y = 5, z = 5, b = 15;
        if (x == y + z + b || y == x + z + b || z == x + y + b ||
        b == x + y + z){
            System.out.println(true);}
        else {System.out.println(false);
        }

    }
}