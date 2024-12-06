public class Task57 {

    String fullName = "Arman Martirosyan";

    public static void main(String[] args) {
        int x = 456;

        int miavor = x % 10;
        int tasnavor = (x /10) % 10;
        int haryuravor = x / 100;
        if(x > 300){
            System.out.println((double) tasnavor / miavor);
        }else {System.out.println((double) haryuravor / miavor);}
}
}
