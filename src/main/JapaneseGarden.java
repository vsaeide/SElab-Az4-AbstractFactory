package main;

public class JapaneseGarden extends GardenFactory {

    public JapaneseGarden(){
        this.type= Type.Japanese;
    }

    public Tree CreatTree(){
        return new JapaneseTree();

    }

    public Flower CreatFlower(){
        return new JapaneseFlower();

    }

    public Type getType(){
        return this.type;
    }

}
