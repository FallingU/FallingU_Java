package task1.magsystem;


import task1.animal.Animal;

import java.util.ArrayList;
import java.util.Scanner;
//菜单式系统的实现
public class AnimalSystem {
    private static ArrayList<Animal> animals = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
    //主菜单页
    public static void mainView(){
        while (true){
            System.out.println("------动物信息管理系统-------");
            System.out.println("(1)---增加动物信息----------");
            System.out.println("(2)---删除动物信息----------");
            System.out.println("(3)---修改动物信息----------");
            System.out.println("(4)---查询动物信息----------");
            System.out.println("(5)---以年龄排序并输出-------");
            System.out.println("请选择功能:");
            int select;
            //使用异常处理非法输入
            try {
                select=Integer.parseInt(input.nextLine().trim());
            }catch (NumberFormatException nfe){
                System.out.println("输入数据类型错误！,必须输入数值类型");
                continue;
            }
            while (select<1||select>5){
                System.out.println("输入有误请重新输入");
                try {
                    select=Integer.parseInt(input.nextLine().trim());
                }catch (NumberFormatException nfe){
                    System.out.println("输入数据类型错误！,必须输入数值类型");
                    continue;
                }
            }
            switch (select){
                case 1: Create.add(animals); break;
                case 2: deleteView();  break;
                case 3: updateView(); break;
                case 4: retrieveView(); break;
                case 5: Sort.sordByAge(animals);
            }
        }

    }
    //删除操作的菜单页
    public static void deleteView(){
       while (true){
           System.out.println("------删除动物信息-------");
           System.out.println("(1)---通过id删除----------");
           System.out.println("(2)---通过种类删除----------");
           System.out.println("(3)---返回上一层----------");
           int select;
           try {
               select=Integer.parseInt(input.nextLine().trim());
           }catch (NumberFormatException nfe){
               System.out.println("输入数据类型错误！,必须输入数值类型");
               continue;
           }
           while (select<1||select>3){
               System.out.println("输入有误请重新输入");
               try {
                   select=Integer.parseInt(input.nextLine().trim());
               }catch (NumberFormatException nfe){
                   System.out.println("输入数据类型错误！,必须输入数值类型");
                   continue;
               }
           }
           switch (select){
               case 1: Delete.deleteById(animals); break;
               case 2: Delete.deleteByType(animals); break;
               case 3: return;
           }
       }
    }
    //修改操作的菜单页
    public static void updateView(){
        while (true){
            System.out.println("------修改动物信息-------");
            System.out.println("(1)---修改种类----------");
            System.out.println("(2)---修改性别----------");
            System.out.println("(3)---修改年龄----------");
            System.out.println("(4)---返回上一层----------");
            int select;
            try {
                select=Integer.parseInt(input.nextLine().trim());
            }catch (NumberFormatException nfe){
                System.out.println("输入数据类型错误！,必须输入数值类型");
                continue;
            }
            while (select<1||select>4){
                System.out.println("输入有误请重新输入");
                try {
                    select=Integer.parseInt(input.nextLine().trim());
                }catch (NumberFormatException nfe){
                    System.out.println("输入数据类型错误！,必须输入数值类型");
                    continue;
                }
            }
            switch (select){
                case 1: Update.setType(animals); break;
                case 2: Update.setGender(animals); break;
                case 3: Update.setAge(animals); break;
                case 4: return;
            }
        }
    }
    //查询操作的菜单页
    public static void retrieveView(){
        while (true){
            System.out.println("------查询动物信息-------");
            System.out.println("(1)---查询所有动物信息------");
            System.out.println("(2)---通过id查询动物信息-----");
            System.out.println("(3)---返回上一层-----------");
            int select;
            try {
                select=Integer.parseInt(input.nextLine().trim());
            }catch (NumberFormatException nfe){
                System.out.println("输入数据类型错误！,必须输入数值类型");
                continue;
            }
            while (select<1||select>3){
                System.out.println("输入有误请重新输入");
                try {
                    select=Integer.parseInt(input.nextLine().trim());
                }catch (NumberFormatException nfe){
                    System.out.println("输入数据类型错误！必须输入数值类型");
                    continue;
                }
            }
            switch (select){
                case 1: Retrieve.displayAll(animals); break;
                case 2: Retrieve.displayById(animals); break;
                case 3: return;
            }
        }
    }

    public static void main(String[] args) {
        mainView();
    }
}
