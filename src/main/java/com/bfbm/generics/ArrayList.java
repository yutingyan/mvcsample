package com.bfbm.generics;

import java.util.Date;

/**
 * A customized ArrayList.
 *
 * @author 巴分巴秒-Eric老师
 * @Date 2019/08/18
 * @since v1.1
 **/
public class ArrayList {

        private Object[] objs = new Object[10];

        private int i = 0;

        public void add(Object obj) {
            objs[i++] = obj;
        }

        public Object get(int i) {
            return objs[i];
        }


    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("level1");
        list.add(new Date());

        String str = (String)list.get(0);

        System.out.println(str);

//        ArrayList<String> list = new ArrayList<String>();
//        list.add("level1");
//        String str = list.get(0);
    }
}
