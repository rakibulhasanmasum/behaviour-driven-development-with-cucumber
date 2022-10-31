package com.alpine.pageObjects.trips;

class WaitExplicit {
    static void wait(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
