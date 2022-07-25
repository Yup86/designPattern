/*
 * @Author: YPL
 * @Date: 2022-07-25 23:47:26
 * @Description: 
 */
package creational.factory;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowsButton implements Button{
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton button;


    public void render(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }


    @Override
    public void onClick() {
        // TODO Auto-generated method stub
        
    }

}