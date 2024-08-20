package codingbat.akim3.string1;

public class WithoutX {
    public String withoutX(String str) {
        // Check if the first character is 'x'
        if (str.length() > 0 && str.charAt(0) == 'x') {
            // Remove the first character
            str = str.substring(1, str.length());
        }
        // Check if the last character is 'x'
        if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
            // Remove the last character
            str = str.substring(0, str.length() - 1);
        }
        // Return the modified string
        return str;
    }
}
