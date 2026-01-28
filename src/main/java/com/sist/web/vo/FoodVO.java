package com.sist.web.vo;

import lombok.Data;

/*
 *  controller: 화면 연결 => 브라우저에서 화면 제어
 *  restcontroller: 다른 프로그램 연동 ===> Spring AI 연결
 *  				 => react / vue => 화면 UI
 *                        |      |
 *                        --------
 *                         ㄴ데이터 => 관리 (tanStack-query, Pinia)
 *                         	 => 상태 관리 (state)
 *                         		 데이터형의 문제 발생 위험 => TypeScript
 *                           => 자주 사용하는 서버
 *                           	 Spring / NodeJS / Dango
 *                           -------------------------------------
 *                           # 공통 기반
 *                           	=> Spring(JSP), DataBase
 *                           	=> AWS, Docker
 *  service: BI (기능 수행)
 *  vo: 데이터를 모아서 한 번에 전송하는 목적
 *  mapper/repository: 데이터베이스 연동
 *  기타: security / websocket ...
 *  
 *  # Boot
 *  	@SpringBootApplication => 웹 구동
 *  	Controller: @RestController / @Controller
 *  	Service: @Service
 *  	Repository: @Repository => JPA/Mapper
 *  	Entity: 데이터베이스 연동 => 컬럼명 동일 => JPA
 *  	동작에 필요한 설정 등록
 *  		application.properties / application.yml
 *  	WebFlux
 *  		@GetMapping / @PostMapping / @PutMapping / @DeleteMapping
 *  		=> 멀티미디어 전송 => 실시간 스트리밍
 *  		=> Spring-AI에서 자주 사용 (이미지 구분, 생성 등...)
 *  	Dependency / Injection (DI)
 *  		=> @Autowired: 객체 주소값 주입
 *  		=> @RequiredArgsConstructor (lombok): 생성자를 통해서 주입
 *  
 *  # 순서
 *  	user = controller = service = mapper = db 순
 *  
 *  # Spring-Boot 순서
 *  	1. 메인 클래스 실행
 *  	2. Bean 생성 + DI
 *  	3. Controller 요청 처리
 *  	4. Service
 *  	5. SQL 문장 => Repository 
 *  	6. 응답 => 브라우저 UI 갱신
 *                ------------- Pinia
 *     
 *  # Spring-Boot 특징
 *  	=> Spring 프레임워크 기반의 빠른 애플리케이션 개발 도구
 *  	=> 설정 최소화
 *  	=> 내장 서버 (tomcat)
 *  	   --------------- CI/CD 최적화
 *  
 *  # 요구 언어
 * 		WebSocket / Security (JWT)
 *  	MyBatis / JPA
 *  	JSP / ThymeLeaf
 *  	SpringFrameWork (유지보수) => 전자정부프레임워크
 *  	Java / Oracle
 *  	 ㄴKottlin
 *  
 *  # Pinia
 *  	=> 동작
 *  	=> Vue3: 상태 관리
 *  	=> 데이터 로딩 상태 유지
 *  	=> UI 자동 갱신
 */

@Data
public class FoodVO {
	private int fno, hit;
	private String name, type, phone, address, theme, price, 
					time, parking, poster, images, content;
	private double score;
}
