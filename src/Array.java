public class Array {

    String fullName = "Arman Martirosyan";
//task 5
    public static void main(String[] args) {
        double[]array = {45,21,76.2,89.8,230,15.6,160.3,2,500,674};
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 24.12 && array[i] < 467.23){
                System.out.println(array[i]);
            }

        }
    }
}
