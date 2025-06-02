package Generic;

// *** 상속 관계에 존재하는 친구들만 쓸 수 있다 ***
public class GenericPrinter<T extends Material> {
    private T material;
    public void setMaterial(T material) {
        this.material = material;
    }
    public T getMaterial() {
        return material;
    }
    @Override
    public String toString() {
        return material.toString();
    }
}
