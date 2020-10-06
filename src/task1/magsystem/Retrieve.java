package task1.magsystem;

import task1.animal.Animal;

import java.util.ArrayList;
import java.util.Scanner;

//提供查询的类
public class Retrieve {
    private static Scanner input = new Scanner(System.in);
    //查询显示所有的方法
    public static  void displayAll(ArrayList<Animal> list_ani){
        System.out.println("--------所有动物数据如下---------");
        for (Animal animal : list_ani) {
            System.out.println(animal);
        }
    }
    //根据id查找
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
        for (int i=0;i<list_ani.size();i++){
           if (list_ani.get(i).getId()==id){
               flag=true;
               System.out.println(list_ani.get(i));
               break;
           }
        }
        if (!flag){
            System.out.println("没有该id的动物");
        }
    }
}
