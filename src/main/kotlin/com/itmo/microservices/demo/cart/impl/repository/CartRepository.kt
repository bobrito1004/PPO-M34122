package com.itmo.microservices.demo.cart.impl.repository

import com.itmo.microservices.demo.cart.impl.entity.Order
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface CartRepository : JpaRepository<Order, String>{
}