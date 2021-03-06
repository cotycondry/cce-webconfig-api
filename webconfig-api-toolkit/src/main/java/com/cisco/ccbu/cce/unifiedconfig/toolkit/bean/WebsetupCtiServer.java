// ----------------------------------------------
package com.cisco.ccbu.cce.unifiedconfig.toolkit.bean;

import com.cisco.ccbu.cce.unifiedconfig.toolkit.BaseApiBean;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.ws.rs.Path;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.ReferenceBean;
import java.util.Date;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.BaseApiListBean;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlElementWrapper;


@XmlRootElement(name="ctiServer")
public class WebsetupCtiServer extends BaseApiBean {
  private String side;
  private String sideAPrivateAddress;
  private String sideAPublicAddress;
  private String sideBPrivateAddress;
  private String sideBPublicAddress;

  public String getSide() {
     return this.side;
  }

  public void setSide(String side) {
     this.side = side;
  }

  public String getSideAPrivateAddress() {
     return this.sideAPrivateAddress;
  }

  public void setSideAPrivateAddress(String sideAPrivateAddress) {
     this.sideAPrivateAddress = sideAPrivateAddress;
  }

  public String getSideAPublicAddress() {
     return this.sideAPublicAddress;
  }

  public void setSideAPublicAddress(String sideAPublicAddress) {
     this.sideAPublicAddress = sideAPublicAddress;
  }

  public String getSideBPrivateAddress() {
     return this.sideBPrivateAddress;
  }

  public void setSideBPrivateAddress(String sideBPrivateAddress) {
     this.sideBPrivateAddress = sideBPrivateAddress;
  }

  public String getSideBPublicAddress() {
     return this.sideBPublicAddress;
  }

  public void setSideBPublicAddress(String sideBPublicAddress) {
     this.sideBPublicAddress = sideBPublicAddress;
  }


}
