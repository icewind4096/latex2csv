package com.company;

/**
 * Created by MMNJ002 on 2018/11/30.
 */
public class bitInfo {
    private int start;
    private int width;
    private String name;
    private String type;
    private int resetValue;
    private String descript;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getResetValue() {
        return resetValue;
    }

    public void setResetValue(int resetValue) {
        this.resetValue = resetValue;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    @Override
    public String toString() {
        return "bitInfo{" +
                "start=" + start +
                ", width=" + width +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", resetValue=" + resetValue +
                ", descript='" + descript + '\'' +
                '}';
    }
}
