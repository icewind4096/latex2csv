package com.company;

import java.util.ArrayList;

/**
 * Created by MMNJ002 on 2018/11/30.
 */
public class registerInfo {
    private int baseAddress;
    private int offset;
    private String name;
    private String descript;
    private String resetValue;
    private ArrayList<bitInfo> bits;

    public registerInfo() {
        bits = new ArrayList<bitInfo>();
    }

    public void add(bitInfo bitInfo){
        bits.add(bitInfo);
    }

    @Override
    public String toString() {
        return "registerInfo{" +
                "baseAddress=" + baseAddress +
                ", offset=" + offset +
                ", name='" + name + '\'' +
                ", descript='" + descript + '\'' +
                ", resetValue='" + resetValue + '\'' +
                ", bits=" + getBitsText(bits) +
                '}';
    }

    private String getBitsText(ArrayList<bitInfo> bits) {
        String text = "";
        for (int i = 0; i < bits.size(); i ++){
            bitInfo bitInfo = bits.get(i);
            text = text + bitInfo.toString();
        }
        return text;
    }
}
