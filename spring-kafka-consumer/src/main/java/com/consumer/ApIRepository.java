package com.consumer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.consumer.entity.ApiCall;

@Repository
public interface ApIRepository extends JpaRepository<ApiCall, Long>{

}
