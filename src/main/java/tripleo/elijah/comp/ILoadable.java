package tripleo.elijah.comp;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public interface ILoadable<T> {
	List<LoadableKey> keys();

	T load(Map<LoadableKey, Object> keys, Consumer<LoadableKey> setter);
}
