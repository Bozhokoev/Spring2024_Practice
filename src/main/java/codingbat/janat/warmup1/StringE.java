package codingbat.janat.warmup1;

public class StringE {
    public boolean stringE(String str) {
        int countE = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e'){
                countE++;
            }
        }

        if (countE >=1 && countE <= 3){
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'e'){
                return false;
            }

        }
        return false;
    }
}
