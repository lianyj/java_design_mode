/**************************************************************************
 * Copyright (c) 2016-2017 Zhejiang TaChao Network Technology Co.,Ltd.
 * All rights reserved.
 *
 * 项目名称：浙江踏潮-基础架构
 * 版权说明：本软件属浙江踏潮网络科技有限公司所有，在未获得浙江踏潮网络科技有限公司正式授权
 *           情况下，任何企业和个人，不能获取、阅读、安装、传播本软件涉及的任何受知
 *           识产权保护的内容。                            
 ***************************************************************************/
package template;

/**
 * TODO
 *
 * @author <a href="mailto:LYJ@zjtachao.com">LYJ</a>
 * @since 2.0
 */
public abstract class AbstractSort {


    /**
     * 将数组array由小到大排序
     * @param array
     */
    protected abstract void sort(int[] array);
    //abstract修饰方法就是要求其子类覆盖（实现）这个方法。
    // 调用时可以以多态方式调用子类覆盖（实现）后的方法，
    // 也就是说抽象方法必须在其子类中实现，除非子类本身也是抽象类。


    public void showSortResult(int[] array){
        this.sort(array);
        System.out.println("排序结果");
        for (int i =0; i<array.length;i++){
            System.out.printf("%3s",array[i]);
        }
    }
}
