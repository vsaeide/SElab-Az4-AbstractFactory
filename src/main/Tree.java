package main;


public abstract class Tree {

    Type type;

    abstract void CreatTree();

    public abstract Type getType();
}


class IranianTree extends Tree {

    IranianTree(){
        this.CreatTree();
    }

    @Override
    public void CreatTree() {
        this.type = Type.Iranian;

    }

    @Override
    public Type getType() {
        return this.type;
    }
}


class JapaneseTree extends Tree {

    JapaneseTree(){
        this.CreatTree();
    }

    @Override
    public void CreatTree() {
        this.type = Type.Japanese;

    }

    @Override
    public Type getType() {
        return this.type;
    }
}