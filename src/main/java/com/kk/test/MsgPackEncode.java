package com.kk.test;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.io.IOException;
import org.msgpack.MessagePack;
/**
 * ±àÂë¹¤¾ß
 */
public class MsgPackEncode extends MessageToByteEncoder<IMMessage>{
    @Override
    protected void encode(ChannelHandlerContext ctx, IMMessage msg, ByteBuf out) throws IOException {
        out.writeBytes(new MessagePack().write(msg));
    }
}
