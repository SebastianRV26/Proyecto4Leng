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
        this.proyectos.add(project);
    }

    public Project searchProject(String project) {
        for (Project proyecto : proyectos) {
            if (proyecto.getNombreProyecto().equals(project)) {
                return proyecto;
            }
        }
        return null;
    }

    public void removeProjec(String project) {
        Project proyecto = searchProject(project);
        if (proyecto != null) {
            this.proyectos.remove(proyecto);
        }
    }

    public ArrayList<Project> getProjects() {
        return this.proyectos;
    }

    public void addPlugin(String plugin) {
        this.plugins.add(plugin);
    }

    public void removePlugin(String plugin) {
        this.plugins.remove(plugin);
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
        return this.imageActual;
    }

    public void setImageActual(Image imageActual) {
        this.imageActual = imageActual;
    }

    public void loadProjects() {

        try {
            FileInputStream fis = new FileInputStream("projectsData.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            ArrayList<Project> proyectos1 = (ArrayList<Project>) ois.readObject();
            setProjects(proyectos1);

            ois.close();
            fis.close();

            FileInputStream fis1 = new FileInputStream("pluginsData.txt");
            ObjectInputStream ois1 = new ObjectInputStream(fis1);
            ArrayList<String> plugins1 = (ArrayList<String>) ois1.readObject();
            this.plugins = plugins1;
            ois1.close();
            fis1.close();
        } catch (IOException | ClassNotFoundException ex) {

        }

    }
}
