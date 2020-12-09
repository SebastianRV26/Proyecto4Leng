/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Sebas
 */
public class Singleton {

    private ArrayList<Project> proyectos = new ArrayList<>();
    private ArrayList<String> plugins = new ArrayList<>();
    private Image imageActual = null;

    private static Singleton instance = null;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void addProject(Project project) {
        proyectos.add(project);
    }

    public ArrayList<Project> getProjects() {
        return this.proyectos;
    }

    public void addPlugin(String plugin) {
        plugins.add(plugin);
    }
    
    public ArrayList<String> getPlugins() {
        return this.plugins;
    }
    
    public void setProjects(ArrayList<Project> newProjects) {
        this.proyectos = newProjects;
    }

    public Project getProject(String name) {
        for (Project project : proyectos) {
            if (project.getNombreProyecto().equals(name)) {
                return project;
            }
        }
        return null;
    }

    public Image getImageActual() {
        return imageActual;
    }

    public void setImageActual(Image imageActual) {
        this.imageActual = imageActual;
    }

    public void loadProjects() {
        //ArrayList<String> namesList = new ArrayList<String>();

        try {
            FileInputStream fis = new FileInputStream("projectsData.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            ArrayList<Project> proyectos1 = (ArrayList<Project>) ois.readObject();
            /*for (Project proyecto : proyectos) {
                System.out.println(proyecto.getNombreProyecto());
            }*/
            setProjects(proyectos1);

            //llenarLista();
            ois.close();
            fis.close();
            
            fis = new FileInputStream("pluginsData.txt");
            ois = new ObjectInputStream(fis);
            ArrayList<String> plugins1 = (ArrayList<String>) ois.readObject();
            this.plugins = plugins1;
            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        } catch (Exception ex) {

        }

    }
}
