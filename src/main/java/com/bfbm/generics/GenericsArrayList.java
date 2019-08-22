package com.bfbm.generics;

import java.util.Arrays;
import java.util.Date;

/**
 * A customized GenericsArrayList.
 *
 * @author 巴分巴秒-Eric老师
 * @Date 2019/08/18
 * @since v1.1
 **/
public class GenericsArrayList<E > {

        private Object[] elementData;

        private int size = 0;

        public GenericsArrayList(int initialCapacity) {
            this.elementData = new Object[initialCapacity];
        }

        public boolean add(E e) {
            elementData[size++] = e;
            return true;
        }

        E get(int index) {
            return (E) elementData[index];
        }

        public <T> T[] toArray(T[] a) {
            return (T[]) Arrays.copyOf(elementData, size, a.getClass());
        }


    public static void main(String[] args) {
        GenericsArrayList<Date> list = new GenericsArrayList<Date>(100);

        list.add(new Date());
        Date date = list.get(0);

        System.out.println(date);



//        GenericsArrayList<String> strList = new GenericsArrayList<>(100);
//        strList.add("1");
//        strList.add("2");
//        strList.add("3");
//        strList.add("4");
//
//        for (String str : strs) {
//            System.out.println(str);
//        }
    }

}
