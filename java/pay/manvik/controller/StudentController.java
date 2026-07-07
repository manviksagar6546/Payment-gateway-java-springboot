package pay.manvik.controller;

//noraml controller

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pay.manvik.dto.Studentorder;
import pay.manvik.service.StudentService;

import java.util.Map;

@Controller
public class StudentController {

    @Autowired
    private StudentService Service;

    @GetMapping("/")
    public String init(){
        return "index";
    }

    //Controller + responsebody  = restcontroller
    @PostMapping(value = "/create-order", produces = "application/json")
    @ResponseBody
    public ResponseEntity<Studentorder> createOrder(@RequestBody Studentorder studentOrder) throws Exception {

        Studentorder createOrder= Service.createOrder(studentOrder);
        //return 2nd order to The UI in the form of responseentitiy
        return new ResponseEntity<>(createOrder, HttpStatus.CREATED);
    }

    //call back method - after paymet completed successfully this call method executed
    @PostMapping("/handle-payment-callback")
    public String handlePaymentCallback(@RequestParam Map<String, String> respPayload){
        System.out.println(respPayload);
        Service.updateOrder(respPayload);

        return "success";
    }



}

