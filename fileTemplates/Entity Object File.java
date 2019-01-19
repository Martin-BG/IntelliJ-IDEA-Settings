#set( $regex = "([a-z])([A-Z]+)")
#set( $replacement = "$1_$2")
#set( $SNAKE_CASE = $NAME.replaceAll($regex, $replacement).toLowerCase() + "s")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "${SNAKE_CASE}")
public class ${NAME} implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
}
