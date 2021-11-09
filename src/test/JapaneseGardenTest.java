package test;

import main.Client;
import main.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


class JapaneseGardenTest {


    private GardenFactory gardenFactory = new JapaneseGarden();

    private Client client = new Client(gardenFactory);

    @Test
    void GardenType() {

        Assertions.assertEquals(gardenFactory.getType(), Type.Japanese);

    }

}