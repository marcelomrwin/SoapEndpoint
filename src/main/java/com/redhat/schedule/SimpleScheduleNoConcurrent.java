package com.redhat.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.ejb.Schedule;
import javax.ejb.Singleton;

import org.slf4j.LoggerFactory;

@Singleton
public class SimpleScheduleNoConcurrent {
    // Agendamento sem sobreposição
//    @Schedule(dayOfWeek = "*", hour = "*", minute = "*", second = "*/10", persistent = false, info = "process2")
    public void process2() throws InterruptedException {
	LoggerFactory.getLogger(getClass()).info(Thread.currentThread().getName() + " process2 Job START [" + this + "] "
		+ new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
	TimeUnit.SECONDS.sleep(15);
	LoggerFactory.getLogger(getClass()).info(Thread.currentThread().getName() + " process2 Job STOP [" + this + "] "
		+ new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
    }
}
