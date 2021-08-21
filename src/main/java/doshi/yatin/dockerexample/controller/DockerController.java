package doshi.yatin.dockerexample.controller;

import doshi.yatin.dockerexample.Repository.DockerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @Autowired
    private DockerRepository dockerRepository;

    @GetMapping("/docker")
    public Integer useDocker() {
        return dockerRepository.findAll().size();
    }
}
