/** 
 * Copyright (C) 2018 Jeebiz (http://jeebiz.net).
 * All Rights Reserved. 
 */
package io.github.hiwepy.fastxls.spring.boot;


import org.springframework.boot.context.properties.ConfigurationProperties;

import io.github.hiwepy.fastxls.core.property.ExportProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ConfigurationProperties(FastxlsExportProperties.PREFIX)
@Getter
@Setter
@ToString
public class FastxlsExportProperties extends ExportProperties {

	public static final String PREFIX = "fastxls.export";

}
