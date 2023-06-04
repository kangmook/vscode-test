package com.skmns.infra.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.skmns.infra.vo.AuthVO;

@Repository
public class AuthDAO {
    
    @Autowired
    @Qualifier("sqlSessionTemplateFirst")
	private SqlSession sqlSession;

    private static final String NS = "com.skmns.infra.auth.";

    /**
     * 전체 AuthList 를 가져온다.
     * @return
     * @throws Exception
     */
    public List<AuthVO> selectAuthList() {
        return sqlSession.selectList(NS + "selectAuthList");
    }
}
