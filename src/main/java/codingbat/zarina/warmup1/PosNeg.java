<<<<<<< HEAD:src/main/java/codingbat/zarina/warmup1/PosNeg.java
package codingbat.zarina.warmup1;

public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
=======
package codingbat.dana.warmup1;

public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative){
            if (a < 0 && b < 0){
                return true;
            }
        } else if (!negative){
            if ((a > 0 && b < 0) || (a < 0 && b > 0)){
                return true;
            }
        }
        return false;
>>>>>>> origin/master:src/main/java/codingbat/dana/warmup1/PosNeg.java
    }
}
