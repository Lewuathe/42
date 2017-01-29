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

package com.lewuathe.dllib

import breeze.linalg
import com.lewuathe.dllib.util._
import com.lewuathe.dllib.layer.Layer
import com.lewuathe.dllib.model.Model

class MockLayer23 extends Layer {
  override var id: String = "layer23"

  /**
    * Calculate the output corresponding given input.
    * Input is given as a top of ActivationStack.
    * @param acts
    * @param model
    * @return
    */
  override def forward(acts: ActivationStack, model: Model): Blob[Double] = ???

  /**
    * Calculate the delta of this iteration. The input of the layer in forward
    * phase can be restored from ActivationStack. It returns the delta of input
    * layer of this layer and the delta of coefficient and intercept parameter.
    * @param delta
    * @param acts
    * @param model
    * @return
    */
  override def backward(delta: Blob[Double], acts: ActivationStack, model: Model): (Blob[Double], Weight, Bias) = ???

  override val outputSize: Int = 2
  override val inputSize: Int = 3
  override val inputShape: BlobShape = BlobShape(1, inputSize)
  override val outputShape: BlobShape = BlobShape(1, outputSize)
}
