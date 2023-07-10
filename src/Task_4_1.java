
public class Task_4_1 {
    public static void main(String[] args) {
        String brackets = "[((())()(())]]";
        StringBuilder stringbuilder = new StringBuilder(brackets);

        stringbuilder.setCharAt(stringbuilder.length() - 2, ')');
        stringbuilder.setCharAt(stringbuilder.length() - 1, ']');

        System.out.println("Исходная скобочная последовательность: " + brackets);
        System.out.println("Измененная скобочная последовательность: " + stringbuilder);
    }
}