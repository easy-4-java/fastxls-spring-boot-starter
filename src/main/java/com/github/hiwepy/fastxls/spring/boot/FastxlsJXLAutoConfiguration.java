/** 
 * Copyright (C) 2018 Jeebiz (http://jeebiz.net).
 * All Rights Reserved. 
 */
package io.github.hiwepy.fastxls.spring.boot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.hiwepy.fastxls.jexcel.JXLWorkbookFiller;
import io.github.hiwepy.fastxls.jexcel.JXLWorkbookMapper;
import io.github.hiwepy.fastxls.jexcel.JXLWorkbookReader;

@Configuration
@ConditionalOnClass({JXLWorkbookFiller.class, JXLWorkbookMapper.class, JXLWorkbookReader.class})
@EnableConfigurationProperties({ FastxlsExportProperties.class, FastxlsImportProperties.class, FastxlsJXLProperties.class})
public class FastxlsJXLAutoConfiguration  {
	
	@Bean
	public JXLWorkbookFiller jxlWorkbookFiller() {
		return new JXLWorkbookFiller();
	}

	@Bean
	public JXLWorkbookMapper jxlWorkbookMapper() {
		return new JXLWorkbookMapper();
	}

	@Bean
	public JXLWorkbookReader jxlWorkbookReader() {
		return new JXLWorkbookReader();
	}

}
