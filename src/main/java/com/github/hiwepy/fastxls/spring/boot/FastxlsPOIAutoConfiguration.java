/** 
 * Copyright (C) 2018 Jeebiz (http://jeebiz.net).
 * All Rights Reserved. 
 */
package io.github.easy4j.fastxls.spring.boot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.easy4j.fastxls.poi.POIWorkbookConverter;
import io.github.easy4j.fastxls.poi.POIWorkbookCopyer;
import io.github.easy4j.fastxls.poi.POIWorkbookExtractor;
import io.github.easy4j.fastxls.poi.POIWorkbookFiller;
import io.github.easy4j.fastxls.poi.POIWorkbookMapper;
import io.github.easy4j.fastxls.poi.POIWorkbookReader;
import io.github.easy4j.fastxls.poi.POIWorkbookWriter;

@Configuration
@ConditionalOnClass({POIWorkbookConverter.class, POIWorkbookCopyer.class, POIWorkbookExtractor.class, 
	POIWorkbookFiller.class, POIWorkbookMapper.class, POIWorkbookReader.class, POIWorkbookWriter.class})
@EnableConfigurationProperties({ FastxlsExportProperties.class, FastxlsImportProperties.class, FastxlsPOIProperties.class})
public class FastxlsPOIAutoConfiguration {

	@Bean
	public POIWorkbookConverter poiWorkbookConverter() {
		return new POIWorkbookConverter();
	}
	
	@Bean
	public POIWorkbookCopyer poiWorkbookCopyer() {
		return new POIWorkbookCopyer();
	}
	
	@Bean
	public POIWorkbookExtractor poiWorkbookExtractor() {
		return new POIWorkbookExtractor();
	}
	
	@Bean
	public POIWorkbookFiller poiWorkbookFiller() {
		return new POIWorkbookFiller();
	}

	@Bean
	public POIWorkbookMapper poiWorkbookMapper() {
		return new POIWorkbookMapper();
	}

	@Bean
	public POIWorkbookReader poiWorkbookReader() {
		return new POIWorkbookReader();
	}
	
	@Bean
	public POIWorkbookWriter poiWorkbookWriter() {
		return new POIWorkbookWriter();
	}

}
