package vn.codegym.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.codegym.demo.bean.KhuyenMai;

@Repository
public interface KhuyenMaiRepository extends JpaRepository<KhuyenMai, Integer> {

    @Query(value = "SELECT c FROM KhuyenMai c WHERE " +
            "c.tieuDe LIKE %:key% OR " +
            "c.mucGiamGia LIKE %:key% OR " +
            "c.chiTiet LIKE %:key%")
    Page<KhuyenMai> findAllByKey(String key, Pageable pageable);
}
