/**************************************************************************
 * Copyright (c) 2016-2017 Zhejiang TaChao Network Technology Co.,Ltd.
 * All rights reserved.
 *
 * 项目名称：浙江踏潮-基础架构
 * 版权说明：本软件属浙江踏潮网络科技有限公司所有，在未获得浙江踏潮网络科技有限公司正式授权
 *           情况下，任何企业和个人，不能获取、阅读、安装、传播本软件涉及的任何受知
 *           识产权保护的内容。                            
 ***************************************************************************/
package observer;

import java.util.Vector;

/**
 * 被观察者
 *
 * @author <a href="mailto:LYJ@zjtachao.com">LYJ</a>
 * @since 2.0
 */
public abstract class Subject {

    private Vector<Observer> obs = new Vector<Observer>();

    public void addObserver(Observer obs){
        this.obs.add(obs);
    }

    public void delObserver(Observer obs){
        this.obs.remove(obs);
    }

    protected void notifyObserver(){
        for (Observer ob :obs ){
            ob.update();
        }
    }

    public abstract void doSomething();

}
