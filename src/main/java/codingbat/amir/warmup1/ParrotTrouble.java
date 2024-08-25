package codingbat.amir.warmup1;

public class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking){
            if (hour > 7 && hour > 20 || hour == 6){
                return true;
            }
            return false;
        }
        return false;
    }
}
