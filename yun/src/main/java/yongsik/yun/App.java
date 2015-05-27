package yongsik.yun;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		CollectUrls collectUrls = new CollectUrls();
		while (true) {

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage()); 
													
			}

			collectUrls
					.next("http://www.wemakeprice.com/deal/adeal/530431/102200/?source=102200&no=1",
							null);

		}
	}
}
