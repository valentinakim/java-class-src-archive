package my.day18.e.ENUM;

public enum EntranceFee_2 {

	// !!! 열거형 상수 CHILD, TEENAGER, ADULT, OLD 하나 하나가 EntranceFee_2 객체이다.!!!
	
	//단체관람 시 각 연령대별 할인금액(추상메소드로 만들어서 객체 생성시 반드시 오버라이딩 하도록 강제한다)을 달리 적용하여 실제 입장료 금액을 계산하도록 한다.
	CHILD(0){	//마치 익명 클래스인 것처럼 기능
		
		@Override
		int getRealFee(int inwonsu) {
			return 0;
		}
		
	},
	
	TEENAGER(150){
		@Override
		int getRealFee(int inwonsu) {
			
			if(inwonsu >= 20)
				return (int)(DEFAULT_FEE*inwonsu*0.8);
			else
				return DEFAULT_FEE*inwonsu;
		}
	},
	
	ADULT(300){
		@Override
		int getRealFee(int inwonsu) {
			
			if(inwonsu >= 20)
				return (int)(DEFAULT_FEE*inwonsu*0.9);
			else
				return DEFAULT_FEE*inwonsu;
		}
	},
	
	OLD(100){
		@Override
		int getRealFee(int inwonsu) {
			
			if(inwonsu >= 20)
				return (int)(DEFAULT_FEE*inwonsu*0.7);
			else
				return DEFAULT_FEE*inwonsu;
		}
	};
	
	
	protected final int DEFAULT_FEE;
	// !!!! private 으로 하면 위의 열거형 상수에서 접근이 불가능해진다. protected 로 해야만 위의 열거형 상수에서 접근이 가능. !!!!
	// enum(열거형)의 인스턴스 변수는 반드시 final 이어야 한다는 규칙은 없지만 
    // fee는 열거형 상수값을 저장하기 위한 용도이므로 final 을 붙인 것이다. final이 붙은 필드는 관례상 대문자를 사용한다. 
	
	EntranceFee_2(int defaultFee) {	//파라미터 생성자
		// enum(열거형)의 생성자는 접근제한자가 private 이 생략되어져 있는 것이다.
		
		this.DEFAULT_FEE = defaultFee;
		
	}
	
	public int getFee() {
		//외부에서 FEE 값을 읽을 수 있도록 접근제한자를 public으로 준다.
		return DEFAULT_FEE;
	}
	
	// !! 입장 인원수에 따라 할인이 적용된 실제 입장료 금액을 알려주는 추상(미완성)메소드 !!
	abstract int getRealFee(int inwonsu);
	
	
	
	
	
	
	
	
	
	
	
}
