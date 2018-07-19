package org.cbioportal.persistence.mybatis.util;

import org.apache.ibatis.cache.Cache;
import org.apache.ibatis.cache.impl.PerpetualCache;
import org.apache.ibatis.cache.decorators.LruCache;

import org.apache.log4j.Logger;

import java.util.concurrent.locks.ReadWriteLock;

public class CustomMyBatisCache implements Cache {

    private final LruCache delegate;
    private static final Logger logger = Logger.getLogger(CustomMyBatisCache.class);

    public CustomMyBatisCache(final String id) {
        if (id == null) {
            throw new IllegalArgumentException("Cache instances require an ID");
        }
        this.delegate = new LruCache(new PerpetualCache(id));
    }

    @Override
    public int getSize() {
        if (logger.isInfoEnabled()) {
            logger.info("getSize() called (size): " + delegate.getSize());
        }
        return delegate.getSize();
    }

    public void setSize(final int size) {
        if (logger.isInfoEnabled()) {
            logger.info("setSize() called (size): " + size);
        }
        if (delegate != null) {
            delegate.setSize(size);
        }
    }

    @Override
    public String getId() {
        if (logger.isInfoEnabled()) {
            logger.info("getId() called...");
        }
        return delegate.getId();
    }

    @Override
    public void putObject(Object key, Object value) {
        if (logger.isInfoEnabled()) {
            logger.info("putObject(key, value): " + key + ", " + value);
        }
        delegate.putObject(key, value);
    }

    /**
     * @param key The key
     * @return The object stored in the cache.
     */
    @Override
    public Object getObject(Object key) {
        if (logger.isInfoEnabled()) {
            logger.info("getObject(key): " + key);
        }
        return delegate.getObject(key);
    }

    @Override
    public Object removeObject(Object key) {
        if (logger.isInfoEnabled()) {
            logger.info("removeObject(key): " + key);
        }
        return delegate.removeObject(key);
    }

    @Override
    public void clear() {
        if (logger.isInfoEnabled()) {
            logger.info("clear()");
        }
        delegate.clear();
    }

    @Override
    public ReadWriteLock getReadWriteLock() {
        if (logger.isInfoEnabled()) {
            logger.info("getReadWriteLock() called.");
        }
        return delegate.getReadWriteLock();
    }
}
