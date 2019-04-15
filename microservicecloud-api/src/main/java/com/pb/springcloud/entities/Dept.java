package com.pb.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author haohan
 * 04/08/2019 - 04:28 下午
 */
@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain = true)        //链式风格访问
public class Dept implements Serializable {

    private Long deptno;
    private String dname;
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }

//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2");
////        list.removeIf("2"::equals);
//        synchronized (list) {
//            Iterator<String> it = list.iterator();
//            while (it.hasNext()) {
//                String next = it.next();
//                if("2".equals(next)) {
//                    it.remove();
//                }
//            }
//        }
//        System.out.println(list.size());
//    }

}
