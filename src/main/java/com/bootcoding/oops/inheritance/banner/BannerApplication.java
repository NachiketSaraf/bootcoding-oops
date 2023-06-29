package com.bootcoding.oops.inheritance.banner;

public class BannerApplication {
    public static void main(String[] args) {
        Banner bn = new Banner();
        bn.color = "white";
        bn.material = "Hello Java";
        bn.type="Banner";
        bn.display();
        FlexBanner fb = new FlexBanner();
        fb.material = "New batches of java is starting soon";
        fb.type = "Flex banner";

        fb.create();
        fb.display();
    }
}
