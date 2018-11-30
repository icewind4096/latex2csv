package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by MMNJ002 on 2018/11/30.
 */
public class mainTex {
    private String fileName;

    public mainTex(String fileName) {
        this.fileName = fileName;
    }

    public boolean isSourceFile(String content) {
        Pattern pattern = Pattern.compile("\\\\include\\{src/[A-Za-z&]+/[Mm][ZzTt][0-9]+_MM32[A-Za-z0-9&]+_[A-Za-z0-9&_]+}");
        return pattern.matcher(content).matches();
    }

    private String pickIPNameFromText(String lineText) {
        return lineText.substring(lineText.lastIndexOf("_") + 1, lineText.lastIndexOf("}")).trim();
    }

    public boolean getIPList(HashMap<String, String> ipFileList){
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(new FileInputStream(fileName), "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String lineText = null;
            while ((lineText = bufferedReader.readLine()) != null){
                if (isSourceFile(lineText.trim()) == true){
                    ipFileList.put(pickIPNameFromText(lineText), lineText.trim());
                }
            }
            return true;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
