package com.redhun.jobApp;

import com.redhun.jobApp.model.JobPost;
import com.redhun.jobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {
@Autowired
    JobService jobService;
    @GetMapping({"/", "home"})
    public String home() {

        return "home";
    }

    @GetMapping("addjob")
    public  String addJob(){

        System.out.println("function called");
        return "addjob";
    }

    @PostMapping("handleForm")
    public  String handleForm(JobPost jobPost, Model model){

        jobService.addJob(jobPost);
        return  "success";
    }

    @GetMapping("viewalljobs")
    public String viewJobs(Model model){
        List<JobPost>jobs=jobService.getAllJobs();
        model.addAttribute("jobPosts",jobs);
        return  "viewalljobs";
    }

}
