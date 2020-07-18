package com.udc.repository.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.StringReader;
import java.lang.reflect.ParameterizedType;
import java.util.function.Function;

public abstract class AdapterOperation<E, D, I, R extends JpaRepository<D, I>> {

    protected R repository;
    protected ObjectMapper mapper;
    private Class<D> dataClass;
    private Function<D, E> toEntityFn;

    public AdapterOperation(R repository, ObjectMapper mapper, Function<D, E> toEntityFn) {
        this.repository = repository;
        this.mapper = mapper;
        ParameterizedType genericSuperclass = (ParameterizedType) this.getClass().getGenericSuperclass();
        this.dataClass = (Class<D>) genericSuperclass.getActualTypeArguments()[1];
        this.toEntityFn = toEntityFn;
    }

    public E save(E entity) {
        D data = toData(entity);
        return toEntityFn.apply(this.saveData(data));
    }

    protected D toData(E entity) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String obj = mapper.writeValueAsString(entity);
            obj = obj.replace("\"className\":\"" + entity.getClass().getSimpleName().toLowerCase() + "\"", "\"className\":\"" + dataClass.getSimpleName().toLowerCase() + "\"");
            return new ObjectMapper().readValue(new StringReader(obj), dataClass);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    protected D saveData(D data) {
        return repository.save(data);
    }
}
