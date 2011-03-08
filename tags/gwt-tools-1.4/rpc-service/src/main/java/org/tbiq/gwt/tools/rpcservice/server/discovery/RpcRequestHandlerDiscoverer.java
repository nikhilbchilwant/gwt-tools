/**
 * Copyright 2010 Yaakov Chaikin (yaakov.chaikin@gmail.com) Licensed under the Apache
 * License, Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed
 * to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under the
 * License.
 */
package org.tbiq.gwt.tools.rpcservice.server.discovery;

import java.util.List;

import org.tbiq.gwt.tools.rpcservice.browser.RpcRequest;
import org.tbiq.gwt.tools.rpcservice.browser.RpcResponse;
import org.tbiq.gwt.tools.rpcservice.server.RpcRequestHandler;

/**
 * RpcRequestHandlerDiscoverer interface defines a method that loads and initializes all
 * RPC request handlers within the system which are annotated with {@link RpcHandler}
 * annotation.
 * 
 * @author Yaakov Chaikin (yaakov.chaikin@gmail.com)
 */
public interface RpcRequestHandlerDiscoverer
{
  /**
   * This method returns class types of RPC request handlers which are found within this
   * system that implement {@link RpcRequestHandler} interface and annotated with
   * {@link RpcHandler} annotation.
   * 
   * @return Class type list of found classes within this system that implement
   *         {@link RpcRequestHandler} interface and annotated with {@link RpcHandler}
   *         annotation.
   */
  List<Class<? extends RpcRequestHandler<? extends RpcRequest<? extends RpcResponse>, ? extends RpcResponse>>> discoverHandlers();
}
