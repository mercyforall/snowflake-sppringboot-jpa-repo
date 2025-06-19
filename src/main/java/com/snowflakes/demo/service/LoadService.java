package com.snowflakes.demo.service;

import com.snowflakes.demo.entity.Employee;
import com.snowflakes.demo.exception.EmployeeNotFoundException;
import com.snowflakes.demo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

@Service
public class LoadService {
    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ExecutorService executorService;

    @Autowired
    private ThreadPoolTaskScheduler scheduler;


    public CompletableFuture<Employee> loadEmployee(int id) {
        return CompletableFuture.supplyAsync(() ->
        {
            System.out.println("loading employee id : " + id + " in thread : " + Thread.currentThread().getName());
            return employeeRepo.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
        }, executorService);
    }

    @PostConstruct
    public void scheduleBackgroundLoad() {
        scheduler.schedule(() ->
        {
            System.out.println("Triggering scheduled Load");
            CompletableFuture<Employee> e1 = loadEmployee(1);
            CompletableFuture<Employee> e2 = loadEmployee(2);

            CompletableFuture.allOf(e1, e2).thenRun(() -> {
                System.out.println("All Employee loaded in Scheduled task .");
            });
        }, new Date(System.currentTimeMillis() + 5000));
    }

    public void manualLoadTrigger() {
        for (int id = 1; id <= 3; id++) {
            loadEmployee(id).thenAccept(emp ->
            {
                if (emp != null) {
                    System.out.println("Manually load Employee :" + emp.getName());
                }
            });

        }
    }
}