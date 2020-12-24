package OOPPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class ManufacturingUnit {

    public static ArrayList<BajajPulsar> bikeFactory() {

        BajajPulsar pulsarRed = new BajajPulsar(true);
        pulsarRed.setColor("red");

        BajajPulsar pulsarBlue1 = new BajajPulsar(false);
        pulsarBlue1.setColor("blue");

        BajajPulsar pulsarBlue2 = new BajajPulsar(true);
        pulsarBlue2.setColor("blue");

        BajajPulsar pulsarDefault = new BajajPulsar(true);

     /*   BajajPulsar[] bp1 = {pulsarRed,pulsarBlue1,pulsarBlue2,pulsarDefault};

        ArrayList<BajajPulsar> bp2 = new ArrayList(Arrays.asList(bp1));*/

        ArrayList<BajajPulsar> bp = new ArrayList();
        bp.add(pulsarBlue1);
        bp.add(pulsarRed);
        bp.add(pulsarBlue2);
        bp.add(pulsarDefault);
        return bp;
    }

    public static void main(String[] args) {
        ArrayList<BajajPulsar> receivedBikes = bikeFactory();
        for (BajajPulsar bajajPulsar:receivedBikes) {

            System.out.println(bajajPulsar.getColor()+" bike has capacity of carrying "+bajajPulsar.noOfPassengers()+ " people " + " and top speed of " +bajajPulsar.topSpeed() + " kmph");
            System.out.println("Another message for test");
        }
    }
}
