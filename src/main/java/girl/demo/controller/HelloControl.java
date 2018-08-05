package girl.demo.controller;


import girl.demo.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloControl {


    @Autowired
    private GirlProperties girlProperties;


//    @RequestMapping(value = {"/helloworld","/hi"},method = RequestMethod.GET)
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") int Myid){
        return "id = " + Myid;
    }
}
