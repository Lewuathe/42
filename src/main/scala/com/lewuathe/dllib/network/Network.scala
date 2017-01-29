/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.lewuathe.dllib.network

import com.lewuathe.dllib.graph.Graph
import com.lewuathe.dllib.model.{InMemoryModel, Model}

/**
  * Network is a representation that has Model parameters and Model formation.
  * @param model
  * @param graph
  */
class Network(val model: Model, val graph: Graph) extends Serializable {
  override def toString: String = {
    s"Form: \n${graph.toString}"
  }
}

object Network {
  def apply(model: Model, graph: Graph): Network = new Network(model, graph)
}
