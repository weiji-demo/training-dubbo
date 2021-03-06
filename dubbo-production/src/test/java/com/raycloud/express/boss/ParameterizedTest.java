package com.raycloud.express.boss;

import com.google.common.collect.Lists;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.List;

/**
 * Created by ZuoYun on 12/19/15. Time: 10:27 AM Information:
 */
@RunWith(Parameterized.class)
public class ParameterizedTest {


  @Parameter(value = 0)
  public int a;
  @Parameter(value = 1)
  public int b;
  @Parameter(value = 2)
  public int c;

  @Parameters
  public static List<Object[]> data() {
    return Lists.asList(new Object[]{-1, 1, 0}, new Object[][]{{20, 20, 40}, {30, 30, 60}, {-5, -5, -10}});
  }

  @Test(timeout = 1000)
  public void hello() {
    Assert.assertEquals(a + b, c);
  }

  @Test(expected = IllegalArgumentException.class)
  public void exception() {
    throw new IllegalArgumentException("Xxx");
  }

  @Before
  public void setUp() throws Exception {
    System.out.println("测试执行前");
  }

  @After
  public void tearDown() throws Exception {
    System.out.println("测试执行后");
  }
}
