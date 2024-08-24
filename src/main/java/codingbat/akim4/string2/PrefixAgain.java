package codingbat.akim4.string2;

public class PrefixAgain {
    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n); // Получаем предполагаемый префикс строки
        for(int i = n; i <= str.length()-n; i++){
            if(prefix.equals(str.substring(i, n + i))){
                return true;
            }
        } return false;
    }
}
