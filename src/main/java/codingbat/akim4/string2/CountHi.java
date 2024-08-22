package codingbat.akim4.string2;

public class CountHi {
    public int countHi(String str) {
        int count = 0;
        int index = str.indexOf("hi");
        while (index != -1) {
            count++;
            index = str.indexOf("hi", index + 1);
        }return count;
    }
}
