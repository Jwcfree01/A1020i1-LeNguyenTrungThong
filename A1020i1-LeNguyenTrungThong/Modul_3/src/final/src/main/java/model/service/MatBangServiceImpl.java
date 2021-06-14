package model.service;

import model.bean.MatBang;
import model.repository.MatBangRepo;
import model.repository.MatBangRepoImpl;

import java.util.List;

public class MatBangServiceImpl implements MatBangService {
    MatBangRepo matBangRepo = new MatBangRepoImpl();
    @Override
    public List<MatBang> findAll() {
        return this.matBangRepo.findAll();
    }

    @Override
    public void deleteMatBang(int id) {
        this.matBangRepo.deleteMatBang(id);
    }

    @Override
    public void createMatBang(MatBang matBang) {
        this.matBangRepo.createMatBang(matBang);
    }

    @Override
    public List<MatBang> searchSoTang(int soTang) {
        return this.matBangRepo.searchSoTang(soTang);
    }

    @Override
    public List<MatBang> searchPrice(double price) {
        return this.matBangRepo.searchPrice(price);
    }
}
