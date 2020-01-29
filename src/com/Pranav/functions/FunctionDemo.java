package com.Pranav.functions;

import java.io.IOException;

// access-modifiers nonaccess-modifiers  return-type function-name(arguments){
//	function body
//	}

// non-access modifiers  native ,final, static, abstract, synchronized
public class FunctionDemo {
	synchronized int add(int first,int second) throws IOException
	{
		int sum = first + second ;
		return sum;
	}

}
