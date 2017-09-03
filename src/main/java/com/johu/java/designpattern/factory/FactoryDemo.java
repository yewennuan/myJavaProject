package com.johu.java.designpattern.factory;

/**
 * 工厂模式分3中. 1.简单工厂模式 2.工厂模式 3.抽象工厂模式
 * 简单工厂模式： 工厂类没有定义为接口，一个工厂类生产1个产品（产品可以不同），违背开闭原则
 * 工厂模式：    工厂类定义为接口，通过实现接口生产出1个产品（一种实现生成一种产品），遵循开闭原则
 * 抽象工厂模式： 工厂类定义为接口，通过实现接口生产多个产品，遵循开闭原则
 * Created by johu on 17-8-25.
 */
public class FactoryDemo {
    public static void main(String[] args) {
        SimpleFactoryDemo simpleFactoryDemo = new SimpleFactoryDemo();
        Product product = simpleFactoryDemo.getProduct(1);

    }


}

class SimpleFactoryDemo{
    public Product getProduct(int type){
        switch (type){
            case 1:
                return new ProductA();
            case 2:
                return new ProductB();
        }
        return null;
    }
}


