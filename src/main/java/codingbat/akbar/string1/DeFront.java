package codingbat.akbar.string1;

public class DeFront {
    public String deFront(String str) {
        if(str.substring(0,1).equals("a") && str.substring(1,2).equals("b")){
            return str;
        }
        if(str.substring(0,1).equals("a")){
            return str.substring(0,1)+str.substring(2);
        }
        if(str.substring(1,2).equals("b")){
            return str.substring(1);
        }
        return str.substring(2);

    }
}
