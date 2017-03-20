package StackException;
/**
 * Created by Guillem on 22/02/2017.
 */
public class EmptyStackException extends Exception {
    public EmptyStackException(){
        super("La pila esta empty");
    }


}
