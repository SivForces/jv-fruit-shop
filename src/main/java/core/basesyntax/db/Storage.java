package core.basesyntax.db;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Storage {
    private static final Map<String, Integer> fruits = new HashMap<>();

    public static int size() {
        return fruits.size();
    }

    public static boolean isEmpty() {
        return fruits.isEmpty();
    }

    public static boolean containsKey(Object key) {
        return fruits.containsKey(key);
    }

    public static boolean containsValue(Object value) {
        return fruits.containsValue(value);
    }

    public static Integer get(Object key) {
        return fruits.get(key);
    }

    public static Integer put(String key, Integer value) {
        return fruits.put(key, value);
    }

    public static Integer remove(Object key) {
        return fruits.remove(key);
    }

    public static void putAll(Map<? extends String, ? extends Integer> m) {
        fruits.putAll(m);
    }

    public static void clear() {
        fruits.clear();
    }

    public static Set<String> keySet() {
        return fruits.keySet();
    }

    public static Collection<Integer> values() {
        return fruits.values();
    }

    public static Set<Map.Entry<String, Integer>> entrySet() {
        return fruits.entrySet();
    }

    public static Integer getOrDefault(Object key, Integer defaultValue) {
        return fruits.getOrDefault(key, defaultValue);
    }

    public static void forEach(BiConsumer<? super String, ? super Integer> action) {
        fruits.forEach(action);
    }

    public static void replaceAll(BiFunction<? super String, ? super Integer, ? extends Integer> function) {
        fruits.replaceAll(function);
    }

    public static Integer putIfAbsent(String key, Integer value) {
        return fruits.putIfAbsent(key, value);
    }

    public static boolean remove(Object key, Object value) {
        return fruits.remove(key, value);
    }

    public static boolean replace(String key, Integer oldValue, Integer newValue) {
        return fruits.replace(key, oldValue, newValue);
    }

    public static Integer replace(String key, Integer value) {
        return fruits.replace(key, value);
    }

    public static Integer computeIfAbsent(String key, Function<? super String, ? extends Integer> mappingFunction) {
        return fruits.computeIfAbsent(key, mappingFunction);
    }

    public static Integer computeIfPresent(String key, BiFunction<? super String, ? super Integer, ? extends Integer> remappingFunction) {
        return fruits.computeIfPresent(key, remappingFunction);
    }

    public static Integer compute(String key, BiFunction<? super String, ? super Integer, ? extends Integer> remappingFunction) {
        return fruits.compute(key, remappingFunction);
    }

    public static Integer merge(String key, Integer value, BiFunction<? super Integer, ? super Integer, ? extends Integer> remappingFunction) {
        return fruits.merge(key, value, remappingFunction);
    }
}
