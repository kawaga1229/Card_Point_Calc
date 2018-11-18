import java.util.Scanner;
public class info1 {
	public static void main(String[] args) {
		int com = 0;
		boolean flg1 = false;
		int price = 0,point = 0;
		Scanner sc = new Scanner(System.in);
		//会社確認
		while (flg1 == false) {
			
					System.out.println("会社コードを入力");
					com =  sc.nextInt();
			
			if (com == 1 || com == 2) {
				flg1 = true;
			}else {
				System.out.println("入力内容が間違っています");
			}
		}
		System.out.println("使用金額:");
			price = sc.nextInt();
			if (com == 1) {
				point = (int) (price * 0.02);
			}else if(com == 2) {
				point = (int) (price * 0.01);
			}
		System.out.println("獲得ポイントは" + point + "ポイント");
		System.out.println("終了します");
		
		
		
	}
}
