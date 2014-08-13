package org.kevoree.microkernel;

import org.kevoree.kcl.api.FlexyClassLoader;
import org.kevoree.resolver.MavenResolver;

import java.io.File;
import java.io.InputStream;

/**
 * Created by duke on 8/12/14.
 */
/*
 *  This interface is not Thread Safe !
  * */
public interface KevoreeKernel {

    public FlexyClassLoader get(String key);

    public FlexyClassLoader put(String key, File kcl);

    public void drop(String key);

    public FlexyClassLoader install(String key, String mavenURL);

    public MavenResolver getResolver();

    public java.util.Collection<FlexyClassLoader> getClassLoaders();

    public boolean boot();

    public boolean boot(InputStream is);

}