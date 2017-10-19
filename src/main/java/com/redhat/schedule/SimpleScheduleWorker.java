package com.redhat.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.ejb.AccessTimeout;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;

import org.slf4j.LoggerFactory;

@Singleton
public class SimpleScheduleWorker {

    @Lock(LockType.READ)
    @AccessTimeout(-1)
    public void doWork() throws InterruptedException {
	LoggerFactory.getLogger(getClass()).info(Thread.currentThread().getName() + " process3 Job START [" + this + "] "
		+ new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
	TimeUnit.SECONDS.sleep(15);
	LoggerFactory.getLogger(getClass()).info(Thread.currentThread().getName() + " process3 Job STOP [" + this + "] "
		+ new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
    }
}
