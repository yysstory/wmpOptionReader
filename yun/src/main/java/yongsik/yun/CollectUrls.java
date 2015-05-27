package yongsik.yun;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CollectUrls {
	private WebDriver driver;

	public CollectUrls() {
		this.driver = new FirefoxDriver();
		this.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	protected void next(String url, List<String> argUrlsList) {
		this.driver.get(url);
		String htmlContent = this.driver.getPageSource();
		String[] htmlContentRow = htmlContent.replaceAll("\t", "").split("\n");
		ArrayList<String> rowList = new ArrayList<String>();
		for (String row : htmlContentRow) {
			String fillter = "<span class=\"num\">248,000</span>";
			fillter = fillter.trim();
			if(row.trim().equals(fillter)){
				rowList.add(row);
			}
			
		}
		if(rowList.size()==0){
			System.out.println("사자사자");
			System.out.println("사자사자");
			System.out.println("사자사자");
			this.driver.get("https://www.youtube.com/watch?v=TKD03uPVD-Q");
			try {
				Thread.sleep(200000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
		}
	}
}
