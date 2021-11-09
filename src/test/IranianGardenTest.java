package test;

import main.Client;
import main.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


class IranianGardenTest {


    private GardenFactory gardenFactory = new IranianGarden();

    private Client client = new Client(gardenFactory);

    @Test
    void GardenType() {

        Assertions.assertEquals(gardenFactory.getType(), Type.Iranian);

    }

    @Test
    void TreeType() {

        Tree tree = client.getTree();

        Assertions.assertEquals(tree.getType(), Type.Iranian);

    }



}