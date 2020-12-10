
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author ashraf
 *
 */
public class JavaClassLoader extends ClassLoader {

    public void invokeClassMethod(String classBinName, String path) {

        try {

            // Create a new JavaClassLoader 
            ClassLoader classLoader = this.getClass().getClassLoader();

            // Load the target class using its binary name
            Class<?> loadedMyClass = classLoader.loadClass(classBinName);

            System.out.println("Loaded class name: " + loadedMyClass.getName());

            // Create a new instance from the loaded class
            Constructor<?> constructor = loadedMyClass.getConstructor();
            Plugin myClassObject = (Plugin) constructor.newInstance();
            
            // Getting the target method from the loaded class and invoke it using its name
            Method method = loadedMyClass.getMethod("loadFile", String.class);
            System.out.println("Invoked method name: " + method.getName());
            method.invoke(myClassObject, path);

        } catch (Exception e) {
        }

    }
}
