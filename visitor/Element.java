package pattern.visitor;

/**
 * @author leishifang
 * @date 2019-07-15 14:39
 */
public class Element implements IElement {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
