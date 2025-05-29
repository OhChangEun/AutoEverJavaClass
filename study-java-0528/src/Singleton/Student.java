package Singleton;

public class Student {
    // 내부의 인스턴스 필드에 이미 생성되어 있는 싱글톤의 객체 주소를 대입
    Singleton singleton = Singleton.getSingleton();

    public void setInfo(String name, int id) {
        singleton.name = name;
        singleton.id = id;
    }

    public void viewInfo() {
        System.out.println("이름: " + singleton.name);
        System.out.println("아이디: " + singleton.id);
    }
}
