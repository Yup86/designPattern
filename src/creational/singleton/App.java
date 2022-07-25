/*
 * @Author: YPL
 * @Date: 2022-07-25 23:26:48
 * @Description: 
 */
package creational.singleton;

public class App {
    public static void main(String[] args) {
        System.out.println("if you see the same value, then the singleton was reuesd!!"+"\n"+
        "if you see different values, then 2 singleton were created!!"+"\n\n"+
        "RESULT:"+"\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
