package com.litongjava.perplexica;

import com.litongjava.annotation.AComponentScan;
import com.litongjava.hotswap.watcher.HotSwapResolver;
import com.litongjava.tio.boot.TioApplication;

@AComponentScan
public class PerplexicaAdmin {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    HotSwapResolver.addSystemClassPrefix("om.litongjava.perplexica.vo.");
    TioApplication.run(PerplexicaAdmin.class, args);
    //    TioApplication.run(PerplexicaAdmin.class, args);
    long end = System.currentTimeMillis();
    System.out.println((end - start) + "ms");
  }
}