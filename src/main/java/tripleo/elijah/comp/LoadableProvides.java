package tripleo.elijah.comp;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/// This one is targetted by the annotation processor
@Target(ElementType.METHOD)
public @interface LoadableProvides {
}
