package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ResultController {


    @RequestMapping("/getResult")
    public Result getResult(@RequestParam(value="orderSn", defaultValue="1024") String orderSn) {
    	return new Result();
    }
}