import com.zou.dao.UserDao;
import com.zou.pojo.User;
import com.zou.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        UserDao userDao = sqlsession.getMapper(UserDao.class);
        //userDao.insertUser(123,"hihe","990");
        List<User> users = userDao.getUserList();
        for (User user : users) {
            System.out.println(user);
        }
        sqlsession.commit();
        sqlsession.close();
    }
}
