package com.leo.base.feature.template;

/**
 * Created by hesy on 2016/9/3.
 */

/*�������ܵ㣺
* 1 �෺�ͷ������壺����Բ������,��ȡԲ���,�ܳ�
* 2 ���Ͳ�����ͨ��������template��������,ǿ�ƽ���ת����object
* 3 ���Ʒ�Χ���ͣ� ͨ��ģ��̳����������͵ķ�ʽ, �����͵Ŀɱ䷶Χ������һ��������
* 4 �ӿڷ��ͣ����������෺�͵ķ�ʽʵ��
* 5 �������ͣ�
* 7 �ɱ�η���ʵ��
* 8 ? ͨ������Ʒ��ͣ� �� ͨ��ռλ�������� �� extend super ���Ʒ��ͷ�Χ
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
