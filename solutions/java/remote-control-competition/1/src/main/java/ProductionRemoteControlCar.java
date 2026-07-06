class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    int distanceDriven = 0;
    int numberOfVictories = 0;
    
    public void drive() {
      distanceDriven += 10;      
    }

    public int getDistanceTravelled() {
        return distanceDriven;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    public int compareTo(ProductionRemoteControlCar other){
        return Integer.compare(other.getNumberOfVictories(), this.getNumberOfVictories());
    }
}
