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
package org.tbiq.gwt.tools.rpcservice.server;

import org.tbiq.gwt.tools.rpcservice.browser.RpcRequest;
import org.tbiq.gwt.tools.rpcservice.browser.RpcResponse;

/**
 * RpcRequestHandlerRegistry interface defines methods for adding, removing, and
 * retrieving {@link RpcRequestHandler}s based on the type of the {@link RpcRequest}.
 * 
 * @author Yaakov Chaikin (yaakov.chaikin@gmail.com)
 */
public interface RpcRequestHandlerRegistry
{
  /**
   * Adds <code>handler</code> to the handler registry.
   * 
   * @param handler Handler to add.
   */
  public void addHandler(RpcRequestHandler<? extends RpcRequest<? extends RpcResponse>, ? extends RpcResponse> handler);

  /**
   * Removes <code>handler</code> from the handler registry.
   * 
   * @param handler Handler to remove.
   */
  public void removeHandler(RpcRequestHandler<? extends RpcRequest<? extends RpcResponse>, ? extends RpcResponse> handler);

  /**
   * @param rpcRequestClassType RPC request type.
   * @return An instance of a concrete implementation of {@link RpcRequestHandler} based
   *         on the <code>rpcRequestClassType</code>. If no handler is found for that RPC
   *         request type, returns <code>null</code>.
   */
  public RpcRequestHandler<? extends RpcRequest<? extends RpcResponse>, ? extends RpcResponse> getHandlerFor(Class<?> rpcRequestClassType);
}
