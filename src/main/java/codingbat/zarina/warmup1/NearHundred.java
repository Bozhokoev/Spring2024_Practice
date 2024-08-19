<<<<<<< HEAD:src/main/java/codingbat/zarina/warmup1/NearHundred.java
package codingbat.zarina.warmup1;

public class NearHundred {
    public boolean nearHundred(int n) {
        return (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10);
    }

=======
package codingbat.dana.warmup1;

public class NearHundred {
    public boolean nearHundred(int n) {
        if (Math.abs (200 - n) <= 10 || Math.abs (100 - n) <=10) {
            return true;
        } else {
            return false;
        }
    }
>>>>>>> origin/master:src/main/java/codingbat/dana/warmup1/NearHundred.java
}
