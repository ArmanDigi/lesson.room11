public class Task53 {

    String fullName = "Arman Martirosyan";

    public static void main(String[] args) {
        int x = 650;
        int k = 230;
        double end = 0;
        int miavor = x % 10;
        int tasnavor = (x /10) % 10;
        int haryuravor = x / 100;
        if (x > k){end = (double) x / (miavor + tasnavor + haryuravor);}
        else {end = (double) miavor / x;}
        System.out.println(end);
    }
}
