public class Task52 {

    String fullName = "Arman Martirosyan";

    public static void main(String[] args) {
    int x = 557;
        boolean t = false;
        int miavor = x % 10;
        int tasnavor = (x /10) % 10;
        int haryuravor = x / 100;
        if( miavor == tasnavor || miavor == haryuravor || tasnavor == haryuravor) {
            t = true;

        }
        System.out.println(t);
    }
}
