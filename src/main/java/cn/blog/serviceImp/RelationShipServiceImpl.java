package cn.blog.serviceImp;

        import cn.blog.dao.RelationShipDao;
        import cn.blog.service.RelationShipService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;


@Service
public class RelationShipServiceImpl implements RelationShipService {

    @Autowired
    private RelationShipDao relationShipDao;


}
