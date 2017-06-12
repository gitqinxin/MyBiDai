package com.kk.test;


import com.sun.deploy.util.SessionState;
import com.sun.security.ntlm.Client;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import java.io.IOException;

import static com.kk.test.IMConfig.TYPE_CONNECT;

public class ClientHandler extends ChannelInboundHandlerAdapter implements BaseConfig {
    private ChannelHandlerContext ctx;
    /**
     * tcp��·�����ɹ������
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("�ɹ����ӷ�����");
        this.ctx = ctx;
        IMMessage message = new IMMessage(
                APP_IM,
                CLIENT_VERSION,
               110,
                TYPE_CONNECT,
                SERVER_ID,
                "");
        sendMsg(message);
    }
    /**
     * ������Ϣ
     * @param msg
     * @return
     * @throws IOException
     */
    public boolean sendMsg(IMMessage msg) throws IOException {
        System.out.println("client:" + msg);
        ctx.channel().writeAndFlush(msg);
        return msg.getMsg().equals("q") ? false : true;
    }
    /**
     * �յ���Ϣ�����
     * @throws IOException
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws IOException {
        IMMessage m = (IMMessage)msg;
        System.out.println(m.getUid() + ":" + m.getMsg());
    }
    /**
     * �����쳣ʱ����
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        System.err.println("��������Ͽ�����:"+cause.getMessage());
        ctx.close();
    }
}