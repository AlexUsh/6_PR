import java.util.Arrays;

public class ListFloat {
    public static void main(String[] args) {
        int[] a = { 128934, 139430, 154065, 158234, 159021};
        int[] b = { 17258, 192344, 214355, 302134, 327391};
        int[] answer = merge(a,b);
        System.out.println("Первый список номеров студенческих билетов: " + Arrays.toString(a));
        System.out.println("Второй список номеров студенческих билетов: " + Arrays.toString(b));
        System.out.println("Отсортированный список студентов по номеру студенческого билета: " + Arrays.toString(answer));
    }

    public static int[] merge(int[] a, int[] b) {
        int[] answer = new int[a.length + b.length];
        int i = 0, j = 0;
        for (int k=0; k<answer.length; k++) {
            if (i > a.length - 1) {
                int z = b[j];
                answer[k] = z;
                j++;
            } else if (j > b.length - 1) {
                int z = a[i];
                answer[k] = z;
                i++;
            } else if (a[i] < b[j]) {
                int z = a[i];
                answer[k] = z;
                i++;
            } else {
                int q = b[j];
                answer[k] = q;
                j++;
            }
        }
        return answer;
    }
}