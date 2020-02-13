package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @创建人 sgwang
 * @name IndexController
 * @user 91119
 * @创建时间 2020/2/13
 * @描述
 */
@RestController
public class IndexController {

    @RequestMapping("")
    public String index() {
        return "index page!";
    }

}
