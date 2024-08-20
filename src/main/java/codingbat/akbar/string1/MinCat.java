package codingbat.akbar.string1;

public class MinCat {public String minCat(String a, String b) {
    if(a.length()==b.length()){
        return a+b;
    }else if(a.length() > b.length()){
        int bl = b.length();
        return a.substring(a.length()-bl)+b;
    }else if(b.length() > a.length()){
        int al = a.length();
        return a+b.substring(b.length()-al);
    }else {
        return a +b;
    }
}
}
