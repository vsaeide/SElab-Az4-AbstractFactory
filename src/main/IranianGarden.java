package main;

public class IranianGarden extends GardenFactory {

    public IranianGarden(){
        this.type= Type.Iranian;
    }

    public Tree CreatTree(){
        return new IranianTree();

    }

    public Flower CreatFlower(){
        return new IranianFlower();

    }
    public Type getType(){
        return this.type;
    }

}
