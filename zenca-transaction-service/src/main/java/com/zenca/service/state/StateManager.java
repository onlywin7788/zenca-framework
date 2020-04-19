package com.zenca.service.state;

public class StateManager implements Runnable{

    @Override
    public void run() {
        while(true) {

            try {
                System.out.println("hello run");

                Thread.sleep(5000);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
