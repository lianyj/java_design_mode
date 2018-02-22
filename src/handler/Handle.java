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
public abstract class Handle {

    private Handle nextHandler;

    protected abstract Level getHandlerLevel();

    public abstract Response response(Request request);

    public final Response handleRequest(Request request){
        Response response = null;

        if (this.getHandlerLevel().above(request.getLevel())){
            response = this.response(request);
        }else {
            if(this.nextHandler != null){
                this.nextHandler.handleRequest(request);
            }else {
                System.out.println("----没有合适的处理器-----");
            }
        }
        return response;
    }

    public void setNextHandler(Handle handler){
        this.nextHandler = handler;
    }
}
