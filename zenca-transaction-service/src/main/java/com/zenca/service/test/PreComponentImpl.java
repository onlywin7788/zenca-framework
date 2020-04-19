package com.zenca.service.test;

import com.zenca.service.spec.component.AbstractPreComponent;

public class PreComponentImpl extends AbstractPreComponent {

    @Override
    public void initialize() throws Exception {
        System.out.println("pre - init");
    }
}
