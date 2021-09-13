/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fbscoreboundproperty;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author naratcha.s
 */
public class Listener2 implements PropertyChangeListener {
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.print("Live Score : " + evt.getNewValue());
        System.out.println();
    }
    
}
