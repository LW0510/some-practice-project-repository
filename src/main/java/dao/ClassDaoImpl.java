package dao;

import entity.Class_;
import mapper.Class_Mapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository( "classDao")
public class ClassDaoImpl extends SqlSessionDaoSupport implements Class_Mapper {

    @Override
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    @Autowired
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


    @Override
    public List<Class_> getUserByCid(int cid) {
        SqlSession session = super.getSqlSession();
        Class_Mapper class_ = session.getMapper(Class_Mapper.class);
        List<Class_> classs = class_.getUserByCid(cid);
        return classs;

    }
}





