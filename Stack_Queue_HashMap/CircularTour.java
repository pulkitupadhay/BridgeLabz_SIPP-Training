package DSA.Stack_Queue_HashMap;

public class CircularTour {
    static class PetrolPump {
        int petrol;
        int distance;

        PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }

    public static int findStartingPoint(PetrolPump[] pumps) {
        int totalPetrol = 0, totalDistance = 0;
        int start = 0, currPetrol = 0;

        for (int i = 0; i < pumps.length; i++) {
            totalPetrol += pumps[i].petrol;
            totalDistance += pumps[i].distance;

            currPetrol += pumps[i].petrol - pumps[i].distance;
            if (currPetrol < 0) {
                start = i + 1;
                currPetrol = 0;
            }
        }

        return totalPetrol < totalDistance ? -1 : start;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
            new PetrolPump(4, 6),
            new PetrolPump(6, 5),
            new PetrolPump(7, 3),
            new PetrolPump(4, 5),
            new PetrolPump(5, 2)
        };

        int startingPoint = findStartingPoint(pumps);
        if (startingPoint != -1) {
            System.out.println("The starting point for the circular tour is: " + startingPoint);
        } 
        else {
            System.out.println("No valid starting point found for the circular tour.");
        }
    }
}

