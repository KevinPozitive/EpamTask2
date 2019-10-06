package by.epam.unit03.class_and_obj.second_task;

public class Train {
    private String destination;
    private int numberTrain;
    private double departureTime;

    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }
    public void setNumberTrain(int numberTrain) {
        this.numberTrain = numberTrain;
    }

    public String getDestination() {
        return destination;
    }
    public double getDepartureTime() {
        return departureTime;
    }
    public int getNumberTrain() {
        return numberTrain;
    }
}
