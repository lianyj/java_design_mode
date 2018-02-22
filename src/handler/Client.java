/**************************************************************************
 * Copyright (c) 2016-2017 Zhejiang TaChao Network Technology Co.,Ltd.
 * All rights reserved.
 *
 * 项目名称：浙江踏潮-基础架构
 * 版权说明：本软件属浙江踏潮网络科技有限公司所有，在未获得浙江踏潮网络科技有限公司正式授权
 *           情况下，任何企业和个人，不能获取、阅读、安装、传播本软件涉及的任何受知
 *           识产权保护的内容。                            
 ***************************************************************************/
package handler;

/**
 * TODO
 *
 * @author <a href="mailto:LYJ@zjtachao.com">LYJ</a>
 * @since 2.0
 */
public class Client {

    public static void main(String[] args){
        Handle handle1 = new ConcreteHandler1();
        Handle handle2 = new ConcreteHandler2();
        Handle handle3 = new ConcreteHandler3();
        handle1.setNextHandler(handle2);
        handle2.setNextHandler(handle3);


        Response response = handle1.handleRequest(new Request(new Level(7)));
    }
}
