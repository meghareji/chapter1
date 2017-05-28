package com.two95.chapter5;

public class ExceptionTestWrongName {

	public static void main(String[] args) {
		
			String[] names = { "Sinsy", "Vinitha", "Megha", "Neha" };
			for (String name : names) {
				System.out.println(name);
				try {
				if (name == "Sabarish") {
					System.out.println(name);
				} else {
					throw new ExceptionWrong("Wrong name was called Sabarish is not in the list");
				}
			
			
			}catch (ExceptionWrong wne) {
			System.out.println("wrong name" + wne.getMessage());
		}
		
		}
	}

}