public class Task51 {

    String fullName = "Arman Martirosyan";

    public static void main(String[] args) {
        int x = 415;
        boolean t = false;
        int miavor = x % 10;
        int tasnavor = (x /10) % 10;
        int haryuravor = x / 100;
        if ( miavor == tasnavor + haryuravor) {
            t = true;
        }System.out.println(t);
    }
}
