import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test1 {
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問題1:配列"numa"の要素を全要素を出力しなさい。※i++など利用しないfor文で記述すること
		int[] numa = {1, 2, 3, 4, 5};
		for (int data: numa){
            System.out.println(data);
		}
		//改行
		System.out.println("問２");
		
		//問題2:配列"numb"の要素を逆順に出力してください。
		int[] numb = {1, 2, 3, 4, 5};
		Integer[] reversedArray = new Integer[numb.length];
        // 配列 numb を逆順にソート
        for (int i = 0; i < numb.length; i++) {
            reversedArray[i] = numb[numb.length - 1 - i];
        }
        // ソートした配列を出力
        for (int data : reversedArray) {
            System.out.println(data);
        }

		//改行
		System.out.println("問３");
		
		//問題3:配列"numc"の中で偶数の要素だけを合計した値を出力してください。
		int[] numc = {1, 2, 3, 4, 5};
		  int evenSum = 0; // 偶数の合計を格納する変数

	        for (int num : numc) {
	            if (num % 2 == 0) { // 偶数の場合
	                evenSum += num; // 偶数を合計に加える
	            }
	        }
	        System.out.println(evenSum);
	    
		//改行
		System.out.println("問４");
		
		//問題4:この配列"numd"をコピーした配列名"new_numd"を作り"new_numd"の中身を出力してください。
		int[] numd = {1, 3, 5, 7, 9};
		 // 配列 numd をコピーして新しい配列 new_numd を作成
        int[] new_numd = new int[numd.length];
        System.arraycopy(numd, 0, new_numd, 0, numd.length);

        for (int i = 0; i < new_numd.length; i++) {
            System.out.print(new_numd[i]); 
            if (i < new_numd.length - 1) {
                System.out.print(", "); 
            }
        }
        System.out.println(); // 改行
		//改行
		System.out.println("問５");
		
		//問題5:この配列"nume"を昇順に並び替えて出力しなさい。
		int[] nume = {6, 2, 8, 1, 9};
		 // 配列 nume を昇順にソート
        Arrays.sort(nume);

        for (int i = 0; i < nume.length; i++) {
            System.out.print(nume[i]); // 要素を出力
            if (i < nume.length - 1) {
                System.out.print(", "); // 最後の要素以外にカンマとスペースを追加
            }
        }
        System.out.println(); 
		//改行
		System.out.println("問６");
		
		//問題6:配列"numf"に要素を1つ(10)追加した配列"new_numf"を作成し出力しなさい。
		int[] numf = {1, 3, 5, 7, 9};
		// 新しい配列 new_numf を作成
        int[] new_numf = new int[6];
        // 元の配列 numf の要素を新しい配列 new_numf にコピー
        for (int i = 0; i < numf.length; i++) {
            new_numf[i] = numf[i];
        }
        // 新しい要素 (10) を追加
        new_numf[5] = 10;
        for (int i = 0; i < new_numf.length; i++) {
            System.out.print(new_numf[i]); // 要素を出力
            if (i < new_numf.length - 1) {
                System.out.print(", "); // 最後の要素以外にカンマとスペースを追加
            }
        }
        System.out.println();
        
		//改行
		System.out.println("問７");
		
		//問題7:Map"car"に「キー："honda"　バリュー"ホンダ",キー："toyota"　バリュー："トヨタ",キー："subaru"　バリュー："スバル"」の要素を追加してください
		
		 // 新しい空のMapを作成
        Map<String, String> car = new HashMap<>();

        // キーとバリューのペアを追加
        car.put("honda", "ホンダ");
        car.put("toyota", "トヨタ");
        car.put("subaru", "スバル");

		
		//改行
		System.out.println("問８");
		
		//問題8:Map"car"の「キー："toyota"」のバリューを出力してください。
		
		 String toyotaValue = car.get("toyota");
	        System.out.println(toyotaValue);

		//改行
		System.out.println("問９");
		
		//問題9:Map"car"のキーとバリューを全て出力してください。※for文で行うこと
		
		 // Mapの中身を出力
        for (Map.Entry<String, String> entry : car.entrySet()) {
            System.out.println( entry.getKey() + ":" + entry.getValue());
        }
		
		//改行
		System.out.println("問１０");
		
		//問題10:Map"car"のキーとバリューを全て出力してください。※forEach文で行うこと
		   car.forEach((key, value) -> {
	            System.out.println(  key + ":" + value);
	        });
	}
}


