package pattern.visitor;

/**
 * @author leishifang
 * @date 2019-07-15 14:38
 */
public class Visitor implements IVisitor {
    private IElement mElement;

    @Override
    public void visit(IElement element) {
        mElement = element;
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + " " + element.toString());
    }

    public void doSomeThingWithElement() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + " " + mElement.toString());
    }
}
