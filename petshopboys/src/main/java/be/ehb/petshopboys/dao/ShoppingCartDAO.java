package be.ehb.petshopboys.dao;

import be.ehb.petshopboys.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartDAO extends JpaRepository<CartItem, Long> {
    <S extends CartItem> S save(S entity);

}