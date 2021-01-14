package my.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyUtil {

	// 현재시각을 출력하는 static 메소드 생성하기
	
	public static void currentTime() {
		Date now = new Date(); // 현재시각
		//JAVA API 문서 확인해볼것
		SimpleDateFormat sdfrmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 2021-01-07 11:22:35
		String result = sdfrmt.format(now);
		System.out.println(result);
		
		
	}
	
	
	
	
	
}
