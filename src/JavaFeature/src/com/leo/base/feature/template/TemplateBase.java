package com.leo.base.feature.template;

/**
 * Created by hesy on 2016/9/3.
 */

/*基本功能点：
* 1 类泛型方法定义：定义圆心坐标,获取圆面积,周长
* 2 类型擦除：通过不定义template具体类型,强制将其转化成object
* 3 限制范围泛型： 通过模板继承至具体类型的方式, 将泛型的可变范围限制在一个区域内
* 4 接口泛型：采用类似类泛型的方式实现
* 5 方法泛型：
* 7 可变参泛型实现
* 8 ? 通配符限制泛型： ？ 通过占位符的性质 和 extend super 限制泛型范围
*
*
*
*
*
*
*
*
*
*
* */





public class TemplateBase {



    public static  void main(String []args){

        Circle<Double , Double> i_circle = new  Circle<Double , Double>();
        i_circle.setData(45.2d,42.36d , 1d);
        i_circle.whoAmI();

        CirclePro<Integer> i_circlepro = new CirclePro<Integer>();
        i_circlepro.setData(45,23);
        i_circlepro.whoAmI();




    }


    public static class Circle<T1,T2>{
        public T1 _x_dot;
        public T1 _y_dot;
        public T2 _radius;
        public void  setData(T1 t_x, T1 t_y,T2  t_radius){
            _x_dot = t_x;
            _y_dot = t_y;
            _radius = t_radius;
        }
        public void whoAmI(){
            System.out.println("Circle x : " + _x_dot  + " y:  " + _y_dot + " radius : " + _radius);
        }
    }


    public static class CirclePro<T1 extends  Number>{
        public T1 _x_dot;
        public T1 _y_dot;
        public void  setData(T1 t_x, T1 t_y){
            _x_dot = t_x;
            _y_dot = t_y;
        }
        public void whoAmI(){
            System.out.println("Circle x : " + _x_dot  + " y:  " + _y_dot);
        }
    }

}
