package com.ctrip.xpipe.redis.core.redis;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import com.ctrip.xpipe.redis.core.AbstractRedisTest;

/**
 * @author wenchao.meng
 *
 * Aug 19, 2016
 */
public class DefaultRunIdGeneratorTest extends AbstractRedisTest{
	
	private int count = 1 << 20;
	
	@Test
	public void testGenerate(){
		
		Set<String> ids = new HashSet<>();
		
		DefaultRunIdGenerator defaultRunIdGenerator = new DefaultRunIdGenerator();
		for(int i=0;i<count;i++){
			ids.add(defaultRunIdGenerator.generateRunid());
		}
		Assert.assertEquals(count, ids.size());
	}

}