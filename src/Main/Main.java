/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Classes.Project;
import Classes.Singleton;
import UI.MainFrame;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Sebas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Singleton singleton = Singleton.getInstance();
        singleton.loadProjects();

        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);
    }

}
