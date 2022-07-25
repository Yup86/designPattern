/*
 * @Author: YPL
 * @Date: 2022-07-25 23:18:47
 * @Description: 
 */

package creational.singleton;

// this is a basic singleton ====single thread.
public final class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
        this.value = value;
    }
    
    public static Singleton getInstance(String value){
        if(instance == null){
            instance = new Singleton(value);
        }
        return instance;
    }
}
