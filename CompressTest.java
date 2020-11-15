package com.test.pic.compress.demo;

import net.coobird.thumbnailator.Thumbnails;

import java.io.IOException;
import java.util.Date;

/**
 * 请填写类的描述
 *
 * @author zhangna12
 * @date 2020-11-15
 */
public class CompressTest {


    public static void main(String[] args) {
        try {
            Date start = new Date();
            Thumbnails.of(CompressTest.class.getClassLoader().getResource("image/2M.jpg"))
                    .scale(0.5)
                    .toFile("/Users/zhangna12/IdeaProjectsMore/PicCompressDemo/test.jpg");
            Date end = new Date();
            System.out.println(end.getTime()-start.getTime());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
