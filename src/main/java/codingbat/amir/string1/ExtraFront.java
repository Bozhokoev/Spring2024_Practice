package codingbat.amir.string1;

public class ExtraFront {

    public String extraFront(String str) {

        if (str.length() <= 1) {
            return str + str + str;
        }
        return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
    }

// Учитывая строку, верните новую строку, состоящую из трех копий первых двух
// символов исходной строки. Строка может быть любой длины.
// Если меньше двух символов, используйте все, что есть.
}
