package main;


public abstract class GardenFactory {
    Type type;
    public abstract Tree CreatTree();
    public abstract Flower CreatFlower();
    public abstract Type getType();
}


