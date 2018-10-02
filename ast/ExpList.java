package mylang.ast;

public abstract class Expression {
    public abstract void accept(MylangVisitor v);
}
