package org.example;

import org.example.Tasks.DatabaseQueryService;
import org.example.response.*;

import java.sql.SQLException;



public class Main {
    public static void main(String[] args) throws SQLException {
        for(LongestProjectResponse response : DatabaseQueryService.getLongestProject()){
            System.out.println(response);
        }
        for(MaxProjectsClientResponse response : DatabaseQueryService.getMaxProjectsClient()){
            System.out.println(response);
        }
        for(MaxSalaryWorkerResponse response : DatabaseQueryService.getMaxSalaryWorker()){
            System.out.println(response);
        }
        for(YoungestEldestWorkersResponse response : DatabaseQueryService.getYoungestEldestWorkers()){
            System.out.println(response);
        }
        for(ProjectPricesResponse response : DatabaseQueryService.getProjectPrices()){
            System.out.println(response);
        }
    }
}