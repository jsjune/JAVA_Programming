package CH7;

interface Parseable{
	// 구문 분석작업을 수행한다.
	public abstract void parse(String filName);
}

class ParserManager{
	// 리턴타입이 Parseable 인터페이스이다.
	public static Parseable getParser(String type) { // String타입으로 받을시 반환을 XMLParser, HTMLParser로 못한다.
		if(type.equals("XML")){
			return new XMLParser(); // getParser("XML");여기서 Parseable parser = new XMLParser();이 수행된 것과 같다.
		}else {
			Parseable p = new HTMLParser();
			return p;
		}
	}
}

class XMLParser implements Parseable{
	public void parse(String fileName) {
		/* 구문 분석작업을 수행하는 코드를 적는다. */
		System.out.println(fileName + "- XML parsing completed.");
	}
}

class HTMLParser implements Parseable{
	public void parse(String fileName) {
		/* 구문 분석작업을 수행하는 코드를 적는다. */
		System.out.println(fileName + "-HTML parsing completed.");
	}
}

public class Test25ParserTest {
	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");
	}
}
