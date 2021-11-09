package main;


public class Client {

    private GardenFactory gardenfactory;
    private Tree tree;
    private Flower flower;

    public Client(GardenFactory gardenfactory) {

        this.gardenfactory = gardenfactory;
        CreatGarden();
    }

    private void CreatGarden() {
        this.tree = gardenfactory.CreatTree();
        this.flower = gardenfactory.CreatFlower();

    }

    @Override
    public String toString() {
        String output="The Garden is "+ gardenfactory.type.toString();
        output+= "\nThe Tree is "+tree.type;
        output+="\nThe flower is "+flower.type;

        return output;
    }


    public Tree getTree() {
        return tree;
    }

    public Flower getFlower() {
        return flower;
    }
}
