package utils;

import redis.clients.jedis.Jedis;
public class RedisUtils {
    Jedis jedis;
    // create a Jedis instance and connect to Redis server
   public RedisUtils( ) {
       this.jedis = new Jedis("18.143.173.183", 6379);
   }
    // set a key-value pair in Redis
    public void SetKeyValue(String key, String value){
        jedis.set(key,value);
    }

    public String GetValue(String key){
        return jedis.get(key);
    }

    public void SetExpire(long time){
       jedis.expire("18.143.173.183",time);
    }
}
