/**
 * Created with IntelliJ IDEA.
 * User: kuraev
 * Date: 18.07.13
 * Time: 13:52
 * To change this template use File | Settings | File Templates.
 */
public class LinkedList {
    private Object element;
    private LinkedList nextElement;

    public LinkedList(Object value) {
        element = value;
    }

    public LinkedList(Object value, LinkedList nextElement) {
        element = value;
        this.nextElement = nextElement;
    }

    public void setElement(Object element) {
        this.element = element;
    }
    public Object getElement() {
        return (this.element);
    }
    public void setNextElement(LinkedList nextElement) {
        this.nextElement = nextElement;
    }
    public LinkedList getNextElement() {
        return nextElement;
    }

    public String toString() {
        return element.toString();
    }




}
