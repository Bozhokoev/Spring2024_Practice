package codingbat.janat.warmup1;

public class StartOz {
    public String startOz(String str) {
        if (str.isEmpty()){
            return "";
        }
        String str1 = str.substring(0,1);
        if (str.startsWith("oz")){
            String str2 = str.substring(1,2);
            return str1 + str2;
        }
        if (str.startsWith("o")){
            return str1;
        }
        if (str.substring(1,2).equals("z")){
            return "z";
        }

        return "";
    }

}
