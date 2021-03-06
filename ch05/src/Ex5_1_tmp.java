import java.util.Arrays;  // Arrays.toString()을 사용하기 위해 추가

class Ex5_1_tmp {
	public static void main(String[] args) {
		int[] score; // 1. 배열 score를 선언(참조변수)
		score = new int[5]; // 2. 배열의 생성(int저장공간 x 5)
		
		int[] score2 = new int[5]; // 배열의선언과 생성을 동시
		score2[3] = 100;
		
		System.out.println(score2[0]);
		System.out.println(score2[1]);
		System.out.println(score2[2]);
		System.out.println(score2[3]);
		System.out.println(score2[4]);
		
		// index범위 : 0~9
		int[] arr = new int[10]; // 길이가 5인 int배열 arr를 생성함
		System.out.println("arr length: "+arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+")="+arr[i]);
		}
		
		int[] iArr = {100, 95, 80, 60, 60}; // 길이가 5인 int배열을  초기화
		for(int i=0; i<iArr.length; i++){
			System.out.println(iArr[i]);
		}
		System.out.println(Arrays.toString(iArr));
		
		// index: 0~2
		String[] strArr = {"가위", "바위", "보"};
		System.out.println(Arrays.toString(strArr));
		
		for(int i=0; i<10; i++) {
			int tmp = (int)(Math.random()*3);
			System.out.println(strArr[tmp]); // 0~2
		}
		
		// 01234
		String str = "ABCDE"; // str.length() = 5
		char ch = str.charAt(4);
		System.out.println(ch);
		String str2 = str.substring(1, 4);
		String str3 = str.substring(1);
		System.out.println(str2); // BCD
		System.out.println(str3); // BCDE
		
		int[] arr1D = {0,1,2,3,4}; 
		int[][] arr2D = {{11,22},{21, 22}};
		System.out.println(Arrays.toString(arr1D));
		System.out.println(Arrays.deepToString(arr2D));
		
		String[][] str2D = {{"aaa", "bbb"}, {"AAA", "BBB"}};
		String[][] str2D2 = {{"ccc", "ddd"}, {"CCC", "DDD"}};
		
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		int[] arr2 = Arrays.copyOfRange(arr1D, 2, 4);
		System.out.println(Arrays.toString(arr2));
				
		int[] arrSort = {3,4,1,0,2};
		Arrays.sort(arrSort);
		System.out.println(Arrays.toString(arrSort));
		
		}
		
	}