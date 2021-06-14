package model.repository;

import model.bean.MatBang;

import java.sql.SQLException;
import java.util.List;

public interface MatBangRepo {
    List<MatBang> findAll();

    void deleteMatBang(int id);

    void createMatBang(MatBang matBang);

    List<MatBang> searchSoTang(int soTang);

    List<MatBang> searchPrice(double price);
}
