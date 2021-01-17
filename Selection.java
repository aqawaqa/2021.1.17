package Sort;

public class Selection {
    public static void sort(Comparable[] num) {
        for (int i = 0; i < num.length; i++) {
            Comparable min = num[i];
            int a = i;
            for (int j = i; j < num.length; j++) {
                if (min.compareTo(num[j])>0) {
                    min = num[j];
                    a = j;
                }
            }
            example.exchange(num,a,i);
        }
    }

}
