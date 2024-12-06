public class Task56 {

    String fullName = "Arman Martirosyan";

    public static void main(String[] args) {
        int x = 746;

        int miavor = x % 10;
        int tasnavor = (x /10) % 10;
        int haryuravor = x / 100;
        if( miavor > tasnavor){
            System.out.println((double)(miavor + tasnavor + haryuravor) / x);
        }else { System.out.println(x);}

        }
    }

