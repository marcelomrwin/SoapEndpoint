package com.redhat.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ejb.Schedule;
import javax.ejb.Singleton;

import org.slf4j.LoggerFactory;

@Singleton
public class SimpleSchedule {

    // Agendamento de serviço simples a cada 10 segundos
//    @Schedule(dayOfWeek = "*", hour = "*", minute = "*", second = "*/10", persistent = false, info = "process")
    public void process() {
	LoggerFactory.getLogger(getClass()).info(Thread.currentThread().getName() + " process Job Run [" + this + "] "
		+ new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
    }

}
