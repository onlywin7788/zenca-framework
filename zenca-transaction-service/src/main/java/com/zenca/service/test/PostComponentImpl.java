package com.zenca.service.test;

import com.zenca.service.spec.component.AbstractPostComponent;

public class PostComponentImpl extends AbstractPostComponent {

    @Override
    public void initialize() throws Exception {
        System.out.println("post - init");
    }
}
