package Service.Closure;

public class ContextClosure {
    Closure closure;

    public void setClosure(Closure closure) {
        this.closure = closure;
    }

    public void executeClosure(int[][] A) {
        closure.doClosure(A);
    }
}
