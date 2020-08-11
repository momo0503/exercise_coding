package org.zerock.controller;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)          //xml 파일 읽어와서. 파일을 읽어와서  Junit 테스트하기 위해서 
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/*.xml"})
//root-context.xml 파일을 읽어옴
public class MybatisTest {
	
	
	@Autowired //자동 의존성 주입 => DI(의존성 주입) 즉 해당 변수에 객체주소를 주입하는 과정, 
	private SqlSessionFactory sqlFactory; //DI쓰는 이유는 우리가 스프링 프레임워크는 혼자서 객체를 생성해서 못한다. 외부 구조틀을 가져와서 50%까지 로컬피시에 설치하고 사용한다.
	//그걸 의존성이라고한다. 51%부터 있는 객체들은 다 의존성을 주입해야한다. 오토와이어드하면 의존성이 주입되서 해당 변수에 주소값이 대입대서 ,사용할 수있게해준다.
	
	
	@Test
	public void testFactory() {
		System.out.println(sqlFactory);
	}
	
	@Test
	public void testSession() throws Exception{
		try(SqlSession sqlSession = sqlFactory.openSession()){
/*
 * 1. SqlSession 자바 7에서 추가된 AutoCloseable 인터페이스를 구현상속받아서 try()내에서 객체를 생성하면 명시적인 close()하지 않아도 자동으로 닫힌다.	
 * 2. sqlSession은 mybatis쿼리문 수행객체가 된다. sqlFactory는 sqlSession객체를 생성하기 위한 의존성이 주입된 참조변수 객체다.		
 */
			
			System.out.println(sqlSession);
		}catch(Exception e) {e.printStackTrace();}
	}
	
}
