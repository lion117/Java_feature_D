package com.leo.base.feature.template;

/**
 * Created by hesy on 2016/9/3.
 */



public class DynParaTemplate {
    public static <T> void out(T... args) {
        for (T t : args) {
            System.out.println(t);
        }
    }
    public static <T>  T getData(T t_data){
        System.out.println("content"+ t_data);
        return  t_data;
    }
    public static void main(String[] args) {
        out("findingsea", 123, 11.11, true);
        System.out.println(DynParaTemplate.getData(45));
        System.out.println(DynParaTemplate.getData("test"));
        System.out.println(DynParaTemplate.getData(45.254));
    }
}
