package task1.magsystem;

import task1.animal.Animal;

import java.util.ArrayList;
import java.util.Scanner;

//系统的删除功能的实现
public class Delete {
    private static Scanner input = new Scanner(System.in);
    //通过id删除动物
    public static void deleteById(ArrayList<Animal> list_ani){
        int id;
        while (true){
            System.out.println("请输入你要删除的动物的id：");
            try {
                id = Integer.parseInt(input.nextLine().trim());
                break;
            }catch (NumberFormatException nfe){
                System.out.println("输入类型错误！必须输入数值类型");
                continue;
            }
        }
        boolean flag = false;
        for (int i=0;i<list_ani.size();i++){
            if (list_ani.get(i).getId()==id){
                list_ani.remove(list_ani.get(i));
                flag=true;
                break;
            }
        }
        //将读取到的该类型的动物全部删除
        if (flag){
            System.out.println("删除成功");
        }else {
            System.out.println("没有目标id的动物");
        }
    }
    //通过种类删除动物
    public static void deleteByType(ArrayList<Animal> list_ani){
        System.out.println("请输入你要删除的动物类型");
        String type = input.nextLine();
        //第一次遍历将该种类的动物放在一个中间集合中存放；
        ArrayList<Animal> temp = new ArrayList<>();
        for (int i=0;i<list_ani.size();i++){
            if (list_ani.get(i).getType().equals(type)){
                temp.add(list_ani.get(i));
            }
        }
        //将读取到的该类型的动物全部删除
        if (temp.size()>0){
        list_ani.removeAll(temp);
        System.out.println("删除成功");
        }else {
            System.out.println("没有目标id的动物");
        }
    }
}
