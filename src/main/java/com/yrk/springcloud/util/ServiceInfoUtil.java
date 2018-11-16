/**
 * 
 */
package com.yrk.springcloud.util;

import org.springframework.boot.context.embedded.EmbeddedServletContainerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

/**
 * @author runkaiyang
 *
 */

@Configuration
public class ServiceInfoUtil implements ApplicationListener<EmbeddedServletContainerInitializedEvent>{

	private static EmbeddedServletContainerInitializedEvent event;
	
	@Override
	public void onApplicationEvent(EmbeddedServletContainerInitializedEvent event) {
		ServiceInfoUtil.event = event;
	}

	public static int getPort() {
		return event.getEmbeddedServletContainer().getPort();
	}
	
}
