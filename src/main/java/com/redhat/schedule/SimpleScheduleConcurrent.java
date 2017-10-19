package com.redhat.schedule;

import javax.ejb.EJB;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Schedule;
import javax.ejb.Singleton;

@Singleton
@Lock(LockType.READ)
public class SimpleScheduleConcurrent {

    @EJB
    SimpleScheduleWorker simpleSchedulWork;

    // Agendamento com sobreposição
    @Schedule(dayOfWeek = "*", hour = "*", minute = "*", second = "*/10", persistent = false, info = "process3")
    public void process3() throws InterruptedException {
	simpleSchedulWork.doWork();
    }
}
