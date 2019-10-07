package by.epam.unit03.class_and_obj.second_task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Train[] trains = new Train[5];
        int numbTrain;
        for(int i = 0;i<trains.length;i++){

            trains[i] = new Train();
            System.out.println("numb:");
            trains[i].setNumberTrain(in.nextInt());
            in.nextLine();
            System.out.println("Point:");
            trains[i].setDestination(in.nextLine());
            System.out.println("time:");
            trains[i].setDepartureTime(in.nextDouble());

        }
        SortingByNumbers sortingByNumbers = new SortingByNumbers(trains);
        trains = sortingByNumbers.getTrains();
        //sorting by number
        for(int i = 0;i<trains.length;i++){
            System.out.println(trains[i].getNumberTrain()+" "+
                    trains[i].getDepartureTime()+" "+
                    trains[i].getDestination());
        }
        //sorting by name and time
        SortingByNameAndTime sortingByNameAndTime = new SortingByNameAndTime(trains);
        trains = sortingByNameAndTime.getTrains();
        for(int i = 0;i<trains.length;i++){
            System.out.println(trains[i].getNumberTrain()+" "+
                    trains[i].getDepartureTime()+" "+
                    trains[i].getDestination());
        }
        numbTrain = in.nextInt();
        for(int i = 0;i<numbTrain;i++){
            if(trains[i].getNumberTrain()==numbTrain){
                System.out.println(trains[i].getNumberTrain()+" "+
                        trains[i].getDepartureTime()+" "+
                        trains[i].getDestination());
            }
        }
    }
}
