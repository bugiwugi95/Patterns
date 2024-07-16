package prototype;

interface Copyable {
    Copyable copy();
}

class CopyableImpl implements Copyable {
    Type type;

    @Override
    public CopyableImpl copy() {
        return new CopyableImpl();
    }

    public void setType(Type type) {
        this.type = type;
    }

    public enum Type {
        ONE, TWO
    }
}

public class Main {
    public static void main(String[] args) {
        CopyableImpl prototype = new CopyableImpl();
        CopyableImpl clone = prototype.copy();
        clone.setType(CopyableImpl.Type.ONE);
    }


}
