
package ui.windows;

import org.apache.commons.collections15.Transformer;

public class Transformador implements Transformer<Boolean, String> {

    @Override
    public String transform(Boolean aprobo) {
        return aprobo ? "Sí" : "No";
    }
}