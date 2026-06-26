package tripleo.elijah.comp;

import java.lang.reflect.Type;

import io.activej.inject.Key;
import io.activej.types.Types;

/// TODO we left activej-inject to get {@link io.activej.inject.Key}
public record LoadableKey(Class<?> klazz) {
	public <T> Key<Class<T>> getKey() {
		final Type pt = Types.parameterizedType(klazz);
		return Key.ofType(pt);
	}
}
