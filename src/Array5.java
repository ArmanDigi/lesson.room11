public class Array5 {

    String fullName = "Arman Martirosyan";
//tak 4
    public static void main(String[] args) {
       int[] array = {5,30,65,19,44,20,55,47};
        for (int i = 0; i < array.length ; i++) {
            if (array[i] % 5 == 0){
                System.out.println(array[i]);
            }

        }
    }
}
