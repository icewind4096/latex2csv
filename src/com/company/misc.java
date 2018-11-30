package com.company;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by MMNJ002 on 2018/11/29.
 */
public class misc {
    public static boolean fileExists(String fileName){
        File file = new File(fileName);
        return (file.exists()) && (file.isFile());
    }

    public static String hashMapToString(HashMap<String, String> hashMap) {
        String result = "";
        for (Map.Entry<String, String> entry : hashMap.entrySet()){
            result = result + entry.getKey() + "->" + entry.getValue() + "\r\n";
        }
        return result;
    }
}
