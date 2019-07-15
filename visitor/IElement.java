package pattern.visitor;

/**
 * @author leishifang
 * @date 2019-07-15 14:37
 */
public interface IElement {
    void accept(IVisitor visitor);
}
