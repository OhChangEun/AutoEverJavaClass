package Enum;

public class Developer {
    private String name; 
    private DevType type; // 열거형
    private Career career;
    private Gender gender;

    public Developer(String name, DevType dev, Career career, Gender gender) {
        this.name = name;
        this.type = dev;
        this.career = career;
        this.gender = gender;
    }
    public void DisplayDevInfo() {
        System.out.println("이름 : " + name);
        System.out.println("업무 : " + type);
        System.out.println("경력` : " + career);
        System.out.println("성별 : " + gender);
    }
}
