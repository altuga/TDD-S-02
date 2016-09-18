package com.kodcu.katas.stringhesapmakinasi;

public class StringHesapMakinasi {


	public int add(String string) {

		String[] values  = string.split(",");

		int sum = 0;
		for (String value : values) {
			sum += toInt(value);
		}
		return sum;
	}



	private int toInt(String value) {
		if (value!=""){
			return Integer.valueOf(value);
		} else {
			return 0 ;
		}

	}

}
