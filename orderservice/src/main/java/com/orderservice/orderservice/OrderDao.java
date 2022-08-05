package com.orderservice.orderservice;
import javax.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Repository
@Transactional
public class OrderDao {
    @PersistenceContext
    private EntityManager entityManager;

    public long insert(Order order){
        entityManager.persist(order);
        return order.getId();
    }
}
