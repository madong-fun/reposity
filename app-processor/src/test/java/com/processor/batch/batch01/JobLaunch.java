package com.processor.batch.batch01;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Title com.processor.batch.batch01.JobLaunch
 * Copyright: Copyright (c) 2005
 * Description: <br> </br>
 * Company: »¥¶¯ÔÚÏß
 * Created on 2015/5/22 18:38
 * author madong
 */
public class JobLaunch {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("batch01/job/job.xml");
        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauch");
        Job job = (Job) context.getBean("job");
        try {
            JobExecution jobExecution =jobLauncher.run(job, new JobParameters());
            System.out.println(jobExecution.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
