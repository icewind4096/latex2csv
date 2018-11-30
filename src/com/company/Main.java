package com.company;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        if (misc.fileExists(args[0]) == false){
            System.out.println("fileName not valid: " + args[0]);
        }

        HashMap<String, String> ipFiles = new HashMap<String, String>();
        if (new MainTex(args[0]).getIPList(ipFiles) == false){
            System.out.println("getIPList error: ");
        }

        for (Map.Entry<String, String> entry : ipFiles.entrySet()){
            System.out.println("process ip->path: " + entry.getKey() + entry.getValue());

        }
    }
}
