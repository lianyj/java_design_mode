/**************************************************************************
 * Copyright (c) 2016-2017 Zhejiang TaChao Network Technology Co.,Ltd.
 * All rights reserved.
 *
 * 项目名称：浙江踏潮-基础架构
 * 版权说明：本软件属浙江踏潮网络科技有限公司所有，在未获得浙江踏潮网络科技有限公司正式授权
 *           情况下，任何企业和个人，不能获取、阅读、安装、传播本软件涉及的任何受知
 *           识产权保护的内容。                            
 ***************************************************************************/
package visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * TODO
 *
 * @author <a href="mailto:LYJ@zjtachao.com">LYJ</a>
 * @since 2.0
 */
public class ObjectStruture {

    public static List<Element> getList(){
        List<Element> list = new ArrayList<Element>();
        Random random = new Random();
        for(int i=0;i<10;i++){
            int a = random.nextInt(100);
            if(a>50){
                list.add(new ConcreteElement1());
            }else {
                list.add(new ConcreteElement2());
            }
        }
        return list;
    }
}
