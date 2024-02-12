package hello.core.order;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Lombok {

    String name;
    public static void main(String[] args) {
        Lombok lm = new Lombok();
        lm.getName();
    }
}
