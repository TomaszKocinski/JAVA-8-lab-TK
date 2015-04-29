/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8;

/**
 *
 * @author Kot
 *
 */
public class Pair<T> {

    private T first;
    private T secound;

    public Pair(T first, T secound) {
        this.first = first;
        this.secound = secound;
    }

    public T getLeft() {
        return first;
    }

    public T getRight() {
        return secound;
    }

    public void swap() {
        T temp = first;
        first = secound;
        secound = temp;
    }

    @Override
    public String toString() {
        return first.toString() + " " + secound.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * @param args the command line arguments
     */

}
