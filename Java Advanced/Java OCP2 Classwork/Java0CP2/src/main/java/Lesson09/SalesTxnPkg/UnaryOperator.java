package Lesson9.SalesTxnPkg;

public interface UnaryOperator<T> extends Function<T,T> {
    @Override
    public T apply(T t);
}