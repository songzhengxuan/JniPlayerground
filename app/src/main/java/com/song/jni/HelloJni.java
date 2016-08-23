package com.song.jni;

import java.nio.ByteBuffer;

/**
 * Created by sks on 2016/8/23.
 */
public class HelloJni {
    static {
        System.loadLibrary("song");
    }
    public static native int testByteBuffer(ByteBuffer buf);
}
