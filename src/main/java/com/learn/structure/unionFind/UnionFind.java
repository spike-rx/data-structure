package com.learn.structure.unionFind;

/**
 * @author : Spike
 * @date : 2023/2/11
 */
public class UnionFind {

    // the number of elements in this union find
    private int size;

    // Used to track the size of each of the component
    private int[] sz;

    // id[i] points to the parent of i, if id[i] = i then i is a root node
    private int[] id;

    // Tracks the number of components in the union find
    private int numComponents;

    public UnionFind(int size) {
        if (size <=0 ) {
            throw new IllegalArgumentException("Size <= 0 is not allowed");
        }
        this.size = numComponents = size;
        sz = new int[size];
        id = new int[size];

        for (int i = 0; i < size; i++) {
            id[i] = i; // Link to itself (self root)
            id[i] = 1; // Each component is originally of size one
        }
    }

    // Find which component/set 'p' belongs to, takes amortized constant time.
    /*[1,3,3,3,3,1,1,1,1,1,4]
      [0,1,2,3,4,5,6,7,8,9,10]
    [-1,-1,-1,-1,-1]
    * */
    public int find(int p) {

        // Find the root of the component/set
        int root = p;
        while (root != id[root]) {
            root = id[root];
        }
        // compress the path leading back to the root.
        // Doing this operation is called "path compression"
        // and is what gives us amortized time complexity
        while (p != root) {
            int next = id[p];
            id[p] = root;
            p = next;
        }
        return root;
    }

}
