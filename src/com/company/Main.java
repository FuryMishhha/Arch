package com.company;

public class Main {

    public static void main(String[] args) {
        Object obj = new Object();
        Thread ping = new Thread(new PingPong(obj,"ping"));
        Thread pong = new Thread(new PingPong(obj,"pong"));
        ping.start();
        pong.start();
    }
}
