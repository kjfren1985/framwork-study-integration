package com.bjsxt.simulation;

import java.util.ArrayList;
import java.util.List;

import com.bjsxt.action.TestAction;

public class ActionInvocation {

	List<Interceptor> interceptors = new ArrayList<Interceptor>();
	Integer index = -1;
	TestAction  testAction = new TestAction();
	
	public ActionInvocation() {
		// TODO Auto-generated constructor stub
		this.interceptors.add(new FirstInterceptor());
		this.interceptors.add(new SecondInterceptor());
	}

	public void invoke() {
		index ++;
		// TODO Auto-generated method stub
		if(index>=this.interceptors.size()){
			try {
				String ss = testAction.execute();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			//живЊ
			this.interceptors.get(index).intercept(this);
		}
	}

}
