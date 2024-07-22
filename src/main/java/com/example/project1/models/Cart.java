package com.example.project1.models;


import jakarta.persistence.*;
import jakarta.persistence.OneToMany;


import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userid;
    private Long cartItemid;
    private LocalDate createdOn;

    @OneToMany(mappedBy = "cart",cascade = CascadeType.ALL)

    private Set<CartItem> cartItems ;




    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }

    public Long getCartItemid() {
        return cartItemid;
    }

    public void setCartItemid(Long cartItemid) {
        this.cartItemid = cartItemid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

}
