package service;

public class TreePart {
    public char actRoot = ' ';
    public int root;
    public TreePart branch1;
    public TreePart branch2;

    public TreePart(char actRoot, TreePart branch1, TreePart branch2) {
        this.actRoot = actRoot;
        this.branch1 = branch1;
        this.branch2 = branch2;
    }

    public TreePart(int root) {
        this.root = root;
    }
}

