package org.hdbone.prototype;

import java.util.Date;

// 视频的原型
public class Video implements Cloneable{
    private String name;
    private Date createTime;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public Video() {
    }
    public Video(String name, Date createTime) {
        this.name = name;
        this.createTime = createTime;
    }
    public void setName(String name) {
        this.name=name;
    }
}
