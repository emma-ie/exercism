
class BirdWatcher {
    private final int[] birdsPerDay;
    private int[] birdsLastWeek = new int[] {0, 2, 5, 3, 7, 8, 4};

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsLastWeek;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        int arrayLen = birdsPerDay.length;
        for (int i = 0; i < arrayLen; i++) {
            if (birdsPerDay[i] == 0) {
                return true;
            }
        } return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int counter = 0; 
        for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++) {
            counter += birdsPerDay[i];
        } return counter;
    }

    public int getBusyDays() {
        int len = birdsPerDay.length;
        int busyDay = 0;
        for (int i = len - 1; i > 0; i--) {
            if (birdsPerDay[i] >= 5) {
                busyDay++;
            }
        } return busyDay;
    }
}
