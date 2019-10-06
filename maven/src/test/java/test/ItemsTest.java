package test;


import dao.ItemsDao;
import domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ItemsService;
import service.impl.ItemsServiceImpl;

public class ItemsTest {

    @Test
    public void findById(){
        //获取spring容器
        ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
        //dao测试
        //从容器中拿到所需的dao代理对象
        ItemsDao dao = ac.getBean(ItemsDao.class);
        //调用方法
        Items items1 = dao.findById(3);
        System.out.println(items1.getName());
        //service测试
        ItemsService service = ac.getBean(ItemsService.class);
        Items items2 = service.findById(2);
        System.out.println(items2.getName());

    }
}
