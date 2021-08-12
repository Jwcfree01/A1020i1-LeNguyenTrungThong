package vn.codegym.casestudy.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.casestudy.model.bean.CustomerType;

public interface CustomerTypeRepo extends JpaRepository<CustomerType, String> {

}
