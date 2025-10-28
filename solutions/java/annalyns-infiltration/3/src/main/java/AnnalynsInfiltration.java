class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    
        /* if (knightIsAwake == false) {
            return true;
        }
        else {
            return false;
        }*/
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
        
        /*if (knightIsAwake == true || archerIsAwake == true || prisonerIsAwake == true) {
            return true;
        }
        else {
            return false;
        }*/
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return prisonerIsAwake && !archerIsAwake;
    
        /*if (archerIsAwake == true) {
            return false;
        }
        else if (prisonerIsAwake == true) {
            return true;
        }
        else {
            return false;
        }*/
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return (petDogIsPresent && !archerIsAwake) || (!petDogIsPresent && prisonerIsAwake) && (!archerIsAwake && !knightIsAwake);
     
        /*if (petDogIsPresent == true && archerIsAwake == false) {
            return true;
        }
        else if (petDogIsPresent == false && prisonerIsAwake == true && (archerIsAwake == false && knightIsAwake == false)) {
            return true;
        }
        else return false;*/
    }
}
