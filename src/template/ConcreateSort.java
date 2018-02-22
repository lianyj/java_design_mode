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

import jdk.nashorn.internal.objects.annotations.Where;

/**
 * TODO
 *
 * @author <a href="mailto:LYJ@zjtachao.com">LYJ</a>
 * @since 2.0
 */
public class ConcreateSort extends AbstractSort {

    @Override
    protected void sort(int[] array) {
        for (int i =0;i<array.length-1;i++){
            selectSort(array,i);
        }
    }

    private void selectSort(int[] array,int index){
        int MinValue = 32767;//最小变量
        int indexMin = 0;//最小值索引变量
        int Temp ;//暂存变量
        for(int i =index;i<array.length;i++){
            if(array[i]<MinValue){
                MinValue = array[i];//找到最小值
                indexMin = i;//保存最小值
            }
        }
        Temp = array[index];//交换两数值
        array[index] = array[indexMin];
        array[indexMin] =Temp;
    }
}
