package vn.codegym.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.demo.bean.KhuyenMai;
import vn.codegym.demo.repository.KhuyenMaiRepository;

@Service
public class KhuyenMaiServiceImpl implements KhuyenMaiService{
    @Autowired
    KhuyenMaiRepository khuyenMaiRepository;

    @Override
    public void create(KhuyenMai khuyenMai) {
        this.khuyenMaiRepository.save(khuyenMai);
    }

    @Override
    public void delete(int id) {
        this.khuyenMaiRepository.deleteById(id);
    }

    @Override
    public KhuyenMai finById(int id) {
        return this.khuyenMaiRepository.findById(id).orElse(null);
    }

    @Override
    public Page<KhuyenMai> findAll(Pageable pageable) {
        return this.khuyenMaiRepository.findAll(pageable);
    }

    @Override
    public Page<KhuyenMai> searchByName(String key, Pageable pageable) {
        return this.khuyenMaiRepository.findAllByKey(key, pageable);
    }
}
