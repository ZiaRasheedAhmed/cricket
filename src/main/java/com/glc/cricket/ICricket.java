package com.glc.cricket;

import java.util.Collection;

public interface ICricket<T> {
    public void save(T player);
    public Collection<T> viewAll();
    public void update(T player);
    public void delete(T player);
    
}
