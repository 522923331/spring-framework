package dw.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService implements DisposableBean {

	@Autowired
	private static OrderService orderService;

	public void sayHi(){
		System.out.println("hi spring");
		System.out.println(orderService);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
	}

}
