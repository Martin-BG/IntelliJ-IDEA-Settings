#set( $NAME_LOWER = $NAME.toLowerCase())
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ${NAME}Controller {

    private final ${NAME}Service ${NAME_LOWER}Service;

    @Autowired
    public ${NAME}Controller (final ${NAME}Service ${NAME_LOWER}Service) {
        this.${NAME_LOWER}Service = ${NAME_LOWER}Service;
    }
}
