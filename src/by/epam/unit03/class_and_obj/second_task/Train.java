package by.epam.unit03.class_and_obj.second_task;

public class Train {
    private String destination;
    private int numberTrain;
    private double departureTime;

    protected void setDestination(String destination) {
        this.destination = destination;
    }
    protected void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }
    protected void setNumberTrain(int numberTrain) {
        this.numberTrain = numberTrain;
    }

    protected String getDestination() {
        return destination;
    }
    protected double getDepartureTime() {
        return departureTime;
    }
    protected int getNumberTrain() {
        return numberTrain;
    }
}
