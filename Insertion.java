package Sort;

public class Insertion {
    public static void sort(Comparable[] num){
        for (int i = 1; i <num.length ; i++) {
            int ii=i;
            for (int j = i-1; j >=0 ; j--) {
                while(num[j].compareTo(num[ii])>0){
                    example.exchange(num,ii--,j);
                }
            }
        }
    }
}
