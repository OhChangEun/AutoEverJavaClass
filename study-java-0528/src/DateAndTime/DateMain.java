package DateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

// LocalDate : 연, 월, 일
// LocalTime : 시, 분, 초, 나노초
// LocalDateTime : 날짜와 시간(시간대 없음)
// ZonedDateTime : 날짜 + 시간 + 시간대
public class DateMain {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

//      System.out.println(date);
//      System.out.println(time);
//      System.out.println(dateTime);
//      System.out.println(zonedDateTime);

        // 포맷 설정
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
        String res = dateTime.format(formatter);
        System.out.println(res);
    }
}
