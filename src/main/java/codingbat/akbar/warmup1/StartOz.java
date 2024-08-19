package codingbat.akbar.warmup1;

public class StartOz {public String startOz(String str) {
    if(str.length() >= 2 && str.substring(0,1).equals("o") && str.substring(1,2).equals("z")){
        return "oz";
    }else if(str.length() >= 2 && str.substring(0,1).equals("o")){
        return "o";
    }else if(str.length() >= 2 && str.substring(1,2).equals("z")){
        return "z";
    }else if(str.length() == 1 && str.substring(0,1).equals("o")){
        return "o";
    }else{
        return "";
    }
}
}
