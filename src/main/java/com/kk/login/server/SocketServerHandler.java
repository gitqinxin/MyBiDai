package com.kk.login.server;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by user on 2017/6/12.
 */
public class SocketServerHandler extends SimpleChannelInboundHandler<String> {
    private static final Log logger = LogFactory.getLog(LoginSocketServer.class);

    @Override
    public void exceptionCaught(ChannelHandlerContext arg0, Throwable arg1) throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public void channelRead(ChannelHandlerContext arg0, Object msg) throws Exception {
        // TODO Auto-generated method stub
        String data = msg.toString();
        logger.info("客户端的内容：data="+data);
    }

    protected void channelRead0(ChannelHandlerContext channelHandlerContext, String data) throws Exception {
        logger.info("数据内容：data="+data);
    }
}