package firstproject;

import java.util.Scanner; 

public class hotelreserve {
    static void displayRoomTypes() {
        System.out.println("1. cost of Luxury room is :2500 per day");
        System.out.println("2. cost of Ac room is :2000 per day");
        System.out.println("3. cost of Non Ac room is :1500 per day");
        System.out.println("4. cost of deluxe room i:5000 per day");
    }

    static int calculateTotalCost(int roomType, int numDays) {
        int[] roomCosts = {2500, 2000, 1500, 5000};
        
        if (roomType >= 1 && roomType <= 3) {
            return roomCosts[roomType - 1] * numDays;
        }
        else
        {
            System.out.println("Invalid room type. Please choose a valid option.");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        displayRoomTypes();

        System.out.print("Enter the room type: ");
        int roomType = scanner.nextInt();

        System.out.print("Enter the number of days: ");
        int numDays = scanner.nextInt();

        int totalCost = calculateTotalCost(roomType, numDays);
        if (totalCost > 0) {
            System.out.println("Total cost for your reservation:" + totalCost);
            System.out.println("Thank you for choosing Taj Hotel!");
        } else {
            System.out.println("Reservation failed. Please try again.");
        }

        scanner.close();
    }
}


