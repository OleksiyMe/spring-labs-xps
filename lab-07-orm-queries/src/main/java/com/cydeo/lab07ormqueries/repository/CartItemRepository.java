package com.cydeo.lab07ormqueries.repository;


import com.cydeo.lab07ormqueries.entity.Cart;
import com.cydeo.lab07ormqueries.entity.CartItem;
import com.cydeo.lab07ormqueries.enums.CartState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartItemRepository extends JpaRepository<Cart, Long> {

    //Write a derived query to get count cart items
    Integer countBy();
    Integer countCartItemBy();
    //Write a derived query to get cart items for specific cart state
     List<CartItem> getByCartState(CartState state);
    //Write a native query to get cart items for specific cart state and product name

    @Query(value = "SELECT * FROM cart_item ci  JOIN cart c  ON ci.cart_id=c.id JOIN product p " +
            "ON ci.product_id=p.id where c.cart_state=?1 AND p.name=?2",nativeQuery = true)
    List<CartItem> itemsByCartStateAndProductName(@Param("cartState") String cartState,
                                                  @Param("name")String name);
    //Write a native query to get cart items for specific cart state and without discount

    @Query(value = "select * cart_item ci join cart c on ci.cart_id=c.id where c.cart_state=?1 " +
            "And c.discount_id is null",
            nativeQuery=true)
    List<CartItem> listCartItemsByCartStateWithoutDiscount(@Param("cartState") String cartState);
    //Write a native query to get cart items for specific cart state and with specific Discount type
    @Query(value = "select * cart_item ci join cart c on ci.cart_id=c.id join discount d" +
            "on c.discount_id=d.id c.cart_state=?1 And d.discount_type=?2",
            nativeQuery=true)
    List<CartItem> listCartItemsByCartStateAndDiscount(@Param("cartState") String cartState,
                                                       @Param("discountType")String discountType);


}
