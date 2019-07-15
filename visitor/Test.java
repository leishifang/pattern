package pattern.visitor;

/**
 * @author leishifang
 * @date 2019-07-12 18:33
 */
public class Test {
    public static void main(String[] args) {
        IElement element = new Element();

        Visitor visitor = new Visitor();
        element.accept(visitor);
        visitor.doSomeThingWithElement();
    }
}
