package com.bfbm.generics;

import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/**
 * A customized CollectionTest.
 *
 * @author 巴分巴秒-Eric老师
 * @Date 2019/08/18
 * @since v1.0
 **/
public class CollectionTest<T> {

    private static final int COPY_THRESHOLD           =   10;

    public static <T> void copy(List<? super T> dest, List<? extends T> src) {
        int srcSize = src.size();
        if (srcSize > dest.size())
            throw new IndexOutOfBoundsException("Source does not fit in dest");

        if (srcSize < COPY_THRESHOLD ||
                (src instanceof RandomAccess && dest instanceof RandomAccess)) {
            for (int i=0; i<srcSize; i++)
                dest.set(i, src.get(i));
        } else {
            ListIterator<? super T> di=dest.listIterator();
            ListIterator<? extends T> si=src.listIterator();
            for (int i=0; i<srcSize; i++) {
                di.next();
                di.set(si.next());
            }
        }
    }
}
