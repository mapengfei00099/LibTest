package com.mapengfei.test.lib.guava;

import com.google.common.base.Preconditions;

/**
 * Created by mapengfei on 15/12/27.
 */
public class PreconditionTest {
    public static void main(String[] args) {
        Preconditions.checkArgument(1==0,"error");
    }
}
