package com.alistair.ejb;

import javax.ejb.*;
import static javax.ejb.TransactionAttributeType.SUPPORTS;

@Stateless
public class HelloBean implements HelloLocal
{
  private String shout = "Not initialized";

  @Inject 
  public void setShout(String shout)
  {
    this.shout = shout;
  }

  @TransactionAttribute(SUPPORTS)
  public String shoutOut()
  {
    return shout;
  }
}
