/**************************************************************************
 * Copyright (c) 2016-2017 Zhejiang TaChao Network Technology Co.,Ltd.
 * All rights reserved.
 *
 * 项目名称：浙江踏潮-基础架构
 * 版权说明：本软件属浙江踏潮网络科技有限公司所有，在未获得浙江踏潮网络科技有限公司正式授权
 *           情况下，任何企业和个人，不能获取、阅读、安装、传播本软件涉及的任何受知
 *           识产权保护的内容。                            
 ***************************************************************************/
package flyweight;

/**
 * TODO
 *
 * @author <a href="mailto:LYJ@zjtachao.com">LYJ</a>
 * @since 2.0
 */
public class FlyweightPattern {

    FlyweightFactory factory  = new FlyweightFactory();
    Flyweight flyweight1;
    Flyweight flyweight2;
    Flyweight flyweight3;
    Flyweight flyweight4;
    Flyweight flyweight5;
    Flyweight flyweight6;

    public FlyweightPattern(){
        flyweight1 = factory.getFlyWeight("Google");
        flyweight2 = factory.getFlyWeight("Qutr");
        flyweight3 = factory.getFlyWeight("Google");
        flyweight4 = factory.getFlyWeight("Google");
        flyweight5 = factory.getFlyWeight("Google");
        flyweight6 = factory.getFlyWeight("Google");
    }

    public void showFlyweight(){
        flyweight1.operation();
        flyweight2.operation();
        flyweight3.operation();
        flyweight4.operation();
        flyweight5.operation();
        flyweight6.operation();
        int objSize = factory.getFlyWeightSize();
        System.out.println("objSize = " + objSize);

    }

    public static void main(String[] args){
        System.out.println("The FlyWeight Pattern!");
        FlyweightPattern fp = new FlyweightPattern();
        fp.showFlyweight();
    }

}
