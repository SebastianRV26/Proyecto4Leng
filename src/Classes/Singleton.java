/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author Sebas
 */
public class Singleton {

    //private Project[] proyectos = null;
    private ArrayList<Project> proyectos = new ArrayList<Project>();
    
    private static Singleton instance = null;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void addProject(Project project){
        proyectos.add(project);
    }
    
    public ArrayList<Project> getProjects(){
        return this.proyectos;
    }
    
}
