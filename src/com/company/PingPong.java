package com.company;

public class PingPong implements Runnable{
    private Object obj;
    private String str;

    public PingPong(Object obj, String str) {
        this.obj = obj;
        this.str = str;
    }

    @Override
    public void run() {
        synchronized (obj){
            while (true){
                System.out.println(str);
                obj.notify();
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
