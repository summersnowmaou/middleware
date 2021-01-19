package com.debug.middleware.server;

import com.debug.middleware.server.entity.Book;

import java.math.BigDecimal;
import java.util.*;

public class HelloWorld {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int i=0;
        while (i<3) {
            Map<Integer, Integer> integerIntegerMap = mapInfo(i);
            map.putAll(integerIntegerMap);
            i++;
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }

    public static Map<Integer, Integer> mapInfo(int value){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(value,value);
        return map;
    }
    public static List<Book> bookInfo(){
        List<Book> list = new ArrayList<>();
        Book book = new Book();
        book.setBookNo(12);
        book.setName("ada");
        Book book1 = new Book();
        book1.setBookNo(12);
        book1.setName("asd");
        Book book2 = new Book();
        book2.setBookNo(22);
        book2.setName("wad");
        list.add(book);
        list.add(book1);
        list.add(book2);
        list.add(null);

        return list;
    }


}
