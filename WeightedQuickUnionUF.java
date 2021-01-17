package UF;

public class WeightedQuickUnionUF {
    int id[];
    int weigth[];
    int count;

    public WeightedQuickUnionUF(int i) {
        id = new int[i];
        weigth = new int[i];
        count = i;
        for (int j = 0; j < i; j++) {
            id[j] = j;
        }
        for (int i1 = 0; i1 < weigth.length; i1++) {
            weigth[i1] = 1;
        }
    }

    public int find(int p) {
        int temp = p;
        while (id[p] != p) p = id[p];
        id[temp] = p;
        return p;
    }

    public void union(int p, int q) {
        int idp = find(p);
        int idq = find(q);
        if (idp == idq) return;
        if (weigth[idq] > weigth[idp]) {
            id[idp] = idq;
            weigth[idq] += weigth[idp];
        } else {
            id[idq] = idp;
            weigth[idp] += weigth[idq];
        }
        count--;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int getCount() {
        return count;
    }
}
