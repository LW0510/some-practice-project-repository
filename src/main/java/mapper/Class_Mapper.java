package mapper;

import entity.Class_;

import java.util.List;

public interface Class_Mapper {

    List<Class_> getUserByCid(int cid);
}