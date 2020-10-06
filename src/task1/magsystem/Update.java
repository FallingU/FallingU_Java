package task1.magsystem;

import task1.animal.Animal;

import java.util.ArrayList;
import java.util.Scanner;

//用于实现系统的修改功能的
public class Update {
    private static Scanner input = new Scanner(System.in);
    //修改动物的种类
    public static void setType(ArrayList<Animal> list_ani){
        int id;
        while (true){
            System.out.println("请输入你要修改的动物的id：");
            try {
                id = Integer.parseInt(input.nextLine().trim());
                break;
            }catch (NumberFormatException nfe){
                System.out.println("输入类型错误！必须输入数值类型");
                continue;
            }
        }
        boolean flag=false;
        for (int i = 0; i < list_ani.size(); i++) {
            if (list_ani.get(i).getId()==id){
                System.out.println("请输入修改后的类型");
                String type =input.nextLine();
                list_ani.get(i).setType(type);
                flag=true;
                break;
            }
        }
        if (flag)
        System.out.println("修改成功");
        else
            System.out.println("没有该id的动物");
    }
    //修改动物的年龄
    public static void setAge(ArrayList<Animal> list_ani){
        int id;
        while (true){
            System.out.println("请输入你要修改的动物的id：");
            try {
                id = Integer.parseInt(input.nextLine().trim());
                break;
            }catch (NumberFormatException nfe){
                System.out.println("输入类型错误！必须输入数值类型");
                continue;
            }
        }
        boolean flag = false;
        for (int i = 0; i < list_ani.size(); i++) {
            if (list_ani.get(i).getId()==id){
                System.out.println("请输入修改后的年龄");
                int age = input.nextInt();
                list_ani.get(i).setAge(age);
                flag=true;
                break;
            }
        }
        if (flag)
            System.out.println("修改成功");
        else
            System.out.println("没有该id的动物");
    }
    //修改动物的性别
    public static void setGender(ArrayList<Animal> list_ani){
        int id;
        while (true){
            System.out.println("请输入你要修改的动物的id：");
            try {
                id = Integer.parseInt(input.nextLine().trim());
                break;
            }catch (NumberFormatException nfe){
                System.out.println("输入类型错误！必须输入数值类型");
                continue;
            }
        }
        boolean flag = false;
        for (int i = 0; i < list_ani.size(); i++) {
            if (list_ani.get(i).getId()==id){
                flag=true;
                if ("雌性".equals(list_ani.get(i).getGender())){
                list_ani.get(i).setGender("雄性");
                }
                else {
                    list_ani.get(i).setGender("雌性");
                }
                break;
            }
        }
        if (flag)
            System.out.println("修改成功");
        else
            System.out.println("没有该id的动物");
    }
}
