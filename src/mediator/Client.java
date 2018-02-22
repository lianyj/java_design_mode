/**************************************************************************
 * Copyright (c) 2016-2017 Zhejiang TaChao Network Technology Co.,Ltd.
 * All rights reserved.
 *
 * 项目名称：浙江踏潮-基础架构
 * 版权说明：本软件属浙江踏潮网络科技有限公司所有，在未获得浙江踏潮网络科技有限公司正式授权
 *           情况下，任何企业和个人，不能获取、阅读、安装、传播本软件涉及的任何受知
 *           识产权保护的内容。                            
 ***************************************************************************/
package mediator;

/**
 * TODO
 *
 * @author <a href="mailto:LYJ@zjtachao.com">LYJ</a>
 * @since 2.0
 */
public class Client {

    public static void main(String[] args){

        AbstractColleague colleagueA = new ColleagueA();
        AbstractColleague colleagueB = new ColleagueB();

        AbstractMediator am = new Mediator(colleagueA,colleagueB);

        System.out.println("=========设置A影响B========");
        colleagueA.setNumber(1288,am);
        System.out.println("collA的number值："+colleagueA.getNumber());
        System.out.println("collB的number值："+colleagueB.getNumber());

        System.out.println("=========设置B影响A========");
        colleagueB.setNumber(87654,am);
        System.out.println("collB的number值："+colleagueB.getNumber());
        System.out.println("collA的number值："+colleagueA.getNumber());


    }
}
