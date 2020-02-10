package com.mywork.quartz.job;

import java.text.SimpleDateFormat;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class SimpleJob implements Job {

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
		System.out.println("Simple Job : "+ df.format(context.getFireTime()));
	}

}
