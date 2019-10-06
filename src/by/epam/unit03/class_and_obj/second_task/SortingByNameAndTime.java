package by.epam.unit03.class_and_obj.second_task;

import java.util.Arrays;

public class SortingByNameAndTime {
    private Train[] trains = new Train[2];
    private void swap(int a, int b){
        Train tmp = trains[a];
        trains[a] = trains[b];
        trains[b] = tmp;
    }
    public Train[] getTrains() {
        return trains;
    }

    public SortingByNameAndTime(Train[] trains1){
        trains = trains1;
        boolean needIteration = true;
        while (needIteration){
            needIteration = false;
            for(int i = 0;i<trains1.length - 1 ;i++){
                if(trains1[i].getDestination().compareTo(trains1[i+1].getDestination())>0){
                    continue;
                }
                else if(trains1[i].getDestination().compareTo(trains1[i+1].getDestination())<0){
                    swap(i,i+1);
                    needIteration = true;
                }
                else{
                    if(trains1[i].getDepartureTime()<trains1[i+1].getDepartureTime()){
                        swap(i,i+1);
                        needIteration = true;
                    }

                }
            }
        }

    }
}
