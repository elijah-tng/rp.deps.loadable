package tripleo.elijah.comp;

import io.activej.inject.Key;
import io.activej.types.Types;

import java.lang.reflect.Type;

/// TODO we left activej-inject to get {@link io.activej.inject.Key}
public record LoadableKey(Class<?> klazz) {
	public <T> io.activej.inject.Key<Class<T>> getKey() {
		final Type pt = Types.parameterizedType(klazz);
		return Key.ofType(pt);
	}
}
