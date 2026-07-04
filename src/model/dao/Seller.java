package model.dao;

import java.util.List;

public interface Seller {

    void insert (Seller seller);
    void update (Seller department);
    void deleteById(Seller department);
    Seller findById(Integer id);
    List<Seller> findAll();
}
