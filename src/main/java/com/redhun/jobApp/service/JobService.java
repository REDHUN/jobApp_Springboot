package com.redhun.jobApp.service;

import com.redhun.jobApp.model.JobPost;
import com.redhun.jobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobService {
@Autowired
    JobRepo repo;
    public  void addJob(JobPost jobPost){
repo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){

return  repo.getAllJobs();
    }
}
