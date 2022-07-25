/*
 * @Author: YPL
 * @Date: 2022-07-25 23:44:33
 * @Description: 
 */
package creational.factory;

public class HtmlButton implements Button{
    
    public void render(){
        System.out.println("<button>test button</button>");
        onClick();
    }


    public void onClick(){
        System.out.println("Click! Button say 'Hello World!'");
    }
}
