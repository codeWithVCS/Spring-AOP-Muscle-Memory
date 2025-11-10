package org.chandra.springaop.topic2_aop_concepts.task5;

import org.springframework.stereotype.Component;

@Component
public class ReportService {
    public void generateDailyReport() throws InterruptedException {
        System.out.println("Generating daily report...");
        try{
            Thread.sleep(300);
        }catch(InterruptedException e){
            System.out.println("Report generation interrupted");
        }
    }
    public void generateMonthlyReport() throws InterruptedException {
        System.out.println("Generating monthly report...");
        try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            System.out.println("Report generation interrupted");
        }
    }
}
