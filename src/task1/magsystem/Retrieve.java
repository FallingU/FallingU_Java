package task1.magsystem;

import task1.animal.Animal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *提供查询的类
 */
public class Retrieve {
    private static Scanner input = new Scanner(System.in);
    /**
     *
     * @param list_ani 要操作的目标集合
     */
    public static  void displayAll(ArrayList<Animal> list_ani){
        System.out.println("--------所有动物数据如下---------");
        for (Animal animal : list_ani) {
            System.out.println(animal);
        }
    }
    /**
     *
     * @param list_ani 要操作的目标集合
     */
    public static void displayById(ArrayList<Animal> list_ani){
        int id;
        while (true){
            System.out.println("请输入你要查询的动物的id：");
            try {
                id = Integer.parseInt(input.nextLine().trim());
                break;
            }catch (NumberFormatException nfe){
                System.out.println("输入类型错误！必须输入数值类型");
                continue;
            }
        }
        boolean flag =false;
        int left=0,right=list_ani.size()-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if (list_ani.get(mid).getId()==id){
                System.out.println(list_ani.get(mid));
                flag=true;
                break;
            }else if (list_ani.get(mid).getId()<id){
                left=mid+1;
            }else if (list_ani.get(mid).getId()>id){
                right=mid-1;
            }
        }
        if (!flag){
            System.out.println("没有该id的动物");
        }
    }
}
