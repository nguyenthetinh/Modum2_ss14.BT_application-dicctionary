package srvice;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class AppDictionary implements Dictionary {

   private static Map<String, String> dic;

    static {
        dic =new HashMap<>();
        dic.put("hello" , "xin chào");
        dic.put("how" , "Thế nào");
        dic.put("book" , "Quyển vở");
        dic.put("computer" , "Máy tính");
    }
    @Override
    public String translate(String word) {
        String result = dic.get(word);

        if (result == null )
        return "Not found";
        else {
            return result;
        }
    }
}
