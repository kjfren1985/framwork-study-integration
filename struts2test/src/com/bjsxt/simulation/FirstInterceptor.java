/**
 * 
 */
package com.bjsxt.simulation;

/**
 * @author jianfeng
 *
 */
public class FirstInterceptor implements Interceptor {

	/* (non-Javadoc)
	 * @see com.bjsxt.simulation.Interceptor#intercept(com.bjsxt.simulation.ActionInvocation)
	 */
	@Override
	public void intercept(ActionInvocation invocation) {
		// TODO Auto-generated method stub
		System.out.println("1");
		invocation.invoke();
		System.out.println("end 1");
	}

}
