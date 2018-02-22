/**************************************************************************
 * Copyright (c) 2016-2017 Zhejiang TaChao Network Technology Co.,Ltd.
 * All rights reserved.
 *
 * 项目名称：浙江踏潮-基础架构
 * 版权说明：本软件属浙江踏潮网络科技有限公司所有，在未获得浙江踏潮网络科技有限公司正式授权
 *           情况下，任何企业和个人，不能获取、阅读、安装、传播本软件涉及的任何受知
 *           识产权保护的内容。                            
 ***************************************************************************/
package memento;

/**
 * 备忘录：负责存储发起人对象的内部状态，在需要的时候提供发起人需要的内部状态。
 *
 * @author <a href="mailto:LYJ@zjtachao.com">LYJ</a>
 * @since 2.0
 */
public class Memento {

    private String state ="";

    public Memento(String state){
        this.state=state;
    }

    public String getState() {
        return state;
    }
    public void setState(String state){
        this.state=state;
    }
}
