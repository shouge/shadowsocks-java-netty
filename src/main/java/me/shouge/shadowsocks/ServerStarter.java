package me.shouge.shadowsocks;

public class ServerStarter {

    public static void main(String[] args) {
        new SocksServer(1080).start();
    }
}