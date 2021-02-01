package my.day10.e.stringbuilder;

public class MainStringBuilder {

	public static void main(String[] args) {

		String name = "일순신";		// 메모리상에 name 1개 소모
		
		name += ",이순신";		// 메모리상에 name 1개 소모
		name += ",삼순신";		// 메모리상에 name 1개 소모
		name += ",사순신";		// 메모리상에 name 1개 소모
		name += ",오순신";		// .
		name += ",육순신";		// .
		name += ",칠순신";		// .
		name += ",팔순신";		// .
		name += ",구순신";		// .
		name += ",십순신";		// .
		
								// 위 처럼 변수 값을 저장했을 때 새로 변수를 저장할 때마다 메모리 상에  4byte씩 계속 누적이 된다고 함 위 같은 경우는 총 9개의 메모리가 누적되어 소모된다.
		
		System.out.println(name);
		
		name = "끝";
		
		System.out.println(name);
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("일순신");
		sb.append(",이순신");
		sb.append(",삼순신");
		sb.append(",사순신");
		sb.append(",오순신");
		sb.append(",육순신");
		sb.append(",칠순신");
		sb.append(",팔순신");
		sb.append(",구순신");
		sb.append(",십순신");
		
		System.out.println(sb.toString());
					//	   ^^^^^^^^^^^^^ 위의 누적되어진 sb를 String타입으로 변환
		
		//StringBuilder의 초기화
		sb.setLength(0);
		
		sb.append("끝");
		System.out.println(sb.toString());
		
		
	}

	// String과 StringBuilder를 비교했을때는 StringBuilder가 크기가 더 크긴 하지만 누적할 데이터가 많다면 StringBuilder를 사용하는게 좋다.
	
	
}
