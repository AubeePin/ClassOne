package lesson15;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class chap3_15 {

	public static void main(String[] args) {
		ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		
		String nowTime=now.getHour()+":"+now.getMinute()+":"+now.getSecond();
		System.out.println(nowTime);
	}

}
