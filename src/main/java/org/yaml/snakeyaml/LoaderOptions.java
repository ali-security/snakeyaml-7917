/**
 * Copyright (c) 2008, http://www.snakeyaml.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.yaml.snakeyaml;

import java.util.ArrayList;
import java.util.List;

public class LoaderOptions {

    private boolean allowDuplicateKeys = true;
    private boolean wrappedToRootException = false;
    private int maxAliasesForCollections = 50; //to prevent YAML at https://en.wikipedia.org/wiki/Billion_laughs_attack
    private boolean allowRecursiveKeys = false;
    private boolean processComments = false;
    private boolean enumCaseSensitive = true;
    private int nestingDepthLimit = 50;
    private int codePointLimit = 100 * 1024;
  private List<String> denyList = new ArrayList<String>();

  public LoaderOptions() {
    denyList.add("javax.script.ScriptEngineManager");
    denyList.add("URLClassLoader");
    denyList.add("bsh.XThis");
    denyList.add("bsh.Interpreter");
    denyList.add("com.mchange.v2.c3p0.PoolBackedDataSource");
    denyList.add("com.mchange.v2.c3p0.impl.PoolBackedDataSourceBase");
    denyList.add("clojure.lang.PersistentArrayMap");
    denyList.add("clojure.inspector.proxy$javax.swing.table.AbstractTableModel$ff19274a");
    denyList.add("org.apache.commons.beanutils.BeanComparator");
    denyList.add("org.apache.commons.collections.Transformer");
    denyList.add("org.apache.commons.collections.functors.ChainedTransformer");
    denyList.add("org.apache.commons.collections.functors.ConstantTransformer");
    denyList.add("org.apache.commons.collections.functors.InstantiateTransformer");
    denyList.add("org.apache.commons.collections.map.LazyMap");
    denyList.add("org.apache.commons.collections.functors.InvokerTransformer");
    denyList.add("org.apache.commons.collections.keyvalue.TiedMapEntry");
    denyList.add("org.apache.commons.collections4.comparators.TransformingComparator");
    denyList.add("org.apache.commons.collections4.functors.InvokerTransformer");
    denyList.add("org.apache.commons.collections4.functors.ChainedTransformer");
    denyList.add("org.apache.commons.collections4.functors.ConstantTransformer");
    denyList.add("org.apache.commons.collections4.functors.InstantiateTransformer");
    denyList.add("org.apache.commons.fileupload.disk.DiskFileItem");
    denyList.add("org.apache.commons.io.output.DeferredFileOutputStream");
    denyList.add("org.apache.commons.io.output.ThresholdingOutputStream");
    denyList.add("org.apache.wicket.util.upload.DiskFileItem");
    denyList.add("org.apache.wicket.util.io.DeferredFileOutputStream");
    denyList.add("org.apache.wicket.util.io.ThresholdingOutputStream");
    denyList.add("org.codehaus.groovy.runtime.ConvertedClosure");
    denyList.add("org.codehaus.groovy.runtime.MethodClosure");
    denyList.add("org.hibernate.engine.spi.TypedValue");
    denyList.add("org.hibernate.tuple.component.AbstractComponentTuplizer");
    denyList.add("org.hibernate.tuple.component.PojoComponentTuplizer");
    denyList.add("org.hibernate.type.AbstractType");
    denyList.add("org.hibernate.type.ComponentType");
    denyList.add("org.hibernate.type.Type");
    denyList.add("org.hibernate.EntityMode");
    denyList.add("com.sun.rowset.JdbcRowSetImpl");
    denyList.add("org.jboss.interceptor.builder.InterceptionModelBuilder");
    denyList.add("org.jboss.interceptor.builder.MethodReference");
    denyList.add("org.jboss.interceptor.proxy.DefaultInvocationContextFactory");
    denyList.add("org.jboss.interceptor.proxy.InterceptorMethodHandler");
    denyList.add("org.jboss.interceptor.reader.ClassMetadataInterceptorReference");
    denyList.add("org.jboss.interceptor.reader.DefaultMethodMetadata");
    denyList.add("org.jboss.interceptor.reader.ReflectiveClassMetadata");
    denyList.add("org.jboss.interceptor.reader.SimpleInterceptorMetadata");
    denyList.add("org.jboss.interceptor.spi.instance.InterceptorInstantiator");
    denyList.add("org.jboss.interceptor.spi.metadata.InterceptorReference");
    denyList.add("org.jboss.interceptor.spi.metadata.MethodMetadata");
    denyList.add("org.jboss.interceptor.spi.model.InterceptionType");
    denyList.add("org.jboss.interceptor.spi.model.InterceptionModel");
    denyList.add("sun.rmi.server.UnicastRef");
    denyList.add("sun.rmi.transport.LiveRef");
    denyList.add("sun.rmi.transport.tcp.TCPEndpoint");
    denyList.add("java.rmi.server.RemoteObject");
    denyList.add("java.rmi.server.RemoteRef");
    denyList.add("java.rmi.server.UnicastRemoteObject");
    denyList.add("sun.rmi.server.ActivationGroupImpl");
    denyList.add("sun.rmi.server.UnicastServerRef");
    denyList.add("org.springframework.aop.framework.AdvisedSupport");
    denyList.add("net.sf.json.JSONObject");
    denyList.add("org.jboss.weld.interceptor.builder.InterceptionModelBuilder");
    denyList.add("org.jboss.weld.interceptor.builder.MethodReference");
    denyList.add("org.jboss.weld.interceptor.proxy.DefaultInvocationContextFactory");
    denyList.add("org.jboss.weld.interceptor.proxy.InterceptorMethodHandler");
    denyList.add("org.jboss.weld.interceptor.reader.ClassMetadataInterceptorReference");
    denyList.add("org.jboss.weld.interceptor.reader.DefaultMethodMetadata");
    denyList.add("org.jboss.weld.interceptor.reader.ReflectiveClassMetadata");
    denyList.add("org.jboss.weld.interceptor.reader.SimpleInterceptorMetadata");
    denyList.add("org.jboss.weld.interceptor.spi.instance.InterceptorInstantiator");
    denyList.add("org.jboss.weld.interceptor.spi.metadata.InterceptorReference");
    denyList.add("org.jboss.weld.interceptor.spi.metadata.MethodMetadata");
    denyList.add("org.jboss.weld.interceptor.spi.model.InterceptionModel");
    denyList.add("org.jboss.weld.interceptor.spi.model.InterceptionType");
    denyList.add("org.python.core.PyObject");
    denyList.add("org.python.core.PyBytecode");
    denyList.add("org.python.core.PyFunction");
    denyList.add("org.mozilla.javascript");
    denyList.add("org.apache.myfaces.context.servlet.FacesContextImpl");
    denyList.add("org.apache.myfaces.context.servlet.FacesContextImplBase");
    denyList.add("org.apache.myfaces.el.CompositeELResolver");
    denyList.add("org.apache.myfaces.el.unified.FacesELContext");
    denyList.add("org.apache.myfaces.view.facelets.el.ValueExpressionMethodExpression");
    denyList.add("com.sun.syndication.feed.impl.ObjectBean");
    denyList.add("org.springframework.beans.factory.ObjectFactory");
    denyList.add("org.springframework.aop.framework.AdvisedSupport");
    denyList.add("org.springframework.aop.target.SingletonTargetSource");
    denyList.add("com.vaadin.data.util.NestedMethodProperty");
    denyList.add("com.vaadin.data.util.PropertysetItem");
    denyList.add("org.springframework.beans.factory.config.PropertyPathFactoryBean");
    denyList.add("org.springframework.aop.support.DefaultBeanFactoryPointcutAdvisor");
    denyList.add("javax.management.BadAttributeValueExpException");
    denyList.add("org.apache.commons.configuration.ConfigurationMap");
    denyList.add("com.mchange.v2.c3p0.WrapperConnectionPoolDataSource");
    denyList.add("com.mchange.v2.c3p0.JndiRefForwardingDataSource");
    denyList.add("com.sun.rowset.JdbcRowSetImpl");
    denyList.add("org.eclipse.jetty.plus.jndi.Resource");
  }

    public boolean isAllowDuplicateKeys() {
        return allowDuplicateKeys;
    }

    /**
     * Allow/Reject duplicate map keys in the YAML file.
     *
     * Default is to allow.
     *
     * YAML 1.1 is slightly vague around duplicate entries in the YAML file. The
     * best reference is <a href="http://www.yaml.org/spec/1.1/#id862121">
     * 3.2.1.3. Nodes Comparison</a> where it hints that a duplicate map key is
     * an error.
     *
     * For future reference, YAML spec 1.2 is clear. The keys MUST be unique.
     * <a href="http://www.yaml.org/spec/1.2/spec.html#id2759572">1.3. Relation
     * to JSON</a>
     * @param allowDuplicateKeys false to reject duplicate mapping keys
     */
    public void setAllowDuplicateKeys(boolean allowDuplicateKeys) {
        this.allowDuplicateKeys = allowDuplicateKeys;
    }

    public boolean isWrappedToRootException() {
        return wrappedToRootException;
    }

    /**
     * Wrap runtime exception to YAMLException during parsing or leave them as they are
     *
     * Default is to leave original exceptions
     *
     * @param wrappedToRootException - true to convert runtime exception to YAMLException
     */
    public void setWrappedToRootException(boolean wrappedToRootException) {
        this.wrappedToRootException = wrappedToRootException;
    }

    public int getMaxAliasesForCollections() {
        return maxAliasesForCollections;
    }

    /**
     * Restrict the amount of aliases for collections (sequences and mappings) to avoid https://en.wikipedia.org/wiki/Billion_laughs_attack
     * @param maxAliasesForCollections set max allowed value (50 by default)
     */
    public void setMaxAliasesForCollections(int maxAliasesForCollections) {
    	this.maxAliasesForCollections = maxAliasesForCollections;
    }

    /**
     * Allow recursive keys for mappings. By default it is not allowed.
     * This setting only prevents the case when the key is the value. If the key is only a part of the value
     * (the value is a sequence or a mapping) then this case is not recognized and always allowed.
     * @param allowRecursiveKeys - false to disable recursive keys
     */
    public void setAllowRecursiveKeys(boolean allowRecursiveKeys) {
    	this.allowRecursiveKeys = allowRecursiveKeys;
    }

    public boolean getAllowRecursiveKeys() {
        return allowRecursiveKeys;
    }

    /**
     * Set the comment processing. By default comments are ignored.
     *
     * @param processComments <code>true</code> to process; <code>false</code> to ignore</code>
     */
    public void setProcessComments(boolean processComments) {
        this.processComments = processComments;
    }

    public boolean isProcessComments() {
        return processComments;
    }

    public boolean isEnumCaseSensitive() {
        return enumCaseSensitive;
    }

    /**
     * Disables or enables case sensitivity during construct enum constant from string value
     * Default is false.
     *
     * @param enumCaseSensitive - true to set enum case sensitive, false the reverse
     */
    public void setEnumCaseSensitive(boolean enumCaseSensitive) {
        this.enumCaseSensitive = enumCaseSensitive;
    }

    public int getNestingDepthLimit() {
        return nestingDepthLimit;
    }

    /**
     * Set max depth of nested collections. When the limit is exceeded an exception is thrown.
     * Aliases/Anchors are not counted.
     * This is to prevent a DoS attack
     * @param nestingDepthLimit - depth to be accepted (50 by default)
     */
    public void setNestingDepthLimit(int nestingDepthLimit) {
        this.nestingDepthLimit = nestingDepthLimit;
    }
    public int getCodePointLimit() {
        return codePointLimit;
    }
    
    /**
     * The max amount of code points in the input YAML document. Please be aware that byte limit
    * depends on the encoding.
    * @param codePointLimit - the max allowed size of the YAML data
    */
    public void setCodePointLimit(int codePointLimit) {
        this.codePointLimit = codePointLimit;
    }

  /**
   * Get the part of the class name which cannot be instantiated. 
   *
   * @return the strings which may not be a part of a class to be created
   */
  public List<String> getDenyList() {
    return denyList;
  }
  /**
   * Set the parts of the class name which may not be created to avoid unintended code execution.
   *
   * @param denyList - the parts of the class name to prohibit
   */
  public void setDenyList(List<String> denyList) {
    this.denyList = denyList;
  }

}
