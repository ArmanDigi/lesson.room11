public class Task54 {

    String fullName = "Arman Martirosyan";

    public static void main(String[] args) {
        int x = 764;

        int miavor = x % 10;
        int tasnavor = (x /10) % 10;
        int haryuravor = x / 100;
        if(miavor > tasnavor && miavor > haryuravor){
            System.out.println(miavor);}
        else if (tasnavor > miavor && tasnavor > haryuravor) {
            System.out.println(tasnavor);}
        else {System.out.println( haryuravor);

        }
    }
    }

