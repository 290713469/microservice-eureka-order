/**
 * 
 */
package com.yrk.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.yrk.springcloud.Order;
import com.yrk.springcloud.util.ServiceInfoUtil;

/**
 * @author runkaiyang
 *
 */
@RestController
public class OrderController {
	
	@GetMapping("/order/{id}")
	public String findOrderById(@PathVariable String id) {
		Order order = new Order();
		order.setId(id);
		order.setPrice(12.2);
		order.setReceiverName("xiao");
		order.setReceiverAddress("sdadsads");
		order.setReceiverPhone("dsfsfdsd");
		System.out.println(ServiceInfoUtil.getPort());
		return order.toString();
	}

}
