package com.two95.chapter5;

public class ExceptionCalculator {

	void divide(int i,int j){
		if(j==0){
			try{
				throw new ExceptionWrong("Math error");
			}catch(ExceptionWrong wn){
				System.out.println(wn.getMessage());
			}
		}else{
			System.out.println(i+"/"+j+"="+i/j);
		}
	}
		
	}


