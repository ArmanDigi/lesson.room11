public class Task58 {

    String fullName = "Arman Martirosyan";

    public static void main(String[] args) {
        int x = 136;
        char f = 'b';
        int miavor = x % 10;
        int tasnavor = (x /10) % 10;
        int haryuravor = x / 100;
        if((tasnavor + haryuravor) < 5){
            f = 'a';
        }
        System.out.println(f);
    }
}