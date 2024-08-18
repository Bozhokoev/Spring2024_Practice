package codingbat.akim.warmup1;

public class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        if ((hour > 20) || (hour >=0 && hour <7)) {
            return talking;
        } else {
            return false;
        }
    }
}
