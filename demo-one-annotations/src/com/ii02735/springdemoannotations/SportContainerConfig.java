package com.ii02735.springdemoannotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:mylogger.properties")
@PropertySource("classpath:coach.properties")
public class SportContainerConfig {
	
	@Bean
	public MyLoggerConfig myLoggerConfig(@Value("${root.logger.level}") String rootLoggerLevel,
										 @Value("${printed.logger.level}") String printedLoggerLevel) {
 
		MyLoggerConfig myLoggerConfig = new MyLoggerConfig(rootLoggerLevel, printedLoggerLevel);
 
		return myLoggerConfig;
	}
	
	/**
	 * On pourrait déclarer la dépendance à l'intérieur
	 * de l'instanciation de la bean swimCoach,
	 * mais il est toujours bien de l'isoler pour faciliter
	 * la réutilisation 
	 */
	@Bean
	public FortuneService sadFortuneService()
	{
		FortuneService sadFortuneService = new SadFortuneService();
		return sadFortuneService;
	}
	
	@Bean
	public Coach swimCoach()
	{
		Coach swimCoach = new SwimCoach(this.sadFortuneService());
		return swimCoach;
	}
	
	
}
