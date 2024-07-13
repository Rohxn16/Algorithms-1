public class QuickUnionEager { // A more optimized approach using the tree data structure
    private int[] id;

    QuickUnionEager(int N){
        id = new int[N];
        for(int i = 0; i < N; i++){
            id[i] = i;
        }
    }

    private int root(int i){
        while(id[i] != i){
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q){
        return root(p) == root(q);
    }

    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    // This process works faster for smaller inputs but becomes a problem when the trees become too tall
    // It is expensive to keep the trees flat as well
}
