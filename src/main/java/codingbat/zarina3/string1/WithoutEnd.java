package codingbat.zarina3.string1;

public class WithoutEnd {
    public String withoutEnd(String str) {
        String str2 = str.substring(1, str.length() - 1);
        return str2;
    }
}
