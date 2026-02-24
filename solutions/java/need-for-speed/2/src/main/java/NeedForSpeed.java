class NeedForSpeed {
    protected int speed;
    protected int batteryDrain;
    private int distanceDriven = 0;
    private int battery = 100;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        if (this.battery < this.batteryDrain){
            return true;
        } else {
            return false;
        }
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()){
            this.distanceDriven = this.distanceDriven + this.speed;
            this.battery -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int remainderToDrive = this.distance % car.speed;
        int timesToDrive = (this.distance / car.speed);
        if (remainderToDrive > 0){
            timesToDrive++;
        }
        if (((car.batteryDrain * timesToDrive) > 100)){
            return false;
        }
        return true;
    }
}
