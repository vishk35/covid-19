package com.covid.dashboard;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.covid.dashboard.bean.Cases;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

@SpringBootApplication
public class CovidDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovidDashboardApplication.class, args);
	}
	
	@Bean
	public Cases readerFor() {
	    try {
	    	getFileFromGit();
	    	CsvSchema casesSchema = CsvSchema.emptySchema().withHeader();
	    	CsvMapper csvMapper = new CsvMapper();
	    	MappingIterator<Map<?, ?>> cases = csvMapper.readerFor(Map.class)
	    	  .with(casesSchema)
	    	  .readValues(new File("src/main/resources/01-01-2021.csv"));
	    	Cases casesList = new Cases();
	    	List<Map<?, ?>> map = cases.readAll();
	    	System.out.println(map);
	    	return casesList;
	    } catch (Exception e) {
	    }
	    return null;
	}
	
	public void getFileFromGit() {
		 java.net.URL url = null;
         String file = "";
         Date date = new Date();
         SimpleDateFormat DateFor = new SimpleDateFormat("MM-dd-yyyy");
         String stringDate= DateFor.format(date);
         System.out.println(stringDate);
         try {
             url = new java.net.URL("https://github.com/CSSEGISandData/COVID-19/blob/9697c68548486888f7e4a3d42d2aa7f21ff28bba/csse_covid_19_data/csse_covid_19_daily_reports/"+"01-01-2021"+".csv");
             java.net.URLConnection uc;
             uc = url.openConnection();

             uc.setRequestProperty("X-Requested-With", "Curl");
             BufferedReader reader = new BufferedReader(new InputStreamReader(uc.getInputStream()));
             String line = null;
             while ((line = reader.readLine()) != null)
                 file = file + line + "\n";
             System.out.println(file);

         } catch (IOException e) {
             
         }
	}
}
