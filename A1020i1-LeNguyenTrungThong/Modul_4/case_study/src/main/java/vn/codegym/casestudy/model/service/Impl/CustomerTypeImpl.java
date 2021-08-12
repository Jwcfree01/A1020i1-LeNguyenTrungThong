package vn.codegym.casestudy.model.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.casestudy.model.bean.CustomerType;
import vn.codegym.casestudy.model.repository.CustomerTypeRepo;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerTypeImpl implements CustomerTypeService{

    @Autowired
    CustomerTypeRepo customerTypeRepo;


    @Override
    public List<CustomerType> findAll() {
        return new ArrayList<>(this.customerTypeRepo.findAll());
    }
}
