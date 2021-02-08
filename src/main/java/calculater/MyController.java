package calculater;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @GetMapping("/calc")
    @ResponseBody
    public String calc(@RequestParam int x, int y){
        Calculater calculater = new Calculater();

        return "" + calculater.product(x,y);
    }

}
