package cn.cl.study.jpa.controller;

import cn.cl.study.jpa.dto.Customer;
import cn.cl.study.jpa.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : 常亮
 * @Date : 2:38 PM 2018/10/15
 * @Description :
 */
@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(value = "/index")
    public void index() {
        customerRepository.save(new Customer("Jack", "Love"));
        customerRepository.save(new Customer("Yao", "Ming"));
        customerRepository.save(new Customer("wang", "Mao"));
    }
    public void listAll(){


    }

}
