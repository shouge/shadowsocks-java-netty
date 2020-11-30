package me.shouge.shadowsocks;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

public final class SocksServerInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
        channel.pipeline().addLast();
    }
}
