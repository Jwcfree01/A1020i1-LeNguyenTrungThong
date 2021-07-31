package vn.codegym.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.blog.model.SmartPhone;
import vn.codegym.blog.repository.SmartPhoneRepo;

import java.util.List;

@Service
public class SmartPhoneServiceImpl implements SmartPhoneService {

    @Autowired
    SmartPhoneRepo smartPhoneRepo;

    @Override
    public List<SmartPhone> findAll() {
        return smartPhoneRepo.findAll();
    }

    @Override
    public SmartPhone saveSmartPhone(SmartPhone smartPhone) {
        return smartPhoneRepo.save(smartPhone);
    }

    @Override
    public void deleteBlog(int id) {
        this.smartPhoneRepo.deleteById(id);
    }

    @Override
    public SmartPhone findById(int id) {
        return this.smartPhoneRepo.findById(id).orElse(null);
    }
}
