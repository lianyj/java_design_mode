/**************************************************************************
 * Copyright (c) 2016-2017 Zhejiang TaChao Network Technology Co.,Ltd.
 * All rights reserved.
 *
 * 项目名称：浙江踏潮-基础架构
 * 版权说明：本软件属浙江踏潮网络科技有限公司所有，在未获得浙江踏潮网络科技有限公司正式授权
 *           情况下，任何企业和个人，不能获取、阅读、安装、传播本软件涉及的任何受知
 *           识产权保护的内容。                            
 ***************************************************************************/
package proxy;

/**
 * TODO
 *
 * @author <a href="mailto:LYJ@zjtachao.com">LYJ</a>
 * @since 2.0
 */
public class run_main {

    public static void main(String[] args){
        people people_1 = new people();
        people_1.setCash(60000);
        people_1.setUsername("jack");

        people people_2 = new people();
        people_2.setCash(40000);
        people_2.setUsername("rose");

        people people_3 = new people();
        people_3.setCash(0);
        people_3.setUsername("tom");
        people_3.setVip("vip");

        proxyclass proxy_buy = new proxyclass();
        proxy_buy.setPeople(people_1);
        proxy_buy.buy_mycar();

        proxy_buy.setPeople(people_2);
        proxy_buy.buy_mycar();

        proxy_buy.setPeople(people_3);
        proxy_buy.buy_mycar();



    }
}
