package com.xavier.jedis;

import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.concurrent.TimeUnit;

public class ConnDB {

	private RedisTemplate redis;

	@Autowired
	public void setRedis(RedisTemplate redis) {
		this.redis = redis;
	}

	/**
	 * <p>向redis中存值</p>
	 *
	 * @param key
	 * @param value
	 * @return boolean(保存是否成功)
	 */
	public boolean set(@NotNull Object key, @NotNull Object value) {
		try {
			redis.boundValueOps(key).set(value);
			return true;
		} catch (Exception e) {

			return false;
		}
	}

	/**
	 * <p>向redis中存值并设置过期时间</p>
	 *
	 * @param key
	 * @param value
	 * @param expireTime
	 * @param timeUnit
	 * @return boolean(保存是否成功)
	 */
	public boolean set(@NotNull Object key, @NotNull Object value, @NotNull long expireTime, @NotNull TimeUnit timeUnit) {
		try {
			redis.boundValueOps(key).set(value, expireTime, timeUnit);
			return true;
		} catch (Exception e) {

			return false;
		}
	}

	/**
	 * <p>根据key获取Redis中的值</p>
	 *
	 * @param key
	 * @return
	 */
	public Object get(@NotNull Object key) {
		return redis.opsForValue().get(key);
	}
}
