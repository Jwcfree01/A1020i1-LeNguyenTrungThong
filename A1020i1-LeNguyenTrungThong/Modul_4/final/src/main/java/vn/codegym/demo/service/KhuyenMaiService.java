package vn.codegym.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.demo.bean.KhuyenMai;

@Service
public interface KhuyenMaiService {
    void create(KhuyenMai khuyenMai);
    void delete(int id);
    KhuyenMai finById(int id);
    Page<KhuyenMai> findAll(Pageable pageable);
    Page<KhuyenMai> searchByName(String key, Pageable pageable);
}
