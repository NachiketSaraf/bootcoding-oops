package com.bootcoding.oops.inheritance.banner;

public class BannerApplication {
    public static void main(String[] args) {
        FlexBanner fb = new FlexBanner();
        fb.material = "New batches of java is starting soon";
        fb.type = "Flex banner";
        //fb.create();
        fb.display();
    }
}
