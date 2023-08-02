package designPatternsWorkbook.chapter1Interfaces;

import java.util.Objects;

public class Fireworks {
    ClassificationConstants type ;
    public Fireworks(ClassificationConstants type) {
        this.type = type;
    }
    public void secureOrder() {
        if (Objects.equals(this.type, ClassificationConstants.CONSUMER)) {
            //
        } else  if ( this.type == ClassificationConstants.DISPLAY) {

        }
    }
}
