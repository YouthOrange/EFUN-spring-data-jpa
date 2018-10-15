package cn.cl.study.jpa.repositories;

import cn.cl.study.jpa.dto.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author : 常亮
 * @Date : 2:27 PM 2018/10/15
 * @Description :
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
