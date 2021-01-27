package my.day15.c.INTERFACE;

import java.util.Scanner;

public interface InterMemberCtrl {

	//구직자 중복아이디 검사. 
	boolean duplicateIdJobseeker(String id, Member[] mbrArr);
	//아이디가 이미 존재한다면 true, 존재하지 않는다면 false 리턴
	
	//구인회사 중복아이디 검사
	boolean duplicateIdCompany(String id, Member[] mbrArr);
	//아이디가 이미 존재한다면 true, 존재하지 않는다면 false 리턴
	
	//회원가입(구직자, 구인회사)
	boolean register(Scanner sc, Member[] mbrArr, int n);
	//int n의 n 값이 1이면 구직자, 2이면 구인회사로 회원가입
	
	//로그인(구직자, 구인회사) 
	Member login(Scanner sc, Member[] mbrArr, int n);
	//int n의 n 값이 1이면 구직자, 2이면 구인회사로 로그인
	
	//모든 회원정보 출력(구직자, 구인회사)
	void viewInfo(Member[] mbrArr, int n);
	//int n의 n 값이 1이면 구직자, 2이면 구인회사로 로그인

	
	//특정 회원정보 한명 출력(구직자, 구인회사)
	String showInfo(Member mbr);
	
	
	//회원(구직자, 구인회사)으로 사용가능한지 알아보는 메소드(null값이 있는지 없는지 알아보기)
	boolean isRegistered(Member mbr);

	
	//회원정보 변경(구직자, 구인회사)
	Member updateMemberInfo(Scanner sc, Member mbr);

	
	
	
	
	
}
