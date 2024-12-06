public class Task59 {

    String fullName = "Arman Martirosyan";

    public static void main(String[] args) {
        int x = 936;

        int miavor = x % 10;
        int tasnavor = (x / 10) % 10;
        int haryuravor = x / 100;
        int max;
        int middle;
        int min;
        if ( miavor > tasnavor && miavor > haryuravor){
            max = miavor;
        } else if (tasnavor > miavor && tasnavor > haryuravor) {
            max = tasnavor;
        }else {max = haryuravor;}


        if ( miavor < tasnavor && miavor < haryuravor){
            min = miavor;
        } else if (tasnavor < miavor && tasnavor < haryuravor) {
            min = tasnavor;
        }else {min = haryuravor;}


        if ( miavor < max && miavor > min){
            middle = miavor;
        } else if (tasnavor < max && tasnavor > min) {
            middle = tasnavor;
        }else {middle = haryuravor;}

        System.out.println(min);
        System.out.println(middle);
        System.out.println(max);
    }
}