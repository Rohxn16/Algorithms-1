public class QuickUnionLazy { // Implementation of the eager approach
    int[] id;
    QuickUnionLazy(int N){
        id = new int[N];
        for(int i = 0; i < N; i++){
            id[i] = i;
        }
    }

    public boolean connected(int p, int q){
        return id[p] == id[q];
    }

    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];

        for(int i = 0; i < id.length; i++){
            if(id[i] == pid) id[i] = qid;
        }

        // This algorithm is O(N^2) for N union commands on N objects
        // The defect being, the union command is too expensive as it takes quadratic time
    }

}