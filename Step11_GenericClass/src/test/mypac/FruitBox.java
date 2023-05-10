package test.mypac;

/*
 * 클래스 안에서 사용하는 특정 type을 고정하지 않고
 * 클래스를 사용하는 시점에 type을 정할수 있게 해줌
 * 
 * - 아래 선언한 T는 마음대로 정할 수 있음
 * - 보통 type이라는 의미에서 T을 많이 사용
 * - T를 포괄클래스(Generic Class)라고함 
 */

// 가상의 과일 박스
public class FruitBox<T> {
	//필드
	private T item;
	
	//과일을 포장하는 메소드
	public void pack(T item) {
		this.item = item;
	}
	//과일을 리턴하는 메소드 (필드에 있는 참조값을 리턴) 
	public T unPack() {
		return item;
	}
}
