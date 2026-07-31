/** 
 * Copyright (C) 2018 Jeebiz (http://jeebiz.net).
 * All Rights Reserved. 
 */
package io.github.easy4j.fastxls.spring.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

import io.github.easy4j.fastxls.core.property.ImportProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ConfigurationProperties(FastxlsImportProperties.PREFIX)
@Getter
@Setter
@ToString
public class FastxlsImportProperties extends ImportProperties {

	public static final String PREFIX = "fastxls.import";

}
