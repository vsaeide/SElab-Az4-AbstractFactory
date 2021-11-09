package main;


public abstract class Flower {

    Type type;
    public abstract void CreatFlower();
    public abstract Type getType();
}


class IranianFlower extends Flower {

    IranianFlower(){
        this.CreatFlower();
    }

    @Override
    public void CreatFlower() {
        this.type = Type.Iranian;

    }

    @Override
    public Type getType() {
        return this.type;
    }
}


class JapaneseFlower extends Flower {

    JapaneseFlower(){
        this.CreatFlower();
    }
    @Override
    public void CreatFlower() {
        this.type = Type.Japanese;

    }

    @Override
    public Type getType() {
        return this.type;
    }
}