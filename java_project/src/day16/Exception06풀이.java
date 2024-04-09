//package day16;
//
//import java.nio.file.attribute.AclEntry;
//
//public class Exception06풀이 {
//
//	public static void main(String[] args) {
//
//		int start = -1, count = -5, size = 5;
//		int arr[] = null;
//		
//		Exception06 e6 = new Exception06();
//		try{
//			arr = e6.createArr(start,count,size);
//			for(int i=0; i<arr.length; i++) {
//				System.out.println(arr[i]);
//			}
//		}catch(Exception e);
//		e.prinStackTrace();		
//	}
//	
//	/* 기능 : size를 매개변수로 입력받아 size만큼의 길이를 가지는 배열 생성 후
//	 * 랜덤값을 채워 배열 리턴
//	 * 랜덤값의 범위는 매개변수 입력 start(시작값), count(개수)
//	 * size가 0보다 작다면 예외발생(throw new)
//	 * count 개수가 0보다 작다면 예외발생
//	 */
//	
//	public int[] createArr(int start, int count, int size) {
//		if(size<=0) {
//			throw new RuntimeException("배열의 길이가 0보다 작습니다.");
//		}
//		if(count<=0) {
//			throw new RuntimeException("random 범위가 0보다 작습니다.");
//		}
//		int arr[] = new int[size];
//		for(int i=0; i<arr.length; i++);{
//			arr[i] = (int)(Math.random()*count)+start;
//		}
//		return arr;	
//	}
//	
//	public
//	
//}
