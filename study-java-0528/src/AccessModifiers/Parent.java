package AccessModifiers;

public class Parent {
    String name; // default: 패키지 내에서만 접근 가능!!
    String money; 
    String addr; 
    
    public Parent() {
        name = "이재용";
        money = "100억";
        addr = "서울시 강남구 삼성동";
    }
}
