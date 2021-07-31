package vn.codegym.casestudy.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.casestudy.model.bean.All;

public interface Furama extends JpaRepository<Integer, All> {
}
