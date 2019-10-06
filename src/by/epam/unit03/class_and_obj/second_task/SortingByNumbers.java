package by.epam.unit03.class_and_obj.second_task;

public class SortingByNumbers {
    private Train[] trains = new Train[2];
    private void swap(int a, int b){
        Train tmp = trains[a];
        trains[a] = trains[b];
        trains[b] = tmp;
    }
    public Train[] getTrains() {
        return trains;
    }
    public SortingByNumbers(Train[] trains1){
        boolean needIteration = true;
        trains = trains1;
        while(needIteration){
            needIteration = false;
            for(int i = 0;i<trains1.length - 1;i++){
                if(trains1[i].getNumberTrain()>trains1[i+1].getNumberTrain()) {
                    swap(0,1);
                    needIteration = true;
                }
            }
        }
    }
}
