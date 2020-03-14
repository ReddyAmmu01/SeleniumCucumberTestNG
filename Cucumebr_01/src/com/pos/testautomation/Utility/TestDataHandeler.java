package com.pos.testautomation.Utility;

import java.util.HashMap;
import java.util.Map;

public class TestDataHandeler {

	Map<String, String> TestDataInMap = new HashMap<String,String>();

	public Map<String, String> getTestDataInMap() {
		return TestDataInMap;
	}

	public void setTestDataInMap(Map<String, String> TestDataInMap) {
		this.TestDataInMap = TestDataInMap;
	}
}
