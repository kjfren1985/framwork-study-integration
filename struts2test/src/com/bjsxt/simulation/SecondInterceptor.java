/**
 * 
 */
package com.bjsxt.simulation;

/**
 * @author jianfeng
 *
 */
public class SecondInterceptor implements Interceptor {

	/* (non-Javadoc)
	 * @see com.bjsxt.simulation.Interceptor#intercept(com.bjsxt.simulation.ActionInvocation)
	 */
	@Override
	public void intercept(ActionInvocation invocation) {
		// TODO Auto-generated method stub
		System.out.println("2");
		invocation.invoke();
		System.out.println("end 2");
	}

}
