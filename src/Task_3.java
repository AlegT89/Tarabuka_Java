
public class Task_3 {
    public static void main(String[] args) {
        int[] array = {1, 7, 9, 14, 18, 21};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}