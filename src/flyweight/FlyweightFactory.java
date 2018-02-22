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

import java.util.Hashtable;

/**
 * 实现一个工厂方法类
 * @author <a href="mailto:LYJ@zjtachao.com">LYJ</a>
 * @since 2.0
 */
public class FlyweightFactory {

    private Hashtable flyweights = new Hashtable();//定义了一个Hashtable用来存储各个对象

    public FlyweightFactory(){};

    public Flyweight getFlyWeight(Object o){
        Flyweight flyweight = (Flyweight)flyweights.get(o);//选出要实例化的对象
        if(flyweight==null){//产生新的ConcreteFlyweight
            flyweight = new ConcreteFlyweight(o.toString());
            flyweights.put(o,flyweight);
        }
        return flyweight;//将该对象返回，如果在Hashtable中没有要选择的对象，此时变量flyweight为null，产生一个新的flyweight存储在Hashtable中，并将该对象返回
    }

    public int getFlyWeightSize(){
        return flyweights.size();
    }
}
