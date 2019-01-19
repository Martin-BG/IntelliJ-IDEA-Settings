#set( $NAME_LOWER = $NAME.toLowerCase())
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ${NAME}ServiceImpl implements ${NAME}Service {
    
    private final ${NAME}Repository ${NAME_LOWER}Repository;
    private final ModelMapper modelMapper;

    @Autowired
    public ${NAME}ServiceImpl(final ${NAME}Repository ${NAME_LOWER}Repository,
                               final ModelMapper modelMapper) {
        this.${NAME_LOWER}Repository = ${NAME_LOWER}Repository;
        this.modelMapper = modelMapper;
    }
}
