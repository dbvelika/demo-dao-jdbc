package model.dao;

import model.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert (Seller seller);
    void update (Seller department);
    void deleteById(Seller department);
    Seller findById(Integer id);
    List<Seller> findAll();
}
