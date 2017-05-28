package com.two95.chapter5;

public class SearchEngineTest {

	public static void main(String[] args) {
		SWebTool tool = new SWebTool();
		// Create the search engine
		SearchEngine engine = new SearchEngine();
		// Pass the tool as a parameter to engine.
		engine.performSearch(tool);
		SImageTool image = new SImageTool();
		engine.performSearch(image);
	SVideoTool video = new SVideoTool();
	engine.performSearch(video);
	SNewsTool news = new SNewsTool();
	engine.performSearch(news);

	}
	

}
