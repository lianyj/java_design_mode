/**************************************************************************
 * Copyright (c) 2016-2017 Zhejiang TaChao Network Technology Co.,Ltd.
 * All rights reserved.
 *
 * 项目名称：浙江踏潮-基础架构
 * 版权说明：本软件属浙江踏潮网络科技有限公司所有，在未获得浙江踏潮网络科技有限公司正式授权
 *           情况下，任何企业和个人，不能获取、阅读、安装、传播本软件涉及的任何受知
 *           识产权保护的内容。                            
 ***************************************************************************/
package Component;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author <a href="mailto:LYJ@zjtachao.com">LYJ</a>
 * @since 2.0
 */
public class PayDemo {

    public abstract class Market{
        String name;

        public abstract void add(Market m);

        public abstract void remove(Market m);

        public abstract void PayByCard();
    }

    // 分店 下面可以有加盟店
    public class MarketBranch extends Market{
        // 加盟店列表
        List<Market> list = new ArrayList<Market>();

        public MarketBranch(String s){
            this.name=s;
        }

        @Override
        public void add(Market m) {
            list.add(m);
        }

        @Override
        public void remove(Market m) {
            list.remove(m);
        }

        @Override
        public void PayByCard() {
            System.out.println(name + "消费,积分已累加入该会员卡");
            for (Market m :list){
                m.PayByCard();
            }
        }
    }

    // 加盟店 下面不在有分店和加盟店，最底层
    public class MarketJoin extends Market {

        public MarketJoin(String s){
            this.name=s;
        }

        @Override
        public void add(Market m) {

        }

        @Override
        public void remove(Market m) {

        }

        @Override
        public void PayByCard() {
            System.out.println(name + "消费,积分已累加入该会员卡");
        }
    }

    public static void main(String[] args) {
        PayDemo demo = new PayDemo();

        MarketBranch rootBranch = demo.new MarketBranch("总店");
        MarketBranch qhdBranch = demo.new MarketBranch("秦皇岛分店");
        MarketJoin hgqJoin = demo.new MarketJoin("秦皇岛分店一海港区加盟店");
        MarketJoin btlJoin = demo.new MarketJoin("秦皇岛分店二白塔岭加盟店");

        qhdBranch.add(hgqJoin);
        qhdBranch.add(btlJoin);
        rootBranch.add(qhdBranch);
        rootBranch.PayByCard();

    }
}
