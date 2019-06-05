package me.newtrekwang.jnademo.utils;

import com.sun.jna.Library;
import com.sun.jna.Native;

/**
 * @author newtrekWang
 * @fileName Clibrary
 * @createDate 2019/6/5 10:36
 * @email 408030208@qq.com
 * @desc 底层库函数 桥接
 */
public interface Clibrary extends Library {

    Clibrary INSTANCE = Native.loadLibrary("hello",Clibrary.class);

   int add(int x,int y);
}
