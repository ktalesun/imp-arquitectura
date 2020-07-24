package com.udc.repository.utils;

import org.reactivecommons.utils.ObjectMapper;
import org.springframework.data.jpa.repository.JpaRepository;

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
        return mapper.map(entity, dataClass);
    }

    protected D saveData(D data) {
        return repository.save(data);
    }
}
