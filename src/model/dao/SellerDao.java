package model.dao;

import java.util.List;

public interface SellerDao {

    void insert (SellerDao seller);
    void update (SellerDao department);
    void deleteById(SellerDao department);
    SellerDao findById(Integer id);
    List<SellerDao> findAll();
}
