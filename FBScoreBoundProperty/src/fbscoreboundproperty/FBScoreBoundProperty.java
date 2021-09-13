/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fbscoreboundproperty;

import java.util.Scanner;

/**
 *
 * @author naratcha.s
 */
public class FBScoreBoundProperty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyPropertyBean mySource = new MyPropertyBean();
        Listener1 listener1 = new Listener1();
        Listener2 listener2 = new Listener2();
        mySource.addPropertyChangeListener(listener1);
        mySource.addPropertyChangeListener(listener2);
        String score;
        System.out.print("Enter Score : ");
        score = sc.nextLine();
        
        
        while (true){
            if (score.equals("")){
                break;
            }
            else {
                mySource.setScore(score);
                System.out.print("Enter Score : ");
                score = sc.nextLine();
            }
        }
    }
    
}
