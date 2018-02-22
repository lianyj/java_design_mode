/**************************************************************************
 * Copyright (c) 2016-2017 Zhejiang TaChao Network Technology Co.,Ltd.
 * All rights reserved.
 *
 * 项目名称：浙江踏潮-基础架构
 * 版权说明：本软件属浙江踏潮网络科技有限公司所有，在未获得浙江踏潮网络科技有限公司正式授权
 *           情况下，任何企业和个人，不能获取、阅读、安装、传播本软件涉及的任何受知
 *           识产权保护的内容。                            
 ***************************************************************************/
package adapter;

/**
 * 需要适配的类（Adaptee）：需要适配的类或适配者类。
 *
 * @author <a href="mailto:LYJ@zjtachao.com">LYJ</a>
 * @since 2.0
 */
// 已存在的、具有特殊功能、但不符合我们既有的标准接口的类
public class Adaptee {

    public void specificRequest(){
        System.out.println("被适配类具有的特使功能。。。");
    }
}
