package StackException;

/**
 * Created by Guillem on 22/02/2017.
 */

        import org.apache.log4j.BasicConfigurator;
        import org.apache.log4j.Logger;

        import static org.apache.log4j.Logger.*;

public class App
{
    public static void main( String[] args ){

        BasicConfigurator.configure();
        final Logger logPush = getLogger("Push");
        final Logger logPop = getLogger("Pop");

        StackImplement implementacion = new StackImplement();

        try {
            logPush.info("Llenamos la pila \n");
            implementacion.push(1);
            implementacion.push(2);
            logPush.info("Tamaño actual: " +implementacion.size() +"\n");
            implementacion.push(3);
            implementacion.push(10);
            logPush.info("Tamaño actual: " +implementacion.size()+"\n");
            logPush.warn("Tamaño máximo \n");
            implementacion.push(15);
        }
        catch (FullStackException e){
            logPush.error(e.getMessage()+"\n");
        }

        try {
            logPop.info("Vaciamos la pila \n");
            implementacion.pop();
            implementacion.pop();
            logPop.info("Tamaño actual: " +implementacion.size()+"\n");
            implementacion.pop();
            implementacion.pop();
            logPop.warn("El tamaño actual es: " +implementacion.size()+" No podemos quitar nada mas \n");
            implementacion.pop();
        } catch (EmptyStackException e) {
            logPop.error(e.getMessage()+"\n");
        }
    }
}