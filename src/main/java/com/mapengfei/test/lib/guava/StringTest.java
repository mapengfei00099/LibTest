package com.mapengfei.test.lib.guava;

import com.google.common.base.Strings;

/**
 * Created by mapengfei on 15/12/27.
 */
public class StringTest {
    public static void main(String[] args) {
        System.out.println(Strings.commonPrefix("abc","adc"));
        System.out.println(Strings.repeat("x",10));
    }


}
