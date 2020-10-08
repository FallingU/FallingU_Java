package task1.magsystem;

import task1.animal.Animal;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 用于实现排序的类
 */
public class Sort {
    /**
     *
     * @param list_ani 要操作的目标集合
     */
    public static void sordByAge(ArrayList<Animal> list_ani){
        //使用collections的sort方法会改变原集合所以使用一个中间集合来完成排序输出的效果。
        ArrayList<Animal> list_temp = new ArrayList<>(list_ani);
        Collections.sort(list_temp);
        Retrieve.displayAll(list_temp);
    }
}
