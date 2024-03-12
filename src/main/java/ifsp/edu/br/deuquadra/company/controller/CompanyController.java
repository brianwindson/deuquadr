package ifsp.edu.br.deuquadra.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CompanyController {

    @GetMapping("path")
    public String getAllCourts(@RequestParam String param) {
        return new String();
    }

    @GetMapping("path")
    public String getCourtById(@RequestParam String id) {
        return new String();
    }
    
    

}
