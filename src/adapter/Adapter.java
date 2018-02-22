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
 *  适配器（Adapter）：通过包装一个需要适配的对象，把原接口转换成目标接口。　　
 *
 * @author <a href="mailto:LYJ@zjtachao.com">LYJ</a>
 * @since 2.0
 */
// 适配器类，继承了被适配类，同时实现标准接口
public class Adapter  implements Target {

    // 直接关联被适配类
    private Adaptee adaptee;

    // 可以通过构造函数传入具体需要适配的被适配类对象
    public Adapter(Adaptee adaptee){
        this.adaptee=adaptee;
    }

    @Override
    public void request() {
        this.adaptee.specificRequest();
    }
}
