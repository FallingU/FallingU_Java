package task1.magsystem;

import task1.animal.Animal;

import java.util.ArrayList;
import java.util.Scanner;

//用于实现系统的修改功能的
public class Update {
    private static Scanner input = new Scanner(System.in);
    /**
     *
     * @param list_ani 要操作的目标集合
     */
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
        int left=0,right=list_ani.size()-1;
        while (left<=right){
            int mid=(left+right)/2;
            if (list_ani.get(mid).getId()==id){
                System.out.println("请输入修改后的类型");
                String type =input.nextLine();
                list_ani.get(mid).setType(type);
                flag=true;
                break;
            }else if (list_ani.get(mid).getId()<id){
                left=mid+1;
            }else if (list_ani.get(mid).getId()>id){
                right=mid-1;
            }
        }
        if (flag)
        System.out.println("修改成功");
        else
            System.out.println("没有该id的动物");
    }
    /**
     *
     * @param list_ani 要操作的目标集合
     */
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
        int left=0,right=list_ani.size()-1;
        while (left<=right){
            int mid=(left+right)/2;
            if (list_ani.get(mid).getId()==id){
                int age;
                while (true){
                    System.out.println("请输入修改后的年龄");
                    try {
                        age = Integer.parseInt(input.nextLine().trim());
                        break;
                    }catch (NumberFormatException nfe){
                        System.out.println("输入类型错误！必须输入数值类型");
                        continue;
                    }
                }
                list_ani.get(mid).setAge(age);
                flag=true;
                break;
            }else if (list_ani.get(mid).getId()<id){
                left=mid+1;
            }else if (list_ani.get(mid).getId()>id){
                right=mid-1;
            }
        }
        if (flag)
            System.out.println("修改成功");
        else
            System.out.println("没有该id的动物");
    }
    /**
     *
     * @param list_ani 要操作的目标集合
     */
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
        int left=0,right=list_ani.size()-1;
        while (left<=right){
            int mid=(left+right)/2;
            if (list_ani.get(mid).getId()==id){
                flag=true;
                if ("雌性".equals(list_ani.get(mid).getGender())){
                list_ani.get(mid).setGender("雄性");
                }
                else {
                    list_ani.get(mid).setGender("雌性");
                }
                break;
            }else if (list_ani.get(mid).getId()<id){
                left=mid+1;
            }else if (list_ani.get(mid).getId()>id){
                right=mid-1;
            }
        }
        if (flag)
            System.out.println("修改成功");
        else
            System.out.println("没有该id的动物");
    }
}
