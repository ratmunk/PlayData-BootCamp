package com.nested;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestMain {

	public static void main(String[] args) {
		
		// Map안에 List
		Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		
		// List안에 Map
		List<Map<String, String>> list = new ArrayList<Map<String,String>>();
		
		// Set안에 List
		Set<List<String>> set = new HashSet<List<String>>();
		
		
	}

}
