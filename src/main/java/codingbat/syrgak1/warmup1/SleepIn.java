package codingbat.syrgak1.warmup1;

public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else
        {
            return false;
        }
    }
}
