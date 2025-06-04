package Set;

import java.util.HashSet;

public class SetMain {
    public static void main(String[] args) {
        HashSet<Member> hashSet = new HashSet<>();
        Member member1 = new Member(1001, "유나");
        Member member2 = new Member(1002, "채원");
        Member member3 = new Member(1003, "지수");
        hashSet.add(member1);
        hashSet.add(member2);
        hashSet.add(member3);

        // id가 다른 걸 중복 제거하고 싶으면 override를 해줘야함!
        hashSet.add(new Member(1003, "카리나"));
        for(Member e : hashSet) System.out.println(e.toString());

//        String a = "apple";
//        String b = new String("apple");
//        set.add("곰돌이");
//        set.add("안유진");
//        set.add("정상기");
//        set.add(a);
//        set.add(b);
//
//        System.out.print(a.hashCode());
//        System.out.print(b.hashCode());
//        for (String e: set) {
//            System.out.println(e + " ");
//        }
    }
}

class Member {
    int id;
    String name;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return id;
    }

    // id 같아도 다른 객체로 판단됨 → 중복 허용됨
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member)obj;
            if (this.id == member.id) return true;
            else return false;
        }
        return false;
    }
    @Override
    public String toString() {
        return "아이디 : " + id + "\n" + "이름 : " + name;
    }
}
