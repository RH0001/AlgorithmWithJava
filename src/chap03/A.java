package chap03;

//class A implements Comparable<A> {

//	// 필드, 메소드 등

//	public int compareTo(A c) {
//		// this가 c보다 크면 양의 값 반환
//		// this가 c보다 작으면 음의 값 반환
//		// this가 c와 같으면 0을 반환
//	}

//	public boolean equals(Object c) {
//		// this가 c와 같으면 true 반환
//		// this가 c와 같지 않으면 false 반환
//	}
//}


//package chap03;
import java.util.Comparator;
//클래스 X의 내부에서 comparator를 정의하는 방법은 다음과 같습니다.

//class X {
//	// 필드, 메소드 등
//	public static final Comparator<T> COMPARATOR = new Comp();

//	private static class Comp implements Comparator<T> {
//		public int compare(T d1, T d2) {
//			// d1이 d2보다 크면 양의 값 반환
//			// d1이 d2보다 작으면 음의 값 반환
//			// d1이 d2와 같으면 0 반환
//		}
//	}
//}