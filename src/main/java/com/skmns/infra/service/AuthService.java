package com.skmns.infra.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.skmns.infra.dao.AuthDAO;
import com.skmns.infra.vo.AuthVO;

@Service
public class AuthService {
    
    @Autowired
    private AuthDAO authDao;

    public List<AuthVO> selectAuthList() {
        return authDao.selectAuthList();
    }

    @Async
    public CompletableFuture<List<AuthVO>> selectAuthList1() {
        return CompletableFuture.completedFuture(authDao.selectAuthList());
    }

}
