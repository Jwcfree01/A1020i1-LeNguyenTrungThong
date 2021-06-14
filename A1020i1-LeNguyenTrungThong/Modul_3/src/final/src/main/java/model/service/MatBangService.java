package model.service;

import model.bean.MatBang;

import java.util.List;

public interface MatBangService {
    List<MatBang> findAll();

    void deleteMatBang(int id);

    void createMatBang(MatBang matBang);

    List<MatBang> searchSoTang(int soTang);

    List<MatBang> searchPrice(double price);
}
