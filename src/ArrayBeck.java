public class ArrayBeck {
    public static void main(String[] args) {
        int[] array = {562, 471, 67, 85, 7894, 43};

        int[] result = new int [array.length];

        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            int reversElement = 0;

            while (element != 0){
                reversElement = reversElement * 10 + element % 10;
                element = element / 10;
            }
            result[i] = reversElement;

        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");

        }
    }
}
