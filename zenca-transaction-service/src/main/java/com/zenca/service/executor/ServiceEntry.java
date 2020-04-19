package com.zenca.service.executor;

import com.zenca.service.spec.component.AbstractPostComponent;
import com.zenca.service.spec.component.AbstractPreComponent;
import com.zenca.service.test.PostComponentImpl;
import com.zenca.service.test.PreComponentImpl;

public class ServiceEntry {

    AbstractPreComponent preComponent = null;
    AbstractPostComponent postComponent = null;

    public ServiceEntry() throws Exception{
        loadComponent();
    }

    public void loadComponent() throws Exception
    {
        try {
            // class dynamic loading
            Class dynamicPreComponentClass = Class.forName("com.zenca.service.test.PreComponentImpl");
            Class dynamicPostComponentClass = Class.forName("com.zenca.service.test.PostComponentImpl");

            Object dynamicPreComponentInstance = dynamicPreComponentClass.getDeclaredConstructor().newInstance();
            Object dynamicPostComponentInstance = dynamicPostComponentClass.getDeclaredConstructor().newInstance();

            // upcasting super class
            preComponent = (PreComponentImpl) dynamicPreComponentInstance;
            postComponent = (PostComponentImpl) dynamicPostComponentInstance;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void execute() throws Exception {

        try {
            // initialize
            System.out.println("initialize");
            preComponent.initialize();
            postComponent.initialize();

            // connect
            preComponent.connect();
            postComponent.connect();

            // execute
            preComponent.execute();
            postComponent.execute();

            preComponent.commit();
            postComponent.commit();
        }
        catch (Exception e)
        {
            // uninitialize
            preComponent.uninitialize();
            postComponent.uninitialize();

            // disconnect
            preComponent.disconnect();
            postComponent.disconnect();

            e.printStackTrace();
            throw e;
        }
    }
}
