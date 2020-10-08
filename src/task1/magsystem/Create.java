package task1.magsystem;

import task1.animal.Animal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 用于实现系统的添加功能的类
 */
public class Create {
    private static Scanner input = new Scanner(System.in);
    public static void add(ArrayList<Animal> list_ani){
        System.out.println("请输入添加的动物类型");
        String type = input.nextLine();
        System.out.println("请选择添加的动物性别:F/f(雌性),m/M(雄性),输入其他默认为雄性");
        String gender = input.nextLine();
        if ("F".equalsIgnoreCase(gender)){
            gender="雌性";
        }else {
            gender="雄性";
        }
        int age;
        while (true){
            System.out.println("请输入添加的动物年龄");
            try {
                age = Integer.parseInt(input.nextLine().trim());
                break;
            }catch (NumberFormatException nfe){
                System.out.println("输入类型错误！必须输入数值类型");
                continue;
            }
        }
        Animal animal = new Animal(type, gender, age);
        list_ani.add(animal);
        System.out.println("添加成功");
    }
}
