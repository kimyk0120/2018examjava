/**
 * 
 */
package EXAM1807;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * @author http://w3devlabs.net/wp/?p=16946
 *
 */
public class Crawler {

	public static void main(String[] args) {
		Crawler crawler = new Crawler();
		crawler.getTIOBEs();
	}
	
	public void getTIOBEs() {
		//String cssQuery = ".table-top20";
		String cssQuery = "table";
		try {
			Document doc = Jsoup.connect("https://www.tiobe.com/tiobe-index/").get();
			Elements elements = doc.select(cssQuery);
			System.out.println("elements.size()" + elements.size());
			if( elements.size() > 1 ){
				for( Element element : elements ){
					System.out.println("element.text()" + element.text());
					System.out.println("element.html()" + element.html());
				}
			} else {
				System.out.println("elements.text()" + elements.text());
				System.out.println("elements.html()" + elements.html());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

}//.class
