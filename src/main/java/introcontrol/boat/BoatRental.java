package introcontrol.boat;

import java.util.*;

public class BoatRental {

    private List<Boat> boats = new ArrayList<>();


    public List<Boat> getBoats() {
        return new ArrayList<>(boats);
    }

    public int numberOfMaxPassenger() {
        int result = 0;
        for (Boat item : boats
        ) {
            result += item.getNumberOfPassenger();

        }
        return result;
    }


    public static void main(String[] args) {

        BoatRental br = new BoatRental();

        br.boats.add(new Boat(5));
        br.boats.add(new Boat(2));
        br.boats.add(new Boat(4));
        br.boats.add(new Boat(3));
        br.boats.add(new Boat(3));

        System.out.println(br.numberOfMaxPassenger());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg az emberek számát!");
        int number = scanner.nextInt();

        if (number > br.numberOfMaxPassenger())
            System.out.println("A parton maradtak: " + (number - br.numberOfMaxPassenger()));


        if (number == br.numberOfMaxPassenger()) {
            System.out.println("Minden hely betelt");
        }

        Map<Integer, Integer> capacityOfBoatsAndNumberOfBoats = new TreeMap<>();

        for (int i = 0; i < br.getBoats().size(); i++) {
            if (!capacityOfBoatsAndNumberOfBoats.containsKey(br.getBoats().get(i).getNumberOfPassenger())) {
                capacityOfBoatsAndNumberOfBoats.put(br.getBoats().get(i).getNumberOfPassenger(), 0);
            }
            capacityOfBoatsAndNumberOfBoats.put(br.getBoats().get(i).getNumberOfPassenger(), capacityOfBoatsAndNumberOfBoats.get(br.getBoats().get(i).getNumberOfPassenger()) + 1);

        }

        for (int i = capacityOfBoatsAndNumberOfBoats.keySet().toArray().length; i > 0; i--) {

            if (number >= (int) capacityOfBoatsAndNumberOfBoats.keySet().toArray()[i - 1]) {
                int times = number / (int) capacityOfBoatsAndNumberOfBoats.keySet().toArray()[i - 1];
                int residual = number % (int) capacityOfBoatsAndNumberOfBoats.keySet().toArray()[i - 1];

                if(times <= capacityOfBoatsAndNumberOfBoats.get(capacityOfBoatsAndNumberOfBoats.keySet().toArray()[i - 1])){
                    if(residual == 0){
                        System.out.println(times + " db " + capacityOfBoatsAndNumberOfBoats.keySet().toArray()[i - 1] + " személyes csónakot kell kiadni!" );
                        return;
                    }else{
                      if (residual % (int) capacityOfBoatsAndNumberOfBoats.keySet().toArray()[i - 2] == 0){
                         int numberOfNextBoat = residual/(int) capacityOfBoatsAndNumberOfBoats.keySet().toArray()[i - 2];

                      }

                    }
                }
            }
        }


    }


}



