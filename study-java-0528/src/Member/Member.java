package Member;

import java.util.Scanner;

public class Member {
    String name;
    int age;
    char gender;
    int job;
    Scanner sc = new Scanner(System.in);

    public void setName() {
        System.out.print("사용자의 이름을 입력하세요: ");
        name = sc.nextLine();
    }
    public String getName() {
        return name;
    }
    public void setAge() {
        while(true) {
            System.out.print("사용자의 나이를 입력하세요: ");
            age = sc.nextInt();
            if (age >= 0 && age <= 199) return;
        }
    }
    public int getAge() {
        return age;
    }
    public void setGender() {
        while(true) {
            System.out.print("사용자의 성별을 입력하세요: ");
            gender = sc.next().charAt(0);

            if(gender=='M' || gender=='m' || gender=='F' || gender=='f')
                return;
        }
    }
    public int getGenderNum() {
        if (gender =='M' || gender =='m') return 0;
        else return 1;
    }
    public char getGender() {
        return gender;
    }
    public void setJob() {
        while(true) {
            System.out.print("사용자의 직업을 입력하세요: ");
            job = sc.nextInt();
            if (job >= 1 && job <= 4) return;
        }
    }
    public int getJob() {
        return job;
    }
    public void getInfo() {
        String[] genderStr = {"남성", "여성"};
        String[] jobStr = {"", "학생" ,"회사원", "주부", "무직"};
        System.out.println("\n======= 회원 정보 =======");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + genderStr[getGenderNum()]);
        System.out.println("직업 : " + jobStr[job]);
    }
}
