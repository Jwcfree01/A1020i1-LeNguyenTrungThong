package vn.codegym.blog.service;

import org.springframework.stereotype.Service;
import vn.codegym.blog.model.SmartPhone;

import java.util.List;

@Service
public interface SmartPhoneService {

    List<SmartPhone> findAll();

    SmartPhone saveSmartPhone(SmartPhone smartPhone);

    void deleteBlog (int id);

    SmartPhone findById (int id);
}
