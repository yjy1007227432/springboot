package girl.demo.controller;

import girl.demo.repository.GirlRepository;
import girl.demo.service.GirlService;
import girl.demo.domain.girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @GetMapping(value = "/girls")
    public List<girl>  girlList(){
        System.out.println(girlRepository.findAll());
        return girlRepository.findAll();
    }

    @PostMapping(value = "/girlsadd")
    public girl girlAdd(@RequestParam("cupSize") String cupSize,@RequestParam("age") Integer age){
        girl girl1 = new girl();
        girl1.setAge(age);
        girl1.setCupSize(cupSize);
        return girlRepository.save(girl1);
    }

    @GetMapping(value = "/selectById")
    public girl selectById(@RequestParam("id") int id){
        return girlRepository.getOne(id);
    }

    @GetMapping(value = "/update/one")
    public girl Update(@RequestParam("id") int id,@RequestParam("cupSize") String cupSize,@RequestParam("age") Integer age){
        girl girl1 = new girl();
        girl1.setAge(age);
        girl1.setCupSize(cupSize);
        girl1.setId(id);
        return girlRepository.save(girl1);
    }

    @GetMapping(value = "/selectByAge")
    public List<girl> girlListByAge(@RequestParam("age") int age){
        return girlRepository.findByAge(age);
    }

    @GetMapping(value = "/insertTwo")
    public void insertTwo(){
       GirlService girlService2 = new GirlService();
       girlService2.insertTwo();
    }

}
