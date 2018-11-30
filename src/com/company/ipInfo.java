package com.company;

import java.util.ArrayList;

/**
 * Created by MMNJ002 on 2018/11/30.
 */
public class ipInfo {
    private String name;
    private ArrayList<registerInfo> registers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<registerInfo> getRegisters() {
        return registers;
    }

    public void setRegisters(ArrayList<registerInfo> registers) {
        this.registers = registers;
    }
}
