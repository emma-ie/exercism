public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if (speed == 10) {
            return speed * 221 * 0.77;
        }
        else if (speed == 9) {
            return speed * 221 * 0.80;
        }
        else if (speed >= 5 && speed <= 8) {
            return speed * 221 * 0.90;
        }
        else if (speed < 5) { 
            return speed * 221;
        }
        else {
            return 0;
        }    
    }

    public int workingItemsPerMinute(int speed) {
        double prodRate = productionRatePerHour(speed);
        int itemsPerMin = (int) prodRate / 60;
        return itemsPerMin;
    }
}
