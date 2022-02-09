package org.hdbone.prototype;


import java.util.Date;

// 客户端 进行克隆
public class Cilent {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date=new Date();
        Video video=new Video("hello world",date);
        System.out.println("video(hash):"+video.hashCode());

        Video video2= (Video) video.clone();
        System.out.println("video2(hash):"+video2.hashCode());
        // 两个对象 , 内容一样, 但 hashCode 不一样

        video2.setName("hello world clone");
        System.out.println("video:"+video);
        System.out.println("video2:"+video2);

    }
}
