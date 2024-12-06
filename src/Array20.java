public class Array20 {

    String fullName = "Arman Martirosyan";

    public static void main(String[] args) {
        int index = 0;
        int[] array = new int[20];
        for (int i = -20; i < 20; i++) {
            if( i % 2 != 0){
                array[index] = i;
                index ++;
            }


        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}