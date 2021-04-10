package StringManipulation;

import java.util.Arrays;
import java.util.Collections;

public class StringManipulate {

    public String trimAndConcat(String a, String b){
       String str1 =  a.trim();
       String str2 =  b.trim();
        String str3 = str1.concat(str2);
        return str3;
    }

    public Integer getIndexOrNull(String str, char c){
        return str.indexOf(c);
    }

    public Integer getIndexOrNull(String str1, String str2){
        return str1.indexOf(str2);

    }
    public String concatSubstring(String str1, int x, int y, String str2) {
        Integer beginIndex = x;
        Integer endIndex = y;
        String substring = str1.substring(beginIndex, endIndex);


        if(x<0 && y <0){
            return str2;
        }
        else{
            return  substring.concat(str2);
        }

    }

}
