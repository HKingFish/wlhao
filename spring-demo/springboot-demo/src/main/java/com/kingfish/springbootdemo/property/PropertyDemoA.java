package com.kingfish.springbootdemo.property;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/5/23 14:32
 * @Des:
 */
public class PropertyDemoA {

   private PropertyDemoB propertyDemoB;
   private PropertyDemoC propertyDemoC;
   private int i;

    public void setI(int i) {
        this.i = i;
    }

    public void setPropertyDemoB(PropertyDemoB propertyDemoB) {
        this.propertyDemoB = propertyDemoB;
    }

    public void setPropertyDemoC(PropertyDemoC propertyDemoC) {
        this.propertyDemoC = propertyDemoC;
    }
}